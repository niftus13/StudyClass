package org.example.main;

import org.example.assembler.Assembler;
import org.example.domain.RegisterRequest;
import org.example.service.ChangePasswordService;
import org.example.service.MemberRegisterService;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Scanner;

public class MemberManagerSpringMain1 {
    // 조립기 : 객체를 관리

    static GenericXmlApplicationContext ctx =
            new GenericXmlApplicationContext("classpath:appCtx.xml");

    public static void main(String[] args) {
        // 사용자 메뉴 입력

        Scanner sc = new Scanner(System.in);

        while (true) {

            // 한줄 단위로 명령이 구분
            System.out.println("명령어를 입력하세요");
            String command = sc.nextLine();
            // exit : 프로그램 종료
            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");

            } else if (command.startsWith("new ")) {
                // new 이메일  비번  비번확인    이름
                // new cool@gmail 1111 1111 COOL
                String[] commandStr = command.split(" ");

                //입력요청
                newCommand(commandStr);
                // change 이메일  oldPW  newPW
                // change cool@gmail 1111 1111
            } else if (command.startsWith("change ")) {
                // new 이메일  비번  비번확인    이름
                changeCommand(command.split(" "));
            }


        }


    }

    // 입력 메소드
    public static void newCommand(String[] args) {

        // 전달받은 배열의 사이즈가 : 5
        if (args.length != 5) {
            System.out.println("new 명령 구문이 올바르지 않습니다.");
            return;
        }

        MemberRegisterService registerService = ctx.getBean("memberRegisterService",MemberRegisterService.class);

        RegisterRequest request = new RegisterRequest();
        // new cool@gmail 1111 1111 COOL
        //  [0]  [1]      [2]   [3]  [4]
        request.setEmail(args[1]);
        request.setPassword(args[2]);
        request.setConfirmPassword(args[3]);
        request.setName(args[4]);

        // 비밀번호 일치 여부
        if (request.isConfirmPassword()) {
            System.out.println("비밀번호 확인 비밀번호가 일치하지 않습니다.");
            return;
        }

        registerService.regist(request);

    }




    // 변경 메소드
    public static void changeCommand(String[] args) {
        // change cool@gmail 1111 1111
        //  [0]  [1]      [2]   [3]
        if (args.length != 4) {
            System.out.println("change 명령 구문이 올바르지 않습니다.");
            return;
        }
        ChangePasswordService changePasswordService =
                ctx.getBean("changePasswordService", ChangePasswordService.class);

        changePasswordService.changePassword(args[1], args[2], args[3]);

        System.out.println("처리되었습니다.");
    }


}
