-- 04.12
-- 함수

desc dual;
SELECT * FROM DUAL;

-- 단일 행 함수 / 집합(그룹)함수
-- 단일행 함수 : 숫자, 문자, 날짜, 변환, 기타 함수

-- 숫자함수

-- 절대값 ABS
SELECT 10, -10, ABS(-10), ABS(10) FROM DUAL;

--FLOOR : 소수점 아래를 절사
SELECT 2.1, 2.9 FROM DUAL;
SELECT 2.1, 2.9, FLOOR(2.1),FLOOR(2.9) FROM DUAL;

--ROUND : 지정한 위치에서 반올림 처리
SELECT 1234.567, ROUND(1234.567), ROUND(1234.567,1), ROUND(1237.567 , -1) FROM DUAL;

-- TRUNC : 특정 자리수 아래를 절사
SELECT 1234.567, TRUNC(1234.567), TRUNC(1234.567,1), TRUNC(1234.567,-1) FROM DUAL;

-- MOD : 나머지 연산
SELECT MOD(1,3), MOD(2,3), MOD(0,3), MOD(3,0) FROM DUAL;


-- 문자함수

-- LOWER : 문자열 모두를 소문자로 변경
SELECT 'SCOOT', LOWER('SCoOT') FROM DUAL;
SELECT DNAME, LOWER(DNAME) FROM DEPT;

-- UPPER : 문자열 모두를 대문자로 변경
SELECT 'scoot', UPPER('scoot') FROM DUAL;
SELECT INITCAP('scoot') FROM DUAL;

-- 문자열 추출 : SUBSTR(원본, 시작위치),SUBSTR(원본, 시작위치, 반환할 문자의 개수)
SELECT '안녕하세요. 손흥민입니다.', 
    SUBSTR('안녕하세요. 손흥민입니다.',5),  
    SUBSTR('안녕하세요. 손흥민입니다.',2,8)  
FROM DUAL;

-- 문자열의 개수 : LENGTH(원본문자열)
SELECT LENGTH('안녕하세요.!!!!')
FROM DUAL;

-- 문자열에서 특정 자리수를 지정하고 자리에 데이터가 없을 때 패턴을 입력
SELECT '10', LPAD('10',10,'0'), RPAD('11',5,'*') FROM DUAL;
SELECT DEPTNO, LPAD(DEPTNO,5,'0') FROM DEPT;

-- TRIM() : 공백제거
SELECT '    ABC     ', TRIM('    ABC     '),
        TRIM('           ABC'),
        TRIM(' ABC        ')
FROM DUAL;

-- REPLACE
SELECT 'Steven King',
        replace('Steven King','Steven','S.'),
        replace('Steven King','Steven ','')
FROM DUAL;


--날짜함수
-- 
SELECT SYSDATE FROM DUAL;

SELECT SYSDATE, MONTHS_BETWEEN('23/12/15',SYSDATE) FROM DUAL;

SELECT ADD_MONTHS(SYSDATE,8) FROM DUAL;
SELECT ADD_MONTHS(SYSDATE,-1) FROM DUAL;
SELECT ADD_MONTHS(SYSDATE,-3) FROM DUAL;
SELECT ADD_MONTHS(SYSDATE,-6) FROM DUAL;

SELECT NEXT_DAY(SYSDATE,1) FROM DUAL; 

SELECT LAST_DAY(SYSDATE) FROM DUAL;

SELECT ROUND(SYSDATE) FROM DUAL;

SELECT TRUNC(SYSDATE) FROM DUAL;

-- 변환함수
-- DATE -> CHAR
-- TO_CHAR(원본, '패턴')
SELECT SYSDATE, 
        TO_CHAR(SYSDATE,'YYYY.MM.DD.'),
        TO_CHAR(SYSDATE,'YYYY-MM-DD'),
        TO_CHAR(SYSDATE,'YYYY-MM-DD DAY'),
        TO_CHAR(SYSDATE,'YYYY.MM.DD. HH24:MI:SS')
FROM DUAL;


-- NUMBER -> CHAR
SELECT 1234546789,
        TO_CHAR(123456789,'000000000000'),
        TO_CHAR(123456789,'000,000,000,000'),
        TO_CHAR(123456789,'999999999999'),
        TO_CHAR(123456789,'999,999,999,999'),
        TO_CHAR(123456789,'L999,999,999,999'),
        TO_CHAR(123456789,'999,999')
FROM DUAL;








