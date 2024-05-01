package org.lxh.enumdemo.demo06;

import org.lxh.enumdemo.demo06.Color;
public class TestColor {
	public static void main(String[] args) {
		for (Color c : Color.values()) {
			System.out.println(c.ordinal()+"-->"+c.name()+": "+c.getColor());
		}
	}
	
}
