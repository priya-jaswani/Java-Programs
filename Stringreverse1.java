
public class Stringreverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello world";
		String revStr = reverseWordByWord(str);
		System.out.println(revStr);

		
	}
	
	 public static String reverseWordByWord(String str){
	        int strLeng = str.length()-1;
	        String reverse = "", temp = "";

	        for(int i = 0; i <= strLeng; i++){
	            temp += str.charAt(i);
	            if((str.charAt(i) == ' ') || (i == strLeng)){
	                for(int j = temp.length()-1; j >= 0; j--){
	                    reverse += temp.charAt(j);
	                    if((j == 0) && (i != strLeng))
	                        reverse += " ";
	                }
	                temp = "";
	            }
	        }
	        return reverse;
	    }

}
