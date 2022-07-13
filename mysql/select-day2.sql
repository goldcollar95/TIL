use empdb;

select * from employees;

select salary, sum(salary) from employees;

select first_name, department_id, salary from employees;


-- JOB_ID - 직종코드

select first_name, job_id from employees;

-- 직종별로 사원의 급여 평균을 구하되(GROUP BY), IT_PROG 직종은 제외하고 조회(WHERE / HAVING)	
-- 조회 컬럼은 alias 직종코드, 부서평균급여	-SELECT , GROUP BY
-- 부서평균급여가 많은 직종부터 보여주도록 조회	-> ORDER BY

select JOB_ID 직종코드,AVG(SALARY) '부서 평균 급여'
from employees
where JOB_ID != 'IT_PROG'  
Group by JOB_ID
order by AVG(SALARY) desc;



select department_id, avg(salary + salary*commission_pct) 
from employees
where hire_date >= '2006-01-01 00:00:00'and commission_pct is not null 	and	department_id is not null; -- null이 있으니까 가능한 일이다.
group by department_id;


CREATE TABLE EMP_COPY 
(SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, SALARY, HIRE_DATE FROM EMPLOYEES);
 
 select count(*) from emp_copy;
 select count(*) from employees;
 
 describe emp_copy;
 describe employees;
 
 -- 1, 이사원, 15000, '2000-12-10 00:00:00'
INSERT INTO emp_copy VALUES(1, '사원', '이', 15000, '2000-12-10 00:00:00');
INSERT INTO emp_copy VALUES(2, '길동', '홍', 25000, '2022-12-10');
INSERT INTO emp_copy VALUES(3, '대리', '홍', 26000, now());
INSERT INTO emp_copy VALUES(4, '신입', '홍', 10000, current_date());

-- 나열되지 않는 컬럼 자동 Null
INSERT INTO emp_copy(employee_id, hire_date, last_name) VALUES(5, now(), '김'); -- null을 허용하지 않는다

-- 명시 ㅜull
INSERT INTO emp_copy VALUES(6, null, '박', null, now());

select * from emp_copy where employee_id <=10;

-- 테이블 정의 동시에 데이터 복사
CREATE TABLE EMP_COPY 
(SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, SALARY, HIRE_DATE FROM EMPLOYEES);


-- 테이블은 정의되어있고 데이터만 복사
insert into emp_copy select * from employees where ;

set sql_safe_updates = 0;

update emp_copy
set salary = 15000 , first_name = '수정'
where employee_id = 6;




delete from emp_copy where employee_id = 6;

select * from employees;

-- 백업(export) / 복원(import)
select * from emp_copy where employee_id <=10;

insert  into emp_copy values(6, '부장','심',50000,now());


-- 1.
select first_name 이름, last_name 이름, salary*12 '월급의 12배' from employees
where salary*12 >= 170000; 

-- 2.
select first_name, last_name, salary from employees
where department_id is null;

-- 3.
select first_name, last_name, salary, hire_date from employees
where hire_date < '2004.01.01';

-- 4.
select department_id , department_name from departments;

-- 5.
select job_id, job_title from jobs;

-- 1. 논리연산자
select first_name, last_name, salary, department_id from employees
where department_id in(50,80) and salary > 1300 and salary < 20000;

-- 2.
select first_name, last_name, salary, department_id, hire_date from employees
where hire_date > '2004.12.31' and salary >= 1300 and salary <= 20000;

-- 1.
select first_name, last_name, salary, department_id, hire_date from employees
where department_id in(50,80) and salary >= 13000;

-- 2.
select first_name, last_name, salary, department_id from employees
where hire_date < '2004.01.01' and salary >= 1300 and salary <= 20000;

-- 3.
select first_name, last_name, department_id, hire_date from employees
where hire_date > '2005.01.01' and hire_date < '2005.12.31' or hire_date LIKE '2005%'; 

-- 4. **
select job_id from jobs
where job_id LIKE '%CLERK%' ; -- 자릿수 무관

-- 5. **
select first_name, last_name, salary, hire_date from employees
where hire_date like '_____12%';		-- 4자리 ??????

-- 6.
select first_name, last_name, salary, hire_date from employees
where first_name like '%le%';	

-- 7.
select first_name, last_name, salary,  hire_date from employees
where first_name like '%m';

-- 8.
select first_name, last_name, salary,  hire_date 
from employees
where first_name like '__e%';	-- e 3째 포함

-- 9.
select first_name, last_name, salary,  commission_pct 
from employees
where commission_pct is not null;

-- 10.
select first_name, last_name, salary,  ifnull(commission_pct,0) 
from employees
where commission_pct is  null;


-- 11.
select first_name, last_name, department_id, salary, hire_date, commission_pct 
from employees
where department_id in (30, 50, 80)
and salary between 5000 and 17000
and commission_pct is not null
order by hire_date , salary desc;


-- 1. 함수

select first_name 내사번, ifnull(manager_id, 'BOSS') 상사사번
from employees;


-- 2. 하나하나 문자열로 처리를 해야할때 concat() 함수를 쓴다. ** 
select concat(employee_id,' 번 사번의 사원명은 LA', last_name, ',' ,first_name, '이고 입사월은 ', substr(hire_date, 6, 2), '월입니다') 사원정보
from employees;

-- 3.

select * from departments;		-- 4개


-- 4.
select location_id ,city, country_id from locations;


-- 5.
select country_id, country_name from countries;

-- 6.
select job_id, job_title from jobs;


/* select 사원이름 , 부서명 from 사원명 포함 employees, depaertments 테이블 */
