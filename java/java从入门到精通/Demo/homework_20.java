import java.io.*;
public class homework_20 {
	public static void main(String[] args) {
		File f = new File("/Users/develop/Documents/Doc/Daily_record/test/Here.txt");
		writeFile(f);
		readFile(f);
	}

	public static void readFile(File f){
		FileInputStream in = null;
		try {
			in = new FileInputStream(f);
		} catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		byte b[] = new byte[1024];
		int len = 0;
		try {
			len = in.read(b);
		} catch(IOException e){
			System.out.println(e.getMessage());
		}
		System.out.println(new String(b,0,len));

		try {
			in.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}



	public static void writeFile(File f){
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(f);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		try {
			out.write("Here is my file".getBytes());
		} catch(IOException e){
			System.out.println(e.getMessage());
		}finally{
			try {
				out.close();
			} catch(IOException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
