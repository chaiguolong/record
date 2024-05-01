import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class homework04_20_7 {
	public static void main(String[] args) {
		File file1 = new File("/Users/develop/Documents/Doc/Daily_record/test/myfile1.txt");
		FileOutputStream fou = null;
		FileInputStream fin = null;
		try {
			String str = "Here is my file.";
			byte[] bytes = str.getBytes();
			fou = new FileOutputStream(file1);
			fou.write(bytes);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fou.close();
			} catch(IOException e){
				e.printStackTrace();
			}
		}

		try {
			byte[] buf = new byte[1024];
			fin = new FileInputStream(file1);
			fin.read(buf);
			String str = new String(buf);
			System.out.println(str);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		} finally{
			try {
				fin.close();
			} catch(IOException e){
				e.printStackTrace();
			}
		}


	}
	
}
