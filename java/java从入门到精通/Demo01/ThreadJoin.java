class ThreadTest implements Runnable{
	public void run(){
		// String str = new String();
		int i = 0;
		for (int x = 0; x < 10; x++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i++);
		}
	}
}
public class ThreadJoin {
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		Thread pp = new Thread(t);
		pp.start();
		int i = 0;
		for (int x = 0; x < 10; x++) {
			if (i == 5) {
				try {
					pp.join();
				} catch(Exception e){
					System.out.println(e.getMessage());
				}
			}
			System.out.println("main Thread"+i++);
		}
	}
	
}
