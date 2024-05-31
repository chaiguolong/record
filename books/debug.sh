#!/bin/bash
#文件名:debug.sh

for i in {1..6}
do
    sex -x
    echo $i
    set +x
done
echo "Script executed"
