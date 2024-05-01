import java.io.IOException;

public class RuntimeDemo {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec("/Applications/Calculator.app/Contents/MacOS/Calculator");
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
