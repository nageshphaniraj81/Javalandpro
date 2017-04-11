package ArraysUtil;

import java.util.Comparator;

public class MyComparator implements Comparator<String>{

	@Override
	public int compare(String arg0, String arg1) {
		return arg1.compareTo(arg0) ;
	}

}

