package CollectionsUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("C");
		l.add("Q");
		
		System.out.println("List before sorting :"+l);
		
		Collections.sort(l);
		
		System.out.println("List after sorting :"+l);
		
		Collections.sort(l,new MyComparator());
		
		System.out.println("List after sorting with comparator :"+l);
		
	}

}
