
public class Printpairsotherwisezero {

	public static void main(String[] args) {
		int arr[]= {1,5,7,8,9};
		int x=18;
		if(findpairs(arr,x)) {
			System.out.println("Array has elements of given value");
		}
		else {
			System.out.println("Array doesn't have elements of given value");
			
		}


	}
 static boolean findpairs(int[] arr, int x) {
	 int l=0;
	 int r=arr.length-1;
	 int sum=x;
	 while(l<r) {
		 
		 if(arr[l]+arr[r]==sum) {
			 return true;
		 }
		 else if (arr[l]+arr[r]<sum) {
			 l++;
		 }
		 else {
			 r--;
		 }
	 }
	return false;
		
		
	}

}
