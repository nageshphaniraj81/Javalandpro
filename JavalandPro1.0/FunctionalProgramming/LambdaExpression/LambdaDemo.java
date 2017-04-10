package LambdaExpression;

public class LambdaDemo {

	public static void main(String[] args) {
		FirstInterface myObject = ()->System.out.println("Inside myMethod of lambda");
		myObject.myMethod();
	}

}
