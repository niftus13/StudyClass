package Practice_Code;

public class prac15 {
	public static void main(String[] args) {

		int n = 3;
		
		if(n==1) {
			System.out.println("현재 인원은 "+n+" 명입니다.");
		}else if(n==2) {
			System.out.println("현재 인원은 "+n+" 명입니다.");
			
		}else if(n==3) {
			System.out.println("현재 인원은 "+n+" 명입니다.");
		}else {
			System.out.println("현재 많은 사람이 있습니다.");
		}
		
		switch(n) {
		case 1:
			System.out.println("현재 인원은 1 명입니다.");
			break;
		case 2:
			System.out.println("현재 인원은 2 명입니다.");
			break;
		case 3:
			System.out.println("현재 인원은 3 명입니다.");
			break;
		default:
			System.out.println("현재 많은 사람이 있습니다.");
			
		
		}
		
		
		
	}

}
