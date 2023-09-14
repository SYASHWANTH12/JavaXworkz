Joints:-
Inner join:
Syntax
Select*from table_name a inner join table_name r on a.id=r.id;
Select*from table_name a inner join table_name r on a.id=r.id inner join table_name c on p.id=r.id;
here a is ref of 1st table and r is the ref of second table
-----------------------------------------------------------------------------------------------------------------------
Left join:-
create table taba(id int, nan varchar(20);
create table tabb(id int, nan varchar(20);
insert into taba values(1,'abc'),(2,'cde'),(3,'def');
insert into taba values(1,'abc'),(3,'cde'),(5,'def');
Syntax:-
select*from taba a right join tabb b on a.id=b.id
-----------------------------------------------------------------------------------------------------
Left join
Syntax:-
select*from taba a left join tabb b on a.id=b.id left join tabc c on c.id=b.id;
----------------------------------------------------------------------------------------------------------
Full join will writean cartiation product
Syntax:-
select*from taba a left join  tabb b on a.id=b.id right join taba ab on ab.id=b.id;
------------------------------------------------------------------------------------------------------------------
How to alter the data type of existing column
create table coffe_shop(id int ,cf_name varchar(34),p_id int;
alter table chocolate modify column id int not null ;
---------------------------------------------------------------------------------------------------------------------------
to add primary key for existing column
alter table column add primary key(1,3,4);
-------------------------------------------------------------------------------------------
to add foriegn key for existing column
alter table table_name add foreign key (p_id)reference  chocolate(p_id);
----------------------------------------------------------------------------------------------------
subqueries:-Nested query or inner query
it should be always present in paranthesis
if its consists of multiple rows than
first it will excicute the inner query
what ever we return in inner query it should be present in the main query
select b_name from bank_info where b_id=
(select b_id from cust_info where c_name ='lokesh');
      !
     !
inner query
if its consists of multiple rows than
select b_name from bank_info where b_id in
(select b_id from cust_info where c_name ='lokesh');
select loan_name from loan_info where c_id=
(select c_id from cust_info where column name='value';
------------------------------------------------------------------------------------------------------------





