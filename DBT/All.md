# D1

### DBT Concepts
- MySQL v9 (RDBMS)
- Intro to Oracle v23ai
- Intro to NoSQL (Not only SQL) (New tech)
- Intro to MongoDB v3.2 (Mongoose DB) (Type of NoSQL)
```
Origin of computer - Computare -> to Compute/calculate
Charles Babbage
Difference Engine
Computers job -> data to information
Input		Computer		Output
data	->				->	Information
Sameer sir: 022-22021984
```
- Information 
	-> Data on whose basis the management can take some decision or you can perform some action
- Processing
	-> Work done by computer to conver data into information.
- Our job
	-> write program to conver data into information
- Data Base
	-> Collection of large data.
- DBMS (Database Management System)
	- e.g. -> Excel, dBase, Foxbase, Foxpro, Clipper, Dataease, Dataflex, 
	lotus, DB Vista
	- Readymade s/w that helps you to manage you data
	- ANSI defination -> Collection of programs
	- Insert, Update, Delete & Process
	MS Excel program -> macro(VBA programming) 53% Work
	
	- MySQL -> RDBMS (Relational Database Management System)
	- Oracle -> RDBMS + OODBMS => ORDBMA (Object Relational DBMS)
	
| DBMA(Excel, Foxpro) | RDBMS(MySQL, Oracle) |
|-|-|
| less expensive | expensive |
| field | column, key, attributes |
| Record | Row, Tuple, Entity |
| File | Table, Relation, Entity class |
| Naming conventions | are different |
| Relationship btwn 2 files is maintained programatically | Relationship btwn 2 tables can be specified at time of table creation (Foreign key contraint) |
| More time required for s/w development | Less time required for s/w development |
| High network traffic | Low network traffic |
| Processing is on client machine | Processing is on server machine (client-server architecture) |
| Slow (in-terms of network) & Expensive in-terms of h/w,n/w,platform cost & infrastructure cost) | Faster (in-terms of network) & Cheaper (in-terms of h/w,n/w,platform cost & infrastructure cost) |
| client-server architecture is not supported | Most of RDBMSs support client-server architecture (MS Access) |
| File level locking | Row level locking |
| Not suitable for nulti user s/w | Suitable for multi-user s/w |
| Distributed DB are not supported | Most of RDBMS support Distributed DB |
| No security of data | Multiple level level security(Logging in sec, Command lvl sec, Obj lvl sec) |

- Logging in security -> MySQL database username & password)
- Command level security -> Privilege to give certain MySQL commands, e.g. Create table, create procedure, create function, create user, etc.
- Object level security -> To access tables of other users

Distributed database - Multiple server can access data from each other

![Screenshot1](/DBT/D1/SS1.png)

### Type of RDBMS
- Informix -> fastest in term of processing speed but programming has to do in assembly.
- Oracle -> Popular bcz programming is very easy, Works on 113 OS, Single user version oracle- Personal Oracle. (63% commercial market) 
- Sybase -> Going down, Recently acquired by SAP.
- MS SQL Server -> Good RDBS from MS, It works only with Windows OS.
- Ingres, Postgres, Unify
- DB2 -> Good RDBS from IBM, DB server has to be mainfraim (super-computer(160GB RAM min)), mostly old s/w use DB2.
- CICS, TELON, IDMS
- MS Access -> Single user RDBMS (PC Based) Paradox, Vatcom SQL
- MySQL -> Open source RDBMS, Widely used (42% open-source market), Free s/w open-source projects that require a full featured database management system often use MySQL; eg. FB, YT, PayPal, LinkedIn, Twitter, eBay, CISCO, Verizon, Uber, Shopify, Netflix, GitHub, Walmart, Booking.com

Part of widely used LAMP open-source web application s/w stack (and other "AMP" stacks)

- L -> Linux
- A -> Apache
- M -> MySQL
- P -> Perl or PHP or Python

- Sun Microsystem acquired MySQL in 2008
- Oracle acquired Sun Microsystem in 2010

Various s/w development tools from MySQL
- MySQL Database
- SQL
	- Not product of MySQL
	- SQL - Structure Query Language (Pronounced as "Sequal"). 
	- Functionalities: Create, Drop, Alter, Insert, Update, Detele permissions, Grant, Revoke, Select Privilege.
	- 9 Commands. 2 yrs to make, 90% C, C++, 10% Assembly. 45 Limitations so far.
	- Conforms to ANSI Standard (1 char = 1 byte storage), Conforms to ISO Standard (for QA)
	- Initially founded by IBM & was known as RQBE (Relational query by example)
	- IBM gave RQBE free of cost to ANSI
	- ANIS renamed as SQL.
	- SQL is now controlled by ANSI (and hence SQL in common for all RDBMS)
	- 2005, ANSI rewrote source code of SQL in Java (100% Java).
	
- MySQL - PL
	- MySQL Programming Language
	- Programming Language from MySQL.
	- Used for database programming, eg. HRA, Tax, Attendance calc, etc.
- MySQL - Command Line Client
	- MySQL Client s/w
	- Runs SQL commands, MySQL Commands, MySQL-PL Programs
	- Front-end s/w.
	- Job- input & Output
	- Character-based (text-based)
- MySQL - Workbench
	- MySQL Client s/w
	- Runs SQL commands, MySQL Commands, MySQL-PL Programs
	- Front-end s/w.
	- Job- input & Output
	- GUI-based (Graphical User Interface-based) 
- MySQL - Enterprise Backup
	- Used to copy table data
	- Used to take backups of table
	- Export server Backup using Enterprise Backup which will provide backup.dmp file. Restore from the backups
	- i.e. Export & Import.
	- Used to transport the tables from one MySQL database to another MySQL database.

**www.mysql.com go & get information about below products**
- MySQL - Connectors
- MySQL - for Excel
- MySQL - Notifier
- MySQL - Enterprise High Availability
- MySQL - Enterprise Encryption
- MySQL - Enterprise Monitor
- MySQL - Query Analyzser

BigTable  is used by Google for search. It is created by Google for Google.


Create Account -> Oracle Account
mysql.com -> Register ... Download Enterprise Edition v9

# D2

D2.1 SQL
## **SQL - Structured Query Language**
### SQL 16 Commands
- 4 sub-divisions for SQL - Follows ANSI Std, Common for all RDBMS
	- DDL - Data Definition Language - Create, Drop, Alter
		- Create - To create the table
		- Drop - To delete the table with all rows
		- Alter - To alter data
	- DML - Data Manipulation Language - Insert, Update, Delete
		- Insert
		- Update
		- Delete
	- DCL - Data Control Language - Grant, Revoke
		- Grant
		- Revoke
	- DQL - Data Query Language - Select
		- Select
- 5th sub-divisions for SQL - Does not follow ANSI Std, Extra in MySQL & Oracle.
	- DTL/TCL - Data Transaction Language/Transaction Control Language - Commit, Rollback, Savepoint
		- Commit
		- Rollback
		- Savepoint
	- DDL - (Rename, Truncate)
		- Rename - to Rename table (Otherwise you have drop table & create one with new name)
		- Truncate - delete all rows & rollback not possible.
- Extra in Oracle RDBMS only (Paid)
	- DML (Merge, Upsert)
		- Upsert- Combo of Update & Insert (If data is not present it insert otherwise update)
		
