package OperatorsAndExpressions;

public class Question10 {

	public static void main(String[] args) {
		int x =0;
		boolean b1,b2,b3,b4;
		b1 =b2=b3=b4=true;
		x = (b1|b2&b3^b4)?x++:--x;
		System.out.println(x);
	}

}
