CREATE TABLE emp(
    emp_name varchar(255),
    emp_id number,
    emp_address varchar(255),
    desig varchar(255),
    eme_ph number,
    per_ph number,
    dept varchar(255)
);
insert into emp values('Nivass',100,'veppadai','emp',65984,33256,'CSE');
insert into emp values('Selva',150,'erode','manager',65984,33256,'IT');

CREATE TABLE salary (
    id int,
    basic_pay decimal(10,2),
    dept varchar(155)
);	
drop table salary;
INSERT INTO salary VALUES(100,50000.00,'CSE');
INSERT INTO salary VALUES(150,60000.00,'IT');

SELECT
    e.emp_name,
    e.emp_id,
    e.emp_address,
    e.desig,
    e.eme_ph,
    e.per_ph,
    e.dept AS emp_dept,
    s.id,
    s.basic_pay,
    s.dept AS salary_dept,
    (s.basic_pay * 0.20) AS hra,
    (s.basic_pay * 0.10) AS da,
    (s.basic_pay * 0.05) AS ta,
    (s.basic_pay + (s.basic_pay * 0.20) + (s.basic_pay * 0.10) + (s.basic_pay * 0.05)) AS total_salary
FROM
    emp e
JOIN
    salary s ON e.emp_id = s.id
WHERE
    s.basic_pay = (SELECT MAX(basic_pay) FROM salary);