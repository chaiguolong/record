public class methoddemo {
	int a = 12345679, b = 81;

	public void time(int i, int j){
		System.out.println(i*j);
	}


	public static void main(String[] args) {
		methoddemo m = new methoddemo();
		m.time(m.a, m.b);
	}
	
}
