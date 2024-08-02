#!/usr/bin/env bash

# 每周五凌晨3点使用tar命令备份/var/log下的所有日志文件
# vim /root/logbak.sh
# 编写备份脚本,备份后的文件名包含日期标签,
# 防止后面粉备份将前面的备份数据覆盖

cd /home/dream/Documents/record/

# tar 最好用相对目录,不然会把目录结构打包进去,
# 可能还会导致计划任务失败
tar -cvf log-`date +%Y%m%d`.tar.gz ./shell

#crontab -e #编写计划任务,执行备份脚本(注意要把crond.service服务启动)
#00 3 * * 5 /root/logbak.sh
