#!/usr/bin/env bash
# 检测是否为管理员,如果是管理员,安装vsftpd软件
# 如果不是管理员,提示,您不是管理员,没有安装权限

if [ $USER == "root" ]
then
    # yum install vsftpd
    echo "正在安装软件..."
else
    echo "您不是管理员,没有安装软件的权限."
fi
