
public class ReturnSingleDigit {

	public static void main(String[] args) {
		int n=12345;
		System.out.println(digitsum(n));

	}

	private static int digitsum(int n) {
		int sum=0;
		while(n>0 || sum>9) {
			if(n==0) {
				n=sum;
				sum=0;
			}
			sum=sum+n%10;
			n=n/10;
		}
		
		return sum;
	}

}
