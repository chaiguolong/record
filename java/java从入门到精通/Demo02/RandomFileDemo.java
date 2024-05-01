import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.RandomAccessFile;

class Employee{
	String name;
	int age;
	final static int LEN = 8;
	public Employee(String name, int age){
		if(name.length() > LEN){
			name = name.substring(0, 8);
		}else{
			while (name.length() < LEN) {
				name = name +"\u0000";
			}
			this.name = name;
			this.age = age;
		}
	}
}
public class RandomFileDemo {
	public static void main(String[] args) throws IOException{
		Employee e1 = new Employee("zhangsan", 23);
		Employee e2 = new Employee("lisi", 24);
		Employee e3 = new Employee("wangwu", 25);
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(
					"/Users/develop/Documents/Doc"
					+"/Daily_record/test/Employee.txt", "rw");
		} catch(FileNotFoundException e){
			System.out.println("文件未找到!...");
		}
		raf.write(e1.name.getBytes());
		raf.writeInt(e1.age);
		raf.write(e2.name.getBytes());
		raf.writeInt(e2.age);
		raf.write(e3.name.getBytes());
		raf.writeInt(e3.age);
		raf.close();
		raf = new RandomAccessFile(
				"/Users/develop/Documents/Doc"
				+"/Daily_record/test/Employee.txt", "r");
		raf.skipBytes(12);
		byte[] buf = new byte[8];
		int len = raf.read(buf);
		String name = new String(buf);
		int age = raf.readInt();
		System.out.println("第二名员工的姓名为:"+name+":年龄为:"+age);
		raf.seek(0);
		len = raf.read(buf);
		name = new String(buf);
		age = raf.readInt();
		System.out.println("第一名员工的姓名为:"+name+":年龄为:"+age);
		raf.skipBytes(12);
		len = raf.read(buf);
		name = new String(buf);
		age = raf.readInt();
		System.out.println("第三名员工的姓名为:"+name+":年龄为:"+age);
		raf.close();


	}
}
