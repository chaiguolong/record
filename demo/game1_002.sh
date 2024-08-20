#!/usr/bin/env bash

# 人机实现剪刀石头布游戏.

# 1.设置电脑随机出拳.
# 1.1将电脑出拳放置在数组中.
game=(剪刀 石头 布)
# 1.2,设置随机数,随机选择数组中的元素
index=$[ RANDOM%3 ]
computor=${game[$index]}
# 2.你出拳时候的三种情况(用case)
echo "请根据下列提示选择出拳手势"
echo "1.剪刀"
echo "2.石头"
echo "3.布"

read -p "请选择你出拳的手势:" person

case $person in
     1)
     # 2.1你出剪刀时.
	if [ $index -eq 0 ]
	then
	    echo "平局"
	elif [ $index -eq 1 ]
	then
	    echo "计算机赢"
	else
	    echo "你赢"
	fi
	    ;;
     2)
     # 2.2你出石头时.
	if [ $index -eq 0 ]
	then
	    echo "你赢"
	elif [ $index -eq 1 ]
	then
	    echo "平局"
	else
	    echo "计算机赢"
	fi
        ;;
     3)
     # 2.3你出布时.
	if [ $index -eq 0 ]
	then
	    echo "计算机赢"
	elif [ $index -eq 1 ]
	then
	    echo "你赢"
	else
	    echo "平局"
	fi
	;;

     *)
	 echo "必须要输入1/2/3其中之一"
esac



