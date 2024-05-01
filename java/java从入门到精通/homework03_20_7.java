import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class homework03_20_7 {
	public static void main(String[] args) {
		File f = new File("/Users/develop/Documents/Doc/"
				+"Daily_record/test/Here.txt");
		FileOutputStream out = null;
		FileInputStream in = null;
		try {
			 out = new FileOutputStream(f);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		try {
			out.write("Here is my file".getBytes());
		} catch(IOException e){
			e.printStackTrace();
		}
		try {
			out.close();
		} catch(IOException e){
			e.printStackTrace();
		}
		byte[] buf = new byte[1024];
		int len = 0;
		try {
			in = new FileInputStream(f);
			len = in.read(buf);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(new String(buf, 0, len));
	}
	
}
