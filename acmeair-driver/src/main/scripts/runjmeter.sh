#!/bin/bash
#Add jmeter bin directory to your path
nohup jmeter -n -t acmeair-driver_vmware_const_througput.jmx   1>acmeair-aggregate-results.log &
