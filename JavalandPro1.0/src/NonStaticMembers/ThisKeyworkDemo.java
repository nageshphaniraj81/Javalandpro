package NonStaticMembers;

public class ThisKeyworkDemo {
	
	int x;
	
	ThisKeyworkDemo(){
		System.out.println(this);
		System.out.println(this.x);
	}
	

	public static void main(String[] args) {

		new ThisKeyworkDemo();
		new ThisKeyworkDemo();

	}

}
