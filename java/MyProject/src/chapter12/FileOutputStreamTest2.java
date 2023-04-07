package chapter12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		
		try {
			OutputStream out = new FileOutputStream("D:\\Test\\Test1.txt");
			String str = "HI~! Hello";
			byte[] arr = str.getBytes();	//String 클래스에서 문자열의 byte 배열을 반환
			out.write(arr);
			out.close();	// i/o 에서는 반드시 닫아줘야함
			System.out.println("파일에 데이터 쓰기 성공");
			
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
