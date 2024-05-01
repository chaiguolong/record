import java.io.*;
public class SerializableDemo {
	public static void main(String[] args) throws Exception{
		File f = new File("SerializedPerson");
			serialize(f);
			deserialize(f);
	}

	//以下方法为序列化对象的方法
	public static void serialize(File f) throws Exception{
		OutputStream outputFile = new FileOutputStream(f);
		ObjectOutputStream cout = new ObjectOutputStream(outputFile);
		cout.writeObject(new Person_01("张三", 25));
		cout.close();
	}

	//以下方法为反序列化对象方法
	public static void deserialize(File f) throws Exception{
		InputStream inputFile = new FileInputStream(f);
		ObjectInputStream cin = new ObjectInputStream(inputFile);
		Person_01 p = (Person_01)cin.readObject();
		System.out.println(p);
	}
	
}
