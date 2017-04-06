package fundamentalsTopic.NonStaticMembers;

public class ObjectReferenceDemo {
	
	int x;
	
	ObjectReferenceDemo(){
		x = 800;
	}
	
	public static void main(String[] args) {
		ObjectReferenceDemo ord = new ObjectReferenceDemo();
		System.out.println(ord.x);
	}

}
