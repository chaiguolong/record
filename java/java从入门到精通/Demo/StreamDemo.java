import java.io.*;
public class StreamDemo {
	public static void main(String[] args) {
		File f = new File("/Users/develop/Documents/Doc/Daily_record/test/temp.txt");
		OutputStream out = null;
		try {
			out = new FileOutputStream(f);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		//将字符串转成字节数组
		byte b[]  = "Hello World!!!".getBytes();
		try {
			//将byte数组写入到文件之中
			out.write(b);
		} catch(IOException e1){
			e1.printStackTrace();
		}

		try {
			out.close();
		} catch(IOException e2){
			e2.printStackTrace();
		}

		//以下为读文件操作
		InputStream in = null;
		try {
			in = new FileInputStream(f);
		} catch(FileNotFoundException e3){
			e3.printStackTrace();
		}

		//开辟一个空间用于接收文件读过来的数据
		byte b1[] = new byte[1024];
		int i = 0;
		try {
			i = in.read(b1);
		} catch(IOException e4){
			e4.printStackTrace();
		}

		try {
			in.close();
		} catch(IOException e5){
			e5.printStackTrace();
		}

		//将byte数组转换为字符串输出
		System.out.println(new String(b1, 0, i));
	}
	
}
