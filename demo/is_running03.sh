#!/usr/bin/env bash

# 编写脚本测试192.168.0.0/24整个网段中哪些主机处于开机
# 状态,哪些主机处于关机(多进程版)

# 定义一个函数,ping某台主机,并检测主机的存活状态.

myping(){
    ping -c 2 -i 0.3 -W 1 $1 &>/dev/null
    if [ $? -eq 0 ]
    then
	echo "$1 is up."
    else
	echo "$1 is down."
    fi
}

for i in {1..254}; do
    myping 192.168.0.$i &
done
