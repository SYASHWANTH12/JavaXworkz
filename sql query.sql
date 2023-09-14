CREATE DATABASE X_Workz;
CREATE DATABASE Fruit_Store;

create database yashwanth;
CREATE DATABASE SUMANTH;
USE SUMANTH;
use yashwanth;

use X_Workz;


use Fruit_Store;
CREATE DATABASE Sumanth_Meghraj;
use Sumanth_Meghraj;
CREATE DATABASE inventory;
use inventory;
CREATE TABLE STORE(QUANTITY INT ,PEPSI INT ,COCOLA INT,RICE_TYPE varchar(10));
SELECT * FROM store;
ALTER TABLE  STORE ADD COLUMN NAME_ITEM VARCHAR(10);
ALTER TABLE STORE ADD COLUMN PIZZA VARCHAR(6);
ALTER TABLE STORE ADD COLUMN BIKE VARCHAR(8);



create database  car_collection;
use car_collection;
create table car_name(toyoto varchar(25),fortuner varchar(15),bugatti varchar(20),ferrari varchar(20),honda float,tiago varchar(4));
select*from car_name;
alter table car_name add column lamborgini varchar(25);


create database bike_collection;
use bike_collection;

create table bike_name(toyoto varchar(23),H2R varchar(20),passionpro varchar(15),herohonda varchar(12),bullet varchar(12));
select *from bike_name;
alter table bike_name add column pulsar varchar(12);

create database institute;
use institute;
create table instiute_name(x_workz varchar(2),J_spider varchar(23),Q_spider varchar(12),tap_academy varchar(9));
select*from instiute_name;
alter table instiute_name add column kodnest varchar(23);
alter table instiute_name drop column x_workz;


CREATE DATABASE Phones;
use Phones;
CREATE Table Brand(Phone_name varchar(29),Phone_price int ,phone_ram int ,Snapdragon int );
SELECT*FROM BRAND;
ALTER Table brand add column Refresh_rate int;
ALTER Table brand Drop column phone_ram;
ALTER TABLE BRAND MODIFY column Refresh_rate  varchar(23);
desc brand;
Alter table brand rename column refresh_rate to refresh_value;
Insert into brand value ('vivo',29999,1200,'120');
insert into brand value('oppo',22010,8100,'60hz');
insert into brand value('realme ',30000,900,'90');
insert into brand value ('redmi',15000,810,'40');
insert into brand value ('Iphone',150000,6500,'60');
insert into brand(Phone_price,Snapdragon) value(30000,120);

create database laptop;
use laptop;
create table Laptop(Laptop_name varchar(23),Laptop_price varchar(23),Laptop_Storage varchar(40),Laptop_Ram int,Laptop_condition boolean,Laptop_refreshRate varchar(8));
select*from laptop;
alter table laptop add column Laptop_Warranty varchar(20);
alter table laptop drop column laptop_price;
alter table laptop modify column laptop_warranty int ;
alter table laptop rename column laptop_warranty to laptop_price;
INSERT INTO laptop (Laptop_name, Laptop_Storage, Laptop_Ram, Laptop_condition, Laptop_refreshRate) VALUES ('lenovo', '512', 8, 0, '120');
desc laptop;


create database shoe;
use shoe;
create table shoe_property(shoe_name varchar(20),Shoe_brand varchar(20),Shoe_Size varchar(25));
select*from shoe_property;
Alter table shoe_property add column shoe_weight varchar(20);
alter table shoe_property drop column shoe_name ;
alter table shoe_property modify shoe_weight int ;
desc shoe_property;
insert into shoe_property value('addidas','12',200);
insert into shoe_property value('niki','22',300);
select shoe_brand from shoe_property;
update shoe_property set shoe_brand='puma' where shoe_size=12;

