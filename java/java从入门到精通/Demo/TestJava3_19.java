public class TestJava3_19 {
	public static void main(String[] args) {
		int a = 56;

		if((a < 0) || (a > 100)){
			System.out.println("输入的数据有错误!");
		}

		if((a < 60) && (a > 50)){
			System.out.println("准备补考吧!");
		}
	}
	
}
