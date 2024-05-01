package org.lxh.enumdemo.demo04;

import java.util.EnumMap;
import java.util.Map;

import org.lxh.enumdemo.demo02.*;
public class EnumMapDemo {
	public static void main(String[] args) {
		EnumMap<Color01, String> em = new EnumMap<>(Color01.class);
		em.put(Color01.RED, "红色");
		em.put(Color01.GREEN, "绿色");
		em.put(Color01.BLUE, "蓝色");
		for (Map.Entry<Color01, String> entry : em.entrySet() ) {
			System.out.println(entry.getKey() + "-->"+entry.getValue());
		}
	}
	
}
