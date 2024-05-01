import java.util.*;
public class StackDemo {

	static void showPush(Stack<Integer> st, int a){
		st.push(a);
		System.out.println("入栈("+a+")");
		System.out.println("Stack:"+st);
	}

	static void showPop(Stack<Integer> st){
		System.out.print("出栈->");
		Integer a = st.pop();
		System.out.println(a);
		System.out.println("Stack: "+st);
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		System.out.println("Stack: "+ st);
		showPush(st, 42);
		showPush(st, 66);
		showPush(st, 99);
		showPop(st);
		showPop(st);
		showPop(st);
		//出栈的时候会有一个EmptyStackException的异常,需要进行异常处理
		try {
			showPop(st);
		} catch(EmptyStackException e){
			System.out.println("出现异常:栈中内容为空");
		}

	}
	
}
