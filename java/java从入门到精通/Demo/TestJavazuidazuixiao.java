public class TestJavazuidazuixiao {
	public static void main(String[] args) {
		int min, max;
		int A[] = {74, 48, 30, 17, 62};

		min=max=A[0];
		System.out.print("数组A的元素包括:	");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+"\t");

			if(A[i] > max){
				max = A[i];
			}
			if(A[i] < min){
				min = A[i];
			}
		}

		System.out.println("\n数组的最大值是:	"+max);
		System.out.println("数组的最小值是:	"+min);
	}
	
}
