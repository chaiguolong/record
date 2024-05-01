import java.util.*;
import java.io.*;
public class PropertiesFile {
	public static void main(String[] args) {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("/Users/develop/count.java"));
		} catch(Exception e){
			props.setProperty("count", "0");
		}

		Integer c = Integer.parseInt(props.getProperty("count")) + 1;
		System.out.println("这是本程序第"+c+"次被使用");
		props.put("count", c.toString());
		try {
			props.store(new FileOutputStream("/Users/develop/count.java"),"PropertiesFile use it .");
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}
