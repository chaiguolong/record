import java.io.PrintWriter;

public class SystemPrintDemo {
	public static void main(String[] args) {
		PrintWriter out = null;
		//通过System.out对PrintWriter实例化
		out = new PrintWriter(System.out);
		//向屏幕上输出
		out.print("Hello world");
		out.close();
	}
	
}
