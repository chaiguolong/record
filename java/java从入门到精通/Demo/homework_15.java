class MyException extends Exception{
	public MyException(String msg){
		super(msg);
	}
}

public class homework_15 {
	public static void main(String[] args) {
		int a = 15, b = 0;
		try {
			if (b == 0) {
				throw new MyException("被除数为0,程序出错!");
			}
			int c = a / b;
			System.out.println("a/b="+c);
		}catch(MyException e){
			System.out.println(e.getMessage());
		}
	}
}
