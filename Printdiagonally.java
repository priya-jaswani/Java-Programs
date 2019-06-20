
public class Printdiagonally {

	public static void main(String[] args) {
		int mat[][]= {{ 1, 2, 3 }, 
                      { 4, 5, 6 }, 
                      { 7, 8, 9 } }; 
		printdiagonally(mat);

	}

	private static void printdiagonally(int[][] mat) {
		int n=mat.length;
		
		for(int k=0;k<n;k++) {
			int row=0;
			int col=k;
			while(row<n && col>=0) {
				System.out.println(mat[row][col]);
				row++;
				col--;
			}
		}
		for(int j=1;j<n;j++) {
			int row=j;
			int col=n-1;
			while(row<n && col>=0) {
				System.out.println(mat[row][col]);
				row++;
				col--;
			}
		}
		
	}

}
