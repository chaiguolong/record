public class TestEquals {
	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = new String("java");
		String str3 = str2;

		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		if(str2 == str3){
			System.out.println("str2 == str3");
		}else{
			System.out.println("str2 != str3");
		}
	}
	
}
