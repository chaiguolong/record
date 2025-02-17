#!/bin/bash
#
#**************************************************
#Author:                dream
#QQ:                    584238433
#Email:                 584238433@qq.com
#Version:               1.0
#Date:                  2024-07-24
#FileName:              change_IP.sh
#用途:切换Fedora的IP地址及网关和DNS(虚拟机状态下桥接模式和NAT模式)
#在外出的情况下无网络时切换为NAT模式,不会出现无法从宿主机ssh到虚拟机
#而在家时切换为桥接模式
#URL:                   https://blog.dream.top
#Copyroght (C):         2024 ALL rights reserved
#**************************************************



#显示连接:
conn=`nmcli connection |awk '/enp/ {print $1}'`
echo $conn

set_ip(){
	echo 设置IP地址:
	read -p "Please input IP: " IP
	nmcli connection modify $conn ipv4.addresses $IP/24
}

set_gateway(){
	echo 设置网关:
	read -p "Please input Gateway: " GATEWAY
	nmcli connection modify $conn ipv4.gateway $GATEWAY
}

set_dns(){
	echo 设置DNS:
	read -p "Please input DNS1: " DNS1
	nmcli connection modify $conn ipv4.dns $DNS1
	read -p "Please input DNS2: " DNS1
	nmcli connection modify $conn ipv4.dns $DNS2
}
show_device(){
    nmcli device show $conn
}
reload_config(){
	nmcli connection up $conn
}
show_ip(){
	ip address show
}

clear
echo -en "\e[32;1m"
cat <<-EOF
该脚本只支持Fedora!!!

1)set_ip
2)set_gateway
3)set_dns
4)show_device
5)reload_config
6)show_ip
q)退出

EOF
echo -en '\e[0m'
read  -p "请输入选定的数字: " num
case "$num" in
1)
    set_ip
    ;;
2)
    set_gateway
    ;;
3)
    set_dns
    ;;
4)
    show_device
    ;;
5)
    reload_config
    ;;
6)
    show_ip
    ;;
q)
   exit 0; 
    ;;
*)
    echo -e "\e[32;1m输入错误!\e[0m"
    ;;
esac
