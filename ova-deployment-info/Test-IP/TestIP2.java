
import java.io.*;
import java.net.*;
import java.util.*;
import static java.lang.System.out;

public class TestIP2
 {

    public static void main(String args[]) throws SocketException {
    	System.out.println(getAddressForInterface(getNetworkInterface("eth0")));
    }
	
	public static NetworkInterface getNetworkInterface(String netInterface) throws SocketException{
		try {
		
			Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
		        for (NetworkInterface netint : Collections.list(nets))
				{
					if(netInterface.equals(netint.getName()))
						return netint;	
				}
			} catch (Exception e) {
				return null;
			}
		return null;
	}
	public static String getAddressForInterface(NetworkInterface netint) 	throws SocketException {
		try {
			   Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
	    	    for (InetAddress inetAddress : Collections.list(inetAddresses)) {
       	    	     byte[] rawArr = inetAddress.getAddress();
                		if (rawArr!= null && rawArr.length>0 && rawArr[0]>0)
					return inetAddress.getHostAddress();
       		 	}
       	} catch (Exception e) {
       		return null;
       	}
		return null;
		
	}

}
