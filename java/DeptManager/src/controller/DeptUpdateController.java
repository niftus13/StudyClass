package controller;

import java.util.List;

import dao.DeptDao;
import domain.Dept;
import main.DeptManagerMain;
import service.DeptListService;
import service.DeptSearchService;
import service.DeptUpdateService;

public class DeptUpdateController {

	DeptListService listService;
	DeptSearchService searchService;
	DeptUpdateService updateService;

	public DeptUpdateController() {
		this.listService = new DeptListService(new DeptDao());
		this.searchService = new DeptSearchService();
		this.updateService = new DeptUpdateService();
	}

	public void updateDept() {

		// 1. 수정하고자 하는 데이터를 사용자로부터 받아서 => Dept반환
		Dept newDept = inputUpdateDept();
		// 2. Service에 Dept를 전달, 수정 => 결과반환(1 or 0)
		int result = updateService.updateDept(newDept);
		// 3. 결과 값에 따른 결과 출력
		printData(result);
		
		
		
	}
	
	
	private void printData(int result) {
		if(result > 0 ) {
			System.out.println("수정되었습니다.");
			
		}else {
			System.out.println("수정 실패..");
			System.out.println("입력한 데이터를 확인 후 입력하세요");
		}
	}
	

	private Dept inputUpdateDept() {

		// 1. 수정하고자 하는 부서번호를 입력하세요
		System.out.println("부서정보 수정을 시작합니다.");
		// 전체 리스트 출력
		System.out.println();

		List<Dept> list = listService.getDeptList();
		System.out.println("---------------------------");
		for (Dept d : list) {
			System.out.println(d.getDeptno() + "/" + d.getDname() + "/" + d.getLoc());
		}
		System.out.println("---------------------------");
		System.out.println("수정하고자 하는 부서번호를 입력하세요 >>>");

		// 사용자 부서번호 입력
		int deptno = Integer.parseInt(DeptManagerMain.sc.nextLine());

		// 2. 해당 부서번호의 데이터를 가져와서 보여줌
		Dept dept = searchService.searchDept(deptno);
		System.out.println("---------------------------");
		System.out.println(dept);
		System.out.println("---------------------------");

		// Dept => 사용자가 입력한 부서번호 의 정보

		// 3. 수정할 데이터를 입력 받아 => Dept로 만들어서 입력
		System.out.println(deptno + "번 부서의 정보 수정을 시작합니다.");
		System.out.println("수정하고자 하는 새로운 부서이름을 입력하세요");
		String newDname = DeptManagerMain.sc.nextLine();
		dept.setDname(newDname);
		System.out.println("새로운 위치 정보를 입력하세요>>>");
		String newLoc = DeptManagerMain.sc.nextLine();
		dept.setLoc(newLoc);

		// dept = deptno + 새로 입력받은 dname, loc

		// 4. 수정된 데이터를 반환
		return dept;

	}
	
	public static void main(String[] args) {
		DeptUpdateController controller = new DeptUpdateController();
		
		Dept dept = controller.inputUpdateDept();
		System.out.println(dept);
		
	}

}
