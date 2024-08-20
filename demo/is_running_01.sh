#!/usr/bin/env bash
# 检测192.168.0.0/24整个网段哪些主机在线
# 哪些主机没有在线.(for版本)


for i in {1..255}; do
    ping -c 2 -i 0.3 -W 1 192.168.0.$i &>/dev/null
    if [ $? -eq 0 ]
    then
	echo "192.168.0.$i is up."
    else
	echo "192.168.0.$i is down."
fi

done

