import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		//创建一个ArrayList对象
		ArrayList<String> al = new ArrayList<>();
		System.out.println("al的初始化大小为: "+al.size());
		//向ArrayList对象中添加新内容
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		//把A2加在ArrayList对象的第二个位置
		al.add(1, "A2");
		System.out.println("al加入元素之后的大小: "+ al.size());
		//显示ArrayList数据
		System.out.println("al的内容: "+al);
		//从ArrayList中移出数据
		al.remove("F");
		al.remove(2);
		System.out.println("al 删除元素之后的大小: "+al.size());
		System.out.println("al 的内容: "+al);
	}
	
}
