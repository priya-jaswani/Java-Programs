import java.util.HashSet;

public class DuplicateArray {

	public static void main(String[] args) {
		//move the  duplicate integers into a different array
		int arr[]= {1,2,3,1,2,3,4,5,6,7,9,6,9};
		int l=arr.length;
		int[] dup_arr= new int[l];
		int count=0;
		HashSet<Integer>set=new HashSet<Integer>();
		for(int i=0;i<l;i++) {
			if(set.contains(arr[i])) {
				dup_arr[count++]=arr[i];	
			}
			else {
				set.add(arr[i]);
			}
			
		}
		for(int i=0;i<count;i++) {
			System.out.println(dup_arr[i]);
		}

	}

}