create database sports;
use sports;
create table sports_info(cricket varchar(10),kabadi varchar(10),football varchar(20),koko varchar(20),hockey varchar(20),bootrace varchar(20),volley_ball varchar(20),wrestler varchar(20),basket_ball varchar(20));
alter table sports_info add column swimmimg varchar(20);
alter table sports_info rename column cricket to Bat_ball;
alter table sports_info rename column kabadi to kabaadi;
insert into sports_info value('dhoni','23','ronaldo','toughgame','throwinggame','inthe','ballgame','Romanregins','goal','water');
insert into sports_info value('virat','43','mesii','toughgame1','throwinggame1','inthe1','ballgame1','Romanregins1','goal1','water1');
insert into sports_info value('rohith','7','venu','toughgame2','throwinggame2','inthe2','ballgame2','Romanregins2','goal2','water2');
insert into sports_info value('varsha','98','vasu','toughgame3','throwinggame3','inthe3','ballgame3','Romanregins3','goal3','water3');
insert into sports_info value('anusha','34','prajwal','toughgame4','throwinggame4','inthe4','ballgame4','Romanregins4','goal4','water4');
insert into sports_info value('yashu','12','benzima','toughgame5','throwinggame5','inthe5','ballgame5','Romanregins5','goal5','water5');
insert into sports_info value('sumanth','54','sakka','toughgame6','throwinggame6','inthe6','ballgame6','Romanregins6','goal6','water6');
insert into sports_info value('ranjith','98','water','toughgame7','throwinggame7','inthe7','ballgame7','Romanregins7','goal7','water7');
insert into sports_info value('madhu','76','junior','toughgame8','throwinggame8','inthe8','ballgame8','Romanregins8','goal8','water8');
insert into sports_info value('chandhan','56','karmar','toughgame9','throwinggame9','inthe9','ballgame9','Romanregins9','goal9','water9');
delete from sports_info where  football='ronaldo';
select*from sports_info;
select *from sports_info where football='ronaldo9' or football='throwinggame9';
select *from sports_info where  football in ('ronaldo9','ronaldo8');
alter table sports_info add column id int;
select*from sports_info where  football not in(d and d);
select *from sports_info where football='ronaldo9' and hockey='throwinggame9';
update sports_info set hockey='throwinggame' where hockey='yashu';
update sports_info set football="yahsu" where football="ronaldo";

drop table sports_info;




create database name;
use name;
create table name_info(id int, is_name varchar(20),is_age varchar(23));
select*from name_info;
desc name_info;
alter table name_info add column shoe_size int;
alter table name_info rename column shoe_size to shoe_name;
alter table name_info modify column shoe_name  varchar(20);
alter table name_info drop column shoe_name;
insert into  name_info value(1,'yashu',22);
insert into  name_info value(2,'sumanth',23);
insert into  name_info value(3,'madhu',18);
insert into  name_info value(4,'ranjith',16);
desc name_info;
update name_info set   is_name=18 where is_name=22;

select*from name_info where id=1 and is_name='yashu';
select*from name_info where id=1 or is_age=18;
select*from name_info where id in(1,2);
select *from name_info where id not in(1,2);
select is_age from name_info;
select id from name_info;



