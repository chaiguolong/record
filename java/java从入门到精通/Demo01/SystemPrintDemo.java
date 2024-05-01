import java.io.PrintStream;

import java.io.PrintWriter;

public class SystemPrintDemo {
	public static void main(String[] args) {
		PrintWriter out = null;
		PrintStream out1 = null;
		out = new PrintWriter(System.out);
		out1 = new PrintStream(System.out);

		out.println("Hello world!");
		System.out.println("+++++++++++");
		out1.println("Hello World!");
		System.out.println("-----------");
		out.close();
	}
	
}
