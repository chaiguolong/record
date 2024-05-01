[root@centos8 ~]# cat init_v1.sh
#!/bin/bash
#
#**************************************************
#Author:                dream
#QQ:                    584238433
#Email:                 584238433@qq.com
#Version:               1.0
#Date:                  2024-04-23
#FileName:              init_v1.sh
#Description:           system init
#URL:                   https://blog.dream.top
#Copyroght (C):         2024 ALL rights reserved
#**************************************************

OS=`awk -F'"' '/PRETTY_NAME/{print $2}' /etc/os-release|tr ' ' '-'`

#1
set_ssh () {
   
    if [[ $OS == Ubuntu-18.04* ]];then
        sed -i.bak '/#PermitRootLogin/a PermitRootLogin yes' /etc/ssh/sshd_config
        systemctl restart sshd
    fi
    echo -e "\e[32;1mPermit root login set complete\e[0m"
}

#2
disable_selinux () {
   
    if [[ $OS == CentOS* ]];then
        sed -i.bak 's/SELINUX=enforcing/SELINUX=disabled/' /etc/selinux/config
    fi
    echo -e "\e[32;1mSElinux already disabled,Restart to take effect\e[0m"

}

#3
disbale_firewall () {
   
    systemctl disable --now firewalld &> /dev/null
    echo -e "\e[32;1mFirewall already disabled\e[0m"
}

#4
set_ps1 () {
   
    if [[ $OS == CentOS* ]];then
        echo "PS1='\[\e[1;36m\][\u@\h \W]\\$ \[\e[0m\]'" >> /etc/profile.d/env.sh
        . /etc/profile.d/env.sh
    elif [[ $OS == Ubuntu* ]];then
        echo 'PS1="\[\e[1;32m\][${debian_chroot:+($debian_chroot)}\u@\h \w]\\$ \[\e[0m\]"' >> .bashrc
        . .bashrc
    fi
    echo -e "\e[32;1mPS1 already modify,Please login again\e[0m"

}

#5
set_default_text_editor_vim () {
   
    echo "export EDITOR=vim" >> /etc/profile.d/env.sh
    . /etc/profile.d/env.sh
    echo -e "\e[32;1mdefault_text_editor already modify vim,Please login again\e[0m"
}

#6
set_vim () {
   
cat > ~/.vimrc <<EOF
set ts=4
set expandtab
set ignorecase
set cursorline
set autoindent
colorscheme murphy
autocmd BufNewFile *.sh exec ":call SetTitle()"
func SetTitle()
    if expand("%:e")=='sh'
    call setline(1,"#!/bin/bash")
    call setline(2,"#")
    call setline(3,"#**************************************************")
    call setline(4,"#Author:                dream")
    call setline(5,"#QQ:                    584238433")
    call setline(6,"#Email:                 584238433@qq.com")
    call setline(7,"#Version:               1.0")
    call setline(8,"#Date:                  ".strftime("%Y-%m-%d"))
    call setline(9,"#FileName:              ".expand("%"))
    call setline(10,"#Description:           The test script")
    call setline(11,"#URL:                   https://blog.dream.top")
    call setline(12,"#Copyroght (C):         ".strftime("%Y")." ALL rights reserved")
    call setline(13,"#**************************************************")
    endif
endfunc
autocmd BufNewFile * normal G
EOF
    echo -e "\e[32;1mVim already modify\e[0m"
}

#7
set_history () {
   
    echo 'export HISTTIMEFORMAT="%F %T `whoami` "' >> /etc/profile.d/env.sh
    echo -e "\e[32;1mHistory modify\e[0m"
}

