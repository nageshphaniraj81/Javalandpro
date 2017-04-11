package MappingConstructors;

public class myTest {

	public static void main(String[] args) {

		// Using Lambdas
		myInterface f1 = s->new MyClass(s);
		f1.get("Using Lambdas");
		
		// Using constructor mapping
		myInterface f2 = MyClass::new;
		f2.get("Using constructor mapping");
		
	}

}
