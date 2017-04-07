package Assertion;

public class AssertDemo {

	public static void main(String[] args) {

       int withdrawlAmount = 100;
       int currentBalance = 50;
       
       // Asserts are usually used for testing
       assert (withdrawlAmount<= currentBalance): "Withdrawl amount is higher than current balance";

	}

}
