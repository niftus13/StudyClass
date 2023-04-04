package chapter10;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = sc.nextLine();

		try {
			if(name.trim().isEmpty()||!checkName(name)) {
				BadIdInputException e = new BadIdInputException("영문자와 숫자 로만 입력가능합니다.");
				throw e;
			}else {
				System.out.println(name);
			}
		} catch (BadIdInputException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	// 전달받은 문자열이 영문자 , 숫자로 되어있는지 판별 : a-z A-Z 0-9
	static boolean checkName(String name) {
		boolean result = true;
		for(int i=0;i<name.length();++i) {
			char c = name.charAt(i);
			if(!(c>='a'&&c<'z'||c>='A'&&c<='Z')||c>='0'&&c<='9') {
				result = false;
				break;
			}
		}
		return result;
	}

}
