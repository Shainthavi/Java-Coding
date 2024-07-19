create table student(id int,name varchar(25),regno int,age int,phno int);
create table marks(mark1 int,mark2 int,mark3 int,mark4 int,mark5 int);
insert into student values(1,'shainthu',41,21,9361792729);
insert into student values(2,'moni',03,20,9876543242);
insert into marks values(50,70,56,87,90,3);
alter table marks add regno varchar(5);
select s.id, s.name,s.regno,s.age,s.phno
from student s
left join marks m
on m.regno=s.regno;
desc student;
desc marks;
select*from student;
select*from marks;
drop table student;
drop table marks;