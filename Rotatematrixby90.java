
public class Rotatematrixby90 {

	public static void main(String[] args) {
		int mat[][] = 
	        { 
	            {1, 2, 3, 4}, 
	            {5, 6, 7, 8}, 
	            {9, 10, 11, 12}, 
	            {13, 14, 15, 16} 
	        }; 
		int n=mat.length;
		rotateMatrix(n,mat); 
	       
        // Print rotated matrix 
        displayMatrix(n,mat); 

	}

	private static void displayMatrix(int n, int[][] mat) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j] +" ");
			}
			System.out.println();
		}
		
	}

	private static void rotateMatrix(int N, int[][] mat) {
		for (int x = 0; x < N / 2; x++) 
        { 
            // Consider elements in group of 4 in  
            // current square 
            for (int y = x; y < N-x-1; y++) 
            { 
                // store current cell in temp variable 
                int temp = mat[x][y]; 
       
                // move values from right to top 
                mat[x][y] = mat[y][N-1-x]; 
       
                // move values from bottom to right 
                mat[y][N-1-x] = mat[N-1-x][N-1-y]; 
       
                // move values from left to bottom 
                mat[N-1-x][N-1-y] = mat[N-1-y][x]; 
       
                // assign temp to left 
                mat[N-1-y][x] = temp; 
            } 
        } 

		
	}
  
}
