import java.util.HashSet;

public class PairSum {

	public static void main(String[] args) {
		// check for pair in A[] with sum as x
		
		int A[] = {1, 4, 45, 6, 10, -8}; 
        int n = 26; 
        int arr_size = A.length;
        
        if(Arrayhaspair(A,n,arr_size)) {
        	System.out.println("Pair Present");
        }
        else {
        	System.out.println("Pair not Present");
        }

	}

	private static boolean Arrayhaspair(int[] a, int n, int arr_size) {
		HashSet<Integer> set= new HashSet<Integer>();
		for(int i=0;i<arr_size;i++) {
			int temp=n-a[i];
			if(temp>0 && set.contains(temp)) {
				return true;
			}
			else {
				set.add(a[i]);
			}
		}
		return false;
	}

}
