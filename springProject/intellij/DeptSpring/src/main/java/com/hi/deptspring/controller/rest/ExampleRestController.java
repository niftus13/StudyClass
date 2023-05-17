package com.hi.deptspring.controller.rest;

import com.hi.deptspring.domain.DeptDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Log4j2
@RequestMapping("/test")
public class ExampleRestController {

    // 메소드의 반환 타입이 String -> 문자열 응답
    @GetMapping("/sample1")
    public String hello(){

        return "NNNNY";
    }

    @GetMapping("/sample2")
    public DeptDTO getDept(){

        DeptDTO dept = DeptDTO.builder().deptno(90).dname("DEV").loc("서울").build();

        return dept;
    }
@GetMapping("/sample3")
    public List<DeptDTO> getDeptList(){
        List<DeptDTO> list = new ArrayList<>();
        list.add(new DeptDTO(10,"test1","loc1"));
        list.add(new DeptDTO(20,"test2","loc2"));
        list.add(new DeptDTO(30,"test3","loc3"));

        return list;
    }

@GetMapping("/sample4")
    public Map<Integer,DeptDTO> getDeptMap(){

        Map<Integer,DeptDTO> map = new HashMap<>();
        map.put(10, new DeptDTO(10,"test1","loc1"));
        map.put(20, new DeptDTO(20,"test2","loc2"));
        map.put(30, new DeptDTO(30,"test3","loc3"));

        return map;
    }


}
