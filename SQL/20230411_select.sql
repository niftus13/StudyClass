
-- 2023.04.11
-- select

-- 로그인 한 사용자가 쇼유하고 있는 테이블의 정보
select * from tab;

-- 테이블 정보 확인
desc emp;
desc dept;

-- 데이터 추출하는 질의어 : select
-- select 컬럼이름, 컬럼이름, 컬럼이름 ... from 테이블이름(VIEW 사용 가능);
-- select * from 테이블이름;

select * from dept;
SELECT * FROM DEPT;

-- 특정 컬럼의 데이터만 검색
select deptno
from dept
;
select dname, deptno, loc from dept;

select empno, ename from emp;


-- SELECT 구문은 프레젠테이션 영역에 테이블이 가지는 컬럼 뿐만 아니라 연산(함수)의 결과를 새로운 컬럼으로 출력
select sal from emp;
select sal, sal + 100, sal-100, sal*10, sal/2 from emp;
select sal-100 from emp;
select sal*10 from emp;
select sal/2 from emp;

-- 사원테이블에서 사원의 이름과 급여, 연봉계산 결과를 출력, 
--연봉의 계산은 급여*12+상여금500
select ename, sal, sal*12+500
from emp;

--상여급 계산 => select*12+comm
select sal,comm, sal*12+comm from emp;

-- nvl함수 사용해서 COMM의 null값 대체
select sal,comm,nvl(comm,0), sal*12+nvl(comm,0) from emp;

-- 컬럼의 이름 대신 별칭 부여
-- 컬럼 뒤에 as 키워드를 쓰고 별칭을 작성
select sal,comm,nvl(comm,0)as COMM1, sal*12+nvl(comm,0)as YearSal from emp;

-- 문자열의 연산: 문자열을 붙여준다 => 문자열 || 문자열

select ename || ' is a ' || job
from emp;


-- select [distinct] from ...
-- [distinct] => 중복값을 제거하고 값을 하나만 출력
-- 사원들이 소속되어 있는 부서 번호를 출력
select deptno from emp;
select distinct deptno from emp;

select job from emp;
select distinct job from emp;

-- 원하는 행 검색
-- WHERE절 사용
-- select ... from ... where 조건식;

-- 급여가 3000 이상인 사원의 리스트
 select * from emp where sal>= 3000;

-- = : 컬럼의 데이터를 같다 비교
-- 10번 부서에 소속된 사원들의 정보 출력
select * 
from emp
where deptno = 10;

--다음은 이름이 FORD인 사원의 사원번호(EMPNO)과 사원이름(ENAME)과 급여(SAL)을 출력
-- 문자열 비교 => 작은 따옴표 사용
select empno, ename, sal
from emp
where ename = 'FORD';

-- 날짜 비교 할 때에도 작은 따옴표 사용
select *
from emp
where hiredate = '81/12/03';

select *
from emp
where hiredate < '81/12/03';

-- 논리연산자 : AND, OR, NOT
-- 10번 부서의 매니저가 누구인지 찾아보자

select * from emp where deptno = 10 and job = 'MANAGER';
select * from emp where deptno = 10 or job = 'MANAGER';
select * from emp where deptno = 20 or deptno = 30 or deptno = 40;
select * from emp where deptno <>10; -- 문자열 포함 
select * from emp where not(deptno = 10);
select * from emp where not deptno!=10;

-- 2000에서 3000 사이의 급여를 받는 사원
select * from emp where sal>=2000 and sal<=3000 ;

-- 범위 연산자 between A and B;  A이상 B이하
select * from emp where sal BETWEEN 2000 and 3000;

-- 범위연산은 날짜도 가능 -> '87/01/01'~'87/12/31'
select * from emp where hiredate between '87/01/01' and '87/12/31';

select * from emp where hiredate not between '87/01/01' and '87/12/31';

-- 10번, 20번, 30번, 부서에 소속한 사원의 정보를 출력
select * from emp where deptno = 10 or deptno = 20 or deptno = 30;

-- 컬럼 in(값1,값2,값3,...); : or연산을 간단하게 처리
-- 컬럼 = 값1 or 값2 or 값3...
select * from emp where deptno in(10,20,30);

select * from emp where deptno not in(10,20);

-- 패턴검색 : 문자열의 패턴 -> 컬럼 LIKE '패턴';
-- 패턴형식 : '%' -> 0개이상, '%java' => java 문자열을 포함하는 문자열
--           '_'-> 한자리, '__' -> 두자리 .... 
--         '__ACE' -> 앞 두자리는 어떤문자가 와도 상관없고 A로 끝나는 세자리 문자열

-- F로 시작하는 이름의 사원 리스트 : 'F%'
SELECT * FROM EMP WHERE ENAME LIKE 'F%';

-- 이름에 A를 포함하는 사원 리스트 : '%A%'
select * from emp where ename like '%A%';

-- 이름에 A를 포함하지않는 사원 리스트 :not like '%A%'
select * from emp where ename not like '%A%';

-- 이름이 N으로 끝나는 이름을 가진 사원 리스트 : '%N', '%pdf'
select * from emp where ename like '%N';

-- 사원 이름중 두번째 문자가 A 인 사원 리스트
select * from emp where ename like '_A%';

-- 사원 이름중 끝에서 두번째 문자가 A 인 사원 리스트
select * from emp where ename like '%R_';

-- NULL 여부를 판단하는 is null/ is not null
-- COMM이 등록되지 않은 사원 리스트 -> COMM 이 null인 사원
select * from emp where comm is null;
-- comm이 등록되어 있는 사원 리스트 -> comm 이 null이 아닌 사원
select * from emp where comm is not null;
-- 커미션을 받지 않는 사원 리스트
select * from emp where comm = 0 or comm is null;

--커미션을 받는 사람의 리스트
select * from emp where not(comm = 0 and comm is null);
select * from emp where comm > 0 or comm is not null;

--select의 출력 결과의 정렬 : 오름차순 asc, 내림차순 desc
-- select ... from ... where ... order by 컬럼이름 {[asc].[desc]}
-- 급여순(오름차순)으로 사원 리스트 출력
select * from emp order by sal asc;

select * from emp order by sal;
select * from emp order by sal desc;
-- 문자정렬
-- 이름순 : 사전순서
select * from emp order by ename;
select * from emp order by ename desc;

--날짜 정렬
-- 입사일 빠른 순서대로 정렬 : 오름 차순
select * from emp order by hiredate;
-- 최근 입사일 기준으로 정렬 : 내림차순
select * from emp order by hiredate desc;

-- 급여순으로 정렬
select * from emp order by sal;

select * from emp order by sal,ename desc;

