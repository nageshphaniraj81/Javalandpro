package fundamentalsTopic.WrapperClasses;

public class ObjectAndString {

	public static void main(String[] args) {

//		long x = 100;
//		Long y = Long.valueOf(x);
//		String s = y.toString();
//		Long z = Long.valueOf(s);
//		System.out.println(z);
		
		int x = 100;
		Integer y = Integer.valueOf(x);
		String z = y.toString();
		int i = Integer.parseInt(z);
		System.out.println(i);
		int j = Integer.valueOf(z);
		System.out.println(j);
	}

}
