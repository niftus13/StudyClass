package chapter12;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream in = new FileInputStream("D:\\Test\\Test1.txt");
			int i = 0;
			while(true) {
				i=in.read();	//읽어올 데이터가 없다면 -1을 반환
				if(i==-1) {
					break;
				}
				System.out.print((char)i);
			}
			System.out.println();
			in.close();
			System.out.println("파일 데이터를 모두 읽었습니다.");
			
		} catch (IOException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		}

	}

}
