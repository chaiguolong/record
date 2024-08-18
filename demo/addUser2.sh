#!/usr/bin/env bash

# 编写脚本:提示用户输入用户名和密码,脚本自动创建相应的
# 账户及配置密码.如果用户不输入账户名,则提示必须输入账户
# 并退出脚本;如果用户不输入密码,则同一使用默认的123456作为
# 默认密码.

read -p "请输入用户名: " user
# 使用-z可以判断一个变量是否为空,如果为空,则提示必须输入
# 账户名并退出脚本,退出码为2
# 没有输入用户名,脚本退出后,使用$?查看的返回码为2

if [ -z $user ]
then
    echo "您必须输入账户名"
    exit 2
fi

# 使用stty -echo 关闭shell的回显功能
# 使用stty -echo 打开shell的回显功能

stty -echo
read -p "请输入密码: " pass
stty echo
pass=${pass:-123456}
useradd "$user"
echo "$pass" | passwd --stdin "$user"
# 换行
echo ""
