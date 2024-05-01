package org.lxh.enumdemo.demo06;
public class TestColor {
	public static void main(String[] args) {
		for (Color c : Color.values()) {
			System.out.println(c.ordinal() + "--> "+c.name()+": "+ c.getColor());
		}
	}
	
}
