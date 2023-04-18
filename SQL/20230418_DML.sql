
--20230418
-- DML : 입력, 수정, 삭제 => CREATE(INSERT), READ(SELECT), UPDATE(UPDATE), DELETE(DELETE) => CRUD

-- 데이터를 행 단위로 입력

--테스트 테이블 생성
CREATE TABLE DEPT01(
    DEPTNO NUMBER(2) CONSTRAINT PK_DEPT01_DEPTNO PRIMARY KEY,
    DNAME VARCHAR2(10) NOT NULL,
    LOC VARCHAR2(10) 
);
DESC DEPT01;

-- INSERT INTO 테이블이름 (컬럼, 컬럼, ...) VALUES (데이터,데이터,...);

INSERT INTO DEPT01 (DEPTNO, DNAME, LOC  ) 
            VALUES (10,'TEST','TEST-LOC');

SELECT * FROM DEPT01;

INSERT INTO DEPT01 (LOC, DNAME, DEPTNO)
            VALUES ('서울', '개발팀', 20);
SELECT * FROM DEPT01;

--오류 : 값이 많음
INSERT INTO DEPT01 (DEPTNO, LOC) VALUES(30,'QA','서울','MEMO');
--오류 : 값 부족
INSERT INTO DEPT01 (LOC, DNAME, DEPTNO) VALUES ('서울', '개발팀');

INSERT INTO DEPT01 (DEPTNO, DNAME) VALUES(30,'QA');
--오류 : NULL 부적합한 식별자
INSERT INTO DEPT01 (DEPTNO, DNAME) VALUES(NULL,NULL);
--오류 : NOT NULL 제약이 있는 컬럼은 반드시 데이터를 입력해야 한다.
INSERT INTO DEPT01 (DEPTNO, LOC) VALUES(30,'서울');
--오류 : 부적합한 식별자 DNAME
INSERT INTO DEPT01 (DEPTNO, DMANE) VALUES(30,'서울');

-- 모든 컬럼에 데이터를 입력하는 경우 -> 컬럼명 생략하고 사용 가능

INSERT INTO DEPT01 VALUES (40,'기획팀','대전');
SELECT * FROM DEPT01;


-- NULL 값 입력
-- 명시적 입력, 암묵적 입력
--명시적 입력
INSERT INTO DEPT01 VALUES (50,'TEST',NULL);
INSERT INTO DEPT01 VALUES(70,'TEST111','');
SELECT * FROM DEPT01;
-- 암묵적 입력
INSERT INTO DEPT01 (DEPTNO,DNAME) VALUES (60,'TEST123');
SELECT * FROM DEPT01;

--서브쿼리를 이용한 데이터 입력
CREATE TABLE DEPT02
AS
SELECT * FROM DEPT WHERE 1=0;
DESC DEPT02;

INSERT INTO DEPT02 
SELECT * FROM DEPT;

SELECT * FROM DEPT02;

--데이터의 업데이트 : 행 단위 컬럼들의 데이터를 변경  -> 해당 컬럼의 값을 입력/수정/삭제
-- UPDATE 테이블이름 SET 컬럼1 = 새로운 값, 컬럼2 = 새로운값,... WHERE 행을 선택하는 조건;

SELECT * FROM DEPT01;
-- 10번 부서의 이름을 '디자인팀' 으로 변경, 위치 정보를 '판교'로 수정
UPDATE DEPT01 
SET DNAME = '디자인', LOC = '판교' 
WHERE DEPTNO = 10;

DROP TABLE DEPT02;

SELECT * FROM DEPT02;
CREATE TABLE DEPT02 AS SELECT * FROM DEPT;

DROP TABLE EMP01;
CREATE TABLE EMP01 AS SELECT * FROM EMP;

SELECT * FROM EMP01;
-- 모든 사원의 부서번호를 30번으로 수정
UPDATE EMP01
SET DEPTNO = 30;

-- 모든 사원의 급여를 10% 인상시키는 UPDATE
UPDATE EMP01
SET SAL = SAL*1.1;

-- 특정행을 수정할 경우 WHERE의 조건으로 행을 선택
-- 부서번호가 10번인 사원의 부서번호를 30번으로 수정

UPDATE EMP01
SET DEPTNO = 30
WHERE DEPTNO = 10;

-- 급여가 3000이상인 사원만 급여를 10% 인상
UPDATE EMP01
SET SAL = SAL*1.1
WHERE SAL >3000;

-- 1987에 입사한 사원의 입사일을 오늘로 수정
UPDATE EMP01
SET HIREDATE = SYSDATE
WHERE SUBSTR(HIREDATE, 1, 2)='87';

SELECT * FROM EMP01;

-- SCOTT 사원의 부서번호는 20번 직급은 MANAGER로 수정

UPDATE EMP01
SET DEPTNO = 20, JOB = 'MANAGER'
WHERE ENAME = 'SCOTT';
SELECT * FROM EMP01;

--SCOTT 사원의 입사일자는 오늘로, 급여를 50 으로 커미션을 4000 으로 수정

UPDATE EMP01
SET HIREDATE = SYSDATE, SAL=50, COMM=4000
WHERE ENAME = 'SCOTT';

-- 서브쿼리를 이용한 데이터 수정
-- 20번 부서의 지역명을 40번 부서의 지역명으로 변경하기 위해서 서브 쿼리문을 사용

UPDATE DEPT02
SET LOC = (SELECT LOC 
            FROM DEPT02 
            WHERE DEPTNO=40)
WHERE DEPTNO = 20;
SELECT * FROM DEPT02;

--부서번호가 20인 부서의 부서명과 지역명을 부서 번호가 30번인 부서와 동일하게 변경

UPDATE DEPT02
SET (DNAME, LOC) = (SELECT DNAME, LOC 
                    FROM DEPT02 
                    WHERE DEPTNO = 30)
WHERE DEPTNO = 20;                    
SELECT * FROM DEPT02;

--DELETE : 테이블의 행 단위 삭제
-- DELETE FROM 테이블이름 WHERE 행을 선택하는 조건

-- DEPT01의 모든 행을 삭제, 모든 부서정보를 삭제
DELETE FROM DEPT01;
SELECT * FROM DEPT01;

--DEPT02 에서 30번 부서만 삭제
DELETE FROM DEPT02
WHERE DEPTNO = 30;
SELECT * FROM DEPT02;

--사원 테이블에서 부서명이 SALES인 사원을 모두 삭제
SELECT DEPTNO FROM DEPT02 WHERE DNAME = 'SALES';

SELECT * FROM EMP01;
DELETE FROM EMP01
WHERE DEPTNO = (SELECT DEPTNO
                FROM DEPT02
                WHERE DNAME = 'SALES');


