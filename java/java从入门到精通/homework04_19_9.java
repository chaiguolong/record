class TestThread implements Runnable{
	public void run(){
		try {
			Thread.sleep(20000);
		} catch(InterruptedException e){
			System.out.println("被中断了...");
		}
		System.out.println(Thread.currentThread().getName()+"在运行...");
	}
}
public class homework04_19_9 {
	public static void main(String[] args) {
		TestThread tt = new TestThread();
		Thread t = new Thread(tt);
		t.start();
		try {
			Thread.sleep(10000);
		} catch(Exception e){
			e.printStackTrace();
		}
		t.interrupt();
	}
	
}
