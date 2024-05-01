import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceDemo {
	public static void main(String[] args) throws IOException {
		//声明两个文件输入流
		FileInputStream in1 = null;
		FileInputStream in2 = null;
		//声明一个序列流
		SequenceInputStream s = null;
		FileOutputStream out = null;

		try {
			//构造两个被读入的文件
			File inputFile1 = new File("/Users/develop/Documents"
					+"/Doc/Daily_record/test/1.txt");
			File inputFile2 = new File("/Users/develop/Documents"
					+"/Doc/Daily_record/test/2.txt");

			File inputFile3 = new File("/Users/develop/Documents"
					+"/Doc/Daily_record/test/3.txt");
			in1 = new FileInputStream(inputFile1);
			in2 = new FileInputStream(inputFile2);
			s = new SequenceInputStream(in1, in2);
			out = new FileOutputStream(inputFile3);
			int c;
			while ((c = s.read()) != -1) {
				out.write(c);
			}
		} catch(Exception e){
			e.printStackTrace();
		}

		try {
			in1.close();
			in2.close();
			s.close();
			out.close();
		} catch(IOException e){
			e.printStackTrace();
		}

	}
	
}
