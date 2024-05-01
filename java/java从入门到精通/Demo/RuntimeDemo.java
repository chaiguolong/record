public class RuntimeDemo {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		try {
			run.exec("/Applications/Timer.app/Contents/MacOS/timer");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
