public class TestJavafor2 {
	public static void main(String[] args) {
		//用两层for循环输出乘法表
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i+"*"+j+" = "+((i*j>=10) ? ""+i*j  : i*j+" ")+ "\t");
			}
			System.out.print("\n");
		}
	}
}
