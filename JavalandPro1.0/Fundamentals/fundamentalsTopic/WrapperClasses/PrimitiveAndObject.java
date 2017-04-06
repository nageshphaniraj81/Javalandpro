package fundamentalsTopic.WrapperClasses;

public class PrimitiveAndObject {

	public static void main(String[] args) {

		 int x  = 100;
		 Integer y =Integer.valueOf(x);
		 int z = y.intValue();
		 System.out.println(z);
		 
		 byte g = 50;
		 Byte h =Byte.valueOf(g);
		 byte i = h.byteValue();
		 System.out.println(i);
		 
		 double l = 100.78;
		 Double d = Double.valueOf(l);
		 double e = d.doubleValue();
		 System.out.println(e);
	}

}
