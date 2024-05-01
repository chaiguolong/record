public class ThreadJoin {
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		Thread t = new Thread(tt);
		t.start();
		int i = 0;
		for (int x = 0; x < 10; x++) {
			if(i == 5){
				try {
					t.join();
				} catch(Exception e){
					System.out.println(e.getMessage());
				}
			}
			System.out.println("main Thread "+i++);
		}

	}
	
}
class ThreadTest implements Runnable{
	public void run(){
		String str = new String();
		int i = 0;
		for (int x = 0; x < 10; x++) {
			System.out.println(Thread.currentThread().getName()+"----->"+i++);
		}
	}
}
