import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FilePrint {
	public static void main(String[] args) {
		PrintWriter out = null;
		File f = new File("/Users/develop/Documents/Doc/Daily_record/test/temp.txt");
		try {
			out = new PrintWriter(new FileWriter(f));
		} catch(IOException e){
			e.printStackTrace();
		}
		//由FileWriter实例化,则向文件中输出
		out.print("Hello World!"+ "\r\n");
		out.close();
	}
	
}
