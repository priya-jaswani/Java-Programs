import java.util.HashSet;
import java.util.Iterator;

public class StringIntersection {

	public static void main(String[] args) {
		String s1 = "Isabella,tom,hardy";
		String s2 = "Isabella,tom,hardy,victor,smith";
		String s1arr[]=s1.split(",");
		String s2arr[]=s2.split(",");
		HashSet<String>set1 = new HashSet<String>();
		
		for(int i=0;i<s1arr.length;i++) {
			set1.add(s1arr[i]);
		}
		HashSet<String>set2 = new HashSet<String>();
		for(int i=0;i<s2arr.length;i++) {
			set2.add(s2arr[i]);
		}
        set1.retainAll(set2);
		Iterator<String>it=set1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
