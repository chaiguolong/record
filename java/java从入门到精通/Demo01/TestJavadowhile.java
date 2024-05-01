public class TestJavadowhile {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		//do...while是先执行一次,再进行判断,即循环体至少会被执行一次
		do{
			sum += i;
			i++;
		}while(i <= 10);
		System.out.println("1+2+...+10 = "+sum);
	}
	
}
