package chapter10;

import java.util.Scanner;

public class Exam1Regex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID를 입력해주세요");
		String name = sc.nextLine();
		
		try {
			
			if(!(name.matches("[a-zA-Z0-9]+"))){
				throw new BadIdInputException("영문자와 숫자로 입력해야 합니다.");
			}else {
				System.out.println(name);
			}
			
		} catch (BadIdInputException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
