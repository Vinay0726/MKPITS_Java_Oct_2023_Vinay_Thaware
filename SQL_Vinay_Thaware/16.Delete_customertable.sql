create database customerdatabase;

use customerdatabase;
create table customer_table(CustomerId integer primary key auto_increment,CustomerName text,City text,Country text);
insert into customer_table(CustomerId,CustomerName,City,Country) values (1,"Vinay","Nagpur","India") , (2,"Raj","Nagpur","India"), (3,"Sanket","Amravati","India");
delete from customer_table where Customerid=3;





