public class homework01_15 {
	public static void main(String[] args) {
		int a = 5, b = 0;
		int c;

		try {
			c = a/b;
		} catch(Exception e){
			System.out.println("被除数为0,程序出错");
		}
	}
	
}
