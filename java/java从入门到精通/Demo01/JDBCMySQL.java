package org.lxh.mysqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JDBCMySQL {
	public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/orcl";
	public static final String DBUSER = "root";
	public static final String DBPASS = "chaiguolong";

	public static void main(String[] args) throws Exception {
		//表示数据库的连接对象
		Connection conn = null;
		//表示数据库的更新操作
		PreparedStatement ps = null;
		String name = "张三";
		int age = 30;
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse("1983-02-15");
		float salary = 7000.0f;
		String sql = "insert into person(name,age,birthday,salary) values (?,?,?,?)";
		System.out.println(sql);
		//1.使用Class类加载驱动程序
		Class.forName(DBDRIVER);
		//2.连接数据库
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		//3.preparedStatement 接口需要通过connection接口进行实例化操作
		//使用预处理的方式创建对象
		ps = conn.prepareStatement(sql);
		ps.setString(1, name);
		ps.setInt(2, age);
		ps.setDate(3, new java.sql.Date(date.getTime()));
		ps.setFloat(4, salary);
		//执行sql语句,更新数据库
		ps.execute();
		//4.关闭数据库
		ps.close();
		conn.close();

	}
	
}
