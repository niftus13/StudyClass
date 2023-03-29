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
	
	private int getSum() {
		return kor + eng + math;
	}
	
	private float getAvg() {
		return getSum()/3f;
	}
	
	
	@Override
	public String toString() {
		return "학생 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math +" 합= "+getSum()+" 평균 ="+getAvg()+"]";
	}
	
	
	//main()메소드에 아래 내용을 정의해봅시다. 
	//① Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
	//② Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
	//③ 배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다
	public static void main(String[] args) {
		Student[] students = new Student[10];
		
		students[0] = new Student("1",99,98,97);
		students[1] = new Student("2",96,95,94);
		students[2] = new Student("3",93,92,91);
		students[3] = new Student("4",90,89,88);
		students[4] = new Student("5",87,86,85);
		students[5] = new Student("6",84,83,82);
		students[6] = new Student("7",81,80,79);
		students[7] = new Student("8",78,77,76);
		students[8] = new Student("9",75,74,73);
		students[9] = new Student("10",72,71,70);
		//출력
		for(Student student:students) {
			System.out.println(student);
		}

		
	}
	
	
	
}
