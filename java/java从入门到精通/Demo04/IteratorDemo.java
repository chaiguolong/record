import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
	public static void main(String[] args) {
		//创建一个ArrayList数组
		ArrayList<String> al = new ArrayList<>();
		//加入元素到ArrayList中
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		//使用iterator显示al中的内容
		System.out.print("al 中原始内容是: ");
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			String element = it.next();
			System.out.print(element + " ");
		}
		System.out.println();
		//在ListIterator中修改内容
		ListIterator<String> lit = al.listIterator();
		while (lit.hasNext()) {
			String listString = lit.next();
			//用set方法修改其内容
			lit.set(listString + "+");
		}
		System.out.println("al 被修改之后的内容:");
		Iterator<String> it_2 = al.iterator();
		while (it_2.hasNext()) {
			System.out.print(it_2.next() + " ");
		}
		System.out.println();
		//下面是将列表中的内容反向输出
		System.out.println("将列表反向输出: ");
		//hasPreviours由后向前输出
		while (lit.hasPrevious()) {
			System.out.print(lit.previous() + " ");
		}
		System.out.println();
	}
	
}
