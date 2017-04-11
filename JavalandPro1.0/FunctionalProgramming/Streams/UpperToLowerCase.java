package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("NAGESH");
		l1.add("ANUSHA");
		l1.add("MARK");

		System.out.println(l1);

		List<String> l2 = l1.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
		System.out.println(l2);
	}

}
