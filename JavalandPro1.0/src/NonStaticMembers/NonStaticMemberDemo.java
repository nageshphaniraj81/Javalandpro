package NonStaticMembers;

public class NonStaticMemberDemo {

	int num;

	NonStaticMemberDemo() {
		System.out.println("Inside constructor");
	}
	
	{
		System.out.println("Inside non static block");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside the main method");
		new NonStaticMemberDemo();
		new NonStaticMemberDemo();
		new NonStaticMemberDemo();
	}
	
	static{
		System.out.println("Inside static block");
	}
}
