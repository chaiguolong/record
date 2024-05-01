public class ThreadDemo_3 {
	public static void main(String[] args) {
		//启动了4个线程,分别进行各自的操作
		new TestThread().start();
		new TestThread().start();
		new TestThread().start();
		new TestThread().start();
	}
	
}
class TestThread extends Thread{
	private int ticket = 20;
	public void run(){
		while (true) {
			if(ticket > 0){
				System.out.println(Thread.currentThread().getName()+"出售票"+ticket--);
			}
		}
	}
}
