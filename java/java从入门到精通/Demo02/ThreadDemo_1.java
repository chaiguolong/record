public class ThreadDemo_1 {
	public static void main(String[] args) {
		new TestThread().start();
		//循环输出
		for (int i = 0; i < 10; i++) {
			System.out.println("main 线程在运行");
		}
	}
}

class TestThread extends Thread{
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("TestThread 在运行...");
		}
	}
}
