#!/usr/bin/env bash
# 提示用户输入用户名和密码,脚本自动创建相应的账户及配置密码.
# 如果用户不输入账户名,则提示必须输入账户名并退出脚本;
# 如果用户不输入密码,则同一使用默认的123456作为默认密码.

read -p "请输入用户名: " user
if [ -z $user ]
then
    echo "请输入用户名!!!"
    exit 2;
fi

# 去除回显设置
stty -echo
read -p "请输入密码:" pass
# 恢复回显设置
pass=${pass:-"12345678"}
# 添加新用户
useradd $user
# 设置密码
echo $pass | passwd --stdin $user
# 回车
echo ""


