import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.text.SimpleDateFormat;
import java.util.Date;
public class JDBCMySQL {
	//配置驱动程序
	// public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";	
	//连接地址是由哥哥数据库生成厂商单独提供的,所以需要单独记住
	public static final String DBURL = "jdbc:mysql://localhost:3306/orcl";
	//连接数据库的用户名
	public static final String DBUSER = "root";
	//连接数据库的密码
	public static final String DBPASS = "chaiguolong";

	public static void main(String[] args) throws Exception{
		//表示数据库的连接对象
		Connection conn = null;
		//表示数据库的更新操作
		PreparedStatement ps = null;
		String name = "李四";
		int age = 40;
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse("1983-02-15");
		float salary = 7000.0f;
		String sql = "insert into person(name,age,birthday,salary) values(?,?,?,?)";
		System.out.println(sql);
		//1.使用Class类加载驱动程序
		Class.forName(DBDRIVER);
		//2.连接数据库
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		//3.PreparedStatement接口需要通过Connection接口进行实例化操作
		//进行预处理的方式创建对象
		ps = conn.prepareStatement(sql);
		ps.setString(1,name);
		ps.setInt(2,age);
		ps.setDate(3,new java.sql.Date(date.getTime()));
		ps.setFloat(4,salary);
		//执行sql语句,更新数据库
		ps.executeUpdate();
		//关闭数据库
		ps.close();
		conn.close();
	}

}
