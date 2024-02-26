create database customerdatabase;
use customerdatabase;
alter table customer_table drop column Email;
alter table customer_table modify column CustomerName varchar(15);
alter table customer_table rename to customer;



