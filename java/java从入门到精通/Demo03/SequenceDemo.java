import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;

public class SequenceDemo {
	public static void main(String[] args) {
		//声明两个文件读入流
		FileInputStream in1 = null;
		FileInputStream in2 = null;
		//声明一个序列流
		SequenceInputStream si = null;
		FileOutputStream out = null;

		//构造两个被读入的文件
		File file1 = new File("/users/develop/documents/doc/daily_record/test/1.txt");
		File file2 = new File("/users/develop/documents/doc/daily_record/test/2.txt");
		//构造一个输出文件
		File file3 = new File("/users/develop/documents/doc/daily_record/test/12.txt");

		try {
			in1 = new FileInputStream(file1);
			in2 = new FileInputStream(file2);
			//将2个输入流合为一个输入流
			si = new SequenceInputStream(in1, in2);
			out = new FileOutputStream(file3);

			int c;
			while ((c = si.read()) != -1) {
				out.write(c);
			}
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally{
			if(in1 != null){
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

			if(si != null){
				try {
					si.close();
				} catch(IOException e){
					e.printStackTrace();
				}
			}
			if(out != null){
				try {
					out.close();
				} catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
	
}
