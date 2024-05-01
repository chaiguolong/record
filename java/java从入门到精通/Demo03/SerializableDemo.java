import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {
	public static void main(String[] args) {
		File f = new File("/Users/develop/Documents/Doc"
				+"/Daily_record/test/SerializedPerson");
		Person p1 = new Person("zhangsan", 20);
		ObjectOutputStream out = null;
		ObjectInputStream in = null;
		Person p = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream(f));
			out.writeObject(p1);
		} catch(IOException e){
			e.printStackTrace();
		}
		try {
			out.close();
		} catch(IOException e){
			e.printStackTrace();
		}

		try {
			in = new ObjectInputStream(new FileInputStream(f));
			Object o = in.readObject();
			if(o instanceof Person){
				p = (Person)o;
			}
		} catch(IOException e){
			e.printStackTrace();
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		} 
		System.out.println(p.toString());
	}
	
}
