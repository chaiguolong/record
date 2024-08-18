#!/usr/bin/env bash

# 脚本生成一个 100 以内的随机数,提示用户猜数字,
# 根据用户的输入,提示用户猜对了,
# 猜小了或猜大了,直至用户猜对脚本结束

# 随机生成一个1-100的数字
num=$[$RANDOM%100+1]
echo $num

while :; do
    read -p "请输入一个数字:" cai
    if [ $cai -eq $num ]
    then
	echo "恭喜你,猜对了."
	exit
    elif [ $cai -gt $num ]
    then
	echo "Oops,你猜大了."
    else
	echo "Oops,你猜小了."
fi

done