#8
modify_kernel_parameters () {
   
    mv /etc/sysctl.conf{
   ,.bak}
cat > /etc/sysctl.conf <<EOF
# Controls source route verification
net.ipv4.conf.default.rp_filter = 1
net.ipv4.ip_nonlocal_bind = 1
net.ipv4.ip_forward = 1

# Do not accept source routing
net.ipv4.conf.default.accept_source_route = 0

# Controls the System Request debugging functionality of the kernel
kernel.sysrq = 0

# Controls whether core dumps will append the PID to the core filename.
# Useful for debugging multi-threaded applications.
kernel.core_uses_pid = 1

# Controls the use of TCP syncookies
# 表示是否打开TCP同步标签（syncookie），内核必须打开了CONFIG_SYN_COOKIES项进行编译，同步标签可以防止一个套接字在有过多试图连接到达时引起过载。    
net.ipv4.tcp_syncookies = 1

# Disable netfilter on bridges.
# net.bridge.bridge-nf-call-arptables：是否在arptables的FORWARD中过滤网桥的ARP包
# net.bridge.bridge-nf-call-ip6tables：是否在ip6tables链中过滤IPv6包
# net.bridge.bridge-nf-call-iptables：是否在iptables链中过滤IPv4包
# net.bridge.bridge-nf-filter-vlan-tagged：是否在iptables/arptables中过滤打了vlan标签的包

net.bridge.bridge-nf-call-ip6tables = 0
net.bridge.bridge-nf-call-iptables = 0
net.bridge.bridge-nf-call-arptables = 0

# Controls the default maxmimum size of a mesage queue
kernel.msgmnb = 65536

# # Controls the maximum size of a message, in bytes
kernel.msgmax = 65536

# Controls the maximum shared segment size, in bytes
kernel.shmmax = 68719476736

# # Controls the maximum number of shared memory segments, in pages
kernel.shmall = 4294967296

# TCP kernel paramater
net.ipv4.tcp_mem = 786432 1048576 1572864
net.ipv4.tcp_rmem = 4096        87380   4194304
net.ipv4.tcp_wmem = 4096        16384   4194304
net.ipv4.tcp_window_scaling = 1
net.ipv4.tcp_sack = 1

# socket buffer
net.core.wmem_default = 8388608
net.core.rmem_default = 8388608
net.core.rmem_max = 16777216
net.core.wmem_max = 16777216
net.core.netdev_max_backlog = 262144
net.core.somaxconn = 20480
net.core.optmem_max = 81920

# TCP conn
net.ipv4.tcp_max_syn_backlog = 262144
net.ipv4.tcp_syn_retries = 3
net.ipv4.tcp_retries1 = 3
net.ipv4.tcp_retries2 = 15

# tcp conn reuse
net.ipv4.tcp_tw_reuse = 1
net.ipv4.tcp_tw_recycle = 1
net.ipv4.tcp_fin_timeout = 1

net.ipv4.tcp_max_tw_buckets = 20000
net.ipv4.tcp_max_orphans = 3276800
net.ipv4.tcp_timestamps = 1 #?
net.ipv4.tcp_synack_retries = 1
net.ipv4.tcp_syncookies = 1

# keepalive conn
net.ipv4.tcp_keepalive_time = 300
net.ipv4.tcp_keepalive_intvl = 30
net.ipv4.tcp_keepalive_probes = 3
net.ipv4.ip_local_port_range = 10001    65000

# swap
vm.overcommit_memory = 0
vm.swappiness = 10

#net.ipv4.conf.eth1.rp_filter = 0
#net.ipv4.conf.lo.arp_ignore = 1
#net.ipv4.conf.lo.arp_announce = 2
#net.ipv4.conf.all.arp_ignore = 1
#net.ipv4.conf.all.arp_announce = 2

EOF
    echo -e "\e[32;1mKernel parameters modify complete\e[0m"
}

#9
modify_resource_limits () {
   
cat >> /etc/security/limits.conf <<EOF

*    -    core        unlimited
*    -    nproc        1000000
*    -    nofile        1000000
*    -    memlock        32000
*    -    msgqueue    8192000
root    -       core            unlimited
root    -       nproc           1000000
root    -       nofile          1000000
root    -       memlock         32000
root    -       msgqueue        8192000
EOF
    echo -e "\e[32;1mResource limits modify complete\e[0m"
}

