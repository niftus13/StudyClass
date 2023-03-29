package chapter06;

//Student 클래스를 정의해봅시다. 
//① 학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다.
//② 변수는 캡슐화를 합니다. getter/setter 메소드를 정의합니다.
//③ 총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다


public class Student {

	private String name;
	private int kor;
	private int eng;
	private int math;
	
	//생성자
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
//Getter/Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}


	//한 학생의 합과 평균을 구하는 메소드
	
	public int getSum() {
		return this.kor + this.eng + this.math;
	}
	
	public float getAvg() {
		return this.getSum()/3;
	}
	
	
	@Override
	public String toString() {
		return "학생 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math +" 합= "+getSum()+"평균 ="+getAvg()+"]";
	}
	
	
	
}
