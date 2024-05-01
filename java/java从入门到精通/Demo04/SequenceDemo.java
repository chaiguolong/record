import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceDemo {
	public static void main(String[] args) throws IOException {
		//声明两个文件读入流
		FileInputStream in1 = null, in2 = null;
		//声明一个序列流
		SequenceInputStream s = null;
		FileOutputStream out = null;

		try {
			//构造两个读入的文件
			File inputFile1 = new File("/Users/develop/Documents/Doc/Daily_record/test/1.txt");
			File inputFile2 = new File("/Users/develop/Documents/Doc/Daily_record/test/2.txt");
			//构造一个输出文件
			File outputFile = new File("/Users/develop/Documents/Doc/Daily_record/test/12.txt");

			in1 = new FileInputStream(inputFile1);
			in2 = new FileInputStream(inputFile2);

			//将两个输入流合为一个输入流
			s = new SequenceInputStream(in1, in2);
			out = new FileOutputStream(outputFile);

			int c;
			while ((c = s.read()) != -1) {
				out.write(c);
			}

			in1.close();
			in2.close();
			s.close();
			out.close();
			System.out.println("ok...");

		} catch(IOException e){
			e.printStackTrace();
		}finally{
			if (in1 != null) {
				try {
					in1.close();
				} catch(IOException e){
					e.printStackTrace();
				}
			}
			if (in2 != null) {
				try {
					in2.close();
				} catch(IOException e){
					e.printStackTrace();
				}
			}
			if(s != null){
				try {
					s.close();
				} catch(IOException e){
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
