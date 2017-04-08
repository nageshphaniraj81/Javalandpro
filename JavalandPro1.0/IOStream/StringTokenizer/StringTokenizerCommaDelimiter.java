package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerCommaDelimiter {

	public static void main(String[] args) {
	    String s = "What,does,not,kill,you,makes,you,stronger";
        StringTokenizer st = new StringTokenizer(s,",");
        
        while(st.hasMoreTokens()){
        	System.out.println(st.nextToken());
        }
	}

}
