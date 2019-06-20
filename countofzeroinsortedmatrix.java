//Author Added
public class countofzeroinsortedmatrix {

	public static void main(String[] args) {
		int[][] arr = {
			    {0, 0, 0, 0, 1},
			    {0, 0, 0, 1, 1},
			    {0, 1, 1, 1, 1},
			    {1, 1, 1, 1, 1},
			    {1, 1, 1, 1, 1}
			  };
		
		CountZeroinSortedMatrix(arr);

	}

	private static void CountZeroinSortedMatrix(int[][] arr) {
		int row=0;
		int col=arr.length-1;
		int zerocount=0;
		
		while(row<arr.length && col>=0) {
			if(arr[row][col]==1) {
				col--;
			}
			else {
				zerocount=zerocount+col+1;
				row++;
			}
			
		}
		System.out.println("Count of Zero:" +zerocount);
	}

}
