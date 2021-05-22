create table employee(
  empId int,
  empName varchar(100),
  empAddress text
);

alter table employee add empDesg varchar(100);
alter table employee modify empId int primary key;
alter table employee drop column empDesg;
desc employee;
