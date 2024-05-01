package org.lxh.enumdemo.demo03;
import org.lxh.enumdemo.demo02.Color01;

public class TestColor03 {
	public static void main(String[] args) {
		switch (Color01.RED) {
			case RED:
				{
					System.out.println("红色");
					break;
				}	
			case GREEN:
				{
					System.out.println("绿色");
					break;
				}          
			case BLUE:
				{
					System.out.println("蓝色");
					break;
				}
		}
	}
	
}
