import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FilePrint {
	public static void main(String[] args) {
		PrintWriter out = null;
		File f = new File("/Users/develop/Documents/Doc/Daily_record/test/temp.txt");
		try {
			out = new PrintWriter(f);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}

		out.write("你好,temp.txt");
		out.flush();
		out.close();
	}
	
}
