
#!/usr/bin/env bash

# 检测本机当前用户是否为超级管理员,如果是管理员,
# 则使用 yum 安装 vsftpd,如果不
# 是,则提示您非管理员(使用 UID 数字对比版本)
if [ $UID -eq 0 ];then
 yum ‐y install vsftpd
else
 echo "您不是管理员,没有权限安装软件"
fi
