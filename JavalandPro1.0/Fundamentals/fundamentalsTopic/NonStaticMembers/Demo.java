package fundamentalsTopic.NonStaticMembers;

public class Demo {
	
	int name;
	
	static Demo obj =  new Demo();
	
	
	static {
		System.out.println(Demo.obj);
		Demo.init();	
	}
	
	static void init(){
		Demo.obj = new Demo();
	}
	
	public static void main(String[] args) {
		System.out.println(Demo.obj);
	}

}