create database june_19;
use  june_19;
create Table Lenskart_info(
id int not null unique,
price int not null unique,
location varchar(20) not null unique,
Store_name varchar(20) not null unique,
Person_buying varchar(20) not null  unique,
Person_Selling varchar(20) not null unique,
created_at datetime ,
updated_at datetime,
any_thing varchar(20));
select*from lenskart_info;
INSERT INTO Lenskart_info  VALUES 
(1, 1000, 'New York', 'Store1', 'John Doe', 'Alice', '2023-09-01 10:00:00', '2023-09-01 10:00:00', 'Notes1'),
(2, 1050, 'Los Angeles', 'Store2', 'Jane Smith', 'Bob', '2023-09-02 11:00:00', '2023-09-02 11:00:00', 'Notes2'),
(3, 1100, 'Chicago', 'Store3', 'Emily', 'Charlie', '2023-09-03 12:00:00', '2023-09-03 12:00:00', 'Notes3'),
(4, 1150, 'Houston', 'Store4', 'Robert', 'Eva', '2023-09-04 10:00:00', '2023-09-04 10:00:00', 'Notes4'),
(5, 1200, 'Phoenix', 'Store5', 'Olivia', 'Frank', '2023-09-05 11:00:00', '2023-09-05 11:00:00', 'Notes5'),
(6, 1250, 'Philadelphia', 'Store6', 'Ethan', 'Grace', '2023-09-06 12:00:00', '2023-09-06 12:00:00', 'Notes6'),
(7, 1300, 'San Antonio', 'Store7', 'Ava', 'Hank', '2023-09-07 10:00:00', '2023-09-07 10:00:00', 'Notes7'),
(8, 1350, 'San Diego', 'Store8', 'William', 'Ivy', '2023-09-08 11:00:00', '2023-09-08 11:00:00', 'Notes8'),
(9, 1400, 'Dallas', 'Store9', 'Sophia', 'Jack', '2023-09-09 12:00:00', '2023-09-09 12:00:00', 'Notes9'),
(10, 1450, 'San Jose', 'Store10', 'Jacob', 'Kylie', '2023-09-10 10:00:00', '2023-09-10 10:00:00', 'Notes10'),
(11, 1500, 'Austin', 'Store11', 'Mia', 'Liam', '2023-09-11 11:00:00', '2023-09-11 11:00:00', 'Notes11'),
(12, 1550, 'Jacksonville', 'Store12', 'Noah', 'Molly', '2023-09-12 12:00:00', '2023-09-12 12:00:00', 'Notes12'),
(13, 1600, 'Fort Worth', 'Store13', 'Lily', 'Nathan', '2023-09-13 10:00:00', '2023-09-13 10:00:00', 'Notes13'),
(14, 1650, 'Columbus', 'Store14', 'James', 'Oscar', '2023-09-14 11:00:00', '2023-09-14 11:00:00', 'Notes14'),
(15, 1700, 'Charlotte', 'Store15', 'Isabella', 'Penny', '2023-09-15 12:00:00', '2023-09-15 12:00:00', 'Notes15'),
(16, 1750, 'San Francisco1', 'Store16', 'Benjamin', 'Quincy', '2023-09-16 10:00:00', '2023-09-16 10:00:00', 'Notes16'),
(17, 1800, 'Indianapolis', 'Store17', 'Chloe', 'Rachel', '2023-09-17 11:00:00', '2023-09-17 11:00:00', 'Notes17'),
(18, 1850, 'Seattle', 'Store18', 'Daniel', 'Steve', '2023-09-18 12:00:00', '2023-09-18 12:00:00', 'Notes18'),
(19, 1900, 'Denver', 'Store19', 'Elizabeth', 'Tina', '2023-09-19 10:00:00', '2023-09-19 10:00:00', 'Notes19'),
(20, 1301, 'San Francisco', 'Store20', 'Lucas', 'Daniel', '2023-09-20 10:00:00', '2023-09-20 10:00:00', 'Notes20');
SELECT * FROM lenskart_info WHERE  location like 'S%F%1';
select*from lenskart_info where location='seattle' and id=18;
select*from lenskart_info where id in(1,4,7);
select*from  lenskart_info where id not in(1,4,7);
select*from lenskart_info where  concat('chicago','store2');
SELECT CONCAT('Francisco', ' ', 'Lucas', ' ', '09!');
update lenskart set location='shivamogga' where location='Denver';

