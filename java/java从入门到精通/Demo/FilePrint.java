import java.io.*;
public class FilePrint {
	public static void main(String[] args) {
		PrintWriter out = null;
		File f = new File("/Users/develop/Documents/Doc/Daily_record/test/temp.txt");
		try {
			out = new PrintWriter(new FileWriter(f));
		} catch(IOException e){
			e.printStackTrace();
		}

		//由FileWriter实例化,则想文件中输出
		out.print("Hello World!"+"\n");
		out.close();
	}
	
}
