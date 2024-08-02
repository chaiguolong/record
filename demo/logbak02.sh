#!/usr/bin/env bash
# 每周五备份/var/log下的所有日志文件
# 编写备份脚本,备份后的文件名包含日期标签,
# 防止后面粉备份将前面的备份数据覆盖

tar -cvf /var/log-`date +%Y%m%d`.tar.gz /var/log
