#!/usr/bin/env bash
# 监控内存和磁盘容量，小于给定值时报警

disk_size=$(df / | awk '/\//{print $4}')
echo $disk_size

Mem_size=$(free | awk '/^Mem/{print $4}')
echo $Mem_size

while :; do
    if [ $disk_size -le 1000000 -a $Mem_size -le 500000 ]
    then mail -s "Warinning" root <<EOF
    "资源紧张,内存和硬盘存储空间不够"
EOF
fi

done
