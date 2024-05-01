class TestThread extends Thread{
	private int tickets = 20;
	public void run(){
		while (true) {
			if(tickets > 0){
				System.out.println(Thread.currentThread().getName()+"出售票"+tickets--);
			}
		}
	}
}
public class ThreadDemo_3 {
	public static void main(String[] args) {
		// TestThread tt = new TestThread();
		//一个线程对象只能启动一次.
		// tt.start();
		// tt.start();
		// tt.start();
		// tt.start();
		//启动了4个线程,分别进行各自的操作
		// new TestThread().start();
		// new TestThread().start();
		// new TestThread().start();
		// new TestThread().start();
	}
}
