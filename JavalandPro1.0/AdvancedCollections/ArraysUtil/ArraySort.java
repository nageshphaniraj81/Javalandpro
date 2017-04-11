package ArraysUtil;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int [] a = {40,10,15,7};
		System.out.println("Before Sort");
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("After Sort");
		Arrays.sort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}

}
