public class TestJavayiwei {
	public static void main(String[] args) {
		int i;
		//声明一个一维数组
		int a[];
		//开辟内存空间供整型数组a使用,其元素个数为3
		a = new int[3];

		for (i = 0; i < 3; i++) {
			//输出数组的内容
			System.out.print("a["+i+"] = "+a[i]+",\t");
		}

		System.out.println("\n数组长度是:	"+a.length);

	}
	
}
