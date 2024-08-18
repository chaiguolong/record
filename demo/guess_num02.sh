#!/usr/bin/env bash

# 猜数字游戏
# 随你生成一个1-100的数字,请你猜出这个数字是多少?

num=$[RANDOM%100+1]
echo $num

while :; do
    read -p "请输入一个数字:" cai
    if [ $cai -eq $num ]
    then
	echo "恭喜你,猜中了."
	exit
    elif [ $cai -gt $num ]
    then
	echo "Oops, 你猜大了."
    else
	echo "Oops, 你猜小了."
fi

done
