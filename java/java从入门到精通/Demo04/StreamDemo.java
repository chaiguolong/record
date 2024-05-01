import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamDemo {
	public static void main(String[] args) {
		File f = new File("/Users/develop/Documents"
				+"/Doc/Daily_record/test/temp.txt");
		OutputStream out = null;
		try {
			out = new FileOutputStream(f);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		//将字符串转成字节数组
		byte b[] = "Hello world".getBytes();
		try {
			//将byte数组写入到文件之中
			out.write(b);
		} catch(IOException e){
			e.printStackTrace();
		}
		try {
			out.close();
		} catch(Exception e){
			e.printStackTrace();
		}

		//以下文读文件操作
		InputStream in = null;
		try {
			in = new FileInputStream(f);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}

		//开辟一个空间用于接收文件读进来的数据
		byte b1[] = new byte[1024];
		int i = 0;
		try {
			//将b1的引用传递到read()方法之中,同时此方法返回读入数据的个数
			i = in.read(b1);
		} catch(Exception e){
			e.printStackTrace();
		}

		try {
			in.close();
		} catch(Exception e){
			e.printStackTrace();
		}

		//将byte数组转换为字符串输出
		System.out.println(new String(b1, 0, i));
	}
	
}
