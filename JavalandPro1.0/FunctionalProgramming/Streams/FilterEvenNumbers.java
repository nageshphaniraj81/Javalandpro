package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>();
		
		for (int i = 0; i <=10; i++) {
			l1.add(i);
		}
		
		System.out.println(l1);
		
	//	List<Integer> l2 = new ArrayList<>();
		
//		for (int i = 0; i <10 ; i++) {
//			if(l1.get(i)%2==0){
//				l2.add(l1.get(i));
//			}
//		}
		
		// Commented code can be achieved in single step
		List<Integer> l2 = l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
		// List of odd numbers
		List<Integer> l3 = l1.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println(l3);
		
		//List of numbers greater than 5
		Set<Integer> s1 = l1.stream().filter(i->i>5).collect(Collectors.toSet());
	    System.out.println(s1);
	    
	    long count = l1.stream().filter(i->i>5).count();
	    System.out.println("Number of even number are "+count);
	    
	    Comparator<Integer> comp = (i1,i2)->i1.compareTo(i2);
	    List<Integer> l4 = l1.stream().sorted(comp).collect(Collectors.toList());
	    System.out.println(l4);
	    
	    Integer max = l1.stream().max(comp).get();
	    System.out.println(max);
	    
	    Integer min = l1.stream().min(comp).get();
	    System.out.println(min);
	    
	    l1.stream().forEach(i->System.out.println(i));
	    
	}

}