### Rules for Table-names, Column-name, Variable-name
	- Max 30 Characters.
	- Allowed : A-Z, a-z, 0-9.
	- Case-insensitive for MySQL DB under Windows.
	- Case-sensitive for MySQL DB under Unix/Linux.
	- Has to begin with alphabet A-Z,a-z.
	- Special characters $, # ,_ are allowed.
	- In MySQL, to use reserved characters such as # in tablename & columnname, enclose it in back-quote(`) (`EMP#`).
	- Some (134) reserved words are not allowed in table name e.g create,select, etc.
	- In MySQL, to use reserved words such as "create,select" in tablename & columnname, enclose it in double-quote(") ("create#").
	
	
### Data-types
- Char
	- Allows any characters
	- could be alpha numeric
	- max 255 characters
	- Fixed length
	- Consumes more space (Fixed size)
	- Searching & Retrieval will be fast
	- Defaul width is 1.
- Varchar
	- Allows any characters
	- could be alpha numeric
	- max 65535 characters (64Kb - 1)
	- Variable length
	- Consumes less space (Flexible size)
	- Searching & Retrieval will be slow
	- Width has to be specified
- Longtext
	- Allows any Characters
	- Could be alpha numeric
	- Max 4,294,967,295 characters (4Gb - 1)
	- Stored outside the table
	- Stored outside the row
	- Stored away from the table
	- Stored away from the row
	- MySQL maintains LOCATOR (HD Pointer) from longtext coulumn to the longtext Data
	- Performance of other Column in table is not affected
	- Not used for those columns that used for searching.
	- Used for those coulumn that are only for storage purpose.
	- Width does not have to be specified
	- e.g. FEEDBACK Longtext
	- Variable length
- Binary
	- Fixed length binary string
	- max upto 255 bytes of binary data
	- e.g. Barcode, signatures, QR codes, Picture codes, .gif, fingerprints
	- Width need not to be specified
- Varbinary
	- Variable length binary string
	- max upto 65535 bytes of binary data
	- e.g. Icons, .gifs, audio, thumbnail, favicons
	- Width need to be specified
- Both if above are stored as character string of 1's & 0's. 
- Blob - Binary large object

- Longblog
	- Max upto 4,394,967,295 byte of binary data
	- Photographs, char, graphs, maps, sound, music, video, etc.
	- Width need to be specified
	- Stored outside the table
	- Stored outside the row
	- Stored away from the table
	- Stored away from the row
	- MySQL maintains a LOCATOR (HD Pointer) from Longblob column to the Longblob data
	- Performance of other Column in table is not affected
	- 
- Integer type
	- Signed or Unsigned
	- by default Signed
	- Tinyint (1 byte), Smallint (2 byte), Mediumint (3 byte), Int (4 byte), Bigint (8 byte)
- Floating-Point types (Approximate value)
	- Flote upto 7 decimals
	- Double upto 15 decimals
- Fixed-point types (Exact value)
	- Decimal
		- Stores double as a string eg. "653.6"
		- Max number of digit is 65
		- Used when it is important to preserve the exact precision, for example with monetary data. eg. stock exchange
- Boolean
	- Logical data types
	- True & False evaluate to 1 & 0 respectively
	- Can insert true, false, 1, 0;
	- Output will display 1 or 0
- Date & Time datatypes
	- Date
		- 1st Jan 1000 AD to 31st Dec 9999 AD
		- No problem of Y2k MySQL
		- 'YYYY-MM-DD' is default date formate in MySQL
		- YY-MM-DD is also supported
		- Year value in range 70-99 are converted to 1970 - 1999
		- Year value in range 00-69 are converted to 2000 - 2069
		- 1970 is known as Year of the Epoch (Unix launched)
		- Date calculations are allowed (returns no of days between 2 dates)
		- Internally date is stored as fixed-length number, it is number days since 1st jan 1000 AD & it is occupies 7 bytes of storage
	- Time
		- 'hh:mm:ss' or 'HHH:MM:SS' 
		- Time values may range from '-838:59:59' to '838:59:59'
		- Time calculations are possibles
		- Internally date is stored as fixed-length number.
	- Datetime
		- Date & Time is stored together
		- 'YYY-MM-DD hh:mm:ss' is default formate in MySQL
		- Range '1000-01-01 00:00:00' to '9999-12-31 23:59:59'
		- Time calculations are possibles, returns number of days, remainder hours
		- Internally date is stored as fixed-length number.
	- Year
		- Formate 'YYYY'
		- Range 1901 to 2155
		
- In MySQL
	- You can have 4096 columns per table
	- Row size <= 65535 bytes
	- No limit on number of rows per table
	- But table size <= 64 TB

![draw1](/DBT/D2/D2%20draw1.png)

### Programming
	- ; known as delimiter/terminator, indicates end of command
	- SQL commands are case-insensitive
	- When you are inserting, the data is case-sensitive
	- For char, varchar, data, time, datetime use single-quote('data')
	- For integer quotes are not required
	- Date should be in format
	- NULL
		- Means nothing
		- having ASCII value zero
		- Special treatment given to null value in all RDBMSs
		- Null is independant on datatype
		- Null value occupies only 1 byte of storage
		- If the row is ending with NULL values, then it won't occupy any space.
		- If you enter a null values for the last columns of those columns are likely to have a large number of nulls
		- It's recommended that preferably they should be specified at the end of table Structure, to conserve on HD space.
	- How select command work (D2-draw2)
	- When you are searching, queries are case-insensitive in MySQL
	- The column is passed as Array into Server RAM from Server DB HD
	
	
### Relational operator
	>
	>=
	<
	<=
	!= or <>
	=
- Hierarchy of execution is as above

### Logical Operators
	NOT
	AND
	OR
- Hierarchy of execution is as above

### Arithmatic Operators
	()
	/
	*
	+
	-
- Hierarchy of execution is as above

**Use brackets to overcome precedence(Hierarchy of execution)**



### Exercise
- Right click, properties, change -uroot to -uamit
1. Login with root user
2. To see which data bases are available
	- mysql> show databases;
3. To connect to databases
	- mysql> use (dbname);
4. To see which users are created
	- mysql> select user from user;
		- user is system table which stores all user information
5. Create a new user
	- mysql> create user (username) identified by (password); @localhost restrics user to access db from local system only.
	create user amit@localhost identified by 'student';
6. Create database for new user
	- mysql> create database (dbname);
	- or 
	- mysql>  create schema (schemaname);
7. Give all permissions to the new user on the new databse
	- mysql> grant all privileges on (dbname).* to (username);
	- grant all privileges on cdacmumai.* to amit@localhost;
	- flush privileges; -> will apply privileges instantly, else it requires db restart.
	- exit
8. Create new shortcut & login with new user and password.
9. Exit ALWAYS
	- Data will not be save if not used exit command.

99. When you install MySQL, few users are automatically created.
	1. root
		- DBA Privileges (Database Administrator)
		- Create, drio, alter, configure databases, create usesr, assign privileges, take backups, Performance monitoring, tuning, planning, management, etc.
	2. mysql.sys
	- Most imp table
	- Owner of database & system tables (70-80 tables created automatically)
	- startup db, shutdown db, perform Recovery

MySQL/Oracle Documentation to check 134 reserved words.	
## SQL Commands
```sql
Create table table_name
(
column_name data_type,
column_name data_type,
column_name data_type,
column_name data_type,
column_name data_type
);
```
```sql
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
1.	```sql 
    insert into table_name
	values(1st_col_data, 2nd_col_data, ... , last_col_data);
    ```
2. ```sql 
    insert into table_name(col1_name, col2_name, col3_name...last_col_name)
	values(1st_col_data, 2nd_col_data, ... , last_col_data);
    ```
^^^^^^^^Recommended^^^^^^^
1. Flexible
2. Readable
3. In future, if table is ALTERed, then this insert statement will continue to work.

```sql 
insert into emp
values('1', 'Amit', 5000, 'Mumbai', '1995-01-15');
```

```sql 
insert into emp(empno, sal, ename, city, dob)
values('2', 6000, 'King','Delhi', '1995-01-15');
```

```sql 
insert into emp(empno, sal)
values('3', 6000);
^^^Enters NULL in remaining columns^^^
```

```sql 
insert into emp
values('4', 'Atul');
^^^^ERROR (not enough values)^^^^
```

```sql 
insert into emp
values('5', 'Abhi', null, null, null);
```

- To insert multiple rows
```sql 
Insert into emp values
('1', 'Amit', 5000, 'Mumbai', '1995-01-15'),
('2', 'King', 6000, 'Delhi', '1990-01-15'),
('3', null, 7000, 'Mumbai', '2994-04-23'),
('4', 'Atul', null, null, null),
('5', 'Abhi', null, Ratnagiri, null);
```

```sql 
Insert into emp(empno, sal) values
('1', 5000),
('2', 6000),
('3', 7000),
('4', null),
('5', null);
```

- Select
```sql 
select * from emp
```
- Will show all the columns & rows

```sql 
select empno, ename from emp;
```
- To restrict the columns

```sql 
select deptno, job, ename, sal, hiredate from emp;
```
- Position of columns in SELECT statement will determine the position of columns in output.
- This will be as per you client requirement

- To restrict the rows
> WHERE clause
```sql 
select * from emp
Where deptno = 10;
```
- Where clause is used for searching
- Searching takes place in DB sever HD
- WHERE clause is used to restrict the rows
- WHERE clause is used to retrieve the rows from DB Server HD to Server RAM

```sql 
select 8 from emp
where sal > 2000;
```
```sql 
select 8 from emp
where sal > 2000 and sal < 3000;
```
^^2000 & 3000 are excluded^^^
```sql 
select 8 from emp
where job = 'MANAGER';
```
```sql 
select ename, sal, sal*12
```
> sal*12 -> computed column, calculated column, virtual column, fake column, psudo column
[Can I insert computed column as perment column in the table]
- Computed columns are not saved in the table because that would be wastage of HD space
```sql 
select ename, sal, sal*12 as "ANNUAL"
```
- sal*12 is shown as "ANNUAL" using 'as' also nown as Alias
- as -> ANSI SQL | optional in MySQL
- Double quotes are also optional unless you want to show it as case-sensitive. So double quotes are recommended
- I can write above command as below
```sql 
select ename, sal, sal*12 "Annual Salary in $" from emp
```
```sql 
select ename, sal, sal*12 as annual from emp
where annual > 30000
```  
^^^ ERROR as annual does not exist in table ^^^
```sql 
select ename, sal, sal*12 as annual from emp
where sal*12 > 30000
``` 
^^^^Right way^^^^
```sql 
salect ename "EMPNAME",
sal "SALARY",
sal*12 "ANNUAL" from emp;
```
- You can specify alias for column of table alos
```sql 
salect ename "EMPNAME",
sal "SALARY",
sal*12 "ANNUAL"
sal*12 "HRA",
sal*12*0.2 "DA"
sal*12 + sal*12*0.4 + sal*12*0.2 "NET" from emp;
```
- You cannot use alias in an expression

![draw2](/DBT/D2/D2%20draw2.png)

# D3

MySQL Documentation
https://dev.mysql.com/doc/refman/8.4/en/

Oracle Documentation
https://docs.oracle.com

- SELECTION - When you SELECT specific columns from table; it is known as SELECTION.
- Where clause - to view Specific rows
- PROJECTION - When you SELECT specific rows; it is known as PROJECTION.
- When you perform SELECTION or PROJECTION, you are viewing a subset of data
- To see which tables are created
	```show tables;```
- To see structure of table
	```desc table_name;```

- To suppress the duplicate/to get unique values
	```select distinct job from emp;```
	- DISTINCT takes time as internally DISTINCT run through every record and store unique value in array.
	- When you have LARGE number of rows in the table, this SELECT statement will  be slow.
	```select job, ename from emp;```
	- DISTINCT willl work on combination of all the columns that are present in select statement.

	```select deptno,job, ename, sal, hiredate, from emp;```

- In DBMS, Data is stored in file
- Inside files, rows are stored sequentially
- In DBMS, there is concept of row numbering, 
- In RDBMS, table is not a file, every row is file
- In RDBMS, rows of table are not stored sequentially, they are not stored in specific order
- Rows of table are scattered (fragmented) all over the database server HD.
- The reason why RDBMS does this is to speed up the insert statement.
- In a multi-user enviroment, when multiple users are inserting rows in same table simultaneously, if MySQL were to store the rows sequentially, then the insert operation would be very slow.
- When you INSERT a table, wherever MySQL finds the free spcae in the DB SERVER HD, it will store the row there.
- Where you SELECT from a table, the searching lexicographically (sequential)
- When you SELECT from a table, the order of rows in output depends on the row addressl it'll always be in ascending order of row address.
- Once you INSERT a row, the row address is constant.
- When you update a row, if the row length is increasing & free space is not available, then the entire row is moved to some other address on DB server HD>
- Later when you SELECT from table, you may see that row at some other location.
- It's only in case of VARCHAR that row length may increase or decrease
- Hence it is not possible to see first 'N' rows of a table or last 'N' rows of a table.
- This is common for all RDBMSs.
- There is a system table which stores all the table names & their row addresses
- When you SELECT from a table, MySQL will not search for the entire DB Server HD; rather it'll go to that system table and retrive the rows of the SELECTed table accoringly. (user_table)

### ORDER By clause

- To see rows in specific order
	- used for sorting
	- used for presentation/reporting purposes

```
select beptno, job, ename, sal, hiredate from emp
ORDER by ename; //ORDER by ename asc;
//By default ascending(asc) order
```
```
select beptno, job, ename, sal, hiredate from emp
ORDER by ename desc;
```
This is also known as Business Intelligence/Data Science/AI. All of them having base in SQL.
```
select beptno, job, ename, sal, hiredate from emp
ORDER by deptno, job;
```
```
select beptno, job, ename, sal, hiredate from emp
ORDER by deptno desc, job;
```
```
select beptno, job, ename, sal, hiredate from emp
ORDER by deptno desc, job desc;
```
- No upper limit on number of columns in ORDER BY clause.
- if you a large number of rows in the table, and a large number of columns in ORDER BY clause, then the SELECT statement will be slow, bcz that much sorting has to take place in Server RAM.
```
select beptno, job, ename, sal, hiredate from emp
WHERE deptno = 10
ORDER by deptno desc, job desc;
```
- SELECT statement executes from top to bottom & left to right.
- WHERE clause is used for searching; searching takes place in DB SErver HS
- WHERE clause is used to restrict rows
- WHERE clause is used to retrieve the reows from DB Server HD to SErver RAM
- ORDER BY clause sorting takes place in SERVER RAM
- ORDER BY clause is LAST CLAUSE in SELECT statement.
- WHERE clause has to specified before the ORDER clause.
```
select ename, sal*12 from emp
ORDER by sal*12;
```
```
select ename, sal*12 "ANNUAL" from emp
ORDER by "ANNUAL";
```
```
select ename, sal*12 "ANNUAL" from emp
ORDER by 2;
```
- ORDER BY 2 will sort by 2nd column.
- Alias can be used in ORDER BY clause, ORDER BY is performed in Server RAM & Alias is generated in Server RAM.
- Alias can't be used in WHERE clause, as WHERE action is performed in DB Server HD & Alias is generated in Server RAM.

### Blank-padded comparision semantics-

- When you compare 2 strings of different lengths, the shorter of the 2 strings is temporarily padded with blank spaces on RHS suchat their lengths become equal; then it will start comparision character by character based on ASCII value.

![Draw3](/DBT/D3/D3%20draw1.png)
```
select * from emp
where ename > 'A' and ename < 'B';
//Starts with A (excluding A)
```
```
select * from emp
where ename >= 'A' and ename < 'B';
//Starts with A (including A)
```
```
select * from emp
where ename >= 'A' and ename < 'C';
//Starts with A,B (excluding C)
```
Wildcard
- '%' (percentage) - any character and any number of characters
- '_' (Underscore) - any one character
Special Operator (Like, Between, Any, In)
```
select * from emp
where ename like 'A%';
//Starts with A
```
```
select * from emp
where ename like '%A';
//Ends with A
```
```
select * from emp
where ename like '%A%';
//Contains with A
```
```
select * from emp
where ename not like 'A%';
//Not starting with A
```
```
select * from emp
where ename not like '__A%';
//Words with 3rd character A (2 underscores are used)
```
```
select * from emp
where ename not like '_I__';
//Names with 4 letters and 2nd letter as I (3 underscores are used)
```
```
select * from emp
where ename not like '____';
//Any word with 4 letters (3 underscores are used)
```
```
select * from emp
where sal >=2000 and sal <= 3000;
```
```
select * from emp
where sal between 2000 and 3000;
//Output will be same as above. Recommended.
```
```
select * from emp
where sal not between 2000 and 3000;
//Below 2k & above 3k
```
```
select * from emp
where hiredate between '2023-01-01' and '2023-12-21';
//Below 2k & above 3k
```
```
select * from emp
where hiredate not between '2023-01-01' and '2023-12-21';
//Below 2k & above 3k
```
```
select * from emp
where ename between 'A' and 'F';
//Start with A,B,C,D,E
```
-------------------------------
```
select * from emp
where deptno = 10 or deptno = 20 or deptno = 30;
//Most powerful
```
```
select * from emp
where deptno =any(10,20,30);
//Faster
```
```
select * from emp
where deptno = in(10,20,30);
//Fastest
```

ANY -> logical OR
IN -> logical OR

```
where deptno = in(10,20,30);
//Fastest

where deptno = not in(10,20,30);
//Fastest

where deptno =any(10,20,30);
//Faster
```
```
select * from emp
where deptno !=any(10,20,30);
//Faster

where deptno >any(10,20,30);
//Faster

where deptno >=any(10,20,30);
//Faster

where deptno <any(10,20,30);
//Faster

where deptno <=any(10,20,30);
//Faster
```

- ANY operator is overloaded (Operator Overloading)
- IN operator is faster that ANY Operator
- Any operator is more powerful than IN Operator
- With the IN operator, you can only check only for IN or NOT IN
- With the ANY operator, you can check =ANY, !=ANY, >ANY, >=ANY, <ANY, <=ANY
- If you want to check for equality or inequality, then use the IN operator
- If you want to check for >, >=, < or <=, then use ANY operator
- if your requirement is more complex, then use the Relational and Logical operator

- IN operator is supported by MySQL
- ANY operator is supported by MySQL only when it is used with sub-query.

### UPDATE

Syntax
````
update table_name
set column_name = new_value
where condition;
```
Example
```
update emp
set sal = 10000
where empno = 1;
```
```
update emp
set sal = sal + sal*04
where empno = 1;
```
Multiple Columns update
```
update emp
set sal = sal + sal*04, city = 'Pune'
where empno = 1;
```
```
update emp
set sal = 10000
where city = 'Mumbai';
```
Multiple Rows & Column update simultaneously
```
update emp
set sal = 10000, city = 'Pune'
where city = 'Mumbai';
```
- You can update multiple rows & multiple columns simultaneously, but you can UPDATE only 1 table in a single command
- If you want to UPDATE 2 or more tables, then a separate UPDATE command is needed for each table

Will update all the values in sal columns
```
update emp
set sal = 10000, city = 'Pune';
```

### DELETE

Syntax
```
delete from table_name
where condition
````
record with empno as 1 will be deleted
```
delete from emp 
where empno = 1;
```
record having city as Mumbai will be deleted
```
delete from emp 
where city = 'Mumbai';
```
Will delete all records from table, but the table will remain
```
delete from emp;
```

### Drop

Syntax
```
drop table table_name;
```
Example
```
drop table emp;
```
Drop multiple tables
```
drop table emp, dept;
```
You cannot have a WHERE with DROP table (bcz DROP is DDL cmd)

### Transaction Processing
##### COMMIT
- Commit will save all the DML changes since the last commited state.
- DML changes are INSERT, UPDATE, ..
- Syntax
```
commit work;
or
commit;
```
- Work is optional in MySQL.
- When the user issues a COMMIT, it is known as end of transaction.
- COMMIT will make the transaction permanent. Otherwise it'll be temporary.
- Total work done = sum of work done in individual transactions(T1+T2+..+Tn;)
- When to use commit is depend on user, not developer, and it depends on the logical scope of work

##### DDL command
```
insert ...
insert ...
insert ...
insert ...
create table customer...
```
- Any DDL command automatically commits; not only will it commit itself, it will commit all DML changes before it.

##### ROLLBACK
- Rollback will undo all the DML changes since the last committed state
- What is commited cannot be rolled back.
Syntax
```
rollback work;
or
rollback;
```
- Only the DML cammands are affected by ROLLBACK & COMMIT
- Work is optional in MySQL.

##### EXIT
- When you EXIT from SQL, the system automatically commits (save & exit). It'll commit in itself.
- Any kind of power failure, network failure, system failure, PC reboot, windows close, improper exit from SQL, etc; you last uncommited transaction is automatically Rolled back.

##### SAVEPOINT
- Savepoint is a point within your work
- Savepoint is similar to bookmark
- Savepoint is similar to milestone within your Transaction
- You can rollback to Savepoint
- You cannot commit to savepoint
- Commit will save all the DML changes since the last committed state
- When you Rollback or Commit, the intermediate Savepoint are cleared; if you want to use them again, then you will have to reissue them in some new work
```
rollback work to pqr;
or
rollback to pqr;
```
- work is optional in MySQL.
- You  can only Rollback sequentially
- Savepoint name can be of max 30 characters.
- Withing a Transaction, you can have 2 Savepoints with the same name.
- The latest Savepoint supoercedes the previous one.
- The older Savepoint not longer exists.

### Environment Setting
```
set autocommit = 1; //switching it on
set autocommit = 0; //switching it off
```
# D4

D4.1 Read & Write Consistancy

### Read & Write Consistancy
- In a multi-user environment when you select from a table you can view only committed data of all users plus/union the changes made by you. 

![D4 draw1](/DBT/D4/D4%20draw1.png)

##### ACID properties in RDBMS
- A -> Atomicity
	- Entire transaction takes place at once or it doesn't happen at all (e.g. You withdraw Rs. 500/- from your bank account....)
- C -> Consistancy
	- The data base must be consistant before & after the transaction. (e.g. same as above, Deposits/Withdrawals & Balances tables)
- I -> Isolation
	- Multiple transactions occur independently without interference.
- D -> Durability
	- The changes of successful transaction are permanently saved even if later system failure occurs.
**Update the example of A & C**

##### OPTIMISTING Locking
- It is automatic row locking mechanism in MySQL
- When you UPDATE or DELETE a row, that row is automatically locked for other users
- Row locking in MySQL is automatic
- when you UPDATE or DELETE a row, that row become read_only for other users.
- Other users can select from that table; they will view old data before your changes.
- Other users can insert rows into that table without any issue
- Other use can UPDATE or DELETE other rows from that table
- No other user can UPDATE or DELETE your locked row till you have issued a Rollback or Commit
- LOCKS ARE AUTOMATICALLY RELEASED WHEN YOU ROLLBACL OR COMMMIT.

##### PESSIMISTIC Locking
- Lock the manually in advance, before issuing UPDATE or DELETE.
- To lock the rows mannually, you have to use SELECT state with the FOR UPDATE clause.
```sql
select * from emp
FOR UPDATE;
--It'll lock whole table, not recommended
```
- Lockes are automatically released when you Rollback or Commit.
```sql
select * from emp
where empno = 101
FOR UPDATE;
--It'll lock selected rows
--By default it'll wait in request queue till rows are released
```
```sql
select * from emp
where empno = 101
FOR UPDATE nowait;
--If selectd rows are locked it'll get error
```
```sql
select * from emp
where empno = 101
FOR UPDATE wait;
--If selectd rows are locked it'll wait till rows are released
```
```sql
select * from emp
where empno = 101
FOR UPDATE wait 60;
--If selectd rows are available it'll lock it, else it'll wait for 60s; if row is still unavailable, then it'll abort the operation.
```


To change SQL Promt name-
```sql
mysql> set sqlpromt user1
user1> 
```
D4.2 Function

### Function

#### Character functions
- Applicable char, varchar datatype
##### Table EMP

| fName | lName |
|-------|-------|
| Arun | Puran |
| Tarun | Arun |
| Sirun | Kirun |
| Nutan | Purun |

<table>
<tr>
<td>

```sql
select concat(fname, lname) from emp;
/*OUTPUT
    ArunPurun
    TarunArun
    SirunKirun
    NutanPurun  */
```
</td>
<td>

```sql
select concat(concat(fname,' '), lname) from emp;
/*OUTPUT
    Arun Purun
    Tarun Arun
    Sirun Kirun
    Nutan Purun */
```
</td>
</tr>
</table>

- Uses ->
	- For presentation/reporting purposes.
- **Function withing funtion, max upto 255 levels**
- This limit of SQL can be exceeded with the help of Views

<table>
<tr>
<td>

```sql
select upper(fname) from emp;
--It'll show data in uppercase
```
</td>
<td>

```sql
select lower(fname) from emp;
--It'll show data in lowercase
```
</td>
</tr>
</table>


<table>
<tr>
<td>

```sql
select lpad(ename,25,' ') from emp;
--It'll left pad data such that total length would be 25; output->right justified
```
</td>
<td>

```sql
select rpad(empno,25,' ') from emp;
--It'll right pad data such that total length would be 25; output->right justified
Convert varchar to char
```
</td>
</tr>
<table>

**Missed something**

<table>
<tr>
<td>

```sql
select substr(ename,3) from emp;
--It'll extract letters from String' 3rd index

select substr(ename,-3) from emp;
--It'll fetch letters from String' 3rd last index to 2 letters ahead
```
</td>
<td>

```sql
select substr(ename,3,2) from emp;
--It'll fetch letters from String' 3rd index to 2 letters ahead

select substr(ename,-3,2) from emp;
--It'll fetch letters from String' 3rd last index to 2 letters ahead
```
</td>
</tr>
<table>

```sql

select replace(ename,'un', 'xyz') from emp;
--'un' will be replaced by 'xyz'

select instr(ename, 'un') from emp;
--Returns starting position of first occurence
--6:17

Select length(ename) from emp;
--Returns length of data
--6:20

select ascii(ename) from emp;
--Returns ascii value of first letter

select ascii('z') from emp;
--Returns ascii value of letter 'z', it'll print for n times

select ascii('z') from dual;
--Returns ascii value of letter 'z', it'll print for n times

select substr('New Mumbai',1,3) from dual;
select 3*12 from dual;
```
- Dual is system table
- it is automatically created when you install MySQL
- Common of all RDBMS
- Dual contains only 1 row & 1 column
- Dual is a dummy table
```sql
select 'Welcome to CDAC Mumbai' as "MESSAGE" from dual;
select char(65 using utf8) from dual;
```
- Here utf8 is given character set for US English, else default is binary character set
```sql 
mysql> show character set;
--Will show set of character languages
``` 
```sql
select * from emp
where ename = 'Arun'

select * from emp
where soundex(ename) = soundex('Arun');
```

#### NUMBER Functions

```sql
select round(sal) from emp;
--Returns round off value of number 12.34 -> 12

select round(sal,1) from emp;
--Returns round off value with one decimal, 12.36 -> 12.4

select round(sal,-1) from emp;
--Return round off value with -1 decimal, 1886.44 -> 1890

select truncate(sal,0) from emp;
--Discard value after decimal point.
--Age or time calculation

select truncate(sal,1) from emp;
--Discard value after 1 digit after decimal point

select truncate(sal,-1) from emp;
--Replace value 1 digit before decimal point with 0

select ceil(sal) from emp;
--If there is any value at all in the decimal it'll add 1 to the whole number, 1234.344 -> 1235
--Used in Bill payments

select floor(sal) from emp;
--It removes decimal & returns decimal number

select sign(-15) from dual;
--Return will -1 for negative, 1 for positive, 0 for 0.

select mode(9,5) from dual;
--Returns reminder, here 4 will be Return

select mod(8.22,2.2) from dual;
--Returns 1.62

select sqrt(81) from dual;
--Returns square root of value, here 9.
7:54

select power(10,3) from dual;
--Returns exponential value, here 1000.

select power(10,1/3) from dual;
--Can return cube root, 4th root...

select abs(-10) from dual;
--Returns positive number, here 10.

sin(x);
cos(x);
tan(x);
x-> should be in radians; if in degree ->x*(pi/180)
ln(y); --log y to the base e
log(n,m); --log m to the base n
```	

#### DATE & TIME functions

```sql
select sysdate() from dual;
--Returns DB server machine date & time when the program is executed
--Use for Date & Time display
select now() from dual;
--Returns DB server machine date & time when program began to execute
--Use Maintain logs of user actions/operations
select sysdate(), now(), sleep(10), sysdate(), now() from dual;

select addDate(sysdate(),1) from dual;
select addDate(sysdate(),-1) from dual;
--Returns date by adding day in date in 1st parameter

select dateDiff(sysdate(), hiredate) from emp;
--Returns number of calender days betn 2
--Decimal got is remainder hours, mins, secs, as a fraction of day.

select date_add(hiredate, interval 2 month) from emp;
--Return 2 months ahead in given date

select date_add(hiredate, interval -2 month) from emp;
--Return 2 months before in given date

select date_add(hiredate, interval 2 year) from emp;
--Return 2 year ahead in given date

select date_add(hiredate, interval -2 year) from emp;
--Return 2 year before in given date

select addDate(sysDate(),1/(24*60*60)) from dual;
--Will add 1 sec in given datetime

select last_day(hiredate) from emp;
--Returns date of last day of given date' month
--Used in payroll, attendance, interest calculation

select dayName(sysDate()) from dual;
--Returns day of week

select addTime('2010-01-15 10:00:00', '1') from dual;
--Will add 1 sec in given date 
select addTime('2010-01-15 10:00:00', '-1') from dual;
select addTime('2010-01-15 10:00:00', '1:30:30') from dual;
select addTime('2010-01-15 10:00:00.000000', '1:30:30.000000') from dual;
```
- In all above we displayed output
- To update, use below
```sql
update emp set fname = upper(fname)
where ....;
--To update in data
```

Implement INITCAP of ENAME in MySQL
Display the Enames centre-justified, Assume screen width is 80 characters
Display the enames with the vowel removed
Spell out the SAL column (upto 5 million)
1.75 days convert to hh:mm:ss

# D5

D5.1 List Functions

### List function (ifnull())
- It is an independent of 
- Character, Number, Date & Time Functions Formats

Passimistic querying -> searching for null values
select * from emp where comm = null;
- any comparision done with null, returns null

select * from emp where comm is null;

Special Operator -> is null
	- to check if value is null

select * from emp where comm != null;
- any comparision done with null, returns null

select * from emp where comm is not null;
	- to check if value is not null
	
select sal + comm from emp
- Any operation done with null, returns null

select sal + ifnull(comm, 0) from emp;
/*	if comm is null then 
	return 0;
	else
		return comm;
	end if	*/
	
select ifnull(sal, 0) + ifnull(comm,0) from emp;
- NULL VALUES ARE NOT COUNTED BY GROUP FUNCTION

ifnull(comm,0)
ifnull(comm,100)
ifnull(city,'Mumbai')
ifnull(


D5 draw2.1
```sql
select greatest(sal,3000) from emp;
--returns greatest betn sal column & 3000
```
Uses ->
- To set lower limit on some value
- e.g. bonus = 10% sal, min bonus = 300
	select greatest(sal*0.1,300) from emp;
```sql
selet greatest(sal,3000,4000,5000,10000) from emp;
```
```sql
greatest(val1, val2, val3, ..., val255);
greatest(col1, col2, col3, ..., col255);
greatest('str1','str2','str3',...,'str255');
greatest('date1', 'date2', 'date3', ..., 'date255');
greatest('time1', 'time2', 'time3', ..., 'time255');
greatest('datetime1', 'datetime2', 'datetime3', ..., 'datetime255';
set x = greatest(a,b,c,d);
```
```sql
select least(sal,3000) from emp;
--returns smallest betn sal column & 3000
```
- Use ->
	- to set upper limit on some value
	eg. cashback = 10% amt, max cashback =300
	select least amt*0.1, 300) from order;
```sql
least(val1, val2, val3, ..., val255);
least(col1, col2, col3, ..., col255);
least('str1','str2','str3',...,'str255');
least('date1', 'date2', 'date3', ..., 'date255');
least('time1', 'time2', 'time3', ..., 'time255');
least('datetime1', 'datetime2', 'datetime3', ..., 'datetime255';
set x = least(a,b,c,d);
```
D5 draw2.2
```sql
select
case
when deptno = 10 then 'Training'
when deptno = 20 then 'Exports'
when deptno = 30 then 'Marketing'
else 'Others'
end "DeptNo"
from emp;
```
- if you don't specify ELSE, and if DeptNo 40 is present in table, then it returns null value
```output
Training
Training
Exports
Marketing
Others
```
<table>
<tr>
<td>

```problem
if deptno = 10 then HRA = 40% ANNUAL
if deptno = 20 then HRA = 30% ANNUAL
if deptno = 30 then HRA = 25% ANNUAL
else HRA = 20% ANNUAL
```
</td>
<td>

```problem
if sal < 3000, Remark = 'Low Income'
if sal = 3000, Remark = 'Middle Income'
if sal > 3000, Remark = 'High Income'
```
</td>
</tr>
</table>

<table>
<tr>
<td>

```sql
select deptno, ename, sal, sal*12, "ANNUAL"
when deptNo=10 then sal*12*0.4
when deptNo=20 then sal*12*0.3
when deptNo=30 then sal*12*0.25
else sal*12*0.2
end "HRA"
from emp
order by 1;
```
</td>
<td>

```sql
select
case
when sign(sal-3000) = 1 then 'High Income'
when sign(sal-3000) = -1 then 'Low Income'
else 'Middle Income'
end "REMARKS"
from emp
order by 2;
```
</td>
</tr>
</table>

#### Environment function

```sql
use cdacmumbai
select database() from dual;
select user() from dual;
show character set;
```
D5.2 Group/Aggregate functions

### Group/Aggregate functions
Draw2.3
<table>
<tr>
<td>

- Single-row function
	- Operate on 1 row at a time
	- Character, Number, Date & Time, List, Environment Functions
	- eg. upper(ename), round(sal), etc.
- Multi-Row function
	- Operate on multiple rows at a time
	- Group function
	- eg. sum(sal)
</td>
<td>

EMP Table   
    SAL   
    1000   
    2000   
    3000   
    4000   
    5000   
</td>
</tr>
</table>

```sql
select
case
when job = 'M' then 'Manager'
when job = 'C' then 'Clerk'
end "JOB"
from emp;
```
```sql
select sum(sal) from emp;
-- Output - 35000
```
- Assume 4th row sal is null

```sql
select sum(sal) from emp;
--Output 26000
-- Null values are not counted by group functions
```
<table>
<tr>
<td>

```sql
select avg(sal) from emp;
-- Output 26000/4 -> 6500
```
</td>
<td>

```sql
select avg(ifnull(sal,0)) from emp;
-- Output 26000/5 -> 5200
```
</td>
</tr>
</table>

<table>
<tr>
<td>

```sql
select min(sal) from emp;
-- Output -> 3000
```
</td>
<td>

```sql
select min(ifnull(sal,0)) from emp;
-- Output -> 0
```
</td>
</tr>
</table>

```sql
select max(sal) from emp;
-- Output -> 8000
```
```sql
select count(sal) from emp;
-- Output -> 4 - Returns count of number of rows where SAL is not having a null value
```
```sql
select count(*) from emp;
-- Output -> 4 - Returns count of total number of rows int the table
```
```sql
select count(*) from emp;
--How may employees
select count(sal) from emp;
--How many are salaried
select count(*) - count(sal) from emp;
--How many are not salaried;
select max(sal)/min(sal) from emp;
--8000/3000 = 2.67
select sum(sal)/count(*) from emp;
--26000/5 = 5200	FASTER
select avg(ifnull(sal,0)) from emp;
--26000/5 = 5200	SLOWER
```
- Discard the assumption for 4th row
```sql
select sum(sal) from emp;
where deptno = 1;
--Output - 18000;
select avg(sal) from emp;
where job = 'C';
-- Output - 6000
```
```sql
--Count Query (Counting number of query hits)
select count(*) from emp
where sal>7000;
-- Returns number of emps whos salary is > 7000
```
sum(column)
avg(column)
min(column)		min(sal)	ename, hiredate
max(column)		max(sal)	ename, hiredate
count(column)	count(sal)	ename, hiredate
count(*)
stddev(column)
variance(column)
```sql
select count(*), min(sal), max(sal), sum(sal), avg(sal)
 from emp;
--OUTPUT -
count(*)	min(sal)	max(sal)	sum(sal)	avg(sal)
14			800			5000		29025		2073
```
##### Restriction for group functions
1. You cannot select column of table along with a group function
```sql
select count(ename), max(sal) from emp;
--OK
select ename, max(sal) from emp;
--Not OK, ename return multiple rows whereas max(sal) returns only 1 row
--ERROR -> Not a single-group group function
```
2. You cannot select single-row function along with a group function
```sql
select count(ename), max(sal) from emp;
--OK
select upper(ename), max(sal) from emp;
--Not OK, 
```

3. You cannot use group function in where clause, as where is executed in Sever HD and group-function executed in Server RAM
```sql
select * from emp where sal>avg(sal);
```

#### GROUP BY Clause
- Used for grouping

```sql
select sum(sal) from emp;
--Output 35000

select sum(sal) from emp
where deptno = 1; 
--Output 18000

select deptno, sum(sal) from emp
group by deptno;
select sum(sal) from emp;
```
- Steps followed in Group By clause
1. Rows retrieved from DB Server HD to Server RAM
2. Sorting will take place deptno wise
3. Gouping is done deptno wise
4. Summation deptno wise
5. HAVING clause
6. ORDER BY clause

SELECT Clause - select deptno, sum(sal) FROM Clause - from emp
GROUP BY Clause group by deptno;

- Rule
1. Besides the group function, whichever column is present in select,it has to be present in GROUP BY clause 
```sql
select deptno, sum(sal) from emp;
--Not OK
select deptno, sum(sal) from emp
group by deptno;
--OK
```
2. Whichever column is present in GROUP BY Clause, it may or maynot be present in SELECT Clause
```sql
select sum(sal) from emp
group by deptno;
/*	Output
	sum(sal)
	18000
	17000
```
```
EMP Table
SAL           DeptNO
1000             10
2000             10
3000             20
4000             30
5000             40
```
```sql
select deptno, sum(sal) from emp
group by deptno;
select deptno, min(sal) from emp
group by deptno;
select deptno, max(sal) from emp
group by deptno;
select deptno, avg(sal) from emp
group by deptno;
select deptno, count(*) from emp
group by deptno;
```
- 2D Query
	- Any SELECT Statement with a GROUP BY clause is known as 2D Query, bcz you can plot a graph from the OUTPUT. eg. bar graph, pie chart, etc.
- MySQL for Excel, Oracle Graphics, Oracle Apex, etc.   

![table](/DBT/D5/Table3.png)
```sql
select deptno, sum(sal) from emp
where sal>7000
group by deptno;
```
- WHERE clause is specified before the GROUP BY clause
```sql
select deptno, sum(sal) from emp
where sal>7000 and sal<10000
group by deptno;
```
```sql
select deptno, sum(sal) from emp
where job='C'
group by deptno;
```
```sql
select job, sum(sal) from emp
group by deptno;
```
```sql
select deptno, job, sum(sal) from emp
group by deptno, job;
```
- There is no upper limit on number of columns in GROUP BY Clause
- eg. select ...........
	group by city, state, city;
- If you have a large number of rows in table & if you have a large number of columns in GROUP BY Clasuse, then the SELECT statement will be very slow, bcz that much sorting has to takes place in Server RAM
- If you have 1 column in group by clause then it's known as 2D Query
- If you have 2 column in group by clause then it's known as 3D Query
- If you have 3 column in group by clause then it's known as 4D Query
- And so on..., it's knwon as Multi-Dimensional queries (also known as Spatial queries)
```sql
select .......
group by city, country, district, state;
--Slower
select .......
group by country, state, district, city;
--Faster
```
```sql
select sum(sal), deptno, job from emp
group by job, deptno;
```
- The position of columns in SELECT clause and position of columns in GROUP BY Clause need not be the same
- The position of columns in SELECT Clause will determine the position of columns in out; this you will write as per user requirement.
- The position of columns in GROUP BY clause will determine the sorting order, grouping order, summation order and hence the speed of processingl this you will write as per count(disting(coluymn_name))
- select count(distinct deptno), count(disting job) from emp;
```sql
select count(distinct deptno), count(disting job) from emp;
```
```sql
select deptno, sum(sal) from emp
group by deptno
having sum(sal) > 17000;
--WHERE clause is used for searching
--searching takes place in DB Server HD
--WHERE clause is used to restrict the rows
--WHERE clause is used to restrict the rows from DB Server HD to Server RAM
--Having clause works after the summation is done
```
```sql
select deptno, sum(sal) from emp
group by deptno
having sal > 17000;		-- <-ERROR
```
- whichever column is present in SELECT clause, it can be used in HAVING clause
- It's recommendend that only the group functions should be used in HAVING Clause
<table>
<tr>
<td>

```sql
select deptno, sum(sal) from emp
group by deptno
having sum(sal) > 17000;
```
</td>
<td>

```sql
select deptno, sum(sal) from emp
group by deptno
having sum(sal) > 17000 and sum(sal) < 25000;
```
</td>
</tr>
</table>

```sql
select deptno, sum(sal) from emp
group by deptno
order by 2;
```
- ORDER BY clause is LAST clause in SELECT statement
```
select ...... from ......
where ......
group by ......
having ......
order by ......;
```
- Matrix report
```sql
select deptno, count(*), max(sal), sum(sal) from emp
group by deptno
order by 1;
DEPTNO	COUNT(*)	MIN(Sal)	SUM(Sal)
10		3			1300		8750
20		5			
30		6			950			9400
```
```sql
select deptno, sum(sal) from emp
group by deptno;
deptno	sum(sal)
1		18000
2		17000

select sum(sal) from emp
group by deptno;
sum(sal)
18000
17000

select max(sum(sal)) from emp
group by deptno;
max(sum(sal))
18000
--NESTING OF GROUP FUNCTIONS IS SUPPORTED BY ORACLE
```
**Interesting**
```sql
select sum(sal) sum_sal from emp
group by deptno;
sum_sal
18000
17000

select max(sum_sal) from 
select sum(sal) sum_sal from emp
group by deptno) abcd;
abcd
18000
```
![draw](/DBT/D5/D5%20draw2.png)
D5.3 Joins

- All the data is stored in one table, data is stored in multiple tables
- If you want to see columns of 2 or more tables, then you will have to write a Joins

![draw](/DBT/D5/D5%20Draw%203.png)
```sql
select dname, ename from emp, dept
where dept.deptno = emp.deptno;
```
- dept.deptno -> tableName.columnName
- emp.deptno -> tableName.columnName   
```dept -> right side table -> driving table```   
```emp -> left side table -> driven table```    
Full table scan - entire table is searched

| ENAME | DNAME |
|-----|-------|
| TRN | Arun |
| TRN | Ali |
| TRN | Kirun |
| EXP | Jack |
| EXP | Thomas |

```sql
--The position of columns in SELECT Clause will determine the position of columns in the output; this you will write as per Client Requirement.
select ename, dname from emp, dept
where dept.deptno = emp.deptno;
```
- WHERE clause can be written in any sequence
<table>
<tr>
<td>

```sql
select dname, ename from emp, dept
where dept.deptno = emp.deptno;
```
</td>
<td>

```sql
select dname, ename from emp, dept
where dept.deptno = emp.deptno;
```
</td>
</tr>
</table>

- In order for the join to work faster, preferably the driving table should be table with lesser number of rows
<table>
<tr>
<td>

```sql
select dname, ename from emp, dept
where dept.deptno = emp.deptno;
--FAST
--dept -> driving table
--emp -> driven table
```
</td>
<td>

```sql
select dname, ename from emp, dept
where dept.deptno = emp.deptno;
--SLOW
--emp -> driving table
--dept -> driven table
```
</td>
</tr>
</table>

- the common column in both table is deptno; the common column that is present in both the tables need not be the same in both the tables, because the same column may have a different meaning in the other table. eg. Export & Import, Purchase & Sale, etc.
```sql
select dname, ename from emp, dept
where dept.x = emp.y;
```
- The datatype of common columns in both the tables should be the same and there has to be some logical reason on whose basis you are writing the join
```sql
select dname, ename from emp, dept
where dept.deptno = emp.empno;
--output will be senseless
```
```sql
select dname, ename from emp, dept
where dept.deptno = emp.empno;
```
```sql
--To make output more presentable
select dname, ename from emp, dept
where dept.deptno = emp.empno
order by 1;
```
```sql
--It's good to display lots of columns in the output; it becomes richer & more meaningful
select dname, loc, ename, job, sal from emp, dept
where dept.deptno = emp.empno
order by 1;
```
```sql
--To display all the columns from both the tables (It'll may display common column 2 times)
select * from emp, dept
where dept.deptno = emp.empno
order by 1;
```
```sql
--Column is ambiguously defined (if common column had difference column names in both the tables, then this problem would not have arisen)
select deptno, dname, loc, ename, job, sal from emp, dept
where dept.deptno = emp.empno
order by 1;
```
- To overcome above error
- To avoid double columns
<table>
<tr>
<td>

```sql
select dept.deptno, dname, loc, ename, job, sal from emp, dept
where dept.deptno = emp.empno
order by 1;
```
</td>
<td>

```sql
select emp.deptno, dname, loc, ename, job, sal from emp, dept
where dept.deptno = emp.empno
order by 1;
```
</td>
</tr>
</table>

```sql
--It's good programming practice to use tablename.columname for all the columns, because it makes select statement more readable
select emp.deptno, dept.dname, dept.loc, emp.ename, emp.job, emp.sal from emp, dept
where dept.deptno = emp.empno
order by 1;
```

# D6

D6.1 Joins

## Joins
<table>
<tr>
<td>

```sql
select deptno, sum(sal) from emp
group by deptno;
```
</td>
<td>

```
OUTPUT
DEPTNO	SUM(SAL)
------	--------
1		18000
2		17000
```
</td>
</tr>
</table>

<table>
<tr>
<td>

```sql
select dname, sum(sal) from emp, dept
where dept.deptno = emp.deptno
group by dname;
DNAME	SUM(SAL)
```
</td>
<td>

```sql
select upper(dname), sum(sal) from emp, dept
where dept.deptno = emp.deptno
group by upper(dname)
having sum(sal) > 10000
order by 1;
```
</td>
<td>

```
OUTPUT
DNAME	SUM(SAL)
------	--------
TRN		18000
EXP		17000
```
</td>
</tr>
</table>

### Type of Joins (5)
1. Equi-join (Natural join)
	- Join based on equality condition
	- Shows me matching rows of both the tables
	- Most frequently use join (>90%), hence it is known as Natural join.
	- Will get data which is belong to group.
<table>
<tr>
<td>

```sql
select dname, ename, from emp, dept
where dept.deptno = emp.deptno;
```
</td>
<td>

```
OUTPUT
DNAME	ENAME
------	--------
TRN		Arun
TRN		Ali
TRN		Kirun
EXP		Jack
EXP		Thomas
```
</td>
</tr>
</table>

2. in-equi-join (Non-equi-join)
	- Join based on inequality condition
	- Showns me non-matching rows of both the tables
	- Will get data which is not belong to group.
	- Used for Exception reports
		- Who are the emps who don't belong to Training
		- Who are the customers who haven't made the payment
<table>
<tr>
<td>

```sql
select dname, ename, from emp, dept
where dept.deptno != emp.deptno; 
```
</td>
<td>

```
OUTPUT
DNAME	ENAME
------	--------
TRN		Jack
TRN		Thomas
EXP		Arun
EXP		Ali
EXP		Kirun
MKTG	Arun
MKTG	Ali
MKTG	Kirun
MKTG	Jack
MKTG	Thomas
```
</td>
</tr>
</table>

3. Outerjoin
	- Join with (+) sign, or if you use keyword "Outer"
	- Shows matching rows of both the tables PLUS non-matching rows of "Outer" table
	- Outer table -> Table with is on Outer side of (+) sign
	- Outer table -> Table with is on opposite side of (+) sign
	- Master-Detail Report (Parent-Child Report) 
	- Parent table (Master table) , Child table (Details table)    
	***Please note following***
	- (+) sign is not supported by MySQL
	- ANSI syntax for Right Outerjoin is supported by MySQL
	- ANSI syntax for Left Outerjoin is supported by MySQL
	- ANSI syntax for Full Outerjoin is supported by MySQL
		- Union of ANSI syntax for Right Outerjoin & ANSI syntax for Left Outerjoin
	1. Half outer join   
		- Here, dept is do-while loop & emp is for loop
		1. Right Outerjoin
            <table>
            <tr>
            <td>

            ```sql
            select dname, ename, from emp, dept
            where dept.deptno = emp.deptno (+);
            ```
            ```sql
            --ANSI syntax
            select dname, ename form emp right outer join dept
            on (dept.deptno = emp.deptno);
            ```
            </td>
            <td>

            ```
            OUTPUT
            DNAME	ENAME
            ------	--------
            TRN		Arun
            TRN		Ali
            TRN		Kirun
            EXP		Jack
            EXP		Thomas
            MKTG	empty/null
            ```
            </td>
            </tr>
            </table>
		2. Left Outerjoin
            Assume 6th emp - (6,'Scott', 8000, 4, C, 4);
            <table>
            <tr>
            <td>

            ```sql
            select dname, ename, from emp, dept
            where dept.deptno (+) = emp.deptno;
            ```
            ```sql
            --ANSI syntax
            select dname, ename form emp left outer join dept
            on (dept.deptno = emp.deptno);
            ```
            </td>
            <td>

            ```
            OUTPUT
            DNAME		ENAME
            ------		--------
            TRN			Arun
            TRN			Ali
            TRN			Kirun
            EXP			Jack
            EXP			Thomas
            empty/null	Scott
            ```
            </td>
            </tr>
            </table>
	2. Full Outer join
	- Here, dept is do-while loop & emp is also do-while loop
	- Nested do-while loop
	- Shows matching rows of both the tables PLUS non-matching rows of both the tables
	- UNION of right Outerjoin and left Outerjoin
        <table>
        <tr>
        <td>

        ```sql
        select dname, ename, from emp, dept
        where dept.deptno = emp.deptno (+)
            union
        select dname, ename, from emp, dept
        where dept.deptno (+) = emp.deptno;
        ```
        ```sql
        --ANSI syntax
        select dname, ename form emp full outer join dept
        on (dept.deptno = emp.deptno);
        ```
        ```sql
        select dname, ename, from emp right outer join dept
        where dept.deptno = emp.deptno (+)
            union
        select dname, ename, from emp left outer join dept
        where dept.deptno (+) = emp.deptno;
        --This will automatically suppress duplicates
        ```
        </td>
        <td>

        ```
        OUTPUT
        DNAME		ENAME
        ------		--------
        TRN			Arun
        TRN			Ali
        TRN			Kirun
        EXP			Jack
        EXP			Thomas
        MKTG		empty/null
        empty/null	Scott
        ```
        </td>
        </tr>
        </table>

4. Inner join
	By default every join is Inner join; putting a (+) sign or using the keyword "Outer" is what makes it an Outerjoin
	- **DO NOT MENTION THIS IN INTERVIEW UNLESS EXPLICITLY ASKED BY INTERVIEWER**

5. Cartesian join (Cross join)
	- Join without a WHERE clause
	- Every row of driving table is combined with each and every row of driven table.
	- It takes the cross product of 2 table & therefore it's also known as Cross join.
	- Fastest Join (As no WHERE Clause resulting no searching)
	- Used for printing purposes
		- e.g. In students table you have all the students names, in SUBJECTS table you have all the subjects names; When you are printing the mark-sheets for the students, every student name is combined with each and every subject name.

<table>
<tr>
<td>

```sql
select dname, ename from emp, dept; 
--Fast (Lesser the I/O between Server HD & Server RAM, the faster it will be.
```
```sql
select dname, ename from dept, emp
order by 1;
--Slow (More the I/O between Server HD & Server RAM, the slower it will be.
```
</td>
<td>

```
OUTPUT
DNAME		ENAME
------		--------
TRN			Arun
TRN			Ali
TRN			Kirun
TRN			Jack
TRN			Thomas
EXP			Arun
EXP			Ali
EXP			Kirun
EXP			Jack
EXP			Thomas
MKTG		Arun
MKTG		Ali
MKTG		Kirun
MKTG		Jack
MKTG		Thomas
```
</td>
</tr>
</table>

6. Self join
	- Joining a table to itself.
	- Used when parent column and child column, both are present in same table
	- Slowest join (Based on Recursion)
	- Use, Employee name & Manager name
	
<table>
<tr>
<td>

```sql
select a.ename, b.name from emp as b, emp as a
where a.mgr = b.empno;
```
</td>
<td>

```
OUTPUT
a.ENAME		b.ENAME
------		--------
Aun			Jack
Ali			Arun
Kirun		Arun
Thomas		Jack
```
</td>
</tr>
</table>

### Joining 3 or More Tables
![D5 Draw3]()
<table>
<tr>
<td>

```sql
select dname, ename, dhead from emp, dept, depthead
where depthead.deptno = dept.deptno
and dept.deptno = emp.deptno;
--It's nested for loop upto 3 levels
```
</td>
<td>

```
OUTPUT
DNAME		ENAME		DHEAD
------		------		------
TRN			Arun		Arun
TRN			Ali			Arun
TRN			Kirun		Arun
EXP			Jack		Jack
EXP			Thomas		Jack
```
</td>
</tr>
</table>

### Types of Relationships between tables
1. 1:1
	- Dept : Depthead
2. 1:Many
	- Dept : Emp, Depthead : Emp
3. Many:1
	- Emp : Dept, Emp : Depthead
4. Many:Many
    ```
                Projects	
    ProjectNo	ClientName		Desc
    P1			Deloitte		CGS
    P2			Morgan Stanley	AMS
    P3			BNM Paribas		Macros
    P4			ICICI Bank		PPS
    P5			AMFI			Website
    ```
    Intersection Table
    ```
    Project_Emp
    ProjectNo	EmpNo
    P1			1
    P1			2
    P1			4
    P2			1
    P2			5
    P3			2
    P3			4
    ```
    Intersection table is required for Many:Many Relationship

```sql
select client)name, ename, from projects_emp, emp, projects
where projects_emp.projno = projects.projno
and projects_emp.empno = projects.empno
order by 1,2;
```
D6.2 Sub-queries

### Sub-queries
- Subqueries are nested queries (i.e. Query withing query(SELECT withing SELECT))

Display the ENAME who is receiving SAL = min(SAL) :-
```sql
select ename from emp
where sal = (select min(sal) from emp);
--First SELECT statement is known as Main Query (Parent/Outer Query)
--Second SELECT statement is known as Sub Query (Child/Inner Query)
```
- Max upto 255 levels for Sub-queries
- This limit of SQL can be exceeded with the help of Views
- More the no of SELECT statement, the slower it'll be
- Less the no of SELECT statement, the faster it'll be
- In somecases, join queries can be replaced with Sub-queries; but Sub-queries is slower than join.

```sql
--2nd largest sal
select max(sal) from emp
where sal < (select max(sal) from emp);
```
```sql
--Display all the rows who belong to the same DEPTNO as 'Thomas'
select * from emp
where deptno = (
	select deptno from emp
	where ename = 'Thomas');
```

```sql
--Display all the rows who belong to the same JOB as 'Kirun'
select * from emp
where job = (
	select job from emp
	where ename = 'Kirun');
```

#### Using Sub-query with DML commands
1. In other RDBMS

```sql
delete * from emp
where deptno = (
	select deptno from emp
	where ename = 'Thomas');
```
```sql
update emp set sal = 10000
where job = (
	select job from emp
	where ename = 'Kirun');
```
- ABOVE 2 COMMSNDS WILL NOT WORK IN MySQL   
- IN MySQL YOU CANNOT UPDATE OR DELETE FROM A TABLE FROM WHICH YOU ARE CURRENTLY SELECTING

```
ABCD TABLE
  DEPTNO
	2
```
Can I do something like function to call instead of whole select statement.
```sql
delete * from emp
where deptno = (
	select abcd.deptno from (
		select deptno from emp
		where ename = 'Thomas') abcd);
```
```sql
update emp set sal = 10000
where job = (
	select pqr.job from (
		select job from emp
		where ename = 'Kirun') pqr);
```

#### Multi-row Sub-queries
Sub-query returns multiple rows
Display all the rows who are receiving sal = any of the managers
```sql
select * from emp
where sal =any(
	select sal from emp
	where job = 'M');
```
```sql
select * from emp
where sal IN(
	select sal from emp
	where job = 'M');
```
```sql
--usability
select * from emp
where deptno = 1 AND sal IN(
	select sal from emp
	where job = 'M') AND MGR = (SELECT...);
```

```sql
select * from emp
where sal >= (
	select min(sal) from emp
	where job = 'M');
```
- To make it work faster:-
	1. Try to solve the problem using join, bcz join is faster than sub-query
	2. Try to reduce the number of levels for sub-queries.
	3. Try to reduce the number of rows returned by sub-quary

- Assumption 3rd row SAL is 13000   

Display all the rows who are receiving SAL > all the managers
<table>
<tr>
<td>

```sql
select * from emp
where sal >all(
	select sal from emp
	where job = 'M');
```
</td>
<td>

```sql
select * from emp
where sal > (
	select max(sal) from emp
	where job = 'M');
```
</td>
</tr>
</table>

ALL -> logical AND   
ANY -> logical OR   
IN -> logical OR 

#### Using Sub-query in HAVING clause
- Assimption 3rd row SAL is 3000
- Inline view - If you have sub-query in the FROM clause then it's known as Inline View.
Display DNAME that having max(sum(sal))
<table>
<tr>
<td>

```sql
select deptno, sum(sal) from emp
group by deptno;
```
</td>
<td>

```
deptno	sum(sal)
------	--------
1		18000
2		17000
```
</td>
</tr>
</table>

<table>
<tr>
<td>

```sql
select sum(sal) from emp
group by deptno;
```
</td>
<td>

```
sum(sal)
--------
18000
17000
```
</td>
</tr>
</table>

<table>
<tr>
<td>

```sql
select sum(sal) sum_sal from emp
group by deptno;
``` 
</td>
<td>

``` 
sum_sal
--------
18000
17000
```
</td>
</tr>
</table>

<table>
<tr>
<td>

```sql
select max(sum_sal) from
(select sum(sal) sum_sal from emp
group by deptno) abcd;
```
</td>
<td>

```
max(sum_sal)
--------
18000
```
</td>
</tr>
</table>


<table>
<tr>
<td>

```sql
select deptno, sum(sal) from emp
group by deptno
having sum(sal) = 
(select max(sum_sal) from
(select sum(sal) sum_sal from emp
group by deptno) abcd);
```
</td>
<td>

```
deptno	sum(sal)
------	--------
1		18000
```
</td>
</tr>
</table>

<table>
<tr>
<td>

```sql
select dname, sum(sal) from emp, dept
where dept.deptno = emp.deptno
group by dname
having sum(sal) = 
(select max(sum_sal) from
(select sum(sal) sum_sal from emp
group by deptno) abcd);
```
</td>
<td>

```
dname	sum(sal)
------	--------
TRN		18000
```
</td>
</tr>
</table>

#### Correlate sub-query (Using the Exist operator)
- This is exception when sub-query is faster than join
- If you have join along with DISTINCT, to make it work faster use Correlated sub-query (use the EXISTS operator)   
Display the DNAMEs that contain employees & the DNAMEs that do contain employees

<table>
<tr>
<td>

##### **Solution #1:** 
```sql
select deptno from emp;
```
```
OUTPUT
1
1
1
2
2
```
```sql
select distinct deptno from emp;
```
```
OUTPUT
1
2
```
```sql
select dname from dept
where deptno =any
(select disting deptno from emp);
```
```
OUTPUT
TRN
EXP
```
```sql
select dname from dept
where deptno in
(select distinct deptno from emp);
```
```
OUTPUT
TRN
EXP
```
```sql
select dname from dept
where deptno not in
(select distinct deptno from emp);
```
```
OUTPUT
MKTG
```

</td>
<td>

##### **Solution #2:**
```sql
select dname from emp, dept
where dept.deptno = emp.deptno;
```
```
OUTPUT
TRN
TRN
TRN
EXP
EXP
```
```sql
select distinct dname from emp, dept
where dept.deptno = emp.deptno;
```
```
OUTPUT
TRN
EXP
```

** ##### Solution #3:**
```sql
select dname from dept where EXISTS
(select deptno from emp
where dept.deptno = emp.deptno);
```
```
OUTPUT
TRN
EXP
```
```sql
select dname from dept where not EXISTS
(select deptno from emp
where dept.deptno = emp.deptno);
```
```
OUTPUT
MKTG
```

</td>
</tr>
</table>

- First the main query is executed
- For every row returned by main query, it will run the sub-quary once
- sub-quary returns boolean TRUE value or FALSE value
- If sub-query returns TRUE value, then main query is eventually executed for that row
- If sub-query returns FALSE value, then main query is not executed for that row
- Unlike earlier, we do not use DISTINCT here, therefore no sorting takes place in Server RAM; this speeds it up
- Unlike a Join, the number of full table scans is reduce; this further speeds it up.

# D7
D7.1 Set Operators

## Set Operators
	- Foundation of RDBS based on Set theory
	- Dr. E. F. Codd is founder of RDBMS
	- UNION, UNION ALL, INTERSECT, EXCEPT
```	
	EMP1				EMP2	
EMPNO	ENAME		EMPNO	ENAME
1		A			1		A
2		B			2		B
3		C			4		D
					5		E
```
##### UNION
<table>
<tr>
<td>

```sql
select empno1, ename from emp1
	union
select empno2, ename from emp2;
```
</td>
<td>

```
OUTPUT
EMPNO	ENAME
-----	-----
1		A
2		B
3		C
4		D
5		E
```
</td>
</tr>
</table>
 
	- Will combine the output of both the SELECT statements and it will suppress the duplicates
- Structure of both the SELECT statements has to be same
- Number of columns in both and the corresponding datatype have to match
- The column names may be different
- 1st select statement column name will reflect 2 different columns are mentioned in SELECT statement
- Order by clause should not be mentioned in 1st statement, it'll give error. Instead mention in in 2nd SELECT statement.
- Use - To combine OUTPUT of multiple tables

##### UNION ALL
<table>
<tr>
<td>

```sql
select empno1, ename from emp1
	union all
select empno2, ename from emp2;
```
</td>
<td>

```
OUTPUT
EMPNO	ENAME
-----	-----
1		A
1		A
2		B
2		B
3		C
4		D
5		E
```
</td>
</tr>
</table>

- Union all will combine the output of both the SELECT statement and duplicates are not suppressed

##### INTERSECT
Intersect will return what is common in both the SELECT statements & duplicates are suppressed
<table>
<tr>
<td>

```sql
select empno1, ename from emp1
	intersect
select empno2, ename from emp2;
```
</td>
<td>

```
OUTPUT
EMPNO	ENAME
-----	-----
1		A
2		B
```
</td>
</tr>
</table>

##### EXCEPT

- Except will return what is present in first SELECT statement & not present in the second SELECT statement & the duplicates are suppressed

<table>
<tr>
<td>

```sql
select empno1, ename from emp1
	except
select empno2, ename from emp2;
```
</td>
<td>

```
OUTPUT
EMPNO	ENAME
-----	-----
3		C
```
</td>
</tr>
</table>

##### General
```sql
select ................
	union
select ................
	intersect
select ................
	union
select ................
	union all
select ................
	except
select ................
	order by x;
```
- Max upto 255 SELECT statements
- This limit of SQL can be exceeded with help of Views
- All are of equal precedence but brackets will have highest priority
- Need not to select from 2 table, can select form same table
<table>
<tr>
<td>

```sql
select job from emp where deptno = 10
intersect
select job from emp where deptno = 20;
JOB
-------
Manager
Clerk

select job from emp where deptno = 10
intersect
select job from emp where deptno = 20;
```
</td>
<td>

```sql
select job from emp where deptno = 10
except
select job from emp where deptno = 20;
JOB
-------
President

select job from emp where deptno = 10
intersect
select job from emp where deptno = 20;
```
</td>
</tr>
</table>

```sql
select empno1, ename from emp1
	except
select empno2, ename from emp2;
```

### Psudo Columns 
- Fake columns(Virtual columns)
- It's not a column of the table, but you can use it in SELECT statement.
- eg. computed columns (sal*12 ANNUAL), Expressions (sal+comm-tax NET_EARNINGS), Function-based columns (avg(sal) AVG_SAL, round(sal, -3) R_SAL)

#### RDBMS supplied Pseudo columns
##### ROWID
- ROWID is a pseudo column
- Stands for Row Identifier
- It is not a column of the table, but you can use it in SELECT statement
- It is the ROW ADDRESS
- It is the actual physical memory location in DB server HD where that that row is located.
- When you select from table, the order of rows in output depends on the row ADDRESS; it will always be in ascending order of ROWID
- It is fixed-length, encrypted string of 18 characters
- When you insert a row, the address (ROWID) is constant for the life of the row
- When you update a row, if the length is descreasing, then address will not change
- When you update a row, if the length is increasing, and if free space is not availabel, then address may change
- No 2 rows of any table in the entire DB Server HD can have same ROWID
- ROWID works as unique identifier for every row in the database
- ROWID is used by MySQL to distinguish between two rows in the DB Server HD
- ROWID can be used to update or delete the DUPLICATE ROWs.
- ROWID is used internally by MySQL for Row locking, to manage indexes, to manage the cursors, to distinguish between 2 rows, row management, etc

```sql
select rowid, ename, sal from emp;
```

### Indexes	(Watch again)
```
			EMP Table
ROWID	EMPNO	ENAME	SAL		DEPTNO
X001	5		A		5000	1
X002	4		A		6000	1
X003	1		C		7000	1
X004	2		D		9000	2
X005	3		E		8000	2
```
- Indexes are present in all RDBMS, all DBMS and some of programming languages also.
- Used to speed up search operations (For faster access)
- Used to speed up select statement with a WHERE clause
- In MySQL, the indexes are automatically invoked by system as & when required.
- Execution plan -> It is plan created by MySQL as to how it is going to execute the SELECT statement
- In MySQL, the indexes are automatically updated by the system for all the DML operations
- Duplicate values are stored in an index
- No upper limit on the number of indexes per table
- Larger the number of indexes, the slower would be the DML operations.
- Cannot index text & blob columns
- NULL values are not stored in any index
- If you have 2 or more independent columns in the WHERE clause, then you create separate indexes for each column; MySQL will use necessary indexes as and when required.
- Composite index -> Combine 2 or more inter-dependent columns together in a single index
```
IND_DEPT_EMPNO
ROWID	DEPTNO	EMPNO
X001	1		1
X001	1		2
X001	1		3
X001	2		1
X001	2		2
```
- INDEX KEY - is set of columns on whose basis the index has been created
- Primary index key, here DEPTNO is Primary index key
- Seconary index key, here EMPNO is Seconary index key
- In MySQL, you can combine upto 32 columns in composite index.

- In MySQL, feature of ROWID is available, but you cannot view it.
- In Oracle, feature of ROWID is available, but you can view it.

```sql
select *  from emp where empno = 1;
select *  from emp where ename = 'C';
select *  from emp where sal > 7000;
```

#### When an Index should be created
- To speed up statement with WHERE clause
- If your SELECT retrieves <25% of table data, otherwise it'll slow down
- Your Primary Key column (unique column) should always be indexed
- Common column in join operations should always be indexed
```
		 DEPT Table
ROWID	DEPTNO	DNAME	LOC
Y011	1		TRN		Bby
Y012	2		EXP		Dlh
Y013	3		MKGT	Cal
```
```sql
select dname, ename from emp, dept
where dept.deptno = emp.deptno;
```
##### Create INDEX
Syntax -   
```sql 
create index indexname on table(column); 
```
```sql
create index i_emp_empno on emp(empno);
```
- Max 30 char allowed for index name
```sql
create index i_emp_ename on emp(ename);
create index i_emp_sal on emp(sal);
```
```sql
--To see which all indexes are created for specific table
show indexes from emp;
```
```sql
--To see all indexes on all table in the database
use information_schema;
select * from statistics;
```
```sql
--To drop index
drop index indexName on emp;
```
```sql
--To store index in descending order
create index i_emp_empno on emp(empno desc);
```
```sql
create index i_orders_onum on orders(onum desc);
```
```sql
create index i_emp_empno on emp(deptnpo, empno);
create index i_emp_empno on emp(deptnpo desc, empno);
create index i_emp_empno on emp(deptnpo, empno desc);
create index i_emp_empno on emp(deptnpo desc, empno desc);
```
```sql
create unique index i_emp_empno on emp(empno);
--Performs extra function, it won't allow to INSERT/UPDATE duplicate value in EMPNO
--At the time of creating the unique index, if you already have duplicate values in EMPNO, then MySQL will not allow you to create the unique index
```
- If you drop the table/column, then associated indexes are droped automatically.
- Will not allow to create two index for same column.

##### Type of indexes
1. Normal index
2. Normal composite index
3. Unique index
4. Unique composite index
5. Clustered index
6. Non-clustered index
7. Covering index
8. Full text index
9. Filtered index
10. Spatial index
11. XML index
12. Hash index
13. Bitmap index
14. Index-Organized table
15. Table & index partitioning
16. Global & Local indexes
17. Index on Abstract columns
18. etc..

<table>
<tr>
<td>

```sql
--In other RDBMS
use index ind_empno;
select * from emp where empno = 1;
```
</td>
<td>

```sql
--In other RDBMS
insert/update.delete .....;
REINDEXs;
```

</td>
</tr>
</table>


# D8

D8.1 ALTER TABLE

## ATLER TABLE (DDL Command)
```
EMPNO	ENAME	SAL
101		SCOTT	5000
102		KING	6000
```
### Direct Commands

#### Rename a table
```sql
rename table emp to employee;
```
- Rename a DDL Command (Extra Command in MySQL)
#### Add a coulmn to the table
```sql
alter table emp add gst float;
```
#### DROP a column
```sql
alter table emp drop column gst;
```
- If you drop a columnm then indexes on that column are dropped automatically
#### To increase the length
```sql
alter table emp modify ename varchar(30); --varchar(25)->30
```

### Indirect Commands

#### Reduce width of column

```sql
alter table emp modify ename varchar(30); --varchar(25)->30
```
- In MySQL, data will get truncated   
Parthavi -> Partha, Sameer -> Sam
- In Oracle, it'll give ERROR, but you can reduce the width provided the contents are null
	- alter table emp add x charvar(25);
	- update emp set x = ename, ename = null;
	- /*Data testing with X column; ckeck that none of names > 20 chars*/
	- update emp set ename = x;
	- alter table emp drop column x;
- It's recommended you use above solution for MySQL
- Extension columns used to extend the table for future requirements
#### Change the datatype

int(11) -> char(20)s
```sql
alter table emp modify empno char(20);
sarke uparse
```
#### Copy the rows from one table imto other avopy og tanle
```sql
insert into emp_kh select * from emp_jh;
```
-Above command will work procta
- IF YOU WANT TO COPY SPECIFICALLY
```sql
INSERT INTO emp_kh
SELECT * FROM EMP_JH WHERE...
```
```sql
INSERT INTO emp_kh
SELECT * FROM EMP_JH WHERE DEPT = 1...
```
```sql
INSERT INTO emp_kh
SELECT EMPNO, ENAME FROM EMP_JH WHERE DEPT = 1...
```
#### Copy of the table
```sql
create table emp2
as
select * from emp;
```
It'll create table emp2  as per structure of SELECT Statement 
SELECT Statement will be executed
- When you create table using sub-query, indexes on original table are not copied into new tables.
- If you want to indexes on new table, you will have to create them manually.
##### To copy specific row/column ONLY
```sql
create table emp2
as
select empno, ename, from emp where......;
```

#### Copy only the structure of the TABLE

##### Solution 1
```sql
create table emp2
as
select * from emp;
delete from emp2;
commit;
```
##### Solution 3
```sql
create table emp2
as
select * from emp;
truncate table emp2;
--TRUNCATE is DDL Command
--TRUNCATE is DDL Command
--TRUNCATE will delete all the rows & commit
```
##### Solution #3
```sql
create table emp2 as select * from  emp
where 1 = 2;
```

###### Difference btween Delete & Truncate

<table>
<tr>
<td>

```
1. Command for all RDBMS
2. ANSI SQL &(ANSI & ISO Stds)
3. DML Command
4.It requires commite
5. Rollback is possible
6. WHERE Clause is supported; can DELETE specific rows
```
</td>
<td>

```
1. Truncate is extra command in Oracle & MySQL
2. Not ANSI SQL (MySQL StDs, abd oracle stds(
6. DDL Command
4. Autocommit
6. Rollback no passible
6. Where clause not supported; Truncate will delete all the rows and commit

```

</td>
</tr>
</table>

#### Rename a column
```sql
create table emp2
as
select empno, ename, sal salary from emp;
drop table emp;
rename table emp2 to emp;
```
#### Change the position of the columns:
```sql
create table emp2
as
select ename, sal, empno from emp;
drop table emp;
rename table emp2 to emp;
```

D8.2 Constrains

## Constrains
- Limitations/restrictions imposed on a table
```
empno	ename	sal	dept
1		A		5000	1
2		A		6000	1
3		C		7000	1
4		D		9000	2
5		E		8000	2
```
### PRIMARY KEY
- Key is another word for column
- Primium column
- Column or set of columns that uniquely  identifies a row e.g. empno
- Duplicates values ar not allowed; it has to be unique 
- Null values are not allowed; this is mandatory column
- It's recommended that very table should have PRIMARY key; it helps in long-term perspective
- Purpose of PRIMARY KEY is row uniqueness; with the help of PRIMARY kry column you can distinguish between 2 rows of table
- TEXT and BLOB cannot be Primary Key
- Unique index is automatically created for Primary Key(because Primary Key is 
the best column for searching)
- COMPOSITE PRIMARY KEY -> combine 2 or columns together to server the Purpose of PRIMARY KEY; preferably they should be interdependent columns
- you can combine upto 32 columns in composite PRIMARY KEY
- If yyou have Composite PRIMARY KEY, then Composite unique index is automatically created.
- You can have only 1 PRIMARY KEY per table
- Candidate key - is not a constraint
- Candidate key - is a defination
- It is PRIMARY KEY is in waiting
- Candidate key - besides the PRIMARY KEY, any other column in table that could server purpose of PRIMARY KEY, is good candidate for PRIMARY KEY, is known as Candidate KEY
- SURROGATE KEY -> It is not a constraint
- SURROGATE KEY -> It is a defination
- SURROGATE KEY -> When you add extra column to table to server the purpose of PRIMARY KEY, then such a PRIMARY KEY is known as SURROGATE KEY.
- PRIMARY KEY is best column for searching, and with CHAR datatype the searching & retrieval is very fast; therefore for SURROGATE KEY, the CHAR datatype is recommended.

##### How to identify PRIMARY KEY
1. Identify some key column & make it PRIMARY KEY of your table
2. If you cannot identify some key column, then try to implement composite PRIMARY KEY
3. If this is not possible, then add an extra column to the table to server the purpose of PRIMARY KEY(SURROGATE KEY)
```sql
create table emp
(
empno char(4) PRIMARY KEY,
ename varchar(25),
sal float,
deptno int
);
```
```sql
insert in emp value('5', 'F', 5000, 2);
insert in emp value(null,'F',5000,2);
--ERRORS
```
- All constrains are at server level; you can perform the DML operations using MySQL command line client or MySQL workbench, or Java or MS .Net or any other front-end s/w, the constrains will always be valid (this feature is known as DATA INTEGRITY)

```sql
select * from information_schema.table_constraints;
select * from information_schema.table_constraints
where table_schema = 'cdeacmumbai';
select * from information_schema.key_column_usage
where table_name = 'emp';
```
- unique index automatically created
```sql
show indexes from emp;
```
- To DROP PRIMARY KEY
```sql
alter table emp drop PRIMARY KEY;
```
- To add PRIMARY KEY to existing table
```sql
alter table emp add PRIMARY KEY(empno);
```
- To change the PRIMARY KEY column ->drop the existing Primary key constraint & alter table & then we can add new primary key constraint

- To do Composite PRIMARY KEY
```sql
create table emp
(
empno char(4),
ename varchar(25),
sal float,
deptno int,
PRIMARY KEY(deptno, empno)
);
```

```sql
alter table emp drop PRIMARY KEY;
alter table emp add PRIMARY KEY(deptno, empno);
```

##### Types of constraint
1. Column level constraint
	- constraint specified on one column
2. Table level constraint
	- Composite
	- Constraint specified on combination of 2 or more columns
	- Has to be specified at the end of the table structure
	
#### NOT NULL CONSTRAINT
- Null values are not allowed 
- Duplicate value are allowed
- Always a column level constraint

```sql
create table emp
(
empno char(4),
ename varchar(25) not null,
sal float not null,
deptno int not null
);
```
1. Entity Integrity -> PRIMARY KEY
2. Referential Integrity -> Foreign KEY
3. Domain Integrity -> Datatype

- In MySQL, nullability is part of datatype to see the not null columns
```sql desc emp; ```
- To DROP the not null constraint
```sql alter table emp modify ename varchar(25) null; ```
- To add the not null constraint to existing table
```sql alter table emp modify ename varchar(25) not null; ```

#### UNIQUE CONSTRAINT
- Duplicate values are not allowed
- Null values are allowed
- Can INSERT any number of null values, but not duplicate values
- unique index is automatically created
- text and blob cannot be unique
- In MySQL, you can combine upto 32 columns in composite unique.
- YOU CAN HAVE ANY NUMBER OF UNIQUE CONSTRAINT PER TABLE, UNLIKE PRIMARY KEY.
- e.g Mobile number
```sql
create table emp
(
empno char(4),
ename varchar(25),
sal float,
deptno int,
mobi_no char(15) unique,
unique(deptno, empno)
);
```
```sql
select * from information_schema.table_constraints;
select * from information_schema.table_constraints
where table_schema = 'cdeacmumbai';
select * from information_schema.key_column_usage
where table_name = 'emp';
```
```sql
show indexes from emp;
--mob_no
--deptno
```
- Unique constraint is index
- To DROP it
```sql
drop index mob_no on emp;
drop index deptno on emp;
```
- To add unique constraint to existing table
```sql
alter table emp add constraint u_emp_mob_no unique(mob_no);
constraint u_emp_mob_no --constraint constraintName
constraint u_emp_mob_no --optional
```
- Column level constraint can be defined as table level constraint except NON NULL constraint
- But table level composit constraint cannot be defined as column level constraint
```sql
create table emp
(
empno char(4),
ename varchar(25),
sal float,
deptno int,
mobi_no char(15),
unique(deptno, empno),
unique(mob_no)
);
```
- Most developers prefer this, it make the CREATE table command more readable
- Column level constraint can be specified at table level (end of structure), except for NOT NULL constraint which is always a column level constraint and therefore the syntax will not support you from specifying it at table level

- 1 Column can have more than 1 constraint. e.g. PRIMARY KEY & FOREIGN KEY, NOT NULL and UNIQUE
```
Solution for Candidate KEY
not null constraint + unique index
OR
not null constraint + unique constraint
```
- With help of above logic, indirectly you can have multiple PRIMARY KEY in the table; one directly, the remaining indirectly

ALTERNATE KEY -> is not constraint
ALTERNATE KEY -> is defination
ALTERNATE KEY -> for Candidate KEY column, if you give it a NOT NULL constraint + unique index/constraint, then it becomes an alternative to PRIMARY KEY, then such a Candidate KEY column is known as ALTERNATE KEY

SUPER KEY -> is not a constraint
SUPER KEY -> is defination
SUPER KEY -> if you have 1 or more alternate keys in table, then the PRIMARY KEY is also known as SUPER KEY


**Lost 15 mins**

### Foreign KEY
- Foreign column (column that is coming/derived from elsewhere)
- Column or set of columns that refernce from a column or set of column of some table
- Foreign key constraint is specified on the chield column (not the parent column)
- Parent column has to be PRIMARY KEY or UNIQUE (this is pre-requisite for Foreign key)
- Foreign key will allow duplicate values
- Foreign key will allow null values also 
- Foreign key may reference column of same table also (known as self-referencing) (parent column & child column both are present in the same table)

```sql
create table dept(
deptno int PRIMARY KEY,
dname varchar(15),
loc varchar(10)
);

```
```sql
create table emp(
empno char(4) PRIMARY KEY,
ename varchar(25),
sal float,
mgr char(4),
constraint fk_emp_deptno foreign key(deptno)
reference dept(deptno),
constraint fk_emp_mgr foreign key(mgr)
reference emp(empno)
);
```
- To DROP
```sql
alter table emp drop Foreign KEY fk_emp_deptno;
```
- To ADD again
```sql
alter table emp add Foreign KEY(deptno) reference dept(deptno);
```
- To disable the foreign KEY constraint
```sql
--for current connection
set Foreign_key_checks = 0;
set Foreign_key_checks = 1;
```
- To disable the foreign KEY constraint for all connection
```sql
--for all connection
set global Foreign_key_checks = 0;
set global Foreign_key_checks = 1;
```
- You cannot delete parent row when child row exists
- ON DELETE CASCADE -> If you delete the parent row then, MySQL will automatically delete the child rows as well
```sql
create table emp(
empno char(4) PRIMARY KEY,
ename varchar(25),
sal float,
mgr char(4),
constraint fk_emp_deptno foreign key(deptno)
reference dept(deptno) on delete cascade,
constraint fk_emp_mgr foreign key(mgr)
reference emp(empno)
);
```

- ON UPDATE CASCADE -> If you update the parent row then, MySQL will automatically update the child rows as well
```sql
create table emp(
empno char(4) PRIMARY KEY,
ename varchar(25),
sal float,
mgr char(4),
constraint fk_emp_deptno foreign key(deptno)
reference dept(deptno) on delete cascade on update cascade,
constraint fk_emp_mgr foreign key(mgr)
reference emp(empno)
);
```
- If you want to retain child rows
```sql
update emp set deptno = null where deptno = 2;
delete from dept where deptno =2;

update dept set deptno = 4 where deptno = 2;
```
- First it inserts, then it checks for the constraint; and it will allow
- constraint is deffered, post-insert
- First it inserts, then it checks for the constraint; then it will Rollback and give an error
- If "delete from emp where empno = 1;"
- avoid on delete cascade in the event of self-referencing; you may delte more rows than expected.


# D9

D9.1 Check Constraints

## CHECK CONSTRAINT
- Used for validations (used for checking purposes)
```sql
create table emp(
empno int auto_increament primary key,
sal float default 7000
	check(sal between 5001 and 2999999),
deptno int reference dept(deptno),
status char(1) default 't'
	check(status in('T', 'P', 'R')),
comm float not null,
mob_no char(15) unique,
check(sal+comm <5000000)
);
```
```Statsus: T-> Temporary, P->Permenant, R-> Retired```
- DEFAULT is not a contraint
- DEFAULT is clause that you can use with CREATE TABLE
- If you enter some value, then it will take tahat value; if nothing is specified, then it'll take default value
- To make use of DEFAULT value & AUTO_INCREAMENT, use of following INSERT statement
```sql
insert into emp(ename, deptno, comm, mob_no)
value(................);
```
- AUTO_INCREAMENT
	- By default is start from 1, by default it increaments by 1

```	
Relational Operators
Logical Operators
Arithmatic Operators
Special Operators, e.g.
BETWEEN, IN, LIKE, etc.
Can call Single-Row function, e.g.
UPPER, ROUND, etc.
```
```sql
insert intoemp(ename, sal) value('A', 5000);
insert intoemp(ename, sal) value('B', 6000);
insert intoemp(ename, sal) value('C', 7000);
exit;
insert intoemp(ename, sal) value('C', 6000);
```
- Rollback & Commit have no effect on auto_increament (it has been designed in this manner on purpose keep in view a multi-use evironment)

#### To avoid the problem of missing number
- Do not issue the INSERT statement to database at time of data entry; when user does the data entry, you store the rows in an array; when use issues a commit, you issue the INSERT statement to database followed by COMMIT

D9.2 Privileges

## PRIVILEGES
- DDL	1. GRANT 2. REVOKE
		EMP Table						USER Table
EMONO	ENAME	SAL		DEPTNO		USER	DATABASE
1		A		5000	1			Scott	USA
2		B		6000	1			Soham	PUNE
3		C		7000	1			
4		D		9000	2			
5		E		8000	2	

```sql
root_mysql> grant select on cdacmumbai.emp to scott@localhost;
--No need to grant separate permission for index, once select privilege is given, it'll us index automatically
root_mysql> grant insert on cdacmumbai.emp to scott@localhost;
root_mysql> grant update on cdacmumbai.emp to scott@localhost;
root_mysql> grant delete on cdacmumbai.emp to scott@localhost;
root_mysql> grant select,insert on cdacmumbai.emp to scott@localhost;
root_mysql> grant all privileges on cdacmumbai.emp to scott@localhost, king@localhost;
grant select on cdacmumbai.emp to public; --open to all
revoke select on cdacmumbai.emp to scott@localhost;
```
```sql
select * from information_schema.table_privileges;
```

![Priv](/DBT/D9/Privileges.png)

```sql
--Not if scott@localhost want to perform action on table in cdacmumbai
mysql> use usa;
mysql> select * from cdacmumbai.emp;
mysql> insert into cdacmumbai.emp ....;
mysql> update cdacmumbai.emp set ....;
mysql> delete from cdacmumbai.emp where ....;
mysql> 
```
```sql
create user amit@localhost identified by 'student';
create user amit@'%' identified by 'student';
create user amit@l'd%' identified by 'student';
create user amit@l'paresh' identified by 'student';
create user amit@l'joshi%' identified by 'student';
```

## SYSTEM TABLES
- These are MySQL created
- automatically created when you install MySQL
- 78 system tables in MySQL v9
- set of system tables is also knwon as DATABASE CATALOG
- set of system tables is also knwon as DATABASE DICTIONARY
- Stored in information_schema
```sql
use information_schema;
show tables;
```

- Stystem tables store complete information about the database
- E.g. statistics (for indexes), table_constraints, key_column_usgae, table_privileges, etc.
- DBA -> DATABASE ADMINISTRATOR
- All the system tables are READ_ONLY
- DDL FOR USER IS DML FOR SYSTEM TABLES

Data is of 2 types
1. User Data
	- User created
	- User tables & indexes
2. System Data
	- MySQL created
	- data is stored in System Tables
	- Also knwon as Metadata (Data about data)

![Arch](/DBT/D9/DB%20Architecture.png)

Something is based on Linux Kernel

## Stored Objects
- Objects that are stored in the DATABASE
	- e.g. CREATE ... tables, indexes; VIEWS, etc
- Anything that you do with CREATE Command is a stored object

### VIEWS
- Present in all RDBMSs and some of DBMS(Foxpro, excel)
- View is a handle to a table
- Stores the address of the table
- View is a HardDisk(HD) pointer -> Stores the address of table <- also known as LOCATOR
- Used for indirect access to the table
- Used for SECURITY Purposes
- Used to restrict access of users
- Max 30 characters
- View name - table name cannot be same
```sql
--To create a view
create view viewname ...;
```
```sql
--To create a view
create view viewname v1
	as
	select empno, ename from emp;
--OUTPUT -> View Created.
```
- Stored query V1=select empno, ename from emp
- Amit wants to share this view to scott
	```sql
	root_mysql> grant select on cdacmumbai.v1 to scott@localhost;
	- Here instead of giving access to table directly, we give access to restricted view of table
	```
- Now to access table scott have to 
```sql
root_mysql> select * from cdacmumbai.emp; --Wrong
root_mysql> select * from cdacmumbai.v1;	--Right
```
- View doesn't contain data, only the definition is store
- View is stored query
- SELECT statement on which the view is based, it is stored in the DB in COMPILED FORMAT
- View is executable format of SELECT statement
- Hence Execution will be fast
- Benifit of COMPILED FORMAT is hiding source code from end user
```sql
grant select, insert on cdacmumbai.v1 to scott@localhost
insert into cdacmumbai.v1 values(6, 'F');
```
- DML operations can be performed on View
- DML operations done on a view will affect the base table
- Constraints that are specified on table will enforced even when you insert via the view
- ENTIRE APPLICATION IS BASED ON VIEWS 
```sql
drop view v1;
```
```sql
create view v2
	as
select * emp where deptno = 1;
--used to restrict the row access
insert into v2 value(6, 'F', 6000, 2); --Allow
```
```sql
create view v2
	as
select * emp where deptno = 1 with check option;
--used to restrict the row access
insert into v2 value(6, 'F', 6000, 2); --ERROR
```
- View with check option is similar to check constraint
- Used to enforce different checks for different users
To change SELECT statement of view
```sql
drop view v1;
create view v1 as ......;
```
```sql
drop view v1;
create or replace view v1
as
select ename, sal emp;
```
```sql
drop view v1;
create view v1 as ......;
```
- Show Table
	- Will show tables & views but it won't tell which is table & which is View   
	To find out which is table & which is View
	```sql
	show full tables;
	desc emp; desc v1;
	```

#### View based on fake columns
<table>
<tr>
<td>

```sql
create or replace view v1
	as
select * upper(ename) "u_ename", sal*12 "Annual" from emp;
```
- View based on computed column, expression, function, order by clause, gourp by clause, etc.
- You can select from this view
- DML operations are not allowed
- Common for all RDBMS

</td>
<td>

```sql
create or replace view v1
	as
select dname, ename from emp, dept
where dept.deptno = emp.deptno;
```
- View based on join, sub-query, UNION, etc.
- You can select from this view
- DML operations are not allowed
- Common for all RDBMS

</td>
</tr>
</table>

- To see select statement on which view is based
```sql
show create view v1;
V1 = select .....
--Will get to see which select statement is used
```

#### View based on view is allowed
Users
	- To exceed the limit is allowed
		- UNION > 255 SELECT statements
		- Sub-query > 255 levels
		- Function withing function > 255 levels
	- To simplify the writing of complex SELECT statements
		- Join of 40 tables
		- Complex queries can be stored in view definition

# D10

YET TO UPDATE THIS NOTES

### PROGRAMMING
- Setting output table tempp
```sql
create table tempp(
fir int
sec char(15)
);
```
<table>
<tr>
<td>

```sql
delimiter //
create procedure abc()
Begin
	isnert into tempp values(1, 'Hello');
end; //
delimiter ;
```
</td>
<td>

```sql
--To call the stored procedure 
call abc();
select * from tempp;
commit;
OUTPUT
FIR		SEC
1		Hello
```
</td>
</tr>
</table>

- MySQL will READ -> COMPILE -> PLAN -> STORE in BD in COMPILED FORMAT the Procedural

- To DROP Procedure
```sql
drop procedure abc;
```

<table>
<tr>
<td>

```sql
delimiter //
create procedure abc()
begin
	declare x int;
	set x = 10;
	--declare x int default 10;
	insert into tempp values(x, 'inside abc');
end; //
delimiter ;
```
</td>
<td>

```sql
declare x int; --<- local var declaration
--All variables to be declared at top. When you don't initialize var, it stores NULL value
set x = 10; --<- Assignment operator
declare x int default 10; --<- Declared var and assigned value simultaneously

call abc();
select * from tempp;
commit;
OUTPUT
FIR		SEC
10		inside abc
```
</td>
</tr>
</table>

MySQL uses SQL, MySQL, MySQL-PL Compiler to compiler

<table>
<tr>
<td>

```sql
delimiter //
create procedure abc()
begin
	declare x char(15) default 'CDAC';
	insert into tempp values(1, x);
end; //
delimiter ;
```
</td>
<td>

```sql
call abc();
select * from tempp;
commit;
OUTPUT
FIR		SEC
1		CDAC
```
</td>
</tr>
</table>


<table>
<tr>
<td>

```sql
delimiter //
create procedure abc()
begin
	declare x char(15) default 'KING';
	default y float default 3000;
	default z float default 0.4;
	default hra float;
	set hra = y*z;
	insert into tempp value(y, x);
	insert into tempp value(hra, 'HRA');
end; //
delimiter ;
```
</td>
<td>

```sql
call abc();
select * from tempp;
commit;
OUTPUT
FIR		SEC
3000	KING
1200	HRA
-->INT to FLOAT - implicit datatype conversion
-->FLAOT to INT - rounding takes place, implicit datatype conversion
```
</td>
</tr>
</table>

<table>
<tr>
<td>

```sql
delimiter //
create procedure abc(x char(15), y float, z float)
begin
	declare hra float;
	set hra y*z;
	insert into tempp value(y, x);
	insert into tempp value(hra, 
end; //
delimiter ;
```
</td>
<td>

```sql
--To make it flexible you can pass parameters to a procedure
call abc('KING', 3000, 0.4);
call abc('SCOTT', 2500, 0.3);
select * from tempp;
commit;
OUTPUT
FIR		SEC
3000	KING
1200	HRA
2500	SCOTT
750		HRA
```
</td>
</tr>
</table>

- Comments are known as Internal Documentation
- You must have a comment, minimum every 2 statements
- To see which all procedure are created or present
```sql
show procedure status;
--Show all procedures in all databases
show procedure status where db = 'cdacmumbai';
show procedure status where name like 'a%';
```
```sql
--To view the source code of stored procedure
show create procedure abc;
```
```sql
--To share the procedure with other users
grant execute on procedure
cdacmumbai.abc to rohit@localhot;
--When rohit calls procedure
call cdacmumbai.abc();
--To revoke  other users
revoke execute on procedure
cdacmumbai.abc from rohit@localhot;
--can share with multiple user using comma separate or public as well
```
```sql
--To change the source code
drop procedure abc;
create procedure abc()
```

ENAME	SAL		JOB		DEPTNO
SCOTT	3000	CLEAR		10
KING	5000	MANAGER		20

<table>
<tr>
<td>

```sql
delimiter //
create procedure abc()
begin
	declare x int;
	declare hra float;
	select sal into x from emp
	where ename = 'KING';
	set hra x*0.5;
	/*processing, e.g. set hra = 0.4, etc*/
	insert into tempp values(x, 'KING');
	insert into temp values(hra, 'HRA');
end; //
delimiter ;
```
</td>
<td>

```sql
/*SELECT columnname INTO var FROM table
WHERE .....;*/
/*CAUTION
datatype of columnname & var should match
Make sure KING is there in table
Make sure there is no duplicate values*/
call abc();
select * from tempp;
commit;
OUTPUT
FIR		SEC
5000	KING
2500	HRA
```
</td>
</tr>
</table>

<table>
<tr>
<td>

```sql
delimiter //
create procedure abc(y char(15))
begin
	declare x int;
	declare hra float;
	select sal into x from emp
	where ename = y;
	set hra x*0.5;
	insert into tempp values(x, y);
	insert into temp values(hra, 'HRA');
end; //
delimiter ;
```
</td>
<td>

```sql
call abc('KING');
call abc('SCOTT');
select * from tempp;
commit;
OUTPUT
FIR		SEC
5000	KING
2500	HRA
3000	SCOTT
1500	HRA
```
</td>
</tr>
</table>

<table>
<tr>
<td>

```sql
delimiter //
create procedure abc(z char(15))
begin
	declare x int;
	declare y char(15);
	declare hra float;
	select sal, job into x,y from emp
	where ename = z;
	set hra x*0.5;
	insert into tempp values(x, y);
	insert into temp values(hra, z);
end; //
delimiter ;
```
</td>
<td>

```sql
/*SELECT col1, col2,..,coln INTO var1, var2,..,varn FROM table
WHERE ....;*/
call abc('KING');
call abc('SCOTT');
select * from tempp;
commit;
OUTPUT
FIR		SEC
5000	MANAGER
2500	KING
3000	CLERK
1500	SCOTT
```
</td>
</tr>
</table>

#### DECISION MAKING
##### IF Statement
```
ENAME	SAL
KING	5000
```
<table>
<tr>
<td>

```sql
delimiter //
create procedure abc()
begin
	declare x int;
	select sal into x from emp
	where ename = 'KING';
	if x>4000 then
		insert into tempp values(x, 'High sal');
	elseif x<4000 then
		insert into tempp values(x, 'Low sal');
	else
		insert into tempp values(x, 'Medium sal');	
	end if;
end; //
delimiter ;
```
</td>
<td>

```sql
/*
if (confition is satisfied) then
	--statements;
elseif (confition is satisfied) then
	--statements;
else
	--statements;
 end if;
*/
call abc();
select * from tempp;
commit;
OUTPUT
FIR		SEC
5000	High sal
```
</td>
</tr>
</table>

<table>
<tr>
<td>

```sql
delimiter //
create procedure abc()
begin
	declare x boolean default true;
	if x then
		insert into tempp values(1, 'Mumbai');
	end if;
end; //
delimiter ;
```
</td>
<td>

```sql
--Boolean is logical datatype, upper/lower allowed
--Can directly use in boolean var by itself as condition for IF statement
--Can use logical NOT in front of var e.g. "NOT x" 
call abc();
select * from tempp;
commit;
OUTPUT
FIR		SEC
1		Mumbai
```
</td>
</tr>
</table>

##### LOOPS
- For repetitive/iterative processing

##### WHILE LOOPS
- Check for some condition before entering the loop
```sql
--Syntax
WHILE condition DO
	statements;
END WHILE;
```

<table>
<tr>
<td>

```sql
delimiter //
create procedure abc()
begin
	declare x default 1;
	while x<10 do
		insert into tempp values(x, 'in While loop');
		set x = x+1;
	end while;
end; //
delimiter ;
```
</td>
<td>

```sql
call abc();
select * from tempp;
commit;
OUTPUT
FIR		SEC
1		in While loop
2		in While loop
3		in While loop
...
9		in While loop
```
</td>
</tr>
</table>
WARNING: It can go in infinite loop on SERVER, it need to killed in SERVER END   
- WhatsApp uses infinite loop to check if new msg is arrived

##### REPEAT LOOP (Similar to DO WHILE)
- No condition to enter the loop
- But there is condition to exit the loop
- It'll execute atleast once, e.g. outerjoin

```sql
--Syntax
REPEAT
	statements;
UNTIL condition
END REPEAT;
```

<table>
<tr>
<td>

```sql
delimiter //
create procedure abc()
begin
	declare x int default 1;
	REPEAT
		insert into tempp values(x, 'in loop');
		set x = x+1;
	UNTIL x>5
	END REPEAT;
end; //
delimiter ;
```
</td>
<td>

```sql
call abc();
select * from tempp;
commit;
OUTPUT
FIR		SEC
1		in loop
2		in loop
...
5		in loop
```
</td>
</tr>
</table>

##### LOOP, LEAVE, ITERATE STATEMENTS

##### LEAVE
- Allows you to exit the loop (similar to 'break' statement)
##### ITERATE
- Allows you to skip entire code under it and start new iteration (Similar to 'continue' statement)
##### LOOP
- Executes a block of code repeatedly with an addition flexibility of using loop label

<table>
<tr>
<td>

```sql
delimiter //
create procedure abc()
begin
	declare x int defaul 1;
	pqr_loop:loop
		if x>10 then
			leave pqr_loop;
		end if;
		set x = x+1;
		if mod(x,2) !=0 then
			iterate pqr_loop;
		else
			insert into tempp values(x, 'inside loop');
		end if;
	end loop;
end; //
delimiter ;
```
</td>
<td>

```sql
--If I multi-level nested loop, I can skip middle loops & go directly to mentioned loop
--In deeply nested loops, going from innermost loop to a point outside side the outermost loop; leave would be the fastest way of doing it
call abc();
select * from tempp;
commit;
OUTPUT
FIR		SEC
2		inside loop
4		inside loop
...
10		inside loop
```
</td>
</tr>
</table>

#### GLOBAL VARIABLES
```sql
--command prompt
set @x = 10;
--It remains in Server RAM till you exit/end you session
```
```sql
select @x from dual;
--OUTPUT -> 10
```
- Global variables can be used in SELECT, INSERT, UPDATE, DELETE statements & MySQL-PL programs also
- There is no need to declare datatype for it. It'll consider it automatically.
- **Can be used in front-end s/w as well**
```sql
set @x = 'CDAC';
set @x = '1990-03-23';
--It remains in Server RAM till you exit/end you session
```

<table>
<tr>
<td>

```sql
delimiter //
create procedure abc()
begin
	declare x default 1;
	insert into tempp values(x, 'before sub')
	begin
		declare x int default 2;
		insert ...... (x, 'in sub');
	end;
	insert ......... (x, 'out of sub');
end; //
delimiter ;
```
</td>
<td>

```sql
call abc();
select * from tempp;
commit;
OUTPUT
FIR		SEC
1		before sub
2		in sub
1		out sub
```
</td>
</tr>
</table>