package TryWithResourceBlock;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {

	public static void main(String[] args) {

	
		int count = 0;
		
		// Try with resource block automatically closes 
		//the resources and hence there is no need of finally block

		try(FileReader fr = new FileReader("C:\\FileIOPractice\\myfile.txt");
				BufferedReader br = new BufferedReader(fr);) {

			String line;
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					count++;
				}
			}
			System.out.println("Number of words in the file are :" + count);

		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
