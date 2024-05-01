public class SleepInterrupt implements Runnable{
	public void run(){
		try {
			System.out.println("在run()方法中 - 这个线程休眠20秒");
			Thread.sleep(20000);
			System.out.println("在run()方法中 - 继续运行");
		} catch(Exception e){
			System.out.println("在run()方法中 - 中断线程");
			return;
		}

		System.out.println("在run()方法中 - 休眠之后继续完成");
		System.out.println("在run()方法中 - 正常退出");
	}

	public static void main(String[] args) {
		SleepInterrupt t = new SleepInterrupt();
		Thread tt = new Thread(t);
		tt.start();
		//在此休眠是为了确保线程能运行一会
		try {
			Thread.sleep(2000);
		} catch(Exception e){
			e.getMessage();
		}
		System.out.println("在main方法中 - 中断其他线程");
		tt.interrupt();
		System.out.println("在main方法中 - 退出");
	}
}
