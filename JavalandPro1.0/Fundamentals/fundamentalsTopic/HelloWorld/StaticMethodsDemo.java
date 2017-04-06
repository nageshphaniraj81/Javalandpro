package fundamentalsTopic.HelloWorld;

public class StaticMethodsDemo {

	public static void main(String[] args) {
		System.out.println("Inside Main");
		StaticMethodsDemo.method1();
		StaticMethodsDemo.method2();
		StsticVariables.num = 100;
		System.out.println(StsticVariables.num );
	}

	static void method1() {
		System.out.println("Inside method 1");
	}
	
	static void method2(){
		System.out.println("Inside method 2");
	}
	
	static void method3(){
		System.out.println("Hi");
	}
	
	static{
		System.out.println("Inside static block");
		StaticMethodsDemo.method1();

	}

}
