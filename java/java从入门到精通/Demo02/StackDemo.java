import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {
	static void showpush(Stack<Integer> st, int a){
		st.push(a);
		System.out.println("入栈("+a+")");
		System.out.println("Stack:"+st);
	}

	static void showpop(Stack<Integer> st){
		System.out.println("出栈-->");
		Integer a = st.pop();
		System.out.println(a);
		System.out.println("Stack: "+st);
	}
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		System.out.println("Stack: "+st);
		showpush(st, 42);
		showpush(st, 66);
		showpush(st, 99);
		showpop(st);
		showpop(st);
		showpop(st);
		//出栈的时候会有一个EmptyStackException的异常,需要进行异常处理
		try {
			showpop(st);
		} catch(EmptyStackException e){
			System.out.println("出现异常: 栈中内容为空");
		}
	}
	
}
