SQL Commands
```mysql
Create table table_name
(
column_name data_type,
column_name data_type,
column_name data_type,
column_name data_type,
column_name data_type
);
```
```mysql
Create table table_name
(
empno char(4),
empname varchar(20),
sal float,
city varchar(15),
dob date
);
```
> Table created.

- Insert -
1.	```mysql 
    insert into table_name
	values(1st_col_data, 2nd_col_data, ... , last_col_data);
    ```
2. ```mysql 
    insert into table_name(col1_name, col2_name, col3_name...last_col_name)
	values(1st_col_data, 2nd_col_data, ... , last_col_data);
    ```
^^^^^^^^Recommended^^^^^^^
1. Flexible
2. Readable
3. In future, if table is ALTERed, then this insert statement will continue to work.

```mysql 
insert into emp
values('1', 'Amit', 5000, 'Mumbai', '1995-01-15');
```

```mysql 
insert into emp(empno, sal, ename, city, dob)
values('2', 6000, 'King','Delhi', '1995-01-15');
```

```mysql 
insert into emp(empno, sal)
values('3', 6000);
^^^Enters NULL in remaining columns^^^
```

```mysql 
insert into emp
values('4', 'Atul');
^^^^ERROR (not enough values)^^^^
```

```mysql 
insert into emp
values('5', 'Abhi', null, null, null);
```

- To insert multiple rows
```mysql 
Insert into emp values
('1', 'Amit', 5000, 'Mumbai', '1995-01-15'),
('2', 'King', 6000, 'Delhi', '1990-01-15'),
('3', null, 7000, 'Mumbai', '2994-04-23'),
('4', 'Atul', null, null, null),
('5', 'Abhi', null, Ratnagiri, null);
```

```mysql 
Insert into emp(empno, sal) values
('1', 5000),
('2', 6000),
('3', 7000),
('4', null),
('5', null);
```

- Select
```mysql 
select * from emp
```
- Will show all the columns & rows

```mysql 
select empno, ename from emp;
```
- To restrict the columns

```mysql 
select deptno, job, ename, sal, hiredate from emp;
```
- Position of columns in SELECT statement will determine the position of columns in output.
- This will be as per you client requirement

- To restrict the rows
> WHERE clause
```mysql 
select * from emp
Where deptno = 10;
```
- Where clause is used for searching
- Searching takes place in DB sever HD
- WHERE clause is used to restrict the rows
- WHERE clause is used to retrieve the rows from DB Server HD to Server RAM

```mysql 
select 8 from emp
where sal > 2000;
```
```mysql 
select 8 from emp
where sal > 2000 and sal < 3000;
```
^^2000 & 3000 are excluded^^^
```mysql 
select 8 from emp
where job = 'MANAGER';
```
```mysql 
select ename, sal, sal*12
```
> sal*12 -> computed column, calculated column, virtual column, fake column, psudo column
[Can I insert computed column as perment column in the table]
- Computed columns are not saved in the table because that would be wastage of HD space
```mysql 
select ename, sal, sal*12 as "ANNUAL"
```
- sal*12 is shown as "ANNUAL" using 'as' also nown as Alias
- as -> ANSI SQL | optional in MySQL
- Double quotes are also optional unless you want to show it as case-sensitive. So double quotes are recommended
- I can write above command as below
```mysql 
select ename, sal, sal*12 "Annual Salary in $" from emp
```
```mysql 
select ename, sal, sal*12 as annual from emp
where annual > 30000
```  
^^^ ERROR as annual does not exist in table ^^^
```mysql 
select ename, sal, sal*12 as annual from emp
where sal*12 > 30000
``` 
^^^^Right way^^^^
```mysql 
salect ename "EMPNAME",
sal "SALARY",
sal*12 "ANNUAL" from emp;
```
- You can specify alias for column of table alos
```mysql 
salect ename "EMPNAME",
sal "SALARY",
sal*12 "ANNUAL"
sal*12 "HRA",
sal*12*0.2 "DA"
sal*12 + sal*12*0.4 + sal*12*0.2 "NET" from emp;
```
- You cannot use alias in an expression

![draw2](/DBT/D2/D2%20draw2.png)