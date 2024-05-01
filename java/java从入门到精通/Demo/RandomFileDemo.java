import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFileDemo {
	public static void main(String[] args){
		Employee e1 = new Employee("zhangsan", 23);
		Employee e2 = new Employee("lisi", 24);
		Employee e3 = new Employee("wangwu", 25);
		RandomAccessFile ra = null;
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile("/Users/develop/Documents/Doc/Daily_record/test/Employee.txt", "rw");
			raf.write(e1.name.getBytes());
			raf.writeInt(e2.age);
			raf.write(e2.name.getBytes());
			raf.writeInt(e2.age);
			raf.write(e3.name.getBytes());
			raf.write(e3.age);
			raf.close();
		} catch(IOException e){
			e.getMessage();
		}

		try {
			 ra = new RandomAccessFile("/Users/develop/Documents/Doc/Daily_record/test/Employee.txt", "r");
			int len = 8;
			ra.skipBytes(12);
			System.out.println("第二个员工信息: ");
			String str = "";
			for (int i = 0; i < len; i++) {
				str=str+(char)ra.readByte();
			}
			System.out.println("name:"+str);
			System.out.println("age:"+ra.readInt());
			System.out.println("第一个员工的信息: ");
			ra.seek(0);
			str = "";
			for (int i = 0; i < len; i++) {
				str = str+(char)ra.readByte();
			}
			System.out.println("name:"+str);
			System.out.println("age:"+ra.readInt());
			System.out.println("第三个员工的信息: ");
			ra.skipBytes(12);
			str = "";
			for (int i = 0; i < len; i++) {
				str = str + (char)ra.readByte();
			}
			System.out.println("name: "+str.trim());
			System.out.println("age: "+ra.readInt());
			ra.close();
		} catch(IOException e) {
			e.getMessage();
		}
	}
	
}

class Employee{
	String name;
	int age;
	final static int LEN = 8;
	public Employee(String name, int age){
		if(name.length() > LEN){
			name = name.substring(0,8);
		}else{
			while (name.length()<LEN) {
				name = name+"\u0000";
			}
		}
		this.name = name;
		this.age = age;
	}
}
