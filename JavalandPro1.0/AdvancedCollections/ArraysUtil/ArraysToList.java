package ArraysUtil;
import java.util.Arrays;
import java.util.List;
public class ArraysToList {

	public static void main(String[] args) {
		
		// List size cannot be changed when convered using asList operation
		String [] s = {"V","A","Z","P"};
		List<String> asList = Arrays.asList(s);
		for (String string : asList) {
			System.out.println(string);
		}
		asList.add("N");
		for (String string : asList) {
			System.out.println(string);
		}
	}

}
