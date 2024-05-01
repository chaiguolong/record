package org.lxh.enumdemo.demo04;

import java.util.EnumSet;
import java.util.Iterator;

import org.lxh.enumdemo.demo02.Color01;
public class EnumSetDemo02 {
	public static void main(String[] args) {
		EnumSet<Color01> es = EnumSet.noneOf(Color01.class);
		Iterator<Color01> it = es.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
	
}
