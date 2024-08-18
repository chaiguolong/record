#!/usr/bin/env bash
# 监控内存和磁盘容量,小于给定值时报警

disk_size=$(df / | awk '/\//{print $4}')
Mem_size=$(free | awk '/^Mem/{print $4}')
while :; do
    if [ $disk_size -le 10000000 -a $Mem_size -le 500000 ]
    then
	mail -s "warnning"  root <<EOF
	"资源紧张,内存和硬盘空间不足!!!"
EOF
	break;
fi

done
