class Outer{
	int score = 95;
	void inst(final int s){
		int temp = 20;
		class Inner{
			void display(){
				System.out.println("成绩: score=" + (score+s+temp));
			}
		}

		Inner in = new Inner();
		in.display();
	}
}
public class InnerClassDemo5 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.inst(5);
	}
	
}
