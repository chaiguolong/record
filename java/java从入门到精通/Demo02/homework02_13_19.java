import java.io.IOException;

public class homework02_13_19 {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec("/Applications/Calculator.app/Contents/MacOS/Calculator");
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
