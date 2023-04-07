package chapter12;

import java.io.FileInputStream;

public class FileInputStreamTest {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream fin = new FileInputStream("D:\\Test\\Testfile.txt");
			
			int i = fin.read();
			
			System.out.println(i);
			
			System.out.println((char)i);
			
			fin.close();
			System.out.println("파일 데이터를 모두 읽었습니다.");
			
		} catch (Exception e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		}

	}

}
