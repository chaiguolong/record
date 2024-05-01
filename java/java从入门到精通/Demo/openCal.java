public class openCal {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		try {
			run.exec("/Applications/Calculator.app/Contents/MacOS/Calculator");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
