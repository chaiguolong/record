import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FilePrint {
	public static void main(String[] args) {
		File f = new File("/Users/develop/Documents/Doc"
				+"/Daily_record/test/temp.txt");
		PrintWriter pw = null;
		try {
			 pw = new PrintWriter(f);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		pw.println("aaaaHello World!!!");
		pw.close();
	}
	
}
