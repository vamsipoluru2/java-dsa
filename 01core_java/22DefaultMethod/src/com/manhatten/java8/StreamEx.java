//PROBLEM 2
//
//				PROBLEM STATEMENT:
//
//	DATA BASE TO MANAGE THE INSURANCE OF A VEHICLE . THE RELATIONS WITH THEIR RESPECTIVE ATTRIBUTES ARE SHOWN BELOW.
//
//schema  	
//
//The table PERSON contains the attributes namely driver_id, name & address where the primary key is driver_id.
//
// 	The table CAR contains the attributes such as model, year & register number where the primary key is register number.
//
//
// 	The table ACCIDENT contains the attributes such as report number, date &location where the primary key is report number.
//
// 	The table OWNS contains the attributes driver id & regno, both the attributes are foreign key &they together constitute the composite key.
//
//
// 	The table PARTICIPATED contains the attributes driver id, regno, report number & damage amount. Here driver id , regno , report number are foreign keys and they constitute the composite key
//
//
//
//PERSON (DRIVER ID, NAME, ADDRESS)
//CAR (REGNO, MODEL, YEAR)
//ACCIDENT (REPORTNO,DATE,LOCATION)
//OWNS(DRIVERID,REGNO)
//PARTICIPATED(DRIVERID,REGNO,REPORTNO,DAMAGEAMOUNT)
//
//
//mysql> use acko.org;
//ERROR 1049 (42000): Unknown database 'acko.org'
//mysql> use acko_org;
//Database changed
//mysql> CREATE TABLE PERSON (
//    ->     DRIVER_ID INT PRIMARY KEY,
//    ->     NAME VARCHAR(20),
//    ->     ADDRESS VARCHAR(50)
//    -> );
//Query OK, 0 rows affected (0.04 sec)
//
//
//
//mysql> CREATE TABLE CAR (
//    ->     REGNO INT PRIMARY KEY,
//    ->     MODEL VARCHAR(30),
//    ->     YEAR YEAR
//    -> );
//Query OK, 0 rows affected (0.04 sec)
//
//
//
//mysql> CREATE TABLE ACCIDENT (
//    ->     REPORTNO INT PRIMARY KEY,
//    ->     DATE DATE,
//    ->     LOCATION VARCHAR(50)
//    -> );
//Query OK, 0 rows affected (0.04 sec)
//
//
//
//mysql> CREATE TABLE OWNS (
//    ->     DRIVERID INT,
//    ->     REGNO INT,
//    ->     PRIMARY KEY (DRIVERID, REGNO),
//    ->     FOREIGN KEY (DRIVERID) REFERENCES PERSON(DRIVER_ID),
//    ->     FOREIGN KEY (REGNO) REFERENCES CAR(REGNO)
//    -> );
//Query OK, 0 rows affected (0.06 sec)
//
//
//
//mysql> CREATE TABLE PARTICIPATED (
//    ->     DRIVERID INT,
//    ->     REGNO INT,
//    ->     REPORTNO INT,
//    ->     DAMAGEAMOUNT INT,
//    ->     PRIMARY KEY (DRIVERID, REGNO, REPORTNO),
//    ->     FOREIGN KEY (DRIVERID) REFERENCES PERSON(DRIVER_ID),
//    ->     FOREIGN KEY (REGNO) REFERENCES CAR(REGNO),
//    ->     FOREIGN KEY (REPORTNO) REFERENCES ACCIDENT(REPORTNO)
//    -> );
//Query OK, 0 rows affected (0.07 sec)
//
//
//
//mysql> INSERT INTO PERSON (driver_id, name, address) VALUES
//    -> (1, 'Arun', 'Chennai'),
//    -> (2, 'Bhanu', 'Hyderabad'),
//    -> (3, 'Charan', 'Bangalore');
//Query OK, 3 rows affected (0.02 sec)
//Records: 3  Duplicates: 0  Warnings: 0
//
//
//
//mysql> INSERT INTO CAR (regno, model, year) VALUES
//    -> (101, 'Maruti', 2001),
//    -> (102, 'Hyundai', 2002),
//    -> (103, 'Honda', 2003);
//Query OK, 3 rows affected (0.02 sec)
//Records: 3  Duplicates: 0  Warnings: 0
//
//
//
//mysql> INSERT INTO ACCIDENT (reportno, date, location) VALUES
//    -> (150, '2002-05-12', 'Chennai'),
//    -> (160, '2002-09-23', 'Hyderabad'),
//    -> (210, '2003-03-14', 'Bangalore');
//Query OK, 3 rows affected (0.02 sec)
//Records: 3  Duplicates: 0  Warnings: 0
//
//
//
//mysql>
//mysql> -- OWNS
//mysql> INSERT INTO OWNS (driver_id, regno) VALUES
//    -> (1, 101),
//    -> (2, 102),
//    -> (3, 103);
//ERROR 1054 (42S22): Unknown column 'driver_id' in 'field list'
//
//
//mysql>
//mysql> -- PARTICIPATED
//mysql> INSERT INTO PARTICIPATED (driver_id, regno, reportno, damageamt) VALUES
//    -> (1, 101, 150, 5000),
//    -> (2, 102, 160, 7000),
//    -> (3, 103, 210, 10000);
//ERROR 1054 (42S22): Unknown column 'driver_id' in 'field list'
//
//]
//mysql> INSERT INTO OWNS (driverid, regno) VALUES(1, 101), (2, 102), (3, 103);
//Query OK, 3 rows affected (0.02 sec)
//Records: 3  Duplicates: 0  Warnings: 0
//
//
//
//mysql>  INSERT INTO PARTICIPATED (driverid, regno, reportno, damageamount) VALues (1, 101, 150, 5000),
//    -> (2, 102, 160, 7000),
//    -> (3, 103, 210, 10000);
//Query OK, 3 rows affected (0.02 sec)
//Records: 3  Duplicates: 0  Warnings: 0
//
//
// additional records for better output
//mysql> INSERT INTO PERSON (driver_id, name, address) VALUES
//    -> (4, 'Divya', 'Delhi'),
//    -> (5, 'Eshan', 'Mumbai'),
//    -> (6, 'Farah', 'Kolkata'),
//    -> (7, 'Gopal', 'Pune');
//Query OK, 4 rows affected (0.02 sec)
//Records: 4  Duplicates: 0  Warnings: 0
//
//mysql> INSERT INTO CAR (regno, model, year) VALUES
//    -> (104, 'Toyota', 2002),
//    -> (105, 'Ford', 2002),
//    -> (106, 'Hyundai', 2003),
//    -> (107, 'Maruti', 2003);
//Query OK, 4 rows affected (0.02 sec)
//Records: 4  Duplicates: 0  Warnings: 0
//
//mysql> INSERT INTO ACCIDENT (reportno, date, location) VALUES
//    -> (220, '2002-06-18', 'Delhi'),
//    -> (230, '2002-08-05', 'Mumbai'),
//    -> (240, '2003-04-20', 'Kolkata'),
//    -> (250, '2003-11-15', 'Pune');
//Query OK, 4 rows affected (0.02 sec)
//Records: 4  Duplicates: 0  Warnings: 0
//
//mysql> INSERT INTO OWNS (driverid, regno) VALUES
//    -> (4, 104),
//    -> (5, 105),
//    -> (6, 106),
//    -> (7, 107);
//Query OK, 4 rows affected (0.02 sec)
//Records: 4  Duplicates: 0  Warnings: 0
//
//mysql> INSERT INTO PARTICIPATED (driverid, regno, reportno, damageamount) VALUES
//    -> (4, 104, 220, 6000),
//    -> (5, 105, 230, 9000),
//    -> (6, 106, 240, 4000),
//    -> (7, 107, 250, 12000),
//    -> (1, 101, 220, 3000),  -- Arun also in another accident
//    -> (2, 102, 230, 2000);
//Query OK, 6 rows affected (0.02 sec)
//Records: 6  Duplicates: 0  Warnings: 0
//
//
//
//table: 
//mysql> show * from accident;
//ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '* from accident' at line 1
//mysql> select * from accident;
//+----------+------------+-----------+
//| REPORTNO | DATE       | LOCATION  |
//+----------+------------+-----------+
//|      150 | 2002-05-12 | Chennai   |
//|      160 | 2002-09-23 | Hyderabad |
//|      210 | 2003-03-14 | Bangalore |
//|      220 | 2002-06-18 | Delhi     |
//|      230 | 2002-08-05 | Mumbai    |
//|      240 | 2003-04-20 | Kolkata   |
//|      250 | 2003-11-15 | Pune      |
//+----------+------------+-----------+
//7 rows in set (0.00 sec)
//
//mysql> select * from car;
//+-------+---------+------+
//| REGNO | MODEL   | YEAR |
//+-------+---------+------+
//|   101 | Maruti  | 2001 |
//|   102 | Hyundai | 2002 |
//|   103 | Honda   | 2003 |
//|   104 | Toyota  | 2002 |
//|   105 | Ford    | 2002 |
//|   106 | Hyundai | 2003 |
//|   107 | Maruti  | 2003 |
//+-------+---------+------+
//7 rows in set (0.00 sec)
//
//mysql> show * from participation;
//ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '* from participation' at line 1
//mysql> select * from participation;
//ERROR 1146 (42S02): Table 'acko_org.participation' doesn't exist
//mysql> select * from participated;
//+----------+-------+----------+--------------+
//| DRIVERID | REGNO | REPORTNO | DAMAGEAMOUNT |
//+----------+-------+----------+--------------+
//|        1 |   101 |      150 |        10000 |
//|        1 |   101 |      220 |         3000 |
//|        2 |   102 |      160 |         7000 |
//|        2 |   102 |      230 |         2000 |
//|        3 |   103 |      210 |        10000 |
//|        4 |   104 |      220 |         6000 |
//|        5 |   105 |      230 |         9000 |
//|        6 |   106 |      240 |         4000 |
//|        7 |   107 |      250 |        12000 |
//+----------+-------+----------+--------------+
//9 rows in set (0.00 sec)
//
//
//
//
// 1)	Query to update the damage amount for the  car with a specific register number in the accident with report number  between 1 & 200.
//
//
//A} mysql> SELECT * FROM PARTICIPATED WHERE regno = 101 AND reportno BETWEEN 1 AND 200;
//+----------+-------+----------+--------------+
//| DRIVERID | REGNO | REPORTNO | DAMAGEAMOUNT |
//+----------+-------+----------+--------------+
//|        1 |   101 |      150 |        10000 |
//+----------+-------+----------+--------------+
//without report no
//mysql> SELECT * FROM PARTICIPATED WHERE reportno BETWEEN 1 AND 200;
//+----------+-------+----------+--------------+
//| DRIVERID | REGNO | REPORTNO | DAMAGEAMOUNT |
//+----------+-------+----------+--------------+
//|        1 |   101 |      150 |        10000 |
//|        2 |   102 |      160 |         7000 |
//+----------+-------+----------+--------------+
//
//
//
//2) 	Query to find the total number of people who owned the cars that were involved in accidents in 2002
//
//.mysql> SELECT COUNT(DISTINCT o.driverid) AS total_people
//    -> FROM OWNS o
//    -> JOIN PARTICIPATED p ON o.driverid = p.driverid AND o.regno = p.regno
//    -> JOIN ACCIDENT a ON p.reportno = a.reportno
//    -> WHERE YEAR(a.date) = 2002;
//+--------------+
//| total_people |
//+--------------+
//|            4 |
//+--------------+
//1 row in set (0.02 sec)
//
//
//3) 	Query to find the number of accidents in which cars belonging to a specific model were involved.
//
//
//mysql> SELECT COUNT(DISTINCT p.reportno) AS accident_count
//    -> FROM PARTICIPATED p
//    -> JOIN CAR c ON p.regno = c.regno
//    -> WHERE c.model = 'Maruti';
//+----------------+
//| accident_count |
//+----------------+
//|              3 |
//+----------------+
//1 row in set (0.00 sec)
//
// 
//
//4)	Query to check if a person with a specific driver_id has met with an accident in 2003.
//
//ysql> SELECT pe.*
//    -> FROM PERSON pe
//    -> JOIN PARTICIPATED pa ON pe.driver_id = pa.driverid
//    -> JOIN ACCIDENT ac ON pa.reportno = ac.reportno
//    -> WHERE YEAR(ac.date) = 2003
//    ->   AND pe.driver_id = 2;
//Empty set (0.00 sec)
//
//mysql> SELECT pe.*
//    -> FROM PERSON pe
//    -> JOIN PARTICIPATED pa ON pe.driver_id = pa.driverid
//    -> JOIN ACCIDENT ac ON pa.reportno = ac.reportno
//    -> WHERE YEAR(ac.date) = 2003
//    ->   AND pe.driver_id = 3;
//+-----------+--------+-----------+
//| DRIVER_ID | NAME   | ADDRESS   |
//+-----------+--------+-----------+
//|         3 | Charan | Bangalore |
//+-----------+--------+-----------+
//1 row in set (0.00 sec)
//
//
//
//5) Query to display name of  a person & the car he/she owns.
//
//mysql> SELECT pe.name, c.model AS car_model
//    -> FROM PERSON pe
//    -> JOIN OWNS o ON pe.driver_id = o.driverid
//    -> JOIN CAR c ON o.regno = c.regno;
//+--------+-----------+
//| name   | car_model |
//+--------+-----------+
//| Arun   | Maruti    |
//| Bhanu  | Hyundai   |
//| Charan | Honda     |
//| Divya  | Toyota    |
//| Eshan  | Ford      |
//| Farah  | Hyundai   |
//| Gopal  | Maruti    |
//+--------+-----------+
//7 rows in set (0.00 sec)
