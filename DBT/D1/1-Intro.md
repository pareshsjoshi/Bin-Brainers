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
