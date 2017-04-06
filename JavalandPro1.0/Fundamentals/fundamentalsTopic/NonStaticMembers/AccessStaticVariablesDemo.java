package fundamentalsTopic.NonStaticMembers;


public class AccessStaticVariablesDemo {

	public static void main(String[] args) {

		fundamentalsTopic.HelloWorld.StsticVariables.hello();
		}
	
	static{
		 fundamentalsTopic.HelloWorld.StsticVariables.num = 100;
		 System.out.println(fundamentalsTopic.HelloWorld.StsticVariables.num);
	}

}
