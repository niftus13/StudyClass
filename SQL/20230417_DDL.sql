-- 0417
-- DDL(DATA DEFINITION LANGUAGE, 데이터 제어문)

-- CREATE : 테이블 생성

CREATE TABLE DDL_TEST (
    -- 컬럼 타입을 정의
    NO NUMBER (3),
    NAME VARCHAR(10),
    BIRTH DATE DEFAULT SYSDATE
);


CREATE TABLE EMP01(
    EMPNO NUMBER(4),
    ENAME VARCHAR2(20),
    SAL NUMBER(7,2)
);
desc emp01;

insert into emp01 (empno , ename, sal) values(1111,'son',1000);
SELECT  * FROM EMP01;


-- 서브쿼리를 이용해서 기존 테이블의 구조로 테이블 생성, 데이터 저장, 제약조건 복사 X

CREATE TABLE EMP02
AS
SELECT * FROM EMP;
DESC EMP02;
DESC EMP;

SELECT * FROM EMP02;


-- 원하는 컬럼만 또는 원하는 로우만 선택해서 테이블 생성
CREATE TABLE EMP03
AS
SELECT EMPNO, ENAME, JOB, HIREDATE FROM EMP;

DESC EMP03;
SELECT * FROM EMP03;

-- 30번 부서의 정보만 가지는 새로운 테이블
CREATE TABLE EMP04
AS
SELECT EMPNO, ENAME, JOB
FROM EMP
WHERE DEPTNO = 30;

SELECT * FROM EMP04;

-- 데이터 필요없이 스키마만 복사
SELECT * FROM EMP WHERE 1=0;

CREATE TABLE EMP05
AS
SELECT * FROM EMP WHERE 1=0;


-- 테이블의 변경 : 저장구조 (스키마의 구조 : 컬럼들의 집합) 변경
-- 컬럼 변경 (테이블의 컬럼 추가, 기존에 있는 컬럼 삭제, 컬럼의 내용이나 이름을 수정)

-- 테이블의 변경
-- ALTER TABLE  [ADD, MODIFY, DROP COLUMN] ()

--EMP01 테이블에 JOB 컬럼 추가
DESC EMP01;
ALTER TABLE EMP01 ADD(JOB VARCHAR2(9));
DESC EMP01;

-- JOB 칼럼을 최대 30글자까지 저장할 수 있게 변경
ALTER TABLE EMP01 MODIFY(JOB VARCHAR2(20) NOT NULL);

ALTER TABLE EMP01 MODIFY(JOB VARCHAR2(50));

DESC EMP01;

SELECT * FROM EMP01;
DELETE FROM EMP01 WHERE EMPNO = 1111;

-- EMP01 테이블에서 JOB컬럼 삭제

ALTER TABLE EMP01 DROP COLUMN JOB;
DESC EMP01;

-- 테이블 객체 삭제
-- DROP TABLE 테이블 이름 => 스키마 삭제와 저장데이터 삭제
-- DDL : 자동 COMMIT , DML 작업중 DDL작업은 신중하게

-- EMP01 테이블 삭제
DROP TABLE EMP01;
DESC EMP01;
SELECT * FROM EMP01;

-- 테이블의 모든 행을 삭제 : TRUNCATE TABLE 테이블 이름
SELECT * FROM EMP02;
TRUNCATE TABLE EMP02;

SELECT * FROM  EMP03;
DELETE FROM EMP03;
ROLLBACK;

-- 테이블 이름 변경
-- RENAME 이전이름 TO 새이름
DESC DDL_TEST;
-- DDL_TEST => TEST
RENAME DDL_TEST TO TEST;
DESC TEST;

-- --------
-- 제약조건의 필요성
INSERT INTO DEPT VALUES(10,'TEST','TEST');

--NOT NULL 제약조건 설정 : 설정한 컬럼에 NULL 값 입력을 금지하는 제약
-- 컬럼 수준에서만 정의가 가능
DROP TABLE EMP02;
-- 사원테이블 생성 : 사원번호, 사원이름, 직급, 부서명
-- 사원번호, 사원이름 NOT NULL 제약조건 설정
CREATE TABLE EMP02(
    EMPNO NUMBER(4) NOT NULL,
    ENAME VARCHAR2(10) NOT NULL,
    JOB VARCHAR2(9),
    DEPTNO NUMBER(2)
);
INSERT INTO EMP02 VALUES (1111, NULL, 'MANAGER', 30);
INSERT INTO EMP02 (JOB,DEPTNO) VALUES ('MANAGER',10);
DESC EMP02;

-- EMP03 생성 : 사원번호, 사원이름, 직급, 부서번호
-- EMPNO : UNIQUE
-- ENAME : NOT NULL
DROP TABLE EMP03;
CREATE TABLE EMP03(
    EMPNO NUMBER(4) UNIQUE,
    ENAME VARCHAR2(10) NOT NULL,
    JOB VARCHAR2(9),
    DEPTNO NUMBER(2)
);
DESC EMP03;
-- UNIQUE : 컬럼 내부에 중복되는 데이터가 있으면 입력실패, 수정실패

INSERT INTO EMP03 VALUES (1111,'KING','MANAGER',10);
INSERT INTO EMP03 VALUES (1112,'SON','MANAGER',20);

SELECT * FROM EMP03;

