package chapter09;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "String";
		String str2 = "String";
		String str3 = new String("String");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		//참조변수 == 주소값 비교
		
		System.out.println("str1.equals(str3) =>"+str1.equals(str3));
		
		//특정 타입의 데이터를 String타입으로 변경
		String str4 = ""+1;
		String str5 = String.valueOf(1);
		String str6 = new String();
		System.out.println(str5.toString());
		
		String str = "Hello~";
		//			  012345 <- Index
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));
		System.out.println(str.length()); // 문자열의 길이 : 문자의 개수
		// index : 0 ~ str.length()-1
		
		// 반복문
		// 문자열 출력
		for(int i=0;i<str.length();++i) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
		
		// 역순으로 출력 : 5,4,3,2,1,0
		for(int i=str.length()-1;i>=0;--i) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
		
		// compareTo
		System.out.println(str.compareTo("Hello~"));
		System.out.println(str.compareTo("Hello~~"));
		System.out.println(str.compareTo("Hello"));
		
		System.out.println("----------------------");
		//문자열을 붙힌다. => ""+"" => concat(String s)
		System.out.println(str.concat(" JAVA!!!"));
		
		System.out.println("----------------------");
		
		// 문자열에 특정 문자열을 포함여부 확인 contains() => boolean
		System.out.println(str.contains("lo"));
		System.out.println(str.contains("bye"));
		
		//endWith
		String file1 = "phone.jpg";
		String file2 = "java.pdf";
		if(file1.endsWith(".jpg")||file2.endsWith("pdf")){
			System.out.println("업로드가 가능합니다.");
		} else {
			System.out.println("확장자가 .jpg인 파일만 업로드가 가능합니다.");
		}
		
		//equals => 저장하고 있는 문자열을 비교 boolean
		System.out.println(str.equals("Hello"));
		System.out.println(str.equals("Hello~"));
		
		// 문자열의 사이즈 체크 : isEmpty() => str.length() == 0;
		System.out.println(str.isEmpty());
		System.out.println("".isEmpty());
		
		//문자열의 개수
		System.out.println(str.length());
		
		//문자열의 치환
		System.out.println(str);
		System.out.println(str.replace('~', '!'));
		System.out.println(str.replace("Hello","JAVA"));
		
		// 시작하는 문자열 체크 startsWith() -> : http://localhost:80/ 
		String url ="http://localhost:80/member.login.jsp";
		System.out.println(url.startsWith("http://"));
		
		//subString  -> member.login.jsp 추출 
		String domain = "http://localhost:80/";
		System.out.println(url.substring(20));
		System.out.println(url.substring(domain.length()));
		
		// trim() : 공백제거
		String str7 = "      Hello    JAVA      ";
		System.out.println(str7);
		System.out.println(str7.trim());
		
		
		
	}

	
}
