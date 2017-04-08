package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerIncludeDelimiter {

	public static void main(String[] args) {
		  String s = "What,does,not,kill,you,makes,you,stronger";
	        StringTokenizer st = new StringTokenizer(s,",",true);
	        
	        while(st.hasMoreTokens()){
	        	System.out.println(st.nextToken());
	        }
	}

}
