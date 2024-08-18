#!/usr/bin/env bash

# 判断是否是超级管理员,如果是管理员,则使用
# yum安装vsftpd(用打印文本代替),如果不是,则提示您非管理员

if [ $UID -eq 0 ]
then
    # yum -y install vsftpd
    echo "正在安装软件..."
else
    echo "您不是超级管理员,没有安装软件的权限."
fi
