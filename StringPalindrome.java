
public class StringPalindrome {

	public static void main(String[] args) {
		String str="azb";
		String revstr="";
		
		for(int i=str.length()-1;i>=0;i--) {
			revstr=revstr+str.charAt(i);
		}
		
		if(str.equals(revstr) ){
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		}
	}


