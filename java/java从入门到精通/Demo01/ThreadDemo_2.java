class TestThread implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("TestThread在运行...");
        }
    }
}
public class ThreadDemo_2 {
	public static void main(String[] args) {
        TestThread t = new TestThread();
        new Thread(t).start();
        //循环输出
        for (int i = 0; i < 10; i++) {
            System.out.println("Main 线程在运行...");
        }
	}
	
}
