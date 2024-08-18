#!/usr/bin/env bash

# 猜数字
# 随机生成一个1-100的数字(Random),如果大于生成的数字
# 就说猜大了,如果小于这个数字,则说猜小了

num=$[$RANDOM%100+1]
echo $num

while :; do
read -p "请输入一个数字:" cai
    if [ $cai -eq $num ]
    then
	echo "恭喜你,猜对了."
	exit
    elif [ $cai -ge $num ]
    then
	echo "Oops 猜大了."
    else
	echo "Oops 猜小了."
fi

done
