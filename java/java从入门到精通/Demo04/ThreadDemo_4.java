class TestThread implements Runnable{
	private int tickets=20;
	public void run(){
		while (true) {
			if(tickets > 0){
				System.out.println(Thread.currentThread().getName()+"出售票"+tickets--);
			}
		}
	}
}
public class ThreadDemo_4 {
	public static void main(String[] args) {
		TestThread tt = new TestThread();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
	}
	
}
