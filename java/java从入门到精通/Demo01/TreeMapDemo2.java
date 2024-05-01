import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import java.util.TreeMap;

class Employee implements Comparator<Object>{
	public int compare(Object a, Object b){
		int k;
		String aStr, bStr;
		aStr = (String)a;
		bStr = (String)b;
		k = aStr.compareTo(bStr);
		if(k == 0){
			return aStr.compareTo(bStr);
		}else{
			return k;
		}
	}
}
@SuppressWarnings("unchecked")
public class TreeMapDemo2 {
	public static void main(String[] args) {
		//创建一个TreeMap对象
		TreeMap<String, Double> tm = new TreeMap<>(new Employee());
		//向Map对象中插入元素
		tm.put("Z,张三", 3534.34);
		tm.put("L,李四", 126.22);
		tm.put("W,王五", 1578.40);
		tm.put("Z,赵六", 99.62);
		tm.put("S,孙七", -29.08);
		Set<Map.Entry<String, Double>> set = tm.entrySet();
		Iterator<Map.Entry<String, Double>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Double> entry = it.next();
			String key = entry.getKey();
			Double val = entry.getValue();
			System.out.println(key + ": "+ val);
		}

		tm.put("Z,张三", (tm.get("Z,张三") + 1000));
		System.out.println("张三最新的资金数为: "+ tm.get("Z,张三"));
	}
	
}
