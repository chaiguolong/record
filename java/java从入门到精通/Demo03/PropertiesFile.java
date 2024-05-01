import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesFile {
	public static void main(String[] args) {
		Properties setting = new Properties();
		try {
			setting.load(new FileInputStream("/Users/develop/Documents/Doc"
						+"/Daily_record/test/count.java"));
		} catch(Exception e){
			setting.setProperty("count", "0");
		}
		int c = Integer.parseInt(setting.getProperty("count")) + 1;
		System.out.println("这是本程序第"+c+"次被使用");
		setting.put("count", c+"");
		try {
			setting.store(new FileOutputStream("/Users/develop/Documents/Doc/"
						+"Daily_record/test/count.java"), "PropertiesFile use it");
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}
