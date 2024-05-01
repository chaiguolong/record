import java.io.PrintWriter;

public class SystemPrintDemo {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);
		pw.print("Hello world!");
		pw.close();
	}
	
}
