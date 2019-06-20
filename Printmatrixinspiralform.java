
public class Printmatrixinspiralform {

	public static void main(String[] args) {
		int R = 3; 
        int C = 6; 
        int a[][] = { {1,  2,  3,  4,  5,  6}, 
                      {7,  8,  9,  10, 11, 12}, 
                      {13, 14, 15, 16, 17, 18} 
                    }; 
        spiralPrint(R,C,a); 

	}

	private static void spiralPrint(int r, int c, int[][] a) {
		int i;
		int k=0;
		int l=0;
		
		while(k<r && l<c) {
			
			for(i=l;i<c;i++) {
			System.out.println(a[k][i]);	
			}
			k++;
			for(i=k;i<r;i++) {
				System.out.println(a[i][c-1]);
			}
			c--;
			if(k<r) {
				for(i=c-1;i>=0;i--) {
					System.out.println(a[r-1][i]);
				}
				r--;
			}
			
			if(l<c) {
				for(i=r-1;i>=k;--i) {
					System.out.println(a[i][l]);
				}
				l++;
			}
			
		}
		
		
	}

}
