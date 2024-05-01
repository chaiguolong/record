import java.util.*;
class Employee implements Comparator{
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
public class TreeMapDemo2 {
	public static void main(String[] args) {
		//创建一个TreeMap对象
		TreeMap<String,Double> tm = new TreeMap<String,Double>(new Employee());
		//向Map对象中插入元素
		tm.put("Z,张三", 3534.34);
		tm.put("L,李四", 126.22);
		tm.put("W,王五", 1578.40);
		tm.put("Z,赵六", 99.62);
		tm.put("S,孙七", -29.08);
		Set<Map.Entry<String,Double>> set = tm.entrySet();
		Iterator<Map.Entry<String,Double>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String,Double> entry = it.next();
			System.out.print(entry.getKey()+":");
			System.out.println(entry.getValue());
		}
		System.out.println();
		double balance = tm.get("Z,张三").doubleValue();
		tm.put("Z,张三", balance + 2000);
		System.out.println("张三最新的资金数为: "+tm.get("Z,张三"));
	}
	
}
