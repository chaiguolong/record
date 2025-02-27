#!/usr/bin/env bash
#文件名: match_palindrome.sh
#用途: 找出给定文件中的回文字

# $#表示执行脚本传入的参数个数
# -ne运算符判断两个数值是否不相等
if [ $# -ne 2 ];
then
    echo "Usage: $0 filename string_length"
    exit -1
fi

filename=$1;
basepattern='/^\(.\)'
count=$(( $2 / 2 ))
for(( i=1; i<$count; i++ ))
do
    basepattern=$basepattern'\(.\)' ;
done

if [ $(( $2 % 2 )) -ne 0 ];
then
    basepattern=$basepattern'.' ;
fi

for((count;count>0;count--))
do
    basepattern=$basepattern'\'"$count" ;
done
    
basepattern=$basepattern'$/p'
sed -n "$basepattern" $filename
