public class TestJavazuidazuixiao {
	public static void main(String[] args) {
		int i, min, max;
		int A[] = {74, 48, 30, 17, 62};

		min=max=A[0];
		System.out.println("数组A的元素包括: ");
		for (i = 0; i < A.length; i++) {
			System.out.print(A[i]+"		");
			if(A[i]>max){
				max = A[i];
			}
			if(A[i]<min){
				min = A[i];
			}
		}
		//输出最大值
		System.out.println("\n数组的最大值是: "+max);
		//输出最小值
		System.out.println("\n数组的最小值是: "+min);
	}
	
}
