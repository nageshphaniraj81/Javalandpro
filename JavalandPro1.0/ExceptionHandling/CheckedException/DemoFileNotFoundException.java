package CheckedException;
import java.io.*;

public class DemoFileNotFoundException {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
