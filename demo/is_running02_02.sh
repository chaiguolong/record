#!/usr/bin/env bash

# 编写脚本,检测网段192.168.0.0/24中主机的存活状态
# while版本

i=1
while [ $i -le 254 ]; do
    ping -c 2 -i 0.3 -W 1 192.168.0.$i &>/dev/null
    if [ $? -eq 0 ]
    then
	echo "192.168.0.$i is up."
    else
	echo "192.168.0.$i is down."
    fi

    let i++

done