
public class Transposeofmatrix {

	public static void main(String[] args) {
		int[][] matrix = {
	            {1,  2,  3,  4,  5},
	            {6,  7,  8,  9,  10},
	            {11, 12, 13, 14, 15},
	            {16, 17, 18, 19, 20},
	            {21, 22, 23, 24, 25}
	        };
		   transposematrix(matrix);
		   printmatrix(matrix);

	}

	private static void printmatrix(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j] +" ");
				
			}
			System.out.println();
			}
		
	}

	private static void transposematrix(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=i;j<matrix[0].length;j++) {
				int data=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=data;
				
			}
		}
		
	}

}
