#!/usr/bin/env bash

# 检测本机当前用户是否为超级管理员,如果是管理员,
# 则使用yum安装vsftpd,如果不是,则提示您不是管理员
# 没有安装软件的权限

if [ $UID -eq 0 ]
then
    # yum -y install vsftpd
    echo "正在安装vsftpd..."
else
    echo "您不是管理员,没有安装软件的权限."
fi

