import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		//创建LinkedList对象
		LinkedList<String> ll = new LinkedList<>();
		//加入元素到LinkedList中
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		//在链表的最后一个位置添加数据
		ll.addLast("Z");
		//在链表的第一个位置上加入数据
		ll.addFirst("A");
		//在链表的第二个位置上加入数据
		ll.add(1, "A2");
		System.out.println("ll最初的内容: "+ll);
		//从linkedList中移出元素
		ll.remove("F");
		ll.remove(2);
		System.out.println("从ll中移除内容之后: "+ll);
		//移除第一个和最后一个元素
		ll.removeFirst();
		ll.removeLast();
		System.out.println("ll移除第一个和最后一个元素之后的内容: "+ll);
		//取得并设置值
		String val = ll.get(2);
		ll.set(2, val+"Changed");
		System.out.println("ll被改变之后: "+ll);
	}
	
}
