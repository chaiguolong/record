public class TestException_1 {
	public static void main(String[] args) {
		//容许5个元素
		int arr[] = new int[5];
		//下标值超出所容许的范围
		arr[10] = 7;
		System.out.println("end of main() method!!");
	}
	
}
