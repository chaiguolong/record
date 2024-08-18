#!/usr/bin/env bash

# 检测是否是管理员,如果是管理员,则安装软件vsftpd,
# 如果不是,则提醒您不是管理员,没有安装软件的权限.

if [ $USER == "root" ]
then
    # yum install vsftpd
    echo "正在安装软件..."
else
    echo "您不是管理员,没有安装软件的权限."
fi

