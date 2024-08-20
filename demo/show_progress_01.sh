#!/usr/bin/env bash
# 编写脚本,显示进度条
# 进度条分为三部分(1.显示进度的主体: [############]; 2.显示进度的百分比[50%]; 3.显示进度的状态[*])

str='#'
char=('|' '/' '-' '\')
i=0
index=0

while [ $i -le 100 ]; do
    # 注意选项\r,回到行首.
    printf "[%-100s][%d%%][%c]\r" $str $i ${char[$index]}
    str+='#'
    let index=i%4
    let i++
    sleep 0.1
done
echo "\n"
echo "安装完成"
