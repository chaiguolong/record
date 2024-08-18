#!/usr/bin/env bash

# 依次提示用户输入3个整数,脚本根据数字大小一次排序输出3个数字
read -p "请输入第一个整数:" num1
read -p "请输入第二个整数:" num2
read -p "请输入第三个整数:" num3

# 不管谁大谁小,最后都打印echo "$num1,$num2,$num3"
# num1中永远存最小的值,num2中永远存中间值,num3中永远存最大值
# 如果输入的不是这样的顺序,则改变数的存储顺序


# 将这排序想象成被3个碗盖住的骰子,num1,num2,num3为3个碗
# 它们所对应的数据就是碗里的骰子点数(这里运用的是冒泡排序
# 每次将最大的点数移到最后一个碗)


# 如果num1>num2,那么把num1和num2交换.
if [ $num1 -ge $num2 ]
then
    temp=$num1
    num1=$num2
    num2=$temp
fi

# 如果num2>num3,那么把num2和num3交换.
if [ $num2 -ge $num3 ]
then
    temp=$num2
    num2=$num3
    num3=$temp
fi

# 如果num1>num3,那么把num1和num3交换.
if [ $num1 -ge $num3 ]
then
    temp=$num1
    num1=$num3
    num3=$temp
fi


echo "排序后的数据(从小到大)为:$num1,$num2,$num3"

