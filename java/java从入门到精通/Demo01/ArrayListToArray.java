import java.util.ArrayList;

public class ArrayListToArray {
	public static void main(String[] args) {
		//创建一ArrayList对象al
		ArrayList<Integer> al = new ArrayList<>();
		//向ArrayList中添加对象
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println("ArrayList中的内容: "+al);
		//得到对象数组
		Object a[] = al.toArray();
		int sum = 0;
		//计算数组内容
		for (int i = 0; i < a.length; i++) {
			// sum += ((Integer)a[i]).intValue();
			sum += (Integer)a[i];
		}
		System.out.println("数组累加结果是: "+sum);

	}
	
}
