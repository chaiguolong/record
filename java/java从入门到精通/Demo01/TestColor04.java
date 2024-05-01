package org.lxh.enumdemo.demo03;

import org.lxh.enumdemo.demo02.*;
public class TestColor04 {
	public static void main(String[] args) {
		for ( Color01 c: Color01.values()) {
			System.out.print(c + ", ");
		}
		System.out.println();
	}
	
}
