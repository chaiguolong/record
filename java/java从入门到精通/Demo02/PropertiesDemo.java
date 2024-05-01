import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) {
		Properties capitals = new Properties();
		Set<Object> states;
		String str;
		capitals.put("中国", "北京");
		capitals.put("俄罗斯", "莫斯科");
		capitals.put("日本", "东京");
		capitals.put("法国", "巴黎");
		capitals.put("英国", "伦敦");

		//返回包含映射中项的集合
		states = capitals.keySet();
		Iterator<Object> it = states.iterator();
		while (it.hasNext()) {
			str = (String)it.next();
			System.out.println("国家: "+str+", 首都: "
					+ (String)capitals.get(str)+".");
		}

		System.out.println();
		//查找列表,如果没有则显示为"没有发现"
		str = capitals.getProperty("美国", "没有发现");
		System.out.println("美国的首都: "+ str);
	}
	
}
