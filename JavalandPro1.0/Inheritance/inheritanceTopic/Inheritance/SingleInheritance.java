package inheritanceTopic.Inheritance;

public class SingleInheritance {

	public void m1(){
		System.out.println("Inside method m1");
	}
	
	public static void main(String[] args) {
		SingleInheritance si = new SingleInheritance();
		si.m1();
		si.hashCode();
		si.getClass();
	}
	
}
