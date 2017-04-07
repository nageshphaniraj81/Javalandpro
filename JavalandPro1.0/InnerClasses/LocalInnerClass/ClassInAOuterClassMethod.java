package LocalInnerClass;

public class ClassInAOuterClassMethod {
	
	public void f1(){
		System.out.println("Inside Outer Class f1 method ");
		
		class Inner{
			void f2(){
				System.out.println("Inside inner class f2 method");
			}
		}
		
		Inner inner = new Inner();
		inner.f2();
		
	}

	public static void main(String[] args) {
		ClassInAOuterClassMethod outer = new ClassInAOuterClassMethod();
		outer.f1();
	}

}
