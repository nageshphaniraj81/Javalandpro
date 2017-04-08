package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
        try {
			FileInputStream fis  = new FileInputStream("C:\\FileIOPractice\\myObject.ser");
		    ObjectInputStream ois = new ObjectInputStream(fis);
		    
		    Object obj = ois.readObject();
		    Employee emp = (Employee)obj;
		    
		    System.out.println(emp.id);
		    System.out.println(emp.name);
		    System.out.println(emp.salary);
		    System.out.println(emp.ssn);
		    
        } catch ( IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
