package chapter06.ex;

public class Student {

	private String sName;
	private int korScore;
	private int engScore;
	private int mathScore;
	
	public Student(String sName, int korScore, int engScore, int mathScore) {
		super();
		this.sName = sName;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}


	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	//총점계산 반환 메소드
	private int sum() {
		return korScore + engScore + mathScore;
	}
	
	private float avg() {
		return sum()/3f;
	}
	
	public String result() {
		return sName+"\t"+ korScore+"\t"+engScore+"\t"+mathScore+"\t"+sum()+"\t"+avg()+"\n";
	}


	@Override
	public String toString() {
//		return "Student [sName=" + sName + ", korScore=" + korScore + ", engScore=" + engScore + ", mathScore="
//				+ mathScore + "]";
		return result();
	}
	
	
	
}
