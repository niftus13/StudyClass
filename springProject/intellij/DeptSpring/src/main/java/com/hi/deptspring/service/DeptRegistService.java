package com.hi.deptspring.service;

import com.hi.deptspring.domain.DeptRegistRequest;
import com.hi.deptspring.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptRegistService {

    @Autowired
    private DeptMapper mapper;

    public int registDept(
            DeptRegistRequest registRequest
    ){
        return mapper.insertDept(registRequest);
    }


}
