import java.util.Enumeration;
import java.util.Properties;

public class SystemInfo {
	public static void main(String[] args) {
		Properties ps = System.getProperties();
		Enumeration<?> e = ps.propertyNames();
		while (e.hasMoreElements()) {
			String key = (String)e.nextElement();
			System.out.println(key+" = "+ps.getProperty(key));
		}
	}
	
}