#10设置软件源为阿里源,并安装epel源
set_software_source () {
   
    if [[ $OS == CentOS-Linux-7* ]];then
        mkdir /etc/yum.repos.d/backup && mv /etc/yum.repos.d/*.repo /etc/yum.repos.d/backup
        curl -o /etc/yum.repos.d/CentOS-Base.repo https://mirrors.aliyun.com/repo/Centos-7.repo
        wget -O /etc/yum.repos.d/epel.repo https://mirrors.aliyun.com/repo/epel-7.repo
        yum clean all && yum makecache
    elif [[ $OS == CentOS-Linux-8* ]];then
        mkdir /etc/yum.repos.d/backup && mv /etc/yum.repos.d/*.repo /etc/yum.repos.d/backup
        curl -o /etc/yum.repos.d/CentOS-Base.repo https://mirrors.aliyun.com/repo/Centos-vault-8.5.2111.repo
		yum install -y https://mirrors.aliyun.com/epel/epel-release-latest-8.noarch.rpm
		sed -i 's|^#baseurl=https://download.example/pub|baseurl=https://mirrors.aliyun.com|' /etc/yum.repos.d/epel*
		sed -i 's|^metalink|#metalink|' /etc/yum.repos.d/epel*
        yum clean all && yum makecache
        yum install -y https://mirrors.aliyun.com/epel/epel-release-latest-8.noarch.rpm
        sed -i 's|^#baseurl=https://download.example/pub|baseurl=https://mirrors.aliyun.com|' /etc/yum.repos.d/epel*
        sed -i 's|^metalink|#metalink|' /etc/yum.repos.d/epel*
    elif [[ $OS == Ubuntu-18.04* ]];then
        mkdir /etc/apt/backup && mv /etc/apt/sources.list /etc/apt/backup
cat > /etc/apt/sources.list <<EOF
deb http://mirrors.aliyun.com/ubuntu/ bionic main restricted universe multiverse
deb-src http://mirrors.aliyun.com/ubuntu/ bionic main restricted universe multiverse

deb http://mirrors.aliyun.com/ubuntu/ bionic-security main restricted universe multiverse
deb-src http://mirrors.aliyun.com/ubuntu/ bionic-security main restricted universe multiverse

deb http://mirrors.aliyun.com/ubuntu/ bionic-updates main restricted universe multiverse
deb-src http://mirrors.aliyun.com/ubuntu/ bionic-updates main restricted universe multiverse

deb http://mirrors.aliyun.com/ubuntu/ bionic-proposed main restricted universe multiverse
deb-src http://mirrors.aliyun.com/ubuntu/ bionic-proposed main restricted universe multiverse

deb http://mirrors.aliyun.com/ubuntu/ bionic-backports main restricted universe multiverse
deb-src http://mirrors.aliyun.com/ubuntu/ bionic-backports main restricted universe multiverse
EOF
        rm -f /var/lib/apt/lists/lock && apt update
    fi
    echo -e "\e[32;1mSoftware source set complete\e[0m"

}

#11
install_package () {
   
    if [[ $OS == CentOS-Linux-7* ]];then
        yum install bash-completion vim-enhanced tree psmisc wget bc iotop gcc make gcc-c++ glibc glibc-devel pcre pcre-devel openssl openssl-devel zip unzip zlib-devel net-tools lrzsz ntpdate telnet lsof tcpdump libevent libevent-devel openssh-server openssh-clients postfix -y
    elif [[ $OS == CentOS-Linux-8* ]];then
        dnf install bash-completion vim-enhanced tree psmisc wget bc iotop gcc make gcc-c++ glibc glibc-devel pcre pcre-devel openssl openssl-devel zip unzip zlib-devel net-tools lrzsz chrony telnet lsof tcpdump libevent libevent-devel openssh-server openssh-clients postfix -y
    elif [[ $OS == Ubuntu-18.04* ]];then
        apt install make gcc iproute2 ntpdate tcpdump telnet traceroute nfs-kernel-server nfs-common lrzsz tree zip unzip openssl libssl-dev libpcre3 libpcre3-dev zlib1g-dev iotop libreadline-dev libsystemd-dev -y
    fi
    echo -e "\e[32;1mCommon Package already install\e[0m"
}

#12
set_time_sync () {
   
    if [[ $OS == CentOS-Linux-7* ]];then
        echo '*/5 * * * * ntpdate time1.aliyun.com &> /dev/null && hwclock -w' >> /var/spool/cron/root
        systemctl restart crond
    elif [[ $OS == CentOS-Linux-8* ]];then
        sed -i.bak '/^pool /c pool time1.aliyun.com iburst' /etc/chrony.conf
        systemctl restart chronyd && systemctl enable chronyd
        echo '*/5 * * * * chronyc -a makestep &> /dev/null && hwclock -w' >> /var/spool/cron/root
        systemctl restart crond
    elif [[ $OS == Ubuntu-18.04* ]];then
        echo '*/5 * * * * ntpdate time1.aliyun.com &> /dev/null && hwclock -w' >> /var/spool/cron/root
        systemctl restart cron
    fi
    echo -e "\e[32;1mTime sync complete\e[0m"
}

#13
set_eth () {
   
    if [[ $OS == CentOS* ]];then
        sed -i.bak '/GRUB_CMDLINE_LINUX/s#"$# net.ifnames=0"#' /etc/default/grub
        grub2-mkconfig -o /boot/grub2/grub.cfg &> /dev/null
    elif [[ $OS == Ubuntu-18.04* ]];then
        sed -i.bak '/GRUB_CMDLINE_LINUX/s#"$#net.ifnames=0"#' /etc/default/grub
        grub-mkconfig -o /boot/grub/grub.cfg &> /dev/null
    fi

    echo -e "\e[32;1mNetname already modify,Restart to take effect\e[0m"
}

