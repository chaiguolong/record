#!/bin/bash
#jumpserver
#v1.0 by dream 2020-07-02
# trap "" HUP INT OUIT TSTP
web_centos01=10.10.10.195
web_ubuntu=10.10.10.217
web_banwagong=138.128.222.176
web_xiaomi=10.10.10.200
web_pi=10.10.10.148
web_git=10.10.10.11
web_dns=10.10.10.12
web_nas=10.10.10.19
web_ftp=10.10.10.20
web_01=10.10.10.21
web_02=10.10.10.22
web_03=10.10.10.23
web_04=10.10.10.24
web_05=10.10.10.25
web_06=10.10.10.26
web_07=10.10.10.27
web_08=10.10.10.28
web_virtualBox=127.0.0.1
#下列虚拟机采用的是桥接模式,主机必须连上外网,且虚拟机和主机的ip需在同一网段
web_centos8u205=192.168.0.105
web_centos8u206=192.168.0.106
web_centos7u601=192.168.0.201
web_centos7u602=192.168.0.202
web_centos7u603=192.168.0.203
web_centos7u604=192.168.0.204
web_centos7u605=192.168.0.205

while true; do
	clear
	cat <<-EOF
	+-------------------------------------+
	|           系统登录管理              |
	|           1.client                  |
	|           2.xiaomi                  |
	|           3.homeassistant服务器     |
	|           4.搬瓦工服务器            |
	|           5.本地虚拟机centos_01     |
	|           6.本地虚拟机centos_02     |
	|           7.本地虚拟机centos_03     |
	|           8.本地虚拟机centos_04     |
	|           9.本地虚拟机centos8u2_05  |
	|           10.本地虚拟机centos8u2_06 |
	|           11.本地虚拟机centos7u601  |
	|           12.本地虚拟机centos7u602  |
	|           13.本地虚拟机centos7u603  |
	|           14.本地虚拟机centos7u604  |
	|           15.本地虚拟机centos7u605  |
	|           q.退出                    |
	+-------------------------------------+

警告:
虚拟机(centos7u6系列主机)采用的是桥接模式
主机必须连上外网,且虚拟机和主机的ip需在同一网段

	EOF

	read  -p "请输入选定的数字: " num
	case "$num" in
		1)
			ssh root@${web_centos01}
			;;
		2)
			ssh root@${web_xiaomi}
			;;
		3)
			ssh root@${web_ubuntu}
			;;
		4)
			ssh -p 29276 root@${web_banwagong}
			;;
		5)
			ssh -p 2222 dream@${web_virtualBox}
			;;
		6)
			ssh -p 3333 dream@${web_virtualBox}
			;;
		7)
			ssh -p 4444 dream@${web_virtualBox}
			;;
		8)
			ssh -p 5555 dream@${web_virtualBox}
			;;
		9)
			ssh   dream@${web_centos8u205}
			
			;;
		10)
			ssh   dream@${web_centos8u206}
			
			;;
		11)
			ssh   dream@${web_centos7u601}
			;;
		12)
			ssh   dream@${web_centos7u602}
			;;
		13)
			ssh   dream@${web_centos7u603}
			;;
		14)
			ssh   dream@${web_centos7u604}
			;;
		15)
			ssh   dream@${web_centos7u605}
			;;
		q)
			exit 0
			;;
		"")
			;;
		*)
			echo "error"
	esac
done
