#!/usr/bin/env bash

# 检测本机当前用户是否为超级管理员,如果是管理员,
# 则使用yum安装vsftpd,如果不是
# 则提示您不是管理员,没有权限安装软件.(这里不安装软件
# 用echo "正在安装软件替代")

if [ $USER == "root" ]
then
    # yum -y install vsftpd
    echo "正在安装软件..."
else
    echo "您不是管理员,没有权限安装软件"
    
fi

