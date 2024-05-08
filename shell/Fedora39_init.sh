#!/bin/bash
#
#********************************************************************
#Author:        Eddie.Peng
#URL:           https://www.cnblogs.com/eddie1127/
#Date:          2019-09-06
#FileName:      centos7_reset.sh
#Description:   The script for centos7 reset
#********************************************************************

#设置命令提示符颜色
echo 'PS1="\[\e[1;31m\][\u@\h \W]\\$\[\e[0m\]"' >> ~/.bashrc
#设置系统默认编辑器为vim
echo export EDITOR=vim >> ~/.bashrc

#检查脚本运行用户是否为root
if [ $(id -u) -ne 0 ];then
    echo -e "\033[1;31m Error! You must be root to run this script! \033[0m"
    exit 10
fi

#禁用selinux
sed -ri 's/^(SELINUX=)enforcing/\1disabled/'  /etc/selinux/config

#禁用防火墙
systemctl stop firewalld.service
systemctl disable firewalld.service

#安装wget工具
#yum -y install wget

#配置系统使用阿里云yum源和EPEL源
#更换为中科大的镜像源
sed -e 's|^metalink=|#metalink=|g' \
    -e 's|^#baseurl=http://download.example/pub/fedora/linux|baseurl=https://mirrors.ustc.edu.cn/fedora|g' \
    -i.bak \
    /etc/yum.repos.d/fedora.repo \
    /etc/yum.repos.d/fedora-updates.repo

#安装bash命令tab自动补全组件
yum -y install bash-completion
#安装vim编辑器
yum -y install vim screen lrzsz tree psmisc
#安装压缩解压工具
yum -y install zip unzip bzip2 gdisk
#安装网络及性能监控工具
yum -y install telnet net-tools sysstat iftop lsof iotop htop dstat
#安装源码编译工具及开发组件
yum -y install cmake gcc gcc-c++ zib zlib-devel open openssl-devel pcre pcre-devel curl


#初始化完成重启系统
echo -e "\033[1;32m System initialization is complete and will be reboot in 10s...\033[0m"
sleep 10

reboot
