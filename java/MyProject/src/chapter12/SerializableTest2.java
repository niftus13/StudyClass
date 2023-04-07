package chapter12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest2 {

	public static void main(String[] args) {
		
		ObjectInputStream inputStream = null;
		try {
			FileInputStream in = new FileInputStream("instanceData.ser");
			
			inputStream = new ObjectInputStream(in);
			
			
			Person p = (Person) inputStream.readObject();
			
			String newStr = (String) inputStream.readObject();
			//Person p = (Person) inputStream.readObject(); 	//순서
			
			p.tell();
			System.out.println(newStr);
			
			
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}

	}
	
}
