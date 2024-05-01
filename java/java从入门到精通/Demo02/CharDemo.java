import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDemo {
	public static void main(String[] args) {
		File f = new File("/Users/develop/Documents/Doc"
				+"/Daily_record/test/temp.txt");
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fw = new FileWriter(f);
			fw.write("Hello World!!!");
		} catch(IOException e){
			e.printStackTrace();
		}
		try {
			fw.close();
		} catch(IOException e){
			e.printStackTrace();
		}
		char[] buf = new char[1024];
		int len = 0;
		try {
			fr = new FileReader(f);
			len = fr.read(buf);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

		System.out.println(new String(buf, 0, len));
		try {
			fr.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
