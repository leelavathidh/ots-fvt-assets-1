#!/bin/bash


#find_matching_branches=$(git ls-remote --heads git@github01.hclpnp.com:testingproducts/ots-fvt-assets-1.git|cut -d '/' -f3-|grep -oE '^editBranch.*[0-9]$|^UITestAutomationEditBranch.*[0-9]$')
#echo "$find_matching_branches"

# Array to keep track of started services
declare -a started_services

# Function to start a set of services
function start_services {
    local find_matching_branches=$(git ls-remote --heads git@github01.hclpnp.com:testingproducts/ots-fvt-assets-1.git|cut -d '/' -f3-|grep -oE '^editBranch.*[0-9]$|^UITestAutomationEditBranch.*[0-9]$')
    for service in $find_matching_branches; do
		echo "$service found, deleting this branch" 
		git push git@github01.hclpnp.com:testingproducts/ots-fvt-assets-1.git --delete "$service"
    done
}

start_services
