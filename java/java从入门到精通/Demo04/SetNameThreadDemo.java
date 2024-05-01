public class SetNameThreadDemo extends Thread{
	public void run(){
		for (int i = 0; i < 10; i++) {
			printMsg();
		}
	}

	public void printMsg(){
		//获取当前线程
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("name = "+ name);
	}
	public static void main(String[] args) {
		SetNameThreadDemo st = new SetNameThreadDemo();
		st.setName("test thread");
		st.start();
		for (int i = 0; i < 10; i++) {
			st.printMsg();
		}
	}
	
}