-- NOT NULL UNIQUE 함께 사용
DROP TABLE EMP01;
CREATE TABLE EMP01(
    EMPNO NUMBER(4) NOT NULL UNIQUE,
    ENAME VARCHAR2(10) NOT NULL,
    JOB VARCHAR2(9),
    DEPTNO NUMBER(2)
);
DESC EMP01;
INSERT INTO EMP01 VALUES (1111, 'KING','MANAGER',10);
INSERT INTO EMP01 VALUES (1111, 'KING','MANAGER',10);

-- 기본키 제약조건
-- 컬럼 옆에 PRIMARY KEY 키워드 사용
DROP TABLE EMP01;
CREATE TABLE EMP01(
    EMPNO NUMBER(4) PRIMARY KEY,
    ENAME VARCHAR2(10) NOT NULL,
    JOB VARCHAR2(9),
    DEPTNO NUMBER(2)
);
DESC EMP01;
INSERT INTO EMP01 VALUES (1111, 'KING','MANAGER',10);
--------
DROP TABLE EMP01;
CREATE TABLE EMP01(
    EMPNO NUMBER(4) CONSTRAINT PK_EMP01_EMPNO PRIMARY KEY,
    ENAME VARCHAR2(10) CONSTRAINT NL_EMP01_ENAME NOT NULL,
    JOB VARCHAR2(9)CONSTRAINT UK_EMP01_JOB UNIQUE,
    DEPTNO NUMBER(2)
);
DESC EMP01;
INSERT INTO EMP01 VALUES (1111, 'KING','MANAGER',10);

-- 외래키 제외조건 

DROP TABLE EMP01;
CREATE TABLE EMP01(
    EMPNO NUMBER(4) CONSTRAINT PK_EMP01_EMPNO PRIMARY KEY,
    ENAME VARCHAR2(10) CONSTRAINT NL_EMP01_ENAME NOT NULL,
    JOB VARCHAR2(9)CONSTRAINT UK_EMP01_JOB UNIQUE,
    DEPTNO NUMBER(2) CONSTRAINT FK_EMP01_DEPTNO REFERENCES DEPT(DEPTNO)
);
DESC EMP01;
INSERT INTO EMP01 VALUES (1111, 'KING','MANAGER',90);

-- CHECK : 특정범위 , 값을 확인 후 입력 또는 수정
DROP TABLE EMP01;
CREATE TABLE EMP01(
    EMPNO NUMBER(4) CONSTRAINT PK_EMP01_EMPNO PRIMARY KEY,
    ENAME VARCHAR2(10) CONSTRAINT NL_EMP01_ENAME NOT NULL,
    JOB VARCHAR2(9) CONSTRAINT UK_EMP01_JOB UNIQUE,
    SAL NUMBER (7,2) CONSTRAINT CK_EMP01_SAL CHECK (SAL BETWEEN 500 AND 5000),
    GENDER CHAR(1) CONSTRAINT CK_EMP01_GENDER CHECK (GENDER IN ('M','F')),
    DEPTNO NUMBER(2) CONSTRAINT FK_EMP01_DEPTNO REFERENCES DEPT(DEPTNO)
);
DESC EMP01;
INSERT INTO EMP01 VALUES (1111,'KING','MANAGER',1500,'F',40);

-- DEFAULT : 컬럼에 입력값이 없을때 기본값을 설정해서 데이터 입력
SELECT SYSDATE FROM DUAL;

DROP TABLE EMP01;
CREATE TABLE EMP01(
    EMPNO NUMBER(4) CONSTRAINT PK_EMP01_EMPNO PRIMARY KEY,
    ENAME VARCHAR2(10) CONSTRAINT NL_EMP01_ENAME NOT NULL,
    JOB VARCHAR2(9) CONSTRAINT UK_EMP01_JOB UNIQUE,
    SAL NUMBER (7,2) CONSTRAINT CK_EMP01_SAL CHECK (SAL BETWEEN 500 AND 5000),
    GENDER CHAR(1) CONSTRAINT CK_EMP01_GENDER CHECK (GENDER IN ('M','F')),
    DEPTNO NUMBER(2) CONSTRAINT FK_EMP01_DEPTNO REFERENCES DEPT(DEPTNO),
    HIREDATE DATE DEFAULT SYSDATE
);
DESC EMP01;
INSERT INTO EMP01 VALUES (1111,'KING','MANAGER',1500,'F',40,SYSDATE);

INSERT INTO EMP01(EMPNO, ENAME, JOB, SAL, GENDER, DEPTNO) 
VALUES (1112,'SON','FREE',3000,'M',40);

SELECT * FROM EMP01;


-- 테이블단위 제약조건

DROP TABLE EMP01;
CREATE TABLE EMP01(
    EMPNO NUMBER(4),
    ENAME VARCHAR2(10) CONSTRAINT NL_EMP01_ENAME NOT NULL,
    JOB VARCHAR2(9),
    SAL NUMBER (7,2) CONSTRAINT CK_EMP01_SAL CHECK (SAL BETWEEN 500 AND 5000),
    GENDER CHAR(1) CONSTRAINT CK_EMP01_GENDER CHECK (GENDER IN ('M','F')),
    DEPTNO NUMBER(2), 
    HIREDATE DATE DEFAULT SYSDATE,
    CONSTRAINT PK_EMP01_EMPNO PRIMARY KEY(EMPNO),
    CONSTRAINT UK_EMP01_JOB UNIQUE(JOB),
    CONSTRAINT FK_EMP01_DEPTNO FOREIGN KEY (DEPTNO) REFERENCES DEPT(DEPTNO)
);
DESC EMP01;

INSERT INTO EMP01 VALUES (1111,'KING','MANAGER',1500,'F',40,SYSDATE);

