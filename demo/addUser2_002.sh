#!/usr/bin/env bash

# 提示用户输入用户名和密码,自动创建账户和密码
# 如何用户没有输入账户名,则提醒用户必须输入用户名,然后退出脚本.
# 如果用户没有输入密码,则用默认密码(123456789)

read -p "请输入用户名:" user
if [ -z $user ]
then
    echo "请输入用户名!!!"
    exit 2
fi

stty -echo
read -p "请输入密码:" pass
stty echo
pass=${pass:-"123456789"}
useradd $user
echo "$pass" | passwd --stdin $user
echo ""

