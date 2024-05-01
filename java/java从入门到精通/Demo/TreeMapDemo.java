import java.util.*;
public class TreeMapDemo {
	public static void main(String[] args) {
		//创建TreeMap对象
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(10000-2000, "张三");
		tm.put(10000 - 1500, "李四");
		tm.put(10000 - 2500, "王五");
		tm.put(10000 - 50000, "赵六");
		Collection<String> col = tm.values();
		Iterator<String> it = col.iterator();
		//按工资由高到底顺序输出:
		System.out.println("按工资由高到底顺序输出:");
		while (it.hasNext()) {
			String ele = it.next();
			System.out.println(ele);
		}
	}
}
