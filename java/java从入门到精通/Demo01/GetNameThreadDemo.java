public class GetNameThreadDemo extends Thread{
	public void run(){
		for (int i = 0; i < 10; i++) {
			printMsg();
		}
	}

	public void printMsg(){
		//获得运行此代码的线程的引用
		String name = Thread.currentThread().getName();
		System.out.println("name = "+name);
	}


	public static void main(String[] args) {
		GetNameThreadDemo t1 = new GetNameThreadDemo();
		t1.start();
		for (int i = 0; i < 10; i++) {
			t1.printMsg();
		}
	}
	
}
