package CollectionsUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(11);
		l.add(5);
		l.add(111);
		
		System.out.println("List before"+l);
		
		Collections.reverse(l);
		
		System.out.println("List after"+l);
	}

}
