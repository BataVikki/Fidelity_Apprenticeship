create table Customers(customer_id varchar(10)  primary key,customer_name varchar(20),address varchar(20),phone_no Bigint, email_id varchar(20));

insert into Customers values('143','vikki','Manyatha Bengaluru',9505326865,'vikki@gmail.com');
insert into Customers values('1431','tarun','Manyatha Bengaluru',9505326865,'tarun@gmail.com');
insert into Customers values('1432','tamil','Manyatha Bengaluru',9505326865,'tamil@gmail.com');
insert into Customers values('1433','hema','Manyatha Bengaluru',9505326865,'hema@gmail.com');
insert into Customers values('1434','varun','Manyatha Bengaluru',9505326865,'varun@gmail.com');
insert into Customers values('1435','suma','Manyatha Bengaluru',9505326865,'suma@gmail.com');
select * from Customers;
create table deliver_partners(Partner_id varchar(10) primary key,Partner_name varchar(20),phone_no BIGINT, rating int);

insert into deliver_partners values('1','Nicky',9505326865,5);
insert into deliver_partners values('2','suma',950537865,3);
insert into deliver_partners values('3','akash',8765326865,5);
insert into deliver_partners values('4','tamil',765326865,4);
insert into deliver_partners values('5','tarun',65326865,1);
insert into deliver_partners values('6','hemanth',5326865,2);

select * from deliver_partners;

create table Hotel_Details(Hotel_id varchar(10) primary key,Hotel_name varchar(20),hotel_type varchar(20),rating int);
insert into Hotel_Details values('12','Udipi','Restaurant',9);
insert into Hotel_Details values('4','Udipi','VEG',7);
insert into Hotel_Details values('2','Udipi','NON-VEG',8);
insert into Hotel_Details values('3','Udipi','Fruits_Cuts',9);
insert into Hotel_Details values('5','Udipi','Icecream',9);
insert into Hotel_Details values('6','Udipi','waterbottle',9);


select * from Hotel_Details;

create table Orders(Order_id varchar(10) primary key,customer_id varchar(10),Hotel_id varchar(10), Partner_id varchar(10),order_date DATE, order_amount int
, constraint fk_customer foreign key(Customer_id)references Customers(Customer_id),constraint fk_hotel foreign key(Hotel_id)references Hotel_Details(Hotel_id), 
constraint fk_Partner foreign key(Partner_id) references deliver_partners(Partner_id));

insert into Orders values('01','143','12','1','2024-10-01',500);
insert into Orders values('02','1431','2','2','2024-11-01',600);
insert into Orders values('03','1432','3','3','2024-12-01',800);
insert into Orders values('04','1434','4','4','2024-10-01',1000);
insert into Orders values('05','1435','5','5','2024-08-01',900);
insert into Orders values('06','1433','6','6','2024-06-01',400);
select * from Orders;


select Partner_id,Partner_name,phone_no
from deliver_partners where rating between 3 and 5
order by partner_id;

---2-Hunger eats - update table

insert into Customers(customer_id, customer_name, address, phone_no, email_id)
values('cust1001', 'suma', 'Bangalore', 645372822, 'suma@gmail.com'),
('cust1002', 'akash', 'Andhra', 85636787486, 'akash@gmail.com'),
('cust1003', 'sudha', 'kochi', 9856323675, 'sudha@gmail.com'),
('cust1004', 'vikki', 'Tamil', 9856786976, 'vikki@gmail.com');
 
select * from customers;
update customers set phone_no = 9876543210 where customer_id = 'cust1004';


---3. Customers having gmail id

select  Customer_id,Customer_name,address,phone_no from customers
where email_id like '%@gmail.com'
order by Customer_id;

---4.Hunger eats - change datatype

alter table Customers
alter column customer_id type INT using customer_id::integer;
select * from Customers;

--5.Hunger eats - Change the field name

alter table Hotel_Details rename column rating to Hotel_rating;
select * from Hotel_Details;

--6.Hotel_info
select 
    CONCAT(Hotel_name ,' is a ',Hotel_type,' hotel' ) as Hotel_info
from 
    Hotel_details
order by 
    hotel_info desc;
	

--7.Hotels that took order more than five times

select 
    hd.hotel_id, 
    hd.hotel_name, 
    count(o.order_id) as NO_OF_ORDERS
from 
    Hotel_details hd
join 
    Orders o on hd.hotel_id = o.hotel_id
group by 
    hd.hotel_id, hd.hotel_name
having 
    count(o.order_id) > 5
order by 
    hd.hotel_id asc;

	select * from Orders;


	--8.Hotels not taken orders in a specific month
select distinct ho.hotel_id, ho.hotel_name, ho.hotel_type
from Hotel_details ho
left join Orders o ON ho.hotel_id = o.hotel_id AND TO_CHAR(o.order_date, 'YYYY-MM') = '2024-10'
where o.order_id IS NULL
order by ho.hotel_id ASC;

	---9.Order details

	select o.order_id, cs.customer_name, hl.hotel_name, o.order_amount
from Orders o
join Customers cs ON o.customer_id = cs.customer_id
join Hotel_details hl ON o.hotel_id = hl.hotel_id
order by o.order_id ASC;

--10.Pizza Store - Update PIZZA table

create table Pizza (
    pizza_id int primary key,
    pizza_type VARCHAR(20),
    amount DECIMAL(10,2)
);
select * from pizza;


UPDATE Pizza
SET amount = amount * 0.97
WHERE pizza_type = 'Extra Large';



create table if not exists salesman (
    salesman_id INT primary key,
    name VARCHAR(50)
);

--11.Create table with Foreign Key constraint

CREATE TABLE IF NOT EXISTS new_orders (
    order_id INT PRIMARY KEY,
    order_date DATE,
    amount DECIMAL(10, 2),
    salesman_id INT,
    FOREIGN KEY (salesman_id) REFERENCES salesman(salesman_id)
);


create table  if not exists Supplier (
    supplier_id INT primary key,
    supplier_name VARCHAR(50)
);


--12.Alter Supplier table with Check Constraint
alter table Supplier
ADD constraint check_supplier_name check (length(supplier_name) > 0);

select * from Supplier;




