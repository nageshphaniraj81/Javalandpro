package WrapperClasses;

public class WrapperClassConstructor {

	public static void main(String[] args) {

        int x = 100;
        Integer y = new Integer(x);
        System.out.println(y.intValue());
        
        String a = "2000";
        Integer b = new Integer(a);
        System.out.println(b.toString());
        System.out.println(b.intValue());

	}

}
