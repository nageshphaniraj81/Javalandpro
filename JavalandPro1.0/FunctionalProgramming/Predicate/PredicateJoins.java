package Predicate;

import java.util.function.Predicate;

public class PredicateJoins {

	public static void main(String[] args) {
		int [] x = {0,7,10,20,30,40,50,60,70,73};
		Predicate<Integer> p1 = i->(i>10);
		Predicate<Integer> p2 = i->(i%2==0);
		
		System.out.println("Values greater than 10");
		PredicateJoins.method1(p1, x);
		
		System.out.println("Values that are even are :");
		method1(p2,x);
		
		System.out.println("Values that are not even");
		method1(p2.negate(),x);
		
		System.out.println("Values that are greater than 10 and even");
		method1(p1.and(p2),x);
		
		System.out.println("Values that are greater than 10 or even");
		method1(p1.or(p2),x);
		
	}
	
	public static void method1(Predicate<Integer> p,int x[]){
		
		for(int eachValue: x){
			if(p.test(eachValue)){
				System.out.println(eachValue);
			}
		}
		
	}

}
