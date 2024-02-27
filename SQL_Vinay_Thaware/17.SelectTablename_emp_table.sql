create database emp;
use emp;
create table emp_table(Emp_Id int primary key not null,Emp_Name varchar(255),Emp_City varchar(255),Salary float);
insert into  emp_table values (1,"Vinay","Nagpur",30000);
insert into  emp_table values (2,"Raj","Nagpur",25000),(3,"Ashiq","Nagpur",40000),(4,"Sanket","Amravati",35000);
select * from emp_table;