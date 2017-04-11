package DiamondProblemAndDefaultMethods;

public interface X {
	default void m1(){
		System.out.println("Inside m1");
	}
}
