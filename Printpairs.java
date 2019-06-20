import java.util.HashSet;

public class Printpairs {

	public static void main(String[] args) {
		int arr[]= {1,5,7,8,9};
		int x=18;
		Printpairs.findpair(arr,x);
		}



	static void findpair(int arr[],int val) {
		HashSet<Integer>set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			int temp=val-arr[i];
			if(temp>0 && set.contains(temp)) {
				System.out.println("Print pairs :" +temp +"and" +arr[i]); 
			}
			set.add(arr[i]);
		}
		
		
	}

	
		
		
	}
