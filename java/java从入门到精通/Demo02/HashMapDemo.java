import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		//创建HashMap对象
		HashMap<String, Double> hm = new HashMap<>();
		//加入元素到HashMap中
		hm.put("John Doe", 3434.34);
		hm.put("Tom Smith", 123.22);
		hm.put("Jane Baker", 1378.00);
		hm.put("Todd Hall", 99.22);
		hm.put("Ralph Smith", -19.08);
		//返回包含映射中项的集合
		Set<Map.Entry<String, Double>> set = hm.entrySet();
		//用Iterator得到HashMap中的内容
		Iterator<Map.Entry<String, Double>> it = set.iterator();
		//显示元素
		while (it.hasNext()) {
			//Map.Entry可以操作映射的输入
			Map.Entry<String, Double> entry = it.next();
			String key = entry.getKey();
			double val = entry.getValue();
			System.out.println(key + ":" + val);
		}
		//让John Doe中的值增加1000
		hm.put("John Doe", hm.get("John Doe") + 1000);
		System.out.println("John Doe's现在的资金: "+ hm.get("John Doe"));
	}
	
}
