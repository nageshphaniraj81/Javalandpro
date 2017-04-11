package MappingInstanceMethodtoFunctionalInterface;

public class MyClass {
	
	public void method1(int i){
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		MyClass c = new MyClass();
		MyInterface i = c::method1;
		i.myMethod(30);
		
		// Note : just incase you want to compare Lambda expression 
		MyInterface j = l->System.out.println(l);
		j.myMethod(50);
		
	}

}
