D11.1 Cursor

## Cursor

- Cursor is based on select statement
- Select statement on which cursor is based could be anything, e.g. select col1, col2,...coln, where clause order by clause, group by clause, etc.
- You can have cursor based on join, subqueries, set operators, view, etc
- You can have cursor based on computed column, expression, function, etc
- Cursor is READ ONLY variable, it cannot be manipulated
- You will have to fetch 1 row at a time into some intermediate variables, and do you processing with those variables
- You can only fetch sequentially (top to bottom)
- You cannot fetch backwards in MySQL cursor
- You can only fetch 1 row at a time
- Declare a continue handler for not found event
- NOT FOUND is cursor attributel it returns a boolean TRUE value if the last fetch was unsuccessful, and false value if the last fetch was successful

```sql
--Syntax
delimiter //
create procedure abc()
begin
	declare a int;
	declare b varchar(15);
	declare c int;
	declare d int;
	declare x int default 0;
	declare c1 cursor for select * from emp;
	open c1;
	while x < 5 do
		fetch c1 into a, b, c, d;
		 /* processing, e.g. set hra = c*0.4, etc. */
		insert into tempp values(a, b);
		set x = x+1;
	end while;
	close c1;
end; //
delimiter ;
```

empno	ename	sal		deptno
1		A		5000	1
2		B		6000	1
3		C		7000	1
4		D		9000	2
5		E		8000	2

<table>
<tr>
<td>

```sql
delimiter //
create procedure abc()
begin
	declare a int;
	declare b varchar(25);
	declare c int;
	declare d int;
	declare x int default 1;
	declare cursor for select * from emp;
	open c1;
	while x < 6 do --<- Try for 3/4 letter
	--while x < 11 this is going to give an error
		fetch c1 into a,b,c,d;
		--processing
		insert into tempp values(a,b);
		set x = x+11;
	end while;
	close c1;
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
1		A
2		B
3		C
4		D
5		E
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
	declare a int;
	declare b varchar(25);
	declare c int;
	declare d int;
	declare x int default 1;
	declare y int;
	declare cursor for select * from emp;
	select count(*) into y from emp;
	open c1;
	while x < y do
		fetch c1 into a,b,c,d;
		--processing
		insert into tempp values(a,b);
		set x = x+11;
	end while;
	close c1;
end; //
delimiter ;
```
</td>
<td>

```sql
Generalised Cursor Syntax For N Rows especially for solving the while loop problem
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
	declare a int;
	declare b varchar(25);
	declare c int;
	declare d int;
	declare y int default 0;
	declare cursor for select * from emp;
	declare continue handler for not found set y = 1;
	open c1;
	cursor_c1_loop:loop
		fetch c1 into a,b,c,d;
		if y = 1 then
			leave cursor_c1_loop;
		end if;
		--processing
		insert into tempp values(a,b);
	end loop cursor_c1_loop;
	close c1;
end; //
delimiter ;
```
</td>
<td>

```sql
Generalised for  
call abc();
select * from tempp;
commit;
OUTPUT
FIR		SEC
1		A
2		B
3		C
4		D
5		E
```
</td>
</tr>
</table>


<table>
<tr>
<td>

```sql
delimiter //
create procedure abc(dd int)
begin
	declare a int;
	declare b varchar(25);
	declare c int;
	declare d int;
	declare y int default 0;
	declare cursor for select * from emp where deptno = dd;
	declare continue handler for not found set y = 1;
	open c1;
	cursor_c1_loop:loop
		fetch c1 into a,b,c,d;
		if y = 1 then
			leave cursor_c1_loop;
		end if;
		--processing
		insert into tempp values(a,b);
	end loop cursor_c1_loop;
	close c1;
end; //
delimiter ;
```
</td>
<td>

```sql
call abc(1);
call abc(2);
select * from tempp;
commit;
OUTPUT
FIR		SEC
1		A
2		B
3		C

4		D
5		E
```
</td>
</tr>
</table>


<table>
<tr>
<td>

```sql
delimiter //
create procedure abc(dd int, ss int)
begin
	declare a int;
	declare b varchar(25);
	declare c int;
	declare d int;
	declare y int default 0;
	declare cursor for select * from emp
	where deptno = dd & sal > ss;
	declare continue handler for not found set y = 1;
	open c1;
	cursor_c1_loop:loop
		fetch c1 into a,b,c,d;
		if y = 1 then
			leave cursor_c1_loop;
		end if;
		--processing
		insert into tempp values(a,b);
	end loop cursor_c1_loop;
	close c1;
end; //
delimiter ;
```
</td>
<td>

```sql
call abc(1, 5000);
call abc(2, 6000);
select * from tempp;
commit;
OUTPUT
FIR		SEC
2		B
3		C
4		D
5		E

3		C
4		D
5		E
```
</td>
</tr>
</table>

#### USES
1. For locking the rows manually
2. For storing/processing multiple rows

- To lock the rows manually
```sql
delimiter //
create procedure abc()
begin
	declare c1 cursor for select * from emp for update;
	open c1;
	close c1;
end; //
delimiter ;
--Use WHERE clause to lock specific rows
call abc();
``` 
- Locks are automatically released when you rollback or commit
