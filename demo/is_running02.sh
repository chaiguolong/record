#!/usr/bin/env bash

# 编写脚本测试192.168.0.0/24整个网段中哪些主机处于开机状态,
# 哪些主机处于关机(while版本)
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
