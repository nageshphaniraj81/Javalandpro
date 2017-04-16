package OperatorsAndExpressions;

public class Question9 {

	public static void main(String[] args) {
		float a = 9.0f,b = 21.0f;
		float c;
		c = (++b*a++)/b++;
		System.out.println(a+" "+b+" "+c);
	}

}
