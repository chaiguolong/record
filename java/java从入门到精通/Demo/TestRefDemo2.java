class Change{
	int x = 0;
}
public class TestRefDemo2 {
	public static void main(String[] args) {
		Change c = new Change();
		c.x = 20;
		fun(c);
		System.out.println("x = " + c.x);
	}

	public static void fun(Change c1){
		c1.x = 25;
	}
	
}
