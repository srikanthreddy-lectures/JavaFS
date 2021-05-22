create table job(
  job_id int primary key,
  job_title varchar(100),
  salary decimal(6,0)
);


create table employee(
  empId int primary key,
  empName varchar(100),
  empAddress text,
  job_id int,
  foreign key(job_id) references job(job_id)
);

//alter table employee add empDesg varchar(100);
//alter table employee modify empId int primary key;
//alter table employee drop column empDesg;

drop table job;

desc job;
desc employee;
