class TestThread  implements Runnable{
	public void  run(){
		System.out.println(Thread.currentThread().getName()
				+"在运行...");
	}
}
public class homework01_19 {
	public static void main(String[] args) {
		TestThread t = new TestThread();
		new Thread(t).start();
		try {
			Thread.sleep(10000);
		} catch(Exception e){
			e.printStackTrace();
		}
		Thread.interrupted();
		System.out.println("main 在运行....");
	}
	
}
