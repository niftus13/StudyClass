package org.example.service;

import org.example.dao.Dao;
import org.example.domain.Member;
import org.example.domain.RegisterRequest;

import java.util.Date;

public class MemberRegisterService {
    private Dao dao;

    // 생성자를 통해서 Dao 주입
    public MemberRegisterService(Dao dao) {
        this.dao = dao;
    }

    //setter 메소드
    public void setDao(Dao dao){
        this.dao=dao;
    }

    // 등록 처리 해주는 메소드 :
    // RegisterRequest (email, password, confirmPassword, name)
    public void regist(RegisterRequest request){
        //이메일 존재여부 확인 : map 저장시 email 을 key 값으로 사용
        Member member =  dao.selectByEmail(request.getEmail());     //Member or null
        if(member != null){
            System.out.println("중복되는 이메일이 있습니다. 다시 시도해주세요");
            return;
        }
        //저장하기 위한 Member 객체 생성
        Member newMember = new Member();
        newMember.setEmail(request.getEmail());
        newMember.setPassword(request.getPassword());
        newMember.setName(request.getName());
        newMember.setRegDate(new Date());

        //Dao => 저장
        dao.insert(newMember);

    }
}
