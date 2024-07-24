#!/usr/bin/env bash

# 每周5使用tar命令备份/var/log下所有日志文件
# vim /root/logbak.sh
# 编写备份脚本,备份后的文件名包含日期标签,
# 防止后面粉备份将前面的备份数据覆盖
# 注意 date 命令需要使用反引号括起来

tar -cvf log-`date +%Y%m%d`.tar.gz /var/log

# crontab -e #编写计划任务,执行备份脚本
# 00 03 * * 5 /root/logbak.sh
# 分 时 日 月 星期 /root/logbak.sh
