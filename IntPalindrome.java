
public class IntPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=121;
		int rnum=0;
		
		while(num>0) {
			int temp=num%10;
			rnum=(rnum*10)+temp;
			num=num/10;
		}
		
if(num==rnum) {
	System.out.println("Palindrome");
}
else {
	System.out.println("Not Palindrome");
}

	}

}
