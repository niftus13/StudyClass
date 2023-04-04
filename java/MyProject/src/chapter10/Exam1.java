package chapter10;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID를 입력하세요");
		String idInput = sc.nextLine();
		try {
			validateName(idInput);
			System.out.println(idInput);
		} catch (BadIdInputException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

	private static void validateName(String idInput) throws BadIdInputException {
		if (idInput == null || idInput.trim().isEmpty()) {
			throw new BadIdInputException("ID를 입력하세요");
		}
		for (int i = 0; i < idInput.length(); i++) {
			char c = idInput.charAt(i);
			if (!(c >= 'a' && c < 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c < '9')) {
				throw new BadIdInputException("ID를 정확히 입력하세요");
			}
		}
	}

}
