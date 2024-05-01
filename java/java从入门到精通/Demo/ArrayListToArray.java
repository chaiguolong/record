import java.util.*;
public class ArrayListToArray {
	public static void main(String[] args) {
		//创建一个ArrayList对象al
		ArrayList<Integer> al = new ArrayList<Integer>();
		//想ArrayList中加入对象
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println("ArrayList中的内容: "+al);
		//得到对象数组
		Object ia[] = al.toArray();
		int sum = 0;
		//计算数组内容
		for (int i = 0; i < ia.length; i++) {
			sum += ((Integer)ia[i]).intValue();
		}
		System.out.println("数组累加结果是: " + sum);
	}
}
