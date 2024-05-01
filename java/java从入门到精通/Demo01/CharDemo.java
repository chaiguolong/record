import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDemo {
	public static void main(String[] args) {
		File f = new File(
				"/Users/develop/Documents/Doc/"
				+"Daily_record/test/temp.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(f);
			fw.write("Hello World!!!你好");
		} catch(IOException e){
			e.printStackTrace();
		}
		try {
			fw.close();
		} catch(IOException e){
			e.printStackTrace();
		}

		FileReader fr = null;
		char buf[] = new char[1024];
		int i = 0;
		try {
			fr = new FileReader(f);
			i = fr.read(buf);
		} catch(IOException e){
			e.printStackTrace();
		}

		try {
			fr.close();
		} catch(IOException e){
			e.printStackTrace();
		}

		System.out.println(new String(buf));

	}
	
}
