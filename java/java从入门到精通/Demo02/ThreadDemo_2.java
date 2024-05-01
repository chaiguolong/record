public class ThreadDemo_2 {
	public static void main(String[] args) {
		TestThread tt = new TestThread();
		new Thread(tt).start();
		//循环输出
		for (int i = 0; i < 10; i++) {
			System.out.println("main线程在运行...");
		}
	}
}

class TestThread implements Runnable{
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("TestThread 在运行...");
		}
	}
}
