import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesFile {
	public static void main(String[] args) {
		Properties settings = new Properties();
		try {
			settings.load(new FileInputStream("/Users/develop/Documents/Doc/Daily_record/test/count.java"));
		} catch(Exception e){
			// settings.setProperty("count", "0");
			settings.put("count", 0);
		}

		// int c = Integer.parseInt(settings.getProperty("count")) + 1;
		int c = Integer.parseInt(settings.get("count").toString()) + 1;
		System.out.println("这是本程序第"+c+"次被使用");
		settings.put("count", c+"");
		try {
			settings.store(new FileOutputStream("/Users/develop/Documents/Doc/Daily_record/test/count.java"), "PropertiesFile use it .");
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}
