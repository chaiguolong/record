class Outer{
	int score = 95;
	void inst(){
		Inner in = new Inner();
		in.display();
	}
	//这里用static声明内部类
	static class Inner{
		void display(){
			System.out.println("成绩: score = "+score);
		}
	}
}
public class InnerClassDemo2 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.inst();
	}
	
}
