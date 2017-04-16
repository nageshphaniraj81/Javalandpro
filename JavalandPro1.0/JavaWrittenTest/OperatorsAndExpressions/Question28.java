package OperatorsAndExpressions;

public class Question28 {

	public static void main(String[] args) {
		int x = 34,y =23;
		int z = x++ | ++y;
		int w = x++|++y^z++;
		System.out.println(w+" "+ x+ " "+y+" "+z);
		
		boolean a =true,b = false,c =true,d = !(a&&b||c), e=(d&&a||b)&&c;
		System.out.println(d+" "+e);
		
	}

}
