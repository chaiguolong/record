#!/usr/bin/env bash


fpath="/etc/passwd"

# if [ -e $fpath]:then
#    echo File exists;
# else
#     echo Does not exist;
# fi

if [ -e $fpath ]
then echo File exists;
else echo Does not exist;
fi

