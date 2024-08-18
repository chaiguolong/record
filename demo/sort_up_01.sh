#!/usr/bin/env bash

# 升序排列三个数,先将最大数挑出来放在最后,
# 再比较第一个和第二个数字,谁最大,然后放在倒数第二个

# 1.依次输入三个数
read -p "请输入第一个数字:" num1
read -p "请输入第二个数字:" num2
read -p "请输入第三个数字:" num3

# 2.挑出3个数中的最大值,放在最后.
#   2.1比较第一个位置数字和第二个位置数字,将大的数放在后面
if [ $num1 -gt $num2 ]
then
    temp=$num2
    num2=$num1
    num1=$temp
fi

#   2.2比较第二个位置数字和第三个位置数字,将大的数放在后面

if [ $num2 -gt $num3 ]
then
    temp=$num3
    num3=$num2
    num2=$temp
fi
# 3.挑出剩下2个数的最大值,放到最后.


if [ $num1 -gt $num2 ]
then
    temp=$num2
    num2=$num1
    num1=$temp
fi

# 4.打印数字
echo "排序后的数字分别是:$num1,$num2,$num3"
