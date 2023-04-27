<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	// application 객체의 속성에 cnt 이름의 속성이 저장되어있다
	// 숫자 저장 String 타입의 데이터로 저장
	
	String cntStr = (String)application.getAttribute("cnt");
	
	int cnt = cntStr == null ? 0 : Integer.parseInt(cntStr);
	
	
	// 접속 전 까지의 카운트 
	out.print("방문자 수 : "+ cnt);
	// 카운트 증가
	cnt++;
	
	//속성에 데이터 저장
	application.setAttribute("cnt", String.valueOf(cnt));





%>