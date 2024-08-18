#!/usr/bin/env bash

# 输入三个数并进行升序排列
# 思路:每次将最大的数放在最后(这次数只有三个,
# 只需将最大的数放在最后,然后将剩下的两个数,
# 最大的放最后就可)

# 1.请输入三个数

read -p "请输入第一个数:" num1

read -p "请输入第二个数:" num2

read -p "请输入第三个数:" num3

# 2.将第一个数和第二个数对比,将大的数放在后面.
if [ $num1 -gt $num2 ]
then
    temp=$num2
    num2=$num1
    num1=$temp
fi


# 3.将第二个数和第三个数对比,将大的数放在后面.
if [ $num2 -gt $num3 ]
then
    temp=$num3
    num3=$num2
    num2=$temp
fi


# 4.将第一个数和第二个数对比,将大的数放在后面.
if [ $num1 -gt $num2 ]
then
    temp=$num2
    num2=$num1
    num1=$temp
fi

echo "排序后的结果是:$num1,$num2,$num3"



