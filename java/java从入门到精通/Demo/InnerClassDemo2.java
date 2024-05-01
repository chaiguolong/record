class Outer{
	int score = 95;
	void inst(){
		Inner in = new Inner();
		in.display();
	}

	//在这里用static声明内部类
	static class Inner{
		void display(){
			//静态内部类无法访问非静态外部类成员变量.
			//System.out.println("成绩:score = "+score);
		}
	}
}

public class InnerClassDemo2 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.inst();
	}
	
}
