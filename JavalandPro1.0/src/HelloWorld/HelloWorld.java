package HelloWorld;

public class HelloWorld {

	public static void main(String[] args) {

		// To print Hello world
		System.out.println("Hello World");

	}

	// This block is loaded even before main method
	static {
		System.out.println("Static block 1");
	}

	// Static block 2 (Order of static block is important
	static {
		System.out.println("Static block 2");
	}
	
	static {
		System.out.println("Static block 3");
	}

}
