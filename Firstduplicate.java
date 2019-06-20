import java.util.HashSet;
import java.util.Set;

public class Firstduplicate {

	public static void main(String[] args) {
		int arr[]= {1,3,4,5,6};
		System.out.println("First duplicate :" +findfirstduplicate(arr));

	}

	private static int findfirstduplicate(int[] arr) {
		Set<Integer>set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!set.add(arr[i])) {
				return arr[i];
			}
		}
		return -1;
	}

}
