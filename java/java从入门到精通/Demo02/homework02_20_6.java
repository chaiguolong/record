import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;

public class homework02_20_6 {
	public static void main(String[] args) {
		File f = new File("/Users/develop/Documents/Doc"
				+"/Daily_record/test/myfile.txt");
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fw = new FileWriter(f);
			fw.write("Here is my file");
			fw.close();
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		char[] buf = new char[1024];
		int len = 0;
		String str = null;
		try {
			fr = new FileReader(f);
			len = fr.read(buf);
			str = new String(buf, 0, len);
		} catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("文件中的数据为: "+str);
	}
	
}
