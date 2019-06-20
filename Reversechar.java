
public class Reversechar {

	public static void main(String[] args) {
		String str="I love India";
		System.out.println(reversestring(str));
	}

	private static String reversestring(String str) {
		String words[]=str.split(" ");
		String reversestring="";
		for(int i=0;i<words.length;i++) {
			String reverseword="";
			String word=words[i];
			for(int j=word.length()-1;j>=0;j--) {
				reverseword=reverseword+word.charAt(j);
			}
			reversestring=reversestring+reverseword +" ";
		}
		return reversestring;
	}

}
