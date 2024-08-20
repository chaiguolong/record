#!/usr/bin/env bash
# 编写脚本,制作进度条
# 思路:进度条有三部分: 1.进度条主题(######); 2.进度条百分比([50%]); 3.进度条状态([*])

# 1.前期准备
str='#'
percent=0
ch=('-' '\' '|' '/')
index=0

# 2.打印进度条
while [ $percent -le 25 ]; do
    printf "[%-25s][%d%%][%c]\r" $str $[$percent*4] ${ch[$index]}
    str+='#'
    let percent++
    let index=percent%4
    # percent=$[ $percent + 1 ]
    # index=$[ $percent%4 ]
    sleep 0.1
done
echo  ""
echo "安装完成"
