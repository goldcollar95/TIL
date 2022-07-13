create table employees
(employee_id INTEGER(10),  /* 컬럼 - 사번 정수 10자리 */
employee_name varchar(20),	/* 컬럼 - 이름 문자열 20바이트 */
salary DECIMAL(10 , 2),	/* 컬럼 - 급여 ( 전체 10자리 중 소수점 2자리)*/
hire_date DATE,	/*컬럼 - 날짜 (년도 월 일 요일)*/
department_id int(5)	/*컬럼 - 부서번호 정수 5자리 */
);


select * from employees;

insert into employees values(100, '이사원', 45000.99, now(), 10);
insert into employees values(101, '김사원', 45000.99, now(), 10);
insert into employees values(102, '하사원', 35000.99, '2021-01-10', 10);
insert into employees values(103, '정사원', 55000.99, '2022-04-07', 10);
insert into employees values(202, '주사원', 65000.99, now(), 10);
insert into employees values(203, '한사원', 75000.99, '2022-02-04', 10);
insert into employees values(301, '유사원', 85000.99, '2020-07-01', 10);
insert into employees values(303, '최사원', 55000.99, now(), 10);
insert into employees values(304, '박사원', 45000.99, now(), 10);

update hire_date 
	set hire_date = '2020-07-01', hire_date = '2008-12-12'
	where 

select distinct department_id  from employees;


select '사번은' || employee_id || ' 이고 이름은 ' || employee_name || "입니다" from employees;

-- 이름, 급여 조회화되 급여 50000 이상인 사람만 조회
select employee_name, salary from employees
where salary >= 50000 ;


-- 이름, 이사원이고 급여가 40000 사원 이름과 급여 조회
select employee_name, salary from employees
where employee_name = '이사원' and salary = 40000;

-- 입사일이 2008- 12-12 이거나 급여가 10000 이상인 사원의 입사일, 급여, 이름, 조회
select employee_name, salary, hire_date from employees
where hire_date = '2020-07-01' and salary >= 10000;




-- 이름이 최씨인 사원의 이름과 보너스 조회. 보너스는 급여의 5% 
-- like - 문자열 패턴 유사, %:값의 자릿수 무관, 모든 문자 무관 , _ : 1자리, 모든 문자 무관
select employee_name, salary*0.05
from employees
where employee_name like '최__';



-- 입사일이 2020년도 입사한 사원의 이름과 입사일 조회
select employee_name, hire_date from employees
where hire_date >= '2020-01-01' and hire_date <= '2020-12-31'
-- 대동소이
select employee_name, hire_date from employees
where hire_date like '2020%';
-- 대동소이
select employee_name, hire_date from employees
where hire_date like '2020______';




select * from employees
where employee_id = 100
or employee_id = 300
or employee_id = 250
or employee_id = 204;

-- 목록 연산자 in(,,,,)
select * from employees
where employee_id in (100, 300, 250, 204);


-- employees 테이블 데이터 5개
insert into employees values(400, '최신입', 40000.0, null, null);
insert into employees values(401, '김신입', 40000.0, now(), 20);
insert into employees values(402, '오신입', 40000.0, now(), 30);
insert into employees values(403, '강신입', 40000.0, now(), 40);
insert into employees values(404, '최신입', 40000.0, null, null);


-- 입사일 없는 사원 조회
select * from employees 
where hire_date is null;
-- 부서 배정받은 사원 조회
select * from employees 
where department_id is not null;



-- 조회시 Alias (조회 임시 사용 다른 컬럼명)

insert into employees values(405, '김경력', null, now(), 30);
select employee_name 사원명 , salary 월급 , ifnull(salary, 1000)*12 '사원의 연봉' from employees;


-- 조회시 두개 이상의 컬럼 연결 concatenate 줄여서 concat
-- xxxx 사원은 xxx의 월급을 받습니다.
select concat(employee_name, ' 사원은 ', salary, '의 월급을 받습니다.') '급여정보' from employees;



-- order by
-- 사번이 낮은 - 높은 ..
select * from employees
order by employee_id asc;



-- 사번이 높은 - 낮은 ..
select * from employees
order by employee_id desc;

-- 급여 많은 사원부터 조회, 동일 급여 사원은 사번 큰 사원부터
select * from employees
order by salary desc, employee_id desc;


-- 급여 많은 사원부터 정렬하되 4,5,6,7 번째 많은 사원만 조회
-- 게시판 1페이지 선택 - 10개
-- 		2페이지 	11-20 개
select employee_name, salary
from employees
order by salary desc
limit 3,4; -- 3번 인덱스부터 4개 



select database(); -- 접속된 db가 누군지?
show tables;

select * from emp_copy;

create table emp_copy (select employee_name, salary, hire_date from employees);
