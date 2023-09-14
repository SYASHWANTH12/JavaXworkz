INSTR:-INSTRING 
Select instr('BANGALORE','N');
it is used to find the position of the N in bangalore.
Syntax:-
Select Instr(column name ,which position )as postion from customer;
select customer_name,INSTR(cutsomer_name,'n')as postion from customers;
---------------------------------------------------------------------------------------------------------------------------------------
SUBSTR:SubString:bangalore
Select SUBSTR('bangalore',4,3);
It is used to say that continue from g and get an output of gal;
(String,startposition,no of characters to fetch);
example:-
select substr('abcdef',2,8);
to select from column:-
select substr(customer_name,3,5);
Syntax:-
select column_name,substr(coloum_name,3,5) from table_name;

-------------------------------------------------------------------------------------------------------------------------------------------
To create a duplicate table
Syntax:-
create table customers_dup as select*from customers;
             duplicate table              alraedy present table
 create table cust_info as select customer_id,customer_name from customers;
			 duplicate table      coloumname,coloumname           table_name(original)
             
--------------------------------------------------------------------------------------------------------------------------------------------------             
LTRIM;- left remove
select LTRIM( column_name )from table_name;
it will trim all the column in left side to the coulumn_name;
to find the length;
select column_name,length(column_name)from table_name;
RTRIM:-to remove right side;
to remove left and right;
select LTRIM(RTRIM(coloum_name)) from tabe_name;
-------------------------------------------------------------------------------------------------------------------------------------------
Padding:-
There are two types a padding left and right
It will add value to the existing value for example in a column we have id as a column name then in these if we want to add a value to 1 value then we 
can add through these yahsu 1;
Syntax:-
select LPAD('xworkz',3,'a');
	     data value,length of the data,add a;
         OUTPUT:xwo;
         select LPAD('xworkz',8,'a');
         OUTPUT:-xworkzaa;
           select LPAD('xworkz',9,'ab');
           OUTPUT:-xworkzaba;
----------------------------------------------------------------------------------------------------------------------------------------------
distinct:-
it is used to remove the dupilcate value from thev table but it will not remove the original table 
Syntax:-
select Distinct(column_name) from table_name;
what is execution sequence:-
select distinct from where group by having order by;
-----------------------------------------------------------------------------------------------------------------------------------------------------------
Exists:-
select exists(select*from table_name where id=1)as exist;
if it is not present it will return empty rows;
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Aggregate Functions:-
1)COUNT:-
Select count(*) from table_name;
it is count how many rows are there :
as is used to change the column name;
select Count(column_name )as no_of_data form recruitment;
2)SUM:-
select sum(column_name)from recuitment;
it is uesd to find the total sum value
3)MAX:-
select MAX(column_name)from table_name;
It will return the maximun value;
5) AVG:-
select AVG(colum_name) from table_name;
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Jason:-
create table course(id int ,c_name json);
insert into couse values(1,'{"name":"abc"}');
what is jason (               these is jason
select*from course;