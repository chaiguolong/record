public class StartThreadDemo extends Thread{

	public void run(){
		for (int i = 0; i < 10; i++) {
			printMsg();
		}
	}

	public void printMsg(){
		String name = Thread.currentThread().getName();
		System.out.println("name = "+ name);
	}

	public static void main(String[] args) {
		StartThreadDemo st = new StartThreadDemo();
		st.setName("test Thread");
		System.out.println("调用start()方法之前,st.isAlive() ="+st.isAlive());
		st.start();
		System.out.println("调用start()方法之后,st.isAlive() ="+st.isAlive());
		for (int i = 0; i < 10; i++) {
			st.printMsg();
		}

		//下面语句的输出结果是不固定的,有时输出false,有时输出true;
		System.out.println("main()方法结束时,st.isAlive() ="+st.isAlive());
	}
	
}
