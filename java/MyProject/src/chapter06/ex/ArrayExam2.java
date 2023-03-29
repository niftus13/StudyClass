package chapter06.ex;

public class ArrayExam2 {

	public static void main(String[] args) {
		
		//Student 타입의 배열 생성 : 데이터 10개의 저장가능
		
		Student[] students = new Student[10];
		students[0] = new Student("son01",100,40,70);
		students[1] = new Student("son02",51,50,82);
		students[2] = new Student("son03",60,20,73);
		students[3] = new Student("son04",41,40,27);
		students[4] = new Student("son05",81,64,61);
		students[5] = new Student("son06",90,80,98);
		students[6] = new Student("son07",20,70,57);
		students[7] = new Student("son08",70,16,25);
		students[8] = new Student("son09",54,81,78);
		students[9] = new Student("son10",91,100,70);

		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("==========================================");
		for(Student student : students) {
			System.out.println(student.result());
		}
	}

}
