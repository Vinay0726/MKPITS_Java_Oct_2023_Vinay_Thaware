create database customerdatabase;
use customerdatabase;
create table customer_table (CustomerId integer primary key auto_increment,CustomerName text,City text,Country text);
drop table customer_table ;
create table customer_table(CustomerId integer primary key auto_increment,CustomerName text,City text,Country text);
insert into customer_table (CustomerId,CustomerName,City,Country) values (1,"Vinay","Nagpur","India") , (2,"Raj","Nagpur","India"), (3,"Sanket","Amravati","India");
select * from customer_table;
select CustomerName,City from customer_table;