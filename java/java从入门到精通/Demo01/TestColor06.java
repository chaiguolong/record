package org.lxh.enumdemo.demo03;

import org.lxh.enumdemo.demo02.*;
public class TestColor06 {
	public static void main(String[] args) {
		Color01 c = Color01.valueOf(Color01.class, "RED");
		System.out.println(c);
	}
	
}
