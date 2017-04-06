package HelloWorld;

public class StsticVariables {
	
	public static int num;
	static String name;
	
	public static void main(String[] args) {
		// Default value is 0
		System.out.println(StsticVariables.num);
		System.out.println(StsticVariables.name);
		System.out.println(StsticVariables.num);
	}
	
	public static void hello(){
		System.out.println("Hello");
	}

}
