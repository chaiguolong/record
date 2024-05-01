import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.RandomAccessFile;

class Employee{
	String name;
	int age;
	final static int LEN = 8;
	public Employee(String name,int age){
		if(name.length() > LEN){
			name = name.substring(0,LEN);
		}else{
			while (name.length() < LEN) {
				name = name +"\u0000";
			}
		}
		this.name = name;
		this.age = age;
	}
}
public class RandomFileDemo {
	public static void main(String[] args) throws IOException {
		Employee e1 = new Employee("zhangsan", 23);
		Employee e2 = new Employee("lisi", 24);
		Employee e3 = new Employee("wangwu", 25);
		RandomAccessFile raf = null;
		RandomAccessFile ra = null;
		String name;
		int age;
		try {
			raf = new RandomAccessFile("/Users/develop/Documents/"
					+"Doc/Daily_record/test/Employee.txt", "rw");
			raf.write(e1.name.getBytes());
			raf.writeInt(e1.age);
			raf.write(e2.name.getBytes());
			raf.writeInt(e2.age);
			raf.write(e3.name.getBytes());
			raf.writeInt(e3.age);
			raf.close();
			ra = new RandomAccessFile("/Users/develop/Documents/"
					+"Doc/Daily_record/test/Employee.txt", "rw");
			//读取文件
			//1.读取第二位员工
			ra.skipBytes(12);
			int len = 8;
			byte[] buf = new byte[len];
			ra.read(buf, 0, len);
			name = new String(buf, 0, len);
			age = ra.readInt();
			System.out.println("e2的姓名:"+name+",年龄为:"+age);
			ra.seek(0);
			//1.读取第一位员工
			ra.read(buf, 0, len);
			name = new String(buf, 0, len);
			age = ra.readInt();
			System.out.println("e2的姓名:"+name+",年龄为:"+age);
			ra.skipBytes(12);
			//1.读取第三位员工
			ra.read(buf, 0, len);
			name = new String(buf, 0, len);
			age = ra.readInt();
			System.out.println("e3的姓名:"+name+",年龄为:"+age);
			ra.close();

			
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	
}
