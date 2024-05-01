public class TestJavashengming {
	public static void main(String[] args) {
		star();
		System.out.println("I Like Java !");
		star();
	}

	//star()方法
	public static void star(){
		for (int i = 0; i < 19; i++) {
			//输出19个星号
			System.out.print("*");
		}
		//换行
		System.out.println();
	}
	
}
