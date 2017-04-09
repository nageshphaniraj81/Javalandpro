package StringBufferComparator;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetForStringBuffer {

	public static void main(String[] args) {

		Set<StringBuffer> set = new TreeSet<>(new SBComparator());
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("def"));
		set.add(new StringBuffer("xyz"));
		
		for (StringBuffer string : set) {
			System.out.println(string);
		}
		
		
	}

}
