import java.util.HashSet;
import java.util.Iterator;

public class StringUnion {

	public static void main(String[] args) {
		String s1 = "Isabella,tom,hardy";
		String s2 = "Isabella,tom,hardy,victor,smith";
		String s1arr[]=s1.split(",");
		String s2arr[]=s2.split(",");
		HashSet<String>set = new HashSet<String>();
		
		for(int i=0;i<s1arr.length;i++) {
			set.add(s1arr[i]);
		}
		for(int i=0;i<s2arr.length;i++) {
			set.add(s2arr[i]);
		}

		Iterator<String>it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
