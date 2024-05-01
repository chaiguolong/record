public class TestJavawhile {
	public static void main(String[] args) {
		int i=1, sum=0;

		while (i<=10) {
			//累加计算
			sum += i;
			i++;
		}
		//输出结果
		System.out.println("1+2+...+10="+sum);
	}
	
}
