D2.1 SQL
# **SQL - Structured Query Language**
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
- Blob -> Binary large object
	- 
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



# Exercise
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