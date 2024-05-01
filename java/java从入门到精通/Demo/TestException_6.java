class DefaultException extends Exception{
	public DefaultException(String msg){
		//调用Exception类的构造方法,存入异常信息
		super(msg);
	}
}
public class TestException_6 {
	public static void main(String[] args) {
		try {
			//在这里用throw直接抛出一个DefaultException类的实例对象
			throw new DefaultException("自定义异常! ");
		} catch(Exception e){
			System.out.println(e);
		}
	}
	
}
