package NonStaticMembers;

public class DefaultConstructor {
	int num;
	
	// No constructor means, default constructor
	
	{
		System.out.println("Inside non static block");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside the main method");
		new DefaultConstructor();
		new DefaultConstructor();
		new DefaultConstructor();
	}
	
	static{
		System.out.println("Inside static block");
	}
}
