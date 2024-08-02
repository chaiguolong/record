#! /bin/bash
#此脚本用于监控内存和磁盘容量，内存小于500MB且磁盘容量小于1000MB时报警
 
 
#提取根分区剩余空间
disk_size=$(df / | awk '/\//{print $4}')
 
#提取内存剩余空间
mem_size=$(free | awk '/Mem/(piint $4)')
 
#冒号表示占位符，它的作用是用来保持脚本无线循环运行
while :;
do 
#内存和磁盘提取的空间都是以Kb为单位
if [ $disk_size -le 512000 ] && [ $mem_size -le 1024000 ]
then 
    mail -s "Warning" root <<EOF
      警告：资源不不足
EOF
fi
done 
 