set_eth0 () {
   
    if [[ $OS == Ubuntu-18.04* ]];then
        mv /etc/netplan/01-netcfg.yaml{
   ,.bak}
cat > /etc/netplan/01-netcfg.yaml <<EOF
network:
  version: 2
  renderer: networkd
  ethernets:
    eth0:
      dhcp4: no
      addresses: [10.0.0.9/24]
      gateway4: 10.0.0.2
      nameservers:
        addresses: [223.5.5.5,114.114.114.114]
EOF
    fi
    echo -e "\e[32;1mIP already set\e[0m"
}

#14
set_ip () {
   
    if [[ $OS == CentOS-Linux-8* ]];then
        mv /etc/sysconfig/network-scripts/ifcfg-ens160{
   ,.bak}
    read -p "Please input IP: " IP
    read -p "Please input Prefix: " PREFIX
    read -p "Please input Gateway: " GATEWAY
    read -p "Please input DNS1: " DNS1
    read -p "Please input DNS2: " DNS2
cat > /etc/sysconfig/network-scripts/ifcfg-eth0 <<EOF
TYPE=Ethernet
NAME=eth0
DEVICE=eth0
BOOTPROTO=static
ONBOOT=yes
IPADDR=$IP
PREFIX=$PREFIX
GATEWAY=$GATEWAY
DNS1=$DNS1
DNS2=$DNS2
EOF
    elif [[ $OS == CentOS-Linux-7* ]];then
        mv /etc/sysconfig/network-scripts/ifcfg-ens33{
   ,.bak}
    read -p "Please input IP: " IP
    read -p "Please input Prefix: " PREFIX
    read -p "Please input Gateway: " GATEWAY
    read -p "Please input DNS1: " DNS1
    read -p "Please input DNS2: " DNS2
cat > /etc/sysconfig/network-scripts/ifcfg-eth0 <<EOF
TYPE=Ethernet
NAME=eth0
DEVICE=eth0
BOOTPROTO=static
ONBOOT=yes
IPADDR=$IP
PREFIX=$PREFIX
GATEWAY=$GATEWAY
DNS1=$DNS1
DNS2=$DNS2
EOF
    elif [[ $OS == Ubuntu-18.04* ]];then
        mv /etc/netplan/01-netcfg.yaml{
   ,.bak}
        read -p "Please input IP/PREFIX: " IP_MASK
        read -p "Please input Gateway: " GATEWAY
        read -p "Please input DNS: " DNS
cat > /etc/netplan/01-netcfg.yaml <<EOF
network:
  version: 2
  renderer: networkd
  ethernets:
    eth0:
      dhcp4: no
      addresses: [$IP_MASK]
      gateway4: $GATEWAY
      nameservers:
        addresses: [$DNS]
EOF
    fi
    echo -e "\e[32;1mIP already set\e[0m"
}



echo -en "\e[32;1m"
cat <<EOF

This script applies to centos7 centos8 ubuntu1804!!!

Please select: 
1)Perimtrootlogin
2)Disable SElinux
3)Disable Firewall
4)Modify PS1
5)Set default text editor
6)Modify vim
7)Set History
8)Modify kernel parameters
9)Modify resource limits
10)set_software_source
11)Install Common Package
12)Set Time Sync
13)Modify NetName
14)Set IP
15)All realized
EOF
echo -en '\e[0m'
read -p "Please input number 1-15: " MENU
case $MENU in
1)
    set_ssh
    ;;
2)
    disable_selinux
    ;;
3)
    disbale_firewall
    ;;
4)
    set_ps1
    ;;
5)
    set_default_text_editor_vim
    ;;
6)
    set_vim
    ;;
7)
    set_history
    ;;
8)
    modify_kernel_parameters
    ;;
9)
    modify_resource_limits
    ;;
10)
    set_software_source
    ;;
11)
    install_package
    ;;
12)
    set_time_sync
    ;;
13)
    set_eth
    set_eth0
    ;;
14)
    set_ip
    ;;
15)
    #set_ssh
    disable_selinux
    disbale_firewall
    set_ps1
    set_default_text_editor_vim
    set_vim
    set_history
    modify_kernel_parameters
    modify_resource_limits
    set_software_source
    install_package
    set_time_sync
    set_eth
    set_eth0
    #set_ip
    echo -e "\e[32;1mAll done\e[0m"
    ;;
*)
    echo -e "\e[32;1mINPUY FLASE!\e[0m"
    ;;
esac
