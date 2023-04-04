package chapter10;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = sc.nextLine();
		try {
			validateName(name);
			System.out.println(name);
		} catch (BadIdInputException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

	private static void validateName(String name) throws BadIdInputException {
		if (name == null || name.trim().isEmpty()) {
			throw new BadIdInputException("ID를 정확히 입력하세요");
		}
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (!(c >= 'a' && c < 'z' || c >= 'A' && c <= 'Z'||c >= '0' && c < '9')) {
				throw new BadIdInputException("ID를 정확히 입력하세요");
			}
		}
	}

}
