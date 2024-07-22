create table emp_personal_details(empname varchar(20),empid int, empadd varchar(50),designation varchar(20),emergency_phone_no int,personal_phone_no int,dept varchar(20));

desc emp_personal_details;

create table  emp_salary(empid int,hra int,da int,ta int,basicpay int,totalsalary int,dept varchar(20));

desc emp_salary;

insert into emp_personal_details values('Nikitha',01,'Erode','manager',1234584754,3216478262,'cse');
insert into emp_personal_details values('Monisha',02,'Tiruchengode','Tester',1234567789,3245698708,'IT');
insert into emp_personal_details values('Shainthavi',03,'Namakkal','HR',1238965890,9874498708,'cse');
insert into emp_personal_details values('Shamridha',04,'Tiruchengode','Teamleader',1234567456,3216498123,'IT');

select*from emp_personal_details;

INSERT INTO emp_salary VALUES(01,6000,3000,2000,26000,6000+3000+2000+26000,'cse');
insert into emp_salary values(02,4000,3000,5000,20000,4000+3000+5000+20000,'IT');
insert into emp_salary values(03,7000,2000,4000,32000,7000+2000+4000+32000,'cse');
insert into emp_salary values(04,3000,5000,6000,35000,3000+5000+6000+35000,'IT');
select * from emp_salary;

select e.empname,e.empid,e.empadd,e.designation,e.emergency_phone_no,e.personal_phone_no,e.dept,s.totalsalary as max_sal
from emp_personal_details e
join emp_salary s
on e.empid=s.empid

    where (e.dept,s.totalsalary) in
    (
    select dept,max(totalsalary)
    from emp_salary
    group by dept
    )  
order by s.totalsalary desc;

select e.empname,e.empid,e.empadd,e.designation,e.emergency_phone_no,e.personal_phone_no,e.dept,s.totalsalary as max_sal
from emp_personal_details e
right join emp_salary s

select e.empname,e.empid,e.empadd,e.designation,e.emergency_phone_no,e.personal_phone_no,e.dept,s.totalsalary as max_sal
from emp_personal_details e
left join emp_salary s
on e.empid=s.empid;

drop table emp_personal_details;
drop table emp_salary;