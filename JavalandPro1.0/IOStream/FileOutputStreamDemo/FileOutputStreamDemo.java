package FileOutputStreamDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	@SuppressWarnings("null")
	public static void main(String[] args) {
       
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("C:\\FileIOPractice\\MyPhoto.jpg");
			fos = new FileOutputStream("C:\\FileIOPractice\\NewPhoto.jpg");
			System.out.println("File opened");
			int data;
			while((data=fis.read())!=-1){
				fos.write(data);
			}
			System.out.println("File copied");
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				fis.close();
				fos.close();
				System.out.println("File closed");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
