
public class StringReverse {

	public static void main(String[] args) {
		String str= "Life is beautiful";
		String revstr="";
		String[] strb= str.split(" ");
		for(int i=strb.length-1;i>=0;i--) {
			revstr=revstr+strb[i]+" ";
		}
		System.out.println(revstr);
	}

}
