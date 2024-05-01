import java.io.File;
import java.io.Writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class CharDemo {
	public static void main(String[] args) {
		File f = new File("/Users/develop/Documents/"
				+"Doc/Daily_record/test/temp.txt");
		Writer out = null;
		try {
			out = new FileWriter(f);
		} catch(IOException e){
			e.printStackTrace();
		}

		//声明一个String类型对象
		String str = "Hello world!!!";
		try {
			//将str内容写入到文件之中
			out.write(str);
		} catch(IOException e){
			e.printStackTrace();
		}
		try {
			out.close();
		} catch(Exception e){
			e.printStackTrace();
		}

		//以下为读文件操作
		Reader in = null;
		try {
			in = new FileReader(f);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}

		//开辟一个空间用于接收文件读进来的数据
		char c1[] = new char[1024];
		int i = 0;
		try {
			i = in.read(c1);
		} catch(IOException e){
			e.printStackTrace();
		}
		try {
			in.close();
		} catch(Exception e){
			e.printStackTrace();
		}
		//将字符数组转换为字符串输出
		System.out.println(new String(c1, 0, i));

	}
	
}
