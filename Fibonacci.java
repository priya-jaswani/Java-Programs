
public class Fibonacci {

	public static void main(String[] args) {
		int n=10;
		int i=0;
		int j=1;
		System.out.println(i);
		System.out.println(j);
		for(int k=2;k<n;k++) {
			int m=i+j;
			System.out.println(m);
			i=j;
			j=m;
			
			
		}
	}

}
