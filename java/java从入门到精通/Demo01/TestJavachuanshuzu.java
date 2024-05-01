public class TestJavachuanshuzu {
	public static void main(String[] args) {
		int score[] = {7, 3, 8, 19, 6, 22};
		largest(score);
	}

	public static void largest(int arr[]){
		int tmp = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(tmp < arr[i]){
				tmp = arr[i];
			}
		}
		System.out.println("最大的数: "+tmp);
	}
	
}
