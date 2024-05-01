class TestThread extends Thread{
	private int tickets = 20;
	public void run(){
		while (true) {
			if (tickets > 0) {
				System.out.println(Thread.currentThread().getName()+"出售票"+tickets--);
			}
		}
	}
}
public class ThreadDemo_3 {
	public static void main(String[] args) {
		//启动4个进程
		new TestThread().start();
		new TestThread().start();
		new TestThread().start();
		new TestThread().start();
	}
	
}
