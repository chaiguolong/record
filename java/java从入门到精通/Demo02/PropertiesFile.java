import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PropertiesFile {
	public static void main(String[] args) {
		Properties settings = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					"/Users/develop/Documents/Doc"
					+"/Daily_record/test/count.java");
			settings.load(fis);
		} catch(FileNotFoundException e){
			settings.setProperty("count", "0");
		} catch(IOException e) {
			System.out.println("读写异常...");
		}
		int c = Integer.parseInt(settings.getProperty("count")) + 1;
		System.out.println("这是本程序第"+c+"次被使用");
		settings.put("count", ""+c);
		// try {
		// 	
		// } catch(Exception e){
		// 	e.printStackTrace();
		// }
		FileOutputStream fos;

		try {
			fos = new FileOutputStream(
						"/Users/develop/Documents/Doc"
						+"/Daily_record/test/count.java");
			settings.store(fos, "PropertiesFile use it.");
		} catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		} catch(IOException e) {
			System.out.println("读写异常...");
		}
	}
	
}
