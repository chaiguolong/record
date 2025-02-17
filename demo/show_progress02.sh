#!/usr/bin/env bash

# 编写脚本,显示进度条

jindu(){
    while :; do
	echo -n '#'
	sleep 0.2
    done
}

jindu &
PID=$!
cp -a $1 $2
sleep 5
kill $PID
# 回车
echo ""
echo "拷贝完成"
