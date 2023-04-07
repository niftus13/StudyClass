package chapter12;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		
		try {
			FileOutputStream out = new FileOutputStream("D:\\Test\\Testfile.txt");
			out.write(65);
			out.close();	// i/o 에서는 반드시 닫아줘야함
			System.out.println("파일에 데이터 쓰기 성공");
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
