import java.io.File;
import java.io.Writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class CharDemo {
	public static void main(String[] args) {
		File f = new File("/Users/develop/Documents/Doc/Daily_record/test/temp.txt");
		Writer out = null;
		Reader in = null;
		try {
			out = new FileWriter(f);
			out.write("Hello World!!!");
		} catch(IOException e){
			e.printStackTrace();
		}
		try {
			out.close();
		} catch(IOException e){
			e.printStackTrace();
		}

		char[] buf = new char[1024];
		int len = 0;

		try {
			in = new FileReader(f);
			len = in.read(buf);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e){
			System.out.println(e.getMessage());
		} 
		System.out.println(new String(buf, 0, len));

		try {
			in.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
