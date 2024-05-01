import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamDemo {
	public static void main(String[] args) {
		File f = new File(
				"/Users/develop/Documents/Doc/"
				+"Daily_record/test/temp.txt");
		FileOutputStream fos = null;
		try {
			 fos = new FileOutputStream(f);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}

		try {
			fos.write("Hello World!!!".getBytes());
			fos.close();
		} catch(IOException e){
			e.printStackTrace();
		}

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}

		//开辟一个空间用于接收文件读进来的数据
		byte b1[] = new byte[1024];
		int i = 0;
		try {
			i = fis.read(b1);
		} catch(IOException e){
			e.printStackTrace();
		}

		try {
			fis.close();
		} catch(IOException e){
			e.printStackTrace();
		}

		System.out.println(new String(b1,0,i));
	}
	
}
