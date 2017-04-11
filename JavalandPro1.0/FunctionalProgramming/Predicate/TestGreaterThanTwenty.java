package Predicate;

import java.util.function.Predicate;

public class TestGreaterThanTwenty {

	public static void main(String[] args) {
		Predicate<Integer> p = i->(i>20);
		System.out.println(p.test(25));
		System.out.println(p.test(19));
		System.out.println(p.test(40));
	}

}
