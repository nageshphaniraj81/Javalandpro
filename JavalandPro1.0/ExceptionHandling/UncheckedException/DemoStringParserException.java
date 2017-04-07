package UncheckedException;

public class DemoStringParserException {

	public static void main(String[] args) {
       String s = "nagesh";
       try{
       int i = Integer.parseInt(s);
       }catch(NumberFormatException e){
    	   System.out.println(e.toString());
       }
       System.out.println("Code after exception");
	}

}
