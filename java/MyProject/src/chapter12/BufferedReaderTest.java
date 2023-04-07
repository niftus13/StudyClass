package chapter12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {

		BufferedReader in = null;
		String str = null;
		// Reader 객체 생성
		try {
			in = new BufferedReader(new FileReader("d:\\Test\\Test2-text.txt"));
			
			while(true) {
				//읽기
				str = in.readLine();	//한줄씩
				if(str == null) {
					break;
				}
				System.out.println(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(str !=null) {
				try {
					in.close();
					System.out.println("읽기 종료");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

	}

}
