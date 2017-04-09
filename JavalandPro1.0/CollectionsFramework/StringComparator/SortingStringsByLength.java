package StringComparator;

import java.util.Set;
import java.util.TreeSet;

public class SortingStringsByLength {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>(new StringComparator());
		
		set.add("abcfdsfsfsfsf");
		set.add("defdddddd");
		set.add("xyzfffffffffffffffff");
		set.add("xyz");
		
		for (String string : set) {
			System.out.println(string);
		}
		
	}

}
