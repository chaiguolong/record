public class TestJavasanwei {
	public static void main(String[] args) {
		int i, j, k, sum = 0;
		//声明数组并设置初值
		int A[][][] = {{{5, 1},{6, 7}},{{9, 4},{8, 3}}};
		//三维数组的输出需要采用三层for循环方式输出
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A[i].length; j++) {
				for ( k = 0; k < A[j].length; k++) {
					System.out.print("A["+i+"]["+j+"]["+k+"]=");
					System.out.println(A[i][j][k]);
					sum += A[i][j][k];
				}
			}
		}
		System.out.println("sum = "+sum);
	}
}
