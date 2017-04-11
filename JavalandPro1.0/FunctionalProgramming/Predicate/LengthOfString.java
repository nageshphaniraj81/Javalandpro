package Predicate;

import java.util.function.Predicate;

public class LengthOfString {

	public static void main(String[] args) {
		Predicate<String> p = s->(s.length()>5);
		System.out.println(p.test("nagesh"));
		System.out.println(p.test("Anu"));
	}

}
