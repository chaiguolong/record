package org.lxh.enumdemo.demo05;
public class Color {
	RED("红色"),GREEN("绿色"),BLUE("蓝色");

	private String name;
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	Color(String name){
		this.setName(name);
	}
	
}
