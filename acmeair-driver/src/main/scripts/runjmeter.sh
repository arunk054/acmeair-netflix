#!/bin/bash
#Add jmeter bin directory to your path
nohup /var/lib/apache-jmeter/bin/jmeter -n -t acmeair-driver_vmware_full_names.jmx -l /tmp/response-times.csv 1>jmeter-output.log & 
