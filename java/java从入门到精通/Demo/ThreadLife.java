public class ThreadLife {
	public static void main(String[] args) {
		TestThread t = new TestThread();
		new Thread(t).start();
		try {
			Thread.sleep(50);
		} catch(Exception e){
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			if(i == 5){
				t.stopMe();
			}
			System.out.println("Main 线程在运行");
		}
	}
}

class TestThread implements Runnable{
	private boolean bFlag = true;
	public void stopMe(){
		bFlag = false;
	}

	public void run(){
		while (bFlag) {
			System.out.println(Thread.currentThread().getName()+" 在运行");
		}
	}
}
