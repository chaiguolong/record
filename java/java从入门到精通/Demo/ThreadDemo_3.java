public class ThreadDemo_3 {
	public static void main(String[] args) {
		//启动了4个线程,分别各自的操作
		new TestThread().start();
		new TestThread().start();
		new TestThread().start();
		new TestThread().start();
	}
	
}

class TestThread extends Thread{
	private int tickets = 20;
	public void run(){
		while(true){
			if(tickets > 0){
				System.out.println(Thread.currentThread().getName()+"出售票"+tickets--);
			}
		}
	}
}
