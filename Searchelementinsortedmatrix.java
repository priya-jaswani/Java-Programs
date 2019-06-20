
public class Searchelementinsortedmatrix {

	public static void main(String[] args) {
		int mat[][] = { {10, 20, 30, 40}, 
                {15, 25, 35, 45}, 
                {27, 29, 37, 48}, 
                {32, 33, 39, 50} }; 
		search(mat,4,21);

	}

	private static void search(int[][] mat, int n, int e) {
		int i=0;
		int j=n-1;
		
		while(i<n && j>=0) {
			if(mat[i][j]==e) {
				System.out.println("Element found at :" +i +","+j);
				return;
			}
			else if(mat[i][j]>e) {
				j--;
			}
			else {
				i++;
			}
		}
		System.out.println("Element not found");
		return;
		
	}

}