-- Create a new database named 'YourDatabaseName' (if it doesn't exist)
CREATE DATABASE IF NOT EXISTS YourDatabaseName;
USE YourDatabaseName;

-- Create the 'District_info' table
CREATE TABLE District_info (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    district_name VARCHAR(50) NOT NULL UNIQUE,
    population INT NOT NULL UNIQUE,
    area_km2 DECIMAL(10, 2) NOT NULL UNIQUE,
    state VARCHAR(50) NOT NULL UNIQUE,
    country VARCHAR(50) NOT NULL,
    mayor_name VARCHAR(50) NOT NULL UNIQUE,
    local_language VARCHAR(50) NOT NULL,
    elevation_m DECIMAL(8, 2) NOT NULL UNIQUE,
    timezone VARCHAR(50) NOT NULL,
    primary_industry VARCHAR(50) NOT NULL,
    tourist_attraction VARCHAR(100) NOT NULL UNIQUE,
    founding_year INT NOT NULL UNIQUE,
    postal_code VARCHAR(10) NOT NULL UNIQUE,
    GDP DECIMAL(15, 2) NOT NULL UNIQUE
);

-- Insert 20 sample rows into the 'District_info' table
INSERT INTO District_info (district_name, population, area_km2, state, country, mayor_name, local_language, elevation_m, timezone, primary_industry, tourist_attraction, founding_year, postal_code, GDP) VALUES
('District1', 100000, 500.25, 'State1', 'CountryA', 'John Doe', 'English', 100.50, 'UTC-5', 'Tech', 'Mountain1', 1850, '10001', 1000000.50),
('District2', 200000, 600.35, 'State2', 'CountryB', 'Jane Smith', 'Spanish', 150.75, 'UTC-4', 'Agriculture', 'Lake1', 1870, '20002', 2000000.75),
('District3', 300000, 700.45, 'State3', 'CountryC', 'Alice Evans', 'French', 200.80, 'UTC-3', 'Tourism', 'River1', 1890, '30003', 3000000.80),
('District4', 400000, 800.55, 'State4', 'CountryD', 'Bob Turner', 'German', 250.90, 'UTC-2', 'Textiles', 'Museum1', 1910, '40004', 4000000.85),
('District5', 500000, 900.65, 'State5', 'CountryE', 'Charlie Young', 'Italian', 300.10, 'UTC-1', 'Finance', 'Park1', 1930, '50005', 5000000.90),
('District6', 600000, 1000.75, 'State6', 'CountryF', 'Diana Reed', 'Chinese', 350.20, 'UTC', 'Education', 'Beach1', 1950, '60006', 6000000.95),
('District7', 700000, 1100.85, 'State7', 'CountryG', 'Edward Green', 'Japanese', 400.30, 'UTC+1', 'Healthcare', 'Forest1', 1970, '70007', 7000000.00),
('District8', 800000, 1200.95, 'State8', 'CountryH', 'Fiona White', 'Russian', 450.40, 'UTC+2', 'IT Services', 'Desert1', 1990, '80008', 8000000.05),
('District9', 900000, 1301.05, 'State9', 'CountryI', 'George Black', 'Arabic', 500.50, 'UTC+3', 'Real Estate', 'Island1', 2000, '90009', 9000000.10),
('District10', 1000000, 1401.15, 'State10', 'CountryJ', 'Hannah Brown', 'Swahili', 550.60, 'UTC+4', 'Transport', 'Cave1', 2010, '100010', 10000000.15),
('District11', 1100000, 1501.25, 'State11', 'CountryK', 'Ian Gray', 'Portuguese', 600.70, 'UTC+5', 'Retail', 'Waterfall1', 2020, '110011', 11000000.20),
('District12', 1200000, 1601.35, 'State12', 'CountryL', 'Julia Roberts', 'Korean', 650.80, 'UTC+6', 'Aerospace', 'Canyon1', 2025, '120012', 12000000.25),
('District13', 1300000, 1701.45, 'State13', 'CountryM', 'Kevin Blue', 'Hindi', 700.90, 'UTC+7', 'Entertainment', 'Hill1', 2030, '130013', 13000000.30),
('District14', 1400000, 1801.55, 'State14', 'CountryN', 'Laura White', 'Punjabi', 750.00, 'UTC+8', 'Agriculture', 'Lake2', 2035, '140014', 14000000.35),
('District15', 1500000, 1901.65, 'State15', 'CountryO', 'Michael Red', 'Bengali', 800.10, 'UTC+9', 'Energy', 'Mountain2', 2040, '150015', 15000000.40),
('District16', 1600000, 2001.75, 'State16', 'CountryP', 'Nina Pink', 'French', 850.20, 'UTC+10', 'Banking', 'River2', 2045, '160016', 16000000.45),
('District17', 1700000, 2101.85, 'State17', 'CountryQ', 'Oliver Yellow', 'Spanish', 900.30, 'UTC+11', 'Insurance', 'Museum2', 2050, '170017', 17000000.50),
('District18', 1800000, 2201.95, 'State18', 'CountryR', 'Patricia Purple', 'German', 950.40, 'UTC+12', 'Logistics', 'Park2', 2055, '180018', 18000000.55),
('District19', 1900000, 2302.05, 'State19', 'CountryS', 'Quincy Orange', 'Italian', 1000.50, 'UTC-11', 'Mining', 'Beach2', 2060, '190019', 19000000.60),
('District20', 2000000, 2402.15, 'State20', 'CountryT', 'Rachel Green', 'Chinese', 1050.60, 'UTC-10', 'Electronics', 'Forest2', 2065, '200020', 20000000.65);
select *from District_info where population like '7%';
use YourDatabaseName;







create database chandan;
use chandan;
create table chandhan_info(id int primary key,name_info varchar(20));
insert into chandhan_info value(1,'yashu');
create table madhu(id_no int,foreign key(id_no) references chandhan_info(id));
insert into madhu value(1);
select*from chandhan_info;
insert into madhu value(3);
select upper(name_info) from chandhan_info;

create database interview;
use interview;
create table interview_info(id int,position varchar(20),type varchar(20),no_of_position int);
insert into interview_info value(1,'java_developer','online',2);
insert into interview_info value(2,'java','online',3);
insert into interview_info value(3,'Software','email',30);
insert into interview_info value(4,'sql','online',5);
insert into interview_info value(5,'pythoin','virtual',6);
insert into interview_info value(6,'react','online',4);
insert into interview_info value(7,'Python_developer','email',34);
insert into interview_info value(8,'Html','online',21);
insert into interview_info value(9,'Css','email',65);
insert into interview_info value(10,'.net','online',4);
insert into interview_info value(11,'Front_end_developer','online',22);
insert into interview_info value(12,'back_end_developer','virtual',45);
insert into interview_info value(13,'Web_developer','email',23);
insert into interview_info value(14,'Software_testing','online',56);
insert into interview_info value(15,'Performane_testing','virtual',5);
insert into interview_info value(16,'software developer','online',1);
insert into interview_info value(17,'react','virtual',84);
insert into interview_info value(18,'Spring','email',9);
insert into interview_info value(19,'java_Script','online',14);
insert into interview_info value(20,'Html And css','virtual',34);
select*from interview_info;
rename table interview_info to yashu_a;
select*from yashu_a;



database;
DDL:data defination language
DML
TCL
create database anusha;
use anusha;
command        database_name
create table anusha_info(number int,salary int,anusha_friends varchar(20)


create database Hospital;
use Hospital;
create table Hospital_name(id int primary key,Hospital_name varchar(20),price int);
alter table hospital_name add column cost int;
alter table hospital_name drop column cost;
alter table hospital_name modify price varchar(20);
alter table hospital_name rename column price to cost;
select*from hospital_name;
desc hospital_name;
insert into hospital_name value(1,'Nanjappa Hospital','2000');
insert into hospital_name value(2,'Metro','2500');
insert into hospital_name value(3,'Life_care','43870');
insert into hospital_name value(4,'IAT','2670');
insert into hospital_name value(5,'Ashok','2320');
insert into hospital_name value(6,'Manipal','9000');
insert into hospital_name value(7,'Hospete','20320');
insert into hospital_name value(8,'nanjapa life care','2000');
select id from hospital_name;
update hospital_name set price='5000' where price= '2000';
update lenskart set location='shivamogga' where location='Denver';
select*from hospital_name where id in(1,2);
select*from hospital_name where id not in (1,2);
select*from hospital_name where id=1 and cost=2000;
select*from hospital_name where id=10 or cost=9000;
select*from name_info where id=1 and is_name='yashu';
select*from name_info where id=1 or is_age=18;
select*from name_info where id in(1,2);
select *from name_info where id not in(1,2);
select Hospital_name ,instr('Metro','t') as n from hospital_name where id=2;
select Hospital_name,substr('Metro','2','5') as cut from hospital_name where id=2;
create table yashhh select*from hospital_name;
select *from yashhh;
select lpad('metro','7','a') ;
select hospital_name from where hospital_name='m%';
select hospital_name from hospital_name where hospital_name like 'm%';




create database yashu;
create table banks_info(id int, b_name varchar(30),amount int primary key,total_customer varchar(20),b_id int not null);
create table custs_info(id int,c_name varchar(20)primary key,amount int , foreign key(amount) references banks_info (amount));
create table loan_info(id int ,c_name varchar(20),foreign key(c_name) references custs_info(c_name));
insert into banks_info value(1,'canara',1500,'20',1276);
insert into banks_info value(2,'Syndicate',2000,'50',1432);
insert into custs_info value(1,'yashu',2500);
insert into custs_info value(2,'sumanth',1500);
insert into loan_info value(1,'home_loan');
insert into loan_info value(2,'car_loan');
select b_name from bank_info where amount=
(select amount from cust_info where id=
(select id from loan_info where c_name='car_loan'));
drop table banks_info;





































