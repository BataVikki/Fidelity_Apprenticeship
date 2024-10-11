create table worker(
workerid int primary key,
firstname varchar(50),
lastname varchar(50),
salary bigint,
joining_date date,
deprtment varchar(50)
)
 
insert into worker values
(1,'Monika','arora',100000,'2020-02-14','HR'),
(2,'shivam','gupta',80000,'2011-02-14','Admin'),
(3,'ishal','singahl',300000,'2020-02-14','HR'),
(4,'AMITABH','bachan',500000,'2020-02-14','hr'),
(5,'vivek','batti',500000,'2011-06-14','hr'),
(6,'vipul','diwan',2000000,'2011-06-14','hr'),
(7,'satish','kumar',750000,'2020-01-14','admin'),
(8,'GEETHIKA','CHAUHAN',90000,'2011-04-14','hr')
 
 
create table title(
workerrefid int,
worker_title Varchar(50),
affectedFrom date,
Foreign key (workerrefid)references worker(workerid)
)
 
insert into title values
(1,'manager','2016-02-20'),
(2,'EXecutive','2016-06-11'),
(8,'executive','2016-06-11'),
(5,'manager','2016-06-11'),
(4,'Asst.manager','2016-06-11'),
(7,'manager','2016-06-11'),
(6,'leadr','2016-06-11'),
(3,'lead','2016-06-11')
 
 
create table bonus(
workerrefid int,
bonusamount bigint,
bonusdate date,
foreign key (workerrefid) references worker(workerid))
 
insert into bonus values
(1,5000,'2020-02-16'),
(2,3000,'2011-06-16'),
(3,4000,'2020-02-16'),
(1,4500,'2020-02-16'),
(2,3500,'2011-02-16'),
(4,4500,'2020-02-16'),
(5,3500,'2011-02-16');
 

select w.firstname,w.salary, t.worker_title from worker w 
join title t on w.workerid=t.workerrefid
 


 
CREATE  FUNCTION count_workers_by_nth_highest_salary(nth INT)
RETURNS INT AS $$
DECLARE
    nth_highest_salary NUMERIC;
    count_workers INT;
BEGIN
    SELECT DISTINCT salary
    INTO nth_highest_salary
    FROM worker
    ORDER BY salary DESC
    OFFSET nth - 1 LIMIT 1;
 
    
    SELECT COUNT(*)
    INTO count_workers
    FROM worker
    WHERE salary = nth_highest_salary;
 
    RETURN count_workers;
 
END;
$$ LANGUAGE plpgsql;
 
select count_workers_by_nth_highest_salary(4);