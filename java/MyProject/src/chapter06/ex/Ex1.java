package chapter06.ex;

public class Ex1 {

	public static void main(String[] args) {
		int[][] scores = {
				{100,90,50},
				{90,90,50},
				{80,90,50},
				{70,90,50},
				{60,90,50},
				{50,90,50},
				{80,90,50},
				{90,90,50},
				{70,90,50},
				{80,90,50},
		};
		
		for(int i=0;i<scores.length;i++) {
			int sum = 0;
			for(int j=0;j<scores[i].length;j++) {
				System.out.print(scores[i][j]+"\t");
				sum+=scores[i][j];
			}
			System.out.print(sum+"\t");
			System.out.println(sum/(float)scores[i].length);
		}

	}

}
