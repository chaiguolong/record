import java.util.Enumeration;
import java.util.Properties;

public class SystemInfo {
	public static void main(String[] args) {
		Properties ps = System.getProperties();
		Enumeration<?> em = ps.propertyNames();
		while (em.hasMoreElements()) {
			String key= (String)em.nextElement();
			System.out.println(key+"="+ps.getProperty(key));
		}
	}
	
}
