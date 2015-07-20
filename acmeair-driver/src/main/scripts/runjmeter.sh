#!/bin/bash
#Add jmeter bin directory to your path
nohup jmeter -n -t acmeair-driver_vmware_full_names.jmx -l /tmp/response-metrics.csv 1>jmeter-output.log & 
