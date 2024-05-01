interface Usb{
	public void start();
	public void stop();
}

class MoveDisk implements Usb{
	public void start(){
		System.out.println("MoveDisk start...");
	}

	public void stop(){
		System.out.println("MoveDisk stop...");
	}
}

class Mp3 implements Usb{
	public void start(){
		System.out.println("Mp3 start...");
	}

	public void stop(){
		System.out.println("Mp3 stop ...");
	}
}

class Computer{
	public void work(Usb u){
		u.start();
		u.stop();
	}
}
public class TestInterface {
	public static void main(String[] args) {
		new Computer().work(new MoveDisk());
		new Computer().work(new Mp3());
	}
	
}
