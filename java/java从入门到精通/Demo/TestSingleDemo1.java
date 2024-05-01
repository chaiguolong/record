public class TestSingleDemo1 {

	private TestSingleDemo1(){
		System.out.println("private TestSingleDemo1 .");
	}

	public static void main(String[] args) {
		new TestSingleDemo1();
	}
	
}
