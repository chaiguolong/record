public class TwoThreadSleep extends Thread{
	public void run(){
		loop();
	}

	public void loop(){
		String name = Thread.currentThread().getName();
		System.out.println(name +"-->刚进入loop方法");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("name="+name);
		}
		System.out.println(name + "--> 离开loop方法");
	}

	public static void main(String[] args) {
		TwoThreadSleep tts = new TwoThreadSleep();
		tts.setName("my worker thread");
		tts.start();
		try {
			Thread.sleep(700);
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		tts.loop();
	}
	
}
