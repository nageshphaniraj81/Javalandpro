package NonStaticMembers;


public class AccessStaticVariablesDemo {

	public static void main(String[] args) {

		HelloWorld.StsticVariables.hello();
		}
	
	static{
		 HelloWorld.StsticVariables.num = 100;
		 System.out.println(HelloWorld.StsticVariables.num);
	}

}
