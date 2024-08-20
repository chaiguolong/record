#!/usr/bin/env bash
# 编写脚本,检测网段192.168.0.0/24中主机的存活状态
# 多进程版本

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
