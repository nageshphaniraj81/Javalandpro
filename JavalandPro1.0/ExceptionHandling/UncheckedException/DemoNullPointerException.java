package UncheckedException;

public class DemoNullPointerException {

	static DemoArrayIndexOutofBoundException d;

	public static void main(String[] args) {
		
		try{
		DemoNullPointerException.d.method1();
		}catch(NullPointerException e){
			System.out.println("Null pointer exception");
		}
		System.out.println("code after exception");
	}

}
