public class TestJavashengming {
	public static void main(String[] args) {
		//调用star()方法
		star();
		System.out.println("I Like Java!");
		//调用star()方法
		star();
	}

	//star方法
	public static void star(){
		for (int i = 0; i < 19; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
