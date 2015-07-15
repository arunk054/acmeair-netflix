#!/bin/bash
#Add jmeter bin directory to your path
nohup jmeter -n -t acmeair-driver_vmware_1.jmx   1>acmeair-aggregate-results.log &
