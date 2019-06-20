
public class Sumofallelementsinmatrix {

	public static void main(String[] args) {
		 int arr[][]= {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
		  
		    // Get each row sum 
		    row_ele(arr); 

	}

	private static void row_ele(int[][] arr) {
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				sum=sum+arr[i][j];
			}
		}
		System.out.println("Sum of all elements in matrix:" +sum);
		
	}

}
