package com.hi.deptspring;

import com.hi.deptspring.domain.DeptDTO;
import com.hi.deptspring.domain.DeptSearchOption;
import com.hi.deptspring.mapper.DeptMapper;
import com.hi.deptspring.mapper.TimeMapper;
import com.hi.deptspring.mapper.TimeMapper2;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ConnectionTest {
    @Autowired
    private DataSource dataSource;

    @Autowired(required = false)
    private TimeMapper timeMapper;

    @Autowired(required = false)
    private TimeMapper2 timeMapper2;

    @Autowired(required = false)
    private DeptMapper deptMapper;

    @Test
    public void searchDeptTest() {
        // 부서 이름검색
        DeptSearchOption option1 = DeptSearchOption.builder().searchType("dname").keyword("S").build();
        // 부서 위치검색
        DeptSearchOption option2 = DeptSearchOption.builder().searchType("loc").keyword("NEW").build();
        // 검색어가 없는 검색
        DeptSearchOption option3 = new DeptSearchOption();

        List<DeptDTO> list1 = deptMapper.selectByOption(option1);
        List<DeptDTO> list2 = deptMapper.selectByOption(option2);
        List<DeptDTO> list3 = deptMapper.selectByOption(option3);

        log.info(list1);
        log.info(list2);
        log.info(list3);
    }
    @Test
    public void selectByDeptnosTest(){
        List<Integer> deptnos = new ArrayList<>();
        deptnos.add(10);
        deptnos.add(30);
        deptnos.add(50);

        List<DeptDTO> list = deptMapper.selectByDeptnos(deptnos);
        log.info(list);
    }

    @Test
    public void deptInsertTest() {
        DeptDTO dept = DeptDTO.builder().dname("자바").loc("서울").deptno(10).build();

        deptMapper.insertDept2(dept);

    }


    @Test
    public void getDeptListTest() {

//        List<DeptDTO> list = deptMapper.selectAll();
        List<DeptDTO> list = deptMapper.selectAll2();

        log.info(">>>>>>> " + list);

        log.info(deptMapper.selectByDeptno(10));
        log.info(deptMapper.selectByDeptno(20));
        log.info(deptMapper.selectByDeptno(30));
        log.info(deptMapper.selectByDeptno(40));
        log.info(deptMapper.selectByDeptno(50));
    }


    @Test
    public void getTimeMapperTest() {
        // TimeMapper 구현체 주입여부 , 메소드 실행결과

        log.info(timeMapper.getTime());
        log.info(timeMapper2.getTime());

    }


    @Test
    public void connectionTest() throws SQLException {
        Connection conn = dataSource.getConnection();
        log.info("conn : " + conn);
        Assertions.assertNotNull(conn);     // 전달되는 conn null 이 아니라면 테스트 성공, null 이면 실패
        conn.close();

    }

}
