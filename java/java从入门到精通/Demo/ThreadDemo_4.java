public class ThreadDemo_4 {
	public static void main(String[] args) {
		TestTHread t = new TestTHread();
		//启动了4个线程,闭馆实现了资源共享的目的.
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}
	
}

class TestTHread implements Runnable{
	private int tickets = 20;
	public void run(){
		while(true){
			if(tickets > 0){
				System.out.println(Thread.currentThread().getName()+"出售票"+tickets--);
			}
		}
	}
}
