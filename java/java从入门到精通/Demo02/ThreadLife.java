class TestThread implements Runnable{
	private boolean bFlag = true;
	public void StopMe(){
		bFlag = false;
	}
	public void run(){
		while (bFlag) {
			System.out.println(Thread.currentThread().getName()+"在运行");
		}
	}
}
public class ThreadLife {
	public static void main(String[] args) throws Exception {
		TestThread tt = new TestThread();
		Thread t = new Thread(tt);
		t.start();
		t.getPriority();
		Thread.sleep(90);
		for (int i = 0; i < 10; i++) {
			if(i == 5){
				tt.StopMe();
			}
			System.out.println("Main线程在运行");
		}
	}
	
}
