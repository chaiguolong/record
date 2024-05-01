package org.lxh.enumdemo.demo03;

import org.lxh.enumdemo.demo02.Color01;

public class TestColor05 {
	public static void main(String[] args) {
		for (Color01 c : Color01.values()) {
			System.out.println(c.name() + "-->" + c.ordinal());
		}
	}
	
}
