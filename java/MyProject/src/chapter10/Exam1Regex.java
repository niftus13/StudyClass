package chapter10;

import java.util.Scanner;

public class Exam1Regex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ID를 입력해주세요");
		String inputId = scanner.nextLine();
		
		try {
			validateInputId(inputId);
			System.out.println(inputId);
			
		} catch (BadIdInputException e) {
			System.out.println(e.getMessage());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			scanner.close();
		}
	}

	private static void validateInputId(String inputId) throws BadIdInputException {
		if (inputId.trim().isEmpty() || !inputId.matches("[a-zA-Z0-9]+")) {
			throw new BadIdInputException("영문자와 숫자로 입력해야 합니다.");
		}
	}
 

}
