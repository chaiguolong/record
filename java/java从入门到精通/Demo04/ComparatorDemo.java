import java.util.Comparator;
import java.util.Iterator;

import java.util.TreeSet;

class MyComp implements Comparator<Object>{
	public int compare(Object o1, Object o2){
		String aStr, bStr;
		aStr = (String) o1;
		bStr = (String) o2;
		return bStr.compareTo(aStr);
	}
}
public class ComparatorDemo {
	public static void main(String[] args) {
		//创建一个TreeSet对象
		TreeSet<String> ts = new TreeSet<>(new MyComp());
		//向TreeSet对象中加入内容
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		//得到Iterator的实例化对象
		Iterator<String> it = ts.iterator();
		//显示全部内容
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
	
}
