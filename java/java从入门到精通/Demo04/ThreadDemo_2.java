class TestThread implements Runnable{
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("TestThread 在运行...");
		}
	}
}
public class ThreadDemo_2 {
	public static void main(String[] args) {
		TestThread tt = new TestThread();
		Thread t = new Thread(tt);
		t.start();
		//循环输出
		for (int i = 0; i < 10; i++) {
			System.out.println("main 线程在运行...");
		}
	}
	
}
