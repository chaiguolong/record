import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		//创建HashSet对象
		HashSet<String> hs = new HashSet<>();
		//加入元素到HashSet中
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		hs.add("你好");
		System.out.println(hs);
	}
	
}
