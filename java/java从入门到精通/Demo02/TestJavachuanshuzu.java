public class TestJavachuanshuzu {
	public static void main(String[] args) {
		int score[] = {7, 3, 8, 19, 6, 22};
		largest(score);
	}

	public static void largest(int arr[]){
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max < arr[i]){
				max = arr[i];
			}
		}
		System.out.println("最大的数: "+ max);
	}
	
}
