public class TestException_2 {
	public static void main(String[] args) {
		try {
			int arr[] = new int[5];
			arr[10] = 7;
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组超出访问访问");
		}finally{
			System.out.println("这里一定会被执行!");
		}
		System.out.println("方法结束!");
	}
	
}
