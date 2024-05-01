class TestThread implements Runnable{
	public void  run(){
		System.out.println("线程先睡眠10s钟...");
		try {
			Thread.sleep(10000);
			System.out.println("线程还在运行......");
		} catch(InterruptedException e){
			System.out.println("线程被中断...");
			return;
		}
	}
}
public class homework02_19_9 {
	public static void main(String[] args) {
		TestThread tt = new TestThread();
		Thread t = new Thread(tt);
		t.start();
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e){}

		t.interrupt();
		System.out.println(t.isInterrupted());
		System.out.println("在main方法中 -- 中断其他线程");
	}
}
