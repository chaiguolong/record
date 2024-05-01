import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class homework01_20 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		File f = new File(
				"/Users/develop/Documents/Doc/Daily_record/"
				+"test/myfile.txt");
		try {
			fos = new FileOutputStream(f);
		} catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		try {
			fos.write("Here is my file".getBytes());
		} catch(IOException e){
			System.out.println(e.getMessage());
		}
		try {
			fos.close();
		} catch(IOException e){
			e.printStackTrace();
		}

		int len = 0;
		byte[] buff = new byte[1024];
		try {
			fis = new FileInputStream(f);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		try {
			len = fis.read(buff);
		} catch(IOException e){
			e.printStackTrace();
		}

		System.out.println(new String(buff, 0, len));
	}
	
}
