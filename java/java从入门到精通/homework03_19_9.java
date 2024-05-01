class TestThread implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName()+"在运行...");
	}
}
public class homework03_19_9 {
	public static void main(String[] args) {
		TestThread tt = new TestThread();
		Thread t = new Thread(tt);
		t.start();
		try {
			Thread.sleep(10000);
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		t.interrupt();
		System.out.println("main方法退出...");
	}
	
}
