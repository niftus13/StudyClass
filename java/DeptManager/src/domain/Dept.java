package domain;

// DTO : Java Beans
// 모든 변수가 private, getter/setter, 기본생성자가 반드시 존재해야함
public class Dept {

	private int deptno; // 컬럼 이름과 동일
	private String dname;
	private String loc;
	
	//생성자
	public Dept() {
		
	}

	public Dept(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	//toString
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
	
	
	
}
