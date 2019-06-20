import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Arr1 {
	static Character[] array = {'A','B','C','D'};
	static List<String> strings= Arrays.asList("AABCDA","ABCDZADC","ABCDBCA","ABCDABDCA");
	public static void main(String[] args) {

		
		System.out.println(getLongest(strings,array));
		

	}

	
	private static String getLongest(List<String> list, Character[] array) {
	    String longest = "";
	    if (list == null || list.isEmpty() || array == null
	            || array.length == 0) {
	        return longest;
	    }
	    Set<Character> set = new HashSet<Character>(Arrays.asList(array));
	    for (String word : list) {
	        boolean valid = true;
	        for (Character c : word.toCharArray()) {
	            if (!set.contains(c)) {
	                valid = false;
	                break;
	            }
	        }
	        if (valid && longest.length() < word.length()) {
	            longest = word;
	        }
	    }
	    return longest;
	

	
	}

}
