#!/bin/bash
# 文件名: filestat.sh

if [  $# -ne 1 ];
then
echo  $0 basepath;
echo
fi

path=$1
declare -A statarray;
while read line;
do
ftype=`file -b "$line" | cut -d , -f 1`
let statarray["$ftype"]++;


done< <( find $path -type f -print )


echo ============ File types and counts =============

for ftype in "${!statarray[@]}";

do

echo  $ftype :${statarray["$ftype"]}

done
