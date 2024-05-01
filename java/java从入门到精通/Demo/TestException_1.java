public class TestException_1 {
	public static void main(String[] args) {
		try {
			int arr[] = new int[5];
			arr[10] = 7;
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组超出绑定范围!");
			System.out.println("异常: "+e);
		}finally{
			System.out.println("这里一定会被执行");
		}
			System.out.println("main()方法结束! ");
	}
	
}
