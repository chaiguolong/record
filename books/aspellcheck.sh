#!/usr/bin/env bash

#文件名: aspellcheck.sh

word=$1
output=`echo \"$word\" | aspell list`
if [ -z $output ]
then echo $word is a dictionary word;
else
    echo $word is not a dictionary word;
fi
