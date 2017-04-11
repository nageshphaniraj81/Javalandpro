package ArraysUtil;

import java.util.Arrays;

public class ArraySortUsingComparator {

	public static void main(String[] args) {
		String [] s = {"V","A","Z","P"};
		
		System.out.println("Before Sorting");
		for (String string : s) {
			System.out.println(string);
		}
		
		System.out.println("After Sorting");
		Arrays.sort(s,new MyComparator());
		for (String string : s) {
			System.out.println(string);
		}
	}

}
