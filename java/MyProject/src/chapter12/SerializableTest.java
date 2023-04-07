package chapter12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableTest {

	public static void main(String[] args) {
		
		
		Person person = new Person("King",10);
		String msg = "안녕하세요";
		
		
		ObjectOutputStream outputStream = null;
		try {
			FileOutputStream fos = new FileOutputStream("instanceData.ser");
			outputStream = new ObjectOutputStream(fos);
			outputStream.writeObject(person);
			outputStream.writeObject(msg);
			System.out.println("저장");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		
		
	}
	
}
