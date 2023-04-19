-- VIEW
--20230419

-- VIEW : 가상테이블
-- VIEW 객체는 SQL을 가진다 => SQL실행결과를 가상의 테이블로 사용


SELECT EMPNO, ENAME, DEPTNO
FROM EMP
WHERE DEPTNO = 30
;

--VIEW 객체 생성
-- CREATE OR REPLACE VIEW 뷰이름 AS 서브쿼리

CREATE OR REPLACE VIEW EMP_VIEW30 
AS 
SELECT EMPNO, ENAME, DEPTNO
FROM EMP
WHERE DEPTNO = 30
;

select * from emp_view30;

-- 주문정보 : orders, book, customer
select o.orderid, c.name, b.bookname, b.price, o.saleprice, o.orderdate
from orders o, book b, customer c
where o.bookid = b.bookid
and o.custid = c.custid
;

--VIEW 생성
CREATE OR REPLACE VIEW ORDER_INFO
AS 
select o.orderid, c.name, b.bookname, b.price, o.saleprice, o.orderdate ,C.PHONE
from orders o, book b, customer c
where o.bookid = b.bookid
and o.custid = c.custid
;

SELECT NAME,BOOKNAME FROM ORDER_INFO;

SELECT BOOKNAME FROM ORDER_INFO WHERE NAME = '박지성';

SELECT VIEW_NAME, TEXT FROM USER_VIEWS;

-- VIEW의 삭제
DROP VIEW EMP_VIEW30;

SELECT ROWNUM, ENAME, HIREDATE FROM EMP ORDER BY HIREDATE;


--ROWNUM INLINE_VIEW

SELECT ROWNUM, ENAME, HIREDATE 
FROM (SELECT ROWNUM, ENAME, HIREDATE FROM EMP ORDER BY HIREDATE)
WHERE ROWNUM <= 3
ORDER BY HIREDATE;

--ROWNUM VIEW
CREATE OR REPLACE VIEW EMP_HIREDATE_VIEW
AS
SELECT ENAME, HIREDATE FROM EMP ORDER BY HIREDATE;

SELECT * FROM EMP_HIREDATE_VIEW;

SELECT ROWNUM, ENAME, HIREDATE
FROM EMP_HIREDATE_VIEW
WHERE ROWNUM <= 3;


