package FileInputStreamDemo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// This program reads the content of the file using fileInputstream class
// One byte at a time and disply it in the console

public class FileInputStreamdemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream( new File("C:\\FileIOPractice\\myfile.txt"));
			System.out.println("File opened");
			
			int i;
			while((i=fis.read())!=-1){
				System.out.print((char)i);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\nFile closed");
		}

	}

}
