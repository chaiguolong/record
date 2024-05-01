import java.util.*;
public class IteratorDemo {
	public static void main(String[] args) {
		//创建一个ArrayList数组
		ArrayList<String> al = new ArrayList<String>();
		//加入元素到ArrayList中
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		//使用Iterator显示al中的内容
		System.out.print("al 中原始的内容是: ");
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			String ele = it.next();
			System.out.print(ele + "	");
		}
		System.out.println();
		//在ListIterator中修改内容
		ListIterator<String> listIt =  al.listIterator();
		while (listIt.hasNext()) {
			String ele = listIt.next();
			listIt.set(ele + "+");
		}
		System.out.println("al 被修改之后的内容: ");
		Iterator<String> it_sec = al.iterator();
		while (it_sec.hasNext()) {
			String ele = it_sec.next();
			System.out.print(ele + "	");
		}
		System.out.println();
		//下面是将列表中的内容反向输出
		System.out.print("将列表反向输出: ");
		while (listIt.hasPrevious()) {
			String ele = listIt.previous();
			System.out.print(ele + "	");
		}
		System.out.println();
	}
	
}
