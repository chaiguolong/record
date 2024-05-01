public class ThreadDemo_5 {
	public static void main(String[] args) {
		TestThread tt = new TestThread();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
	}
	
}
class TestThread implements Runnable{
	private int tickets = 20;
	public void run(){
		while (true) {
			synchronized(this){
				if(tickets > 0){
					try {
						Thread.sleep(100);
					} catch(Exception e){}

					System.out.println(Thread.currentThread().getName()+"出售票"+tickets--);
				}
			}
		}
	}
}
