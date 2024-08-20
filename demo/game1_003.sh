#!/usr/bin/env bash

# 做一个人机版剪刀,石头,布

# 1.电脑获得一个随机出拳
# 1.1将出拳方式存在数组中
game=(剪刀 石头 布)
# 1.2获取一个3之内的随机数作为数组索引
index=$[ RANDOM%3 ]
# 1.3随机获得计算机的出拳方式
computor=${game[$index]}
echo  $computor
# 2.你出拳
echo "根据下列提示,选择出拳:"
echo "1.剪刀"
echo "2.石头"
echo "3.布"

read -p "请输入数字1-3,选择你的出拳:" person

# 3.根据你的出拳,与计算机进行比较
case $person in
    # 3.1你的出拳是剪刀
    1)
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
    # 3.2你的出拳是石头
    2)
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
    # 3.3你的出拳是布
    3)
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
	echo "你必须输入1-3的数字"
	
esac
