
public class SumMatrix {

	public static void main(String[] args) {
		// Sum of All elements in matrix
		 int mat[][] = { {1,  2,  3},
				 {4,  5,  6}, 
                 {7,  8,  9} 
               }; 
		sum(mat);

	}

	private static void sum(int[][] mat) {
		int row=mat.length;
		int col=mat[0].length;
		int sum=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				sum=sum+mat[i][j];
			}
		}
		System.out.println("Sum of all elements of matrix :" +sum);
	}

}
