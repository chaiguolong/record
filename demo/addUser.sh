#!/usr/bin/env bash
# 通过位置变量创建Linux系统账户及密码

useradd "$1"
echo "$2" | passwd --stdin "$1"
