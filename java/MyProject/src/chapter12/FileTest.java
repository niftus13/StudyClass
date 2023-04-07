package chapter12;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {

		File file1 = new File("d:\\Test\\Test-test.txt");
		File dir1 = new File("d:\\tests");

		System.out.println(dir1.exists());
		if (!dir1.exists()) {
			// 폴더가 존재하지 않으면 폴더를 생성
			dir1.mkdir();
			System.out.println("D드라이브에 tests 폴더를 생성" + dir1.exists());
		}

		if (file1.exists()) {
			System.out.println("파일이 존재합니다.");

		} else {
			System.out.println("파일이 없습니다.");
		}
		
		File dir2 = new File("d:\\Test");
		
		
		File newFile = new File("d:\\Test", "Test2-text.txt");
		File newFile2 = new File(dir2, "Test-text2.txt");
		
		System.out.println("파일여부 확인 : "+ newFile.isFile());
		System.out.println("폴더여부 확인 : "+ newFile2.isDirectory());
		
		File[] list = dir2.listFiles();
		System.out.println("test폴더 =======================");
		for(File file : list) {
			if(file.isDirectory()) {
				System.out.print("[DIR] ");
			}else if(file.isFile()) {
				System.out.print("[FILE] ");
			}
			System.out.println(file.getName());
		}
		
		File newPathFile = new File("d:\\Test\\abc","Test2-text.txt");
		// 파일의 이동
		newFile.renameTo(newPathFile);
		
		
	}
}
