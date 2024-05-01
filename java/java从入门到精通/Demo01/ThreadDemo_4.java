public class ThreadDemo_4 {
	public static void main(String[] args) {
		TestThread t = new TestThread();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}
	
}

class TestThread implements Runnable{
	private int tickets = 20;
	public void run(){
		while (true) {
			if(tickets > 0){
				System.out.println(Thread.currentThread().getName()+
						"出售票"+tickets--);
			}
		}
	}
}
