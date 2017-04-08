package FileReadedAndWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadedAndWriterDemo {

	public static void main(String[] args) throws Exception {

		FileReader fr = null;
		FileWriter fw = null;
		
		fr = new FileReader("C:\\FileIOPractice\\myfile.txt");	
		fw = new FileWriter("C:\\FileIOPractice\\newfile.txt");
		
		int data;
		while((data = fr.read())!= -1){
			fw.write(data);
		}
		
		fr.close();
		fw.close();
	}
}
