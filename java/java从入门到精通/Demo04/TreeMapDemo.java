import java.util.Collection;
import java.util.Iterator;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		//创建TreeMap对象
		TreeMap<Integer, String> tm = new TreeMap<>();
		//加入元素到TreeMap中
		tm.put(10000-2000, "张三");
		tm.put(10000-1500, "李四");
		tm.put(10000-2500, "王五");
		tm.put(10000-5000, "赵六");
		Collection<String> col = tm.values();
		Iterator<String> it = col.iterator();
		System.out.println("按工资由高到低顺序输出: ");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
