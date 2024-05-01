class Outer{
	int score = 95;
	void inst(){
		class Inner{
			void display(){
				System.out.println("成绩: score = "+ score);
			}
		}

		Inner in = new Inner();
		in.display();
	}
}
public class InnerClassDemo4 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.inst();
	}
	
}
