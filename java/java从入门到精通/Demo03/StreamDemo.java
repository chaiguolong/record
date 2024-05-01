import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamDemo {
	public static void main(String[] args) {
		File f = new File("/Users/develop/Documents/Doc/Daily_record/test/temp.txt");
		OutputStream out = null;
		InputStream in = null;
		try {
			out = new FileOutputStream(f);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		try {
			out.write("Hello world!!!".getBytes());
		} catch(IOException e){
			e.printStackTrace();
		}
		//读取文件
		try {
			in = new FileInputStream(f);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		byte[] buf = new byte[1024];
		int len = 0;
		try {
			len = in.read(buf);
		} catch(IOException e){
			e.printStackTrace();
		}

		System.out.println(new String(buf, 0, len));
		try {
			out.close();
			in.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}	
}
