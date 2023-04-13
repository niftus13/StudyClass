--2023 04 12

--16. SUBSTR 함수를 사용하여 사원들의 입사한 년도와 입사한 달만 출력하시오.
SELECT SUBSTR(HIREDATE,1,5), SUBSTR(HIREDATE,1,2),SUBSTR(HIREDATE,3,4) FROM EMP;

--17. SUBSTR 함수를 사용하여 4월에 입사한 사원을 출력하시오.
SELECT * FROM EMP WHERE SUBSTR(HIREDATE,4,2)=04;

--18. MOD 함수를 사용하여 사원번호가 짝수인 사람만 출력하시오.
SELECT *
FROM EMP
WHERE MOD(EMPNO,2)=0;

--19. 입사일을 년도는 2자리(YY), 월은 숫자(MM)로 표시하고 요일은 약어 (DY)로 지정하여 출력하시오.
SELECT ENAME,
        TO_CHAR(HIREDATE,'YY')AS "입사년도",
        TO_CHAR(HIREDATE,'MM')AS "입사 월",
        TO_CHAR(HIREDATE,'DY')AS "입사 요일",
        TO_CHAR(HIREDATE,'YY.MM. DY')AS "입사 년 월 요일"
FROM EMP;

--20. 올해 몇 칠이 지났는지 출력하시오. 현재날짜에서 올해 1월 1일을 뺀 결과를 출력하고 TO_DATE 함수를 사용하여 데이터 형을 일치 시키시오.
SELECT SYSDATE, TO_DATE('2023-01-01','YYYY/MM/DD'), SYSDATE - TO_DATE('2023-01-01','YYYY/MM/DD'),
TRUNC(SYSDATE - TO_DATE('2023-01-01','YYYY/MM/DD'))
FROM DUAL;

--21. 사원들의 상관 사번을 출력하되 상관이 없는 사원에 대해서는 NULL 값 대신 0으로 출력하시오.
SELECT MGR, NVL(MGR,0)
FROM EMP;
--22. DECODE 함수로 직급에 따라 급여를 인상하도록 하시오. 직급이 ‘ANALIST”인 사원은 200, ‘SALESMAN’인 사원은 180, ‘MANAGER’인 사원은 150, ‘CLERK”인 사원은 100을 인상하시오.
SELECT ENAME, JOB, SAL,
       NVL( DECODE (JOB, 'ANALYST', SAL+200,
                    'SALESMAN', SAL+180,
                    'MANAGER', SAL+150,
                    'CLERK', SAL+100
       ),SAL )AS UP_SAL
FROM EMP;

--23. 모든 사원의 급여 최고액, 최저액, 총액 및 평균 급여를 출력하시오. 평균에 대해서는 정수로 반올림하시오.
SELECT MAX(SAL),MIN(SAL),SUM(SAL),ROUND(AVG(SAL))
FROM EMP;

--24. 각 담당 업무 유형별로 급여 최고액, 최저액, 총액 및 평균 액을 출력하시오. 평균에 대해서는 정수로 반올림 하시오.
SELECT JOB, MAX(SAL),MIN(SAL),SUM(SAL),ROUND(AVG(SAL))
FROM EMP
GROUP BY JOB;
--25. COUNT(*) 함수를 이용하여 담당업무가 동일한 사원 수를 출력하시오.
SELECT JOB, COUNT(*)
FROM EMP
GROUP BY JOB;
--26. 관리자 수를 출력하시오. MGR => EMPNO
SELECT COUNT( DISTINCT MGR)
FROM EMP;
--27. 급여 최고액, 급여 최저액의 차액을 출력하시오.
SELECT MAX(SAL),MIN(SAL), MAX(SAL)-MIN(SAL)
FROM EMP;
--28. 직급별 사원의 최저 급여를 출력하시오. 관리자를 알 수 없는 사원과 최저 급여가 2000 미만인 그룹은 제외시키고 결과를 급여에 대한 내림차순으로 정렬하여 출력하시오.
SELECT JOB, MIN(SAL)
FROM EMP
WHERE MGR IS NOT NULL
GROUP BY JOB
HAVING MIN(SAL) >= 2000
ORDER BY MIN(SAL) DESC;
--29. 각 부서에 대해 부서번호, 사원 수, 부서 내의 모든 사원의 평균 급여를 출력하시오. 평균 급여는 소수점 둘째 자리로 반올림 하시오.
SELECT DEPTNO, COUNT(*),ROUND(AVG(SAL),2)
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO;
--30. 각 부서에 대해 부서번호 이름, 지역 명, 사원 수, 부서내의 모든 사원의 평균 급여를 출력하시오. 평균 급여는 정수로 반올림 하시오. DECODE 사용.
SELECT DEPTNO,
        DECODE (DEPTNO,10,'ACCOUNTING',
                      20,'RESERCH',
                      30,'SALES',
                      40,'ORERATIONS') AS DNAME,
       DECODE (DEPTNO,10,'NEW YORK',
                      20,'DALLAS',
                      30,'CHICAGO',
                      40,'BOSTON') AS LOC,
       COUNT(*),
       ROUND(AVG(SAL))
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO;