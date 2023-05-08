package com.app.springex;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class deptDTO {

    private int deptno;
    private String dname;
    private String loc;

    public static void main(String[] args) {
        deptDTO dept = new deptDTO(2 , "test", "loc");
        System.out.println(dept);
        dept.setDeptno(10);
        dept.setDname("ACOUNTING");
        dept.setLoc("NEW YORK");
        System.out.println(dept.getLoc());
    }
}
