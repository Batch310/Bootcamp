DROP TABLE IF EXISTS biodata;
CREATE TABLE biodata (
	id bigint,
	first_name varchar(20), 
	last_name varchar(30), 
	dob varchar(10), 
	pob varchar(50), 
	address varchar(255), 
	marital_status boolean
);


INSERT INTO biodata VALUES (1, 'Raya', 'Indriyani', '1991-01-01', 'Bali', 'Jl. Raya Baru, Bali', false);
INSERT INTO biodata VALUES (2, 'Rere', 'Wulandari', '1992-01-02', 'Bandung', 'Jl. Berkah Ramadhan, Bandung', false);
INSERT INTO biodata VALUES (3, 'Bunga', 'Maria', '1991-03-03', 'Jakarta', 'Jl. Mawar Semerbak, Bogor', true);
INSERT INTO biodata VALUES (4, 'Natasha', 'Wulan', '1990-04-10', 'Jakarta', 'Jl. Mawar Harum, Jakarta', false);
INSERT INTO biodata VALUES (5, 'Zahra', 'Aurelia Putri', '1991-03-03', 'Jakarta', 'Jl. Mawar Semerbak, Bogor', true);
INSERT INTO biodata VALUES (6, 'Katniss', 'Everdeen', '1989-01-12', 'Jakarta', 'Jl. Bunga Melati, Jakarta', true);
SELECT *
FROM BIODATA;

DROP TABLE IF EXISTS employee;
CREATE TABLE employee (
	id bigint,
	biodata_id bigint,
	nip varchar(5), 
	status varchar(10), 
	salary decimal(10, 0)
);

INSERT INTO employee VALUES (1, 1, 'NX001', 'Permanen', 12000000);
INSERT INTO employee VALUES (2, 2, 'NX002', 'Kontrak', 15000000);
INSERT INTO employee VALUES (3, 4, 'NX003', 'Permanen', 13500000);
INSERT INTO employee VALUES (4, 5, 'NX004', 'Permanen', 12000000);
INSERT INTO employee VALUES (5, 6, 'NX005', 'Permanen', 17000000);
SELECT *
FROM EMPLOYEE;

DROP TABLE IF EXISTS contact_person;
CREATE TABLE contact_person (
	id bigint,
	biodata_id bigint,
	type varchar(5), 
	contact varchar(100)
);

INSERT INTO contact_person VALUES (1, 1, 'MAIL', 'raya.indriyani@gmail.com');
INSERT INTO contact_person VALUES (2, 1, 'PHONE', '085612345678');
INSERT INTO contact_person VALUES (3, 2, 'MAIL', 'rere.wulandari@gmail.com');
INSERT INTO contact_person VALUES (4, 2, 'PHONE', '081312345678');
INSERT INTO contact_person VALUES (5, 2, 'PHONE', '087812345678');
INSERT INTO contact_person VALUES (6, 3, 'MAIL', 'bunga.maria@gmail.com');
INSERT INTO contact_person VALUES (7, 4, 'MAIL', 'natasha.wulan@gmail.com');
INSERT INTO contact_person VALUES (8, 5, 'MAIL', 'zahra.putri@gmail.com');
INSERT INTO contact_person VALUES (9, 6, 'MAIL', 'katniss.everdeen@gmail.com');
SELECT *
FROM CONTACT_PERSON;

DROP TABLE IF EXISTS leave;
CREATE TABLE leave (
	id bigint,
	type varchar(10), 
	name varchar(100)
);

INSERT INTO leave VALUES (1, 'Regular', 'Cuti Tahunan');
INSERT INTO leave VALUES (2, 'Khusus', 'Cuti Menikah');
INSERT INTO leave VALUES (3, 'Khusus', 'Cuti Haji & Umroh');
INSERT INTO leave VALUES (4, 'Khusus', 'Melahirkan');
SELECT *
FROM LEAVE;

DROP TABLE IF EXISTS employee_leave;
CREATE TABLE employee_leave (
  id integer,
  employee_id integer,
  period varchar(4),
  regular_quota integer
);

INSERT INTO employee_leave VALUES (1, 1, '2020', 16);
INSERT INTO employee_leave VALUES (2, 2, '2020', 12);
INSERT INTO employee_leave VALUES (3, 1, '2021', 16);
INSERT INTO employee_leave VALUES (4, 2, '2021', 12);
INSERT INTO employee_leave VALUES (5, 4, '2021', 12);
INSERT INTO employee_leave VALUES (6, 5, '2021', 12);
INSERT INTO employee_leave VALUES (7, 6, '2021', 12);
SELECT *
FROM EMPLOYEE_LEAVE;

DROP TABLE IF EXISTS leave_request;
CREATE TABLE leave_request (
	id bigint,
	employee_id bigint,
	leave_id bigint,
	start_date date,
	end_date date,
	reason varchar(255)
);

INSERT INTO leave_request VALUES (1, 1, 1, '2020-10-10', '2020-10-12', 'Liburan');
INSERT INTO leave_request VALUES (2, 1, 1, '2020-11-12', '2020-11-15', 'Acara keluarga');
INSERT INTO leave_request VALUES (3, 2, 2, '2020-05-05', '2020-05-07', 'Menikah');
INSERT INTO leave_request VALUES (4, 2, 1, '2020-09-09', '2020-09-13', 'Touring');
INSERT INTO leave_request VALUES (5, 2, 1, '2020-12-24', '2020-12-25', 'Acara keluarga');
SELECT *
FROM LEAVE_REQUEST;

DROP TABLE IF EXISTS travel_type;
CREATE TABLE travel_type (
	id bigint,
	name varchar(50),
	travel_fee integer
);

INSERT INTO travel_type VALUES (1, 'In Indonesia', 200000);
INSERT INTO travel_type VALUES (2, 'Out Indonesia', 350000);
SELECT *
FROM TRAVEL_TYPE;

DROP TABLE IF EXISTS travel_request;
CREATE TABLE travel_request (
	id bigint,
	employee_id bigint,
	travel_type_id bigint,
	start_date date,
	end_date date
);

INSERT INTO travel_request VALUES (1, 1, 1, '2020-07-07', '2020-07-08');
INSERT INTO travel_request VALUES (2, 1, 1, '2020-08-07', '2020-08-08');
INSERT INTO travel_request VALUES (3, 2, 2, '2020-04-04', '2020-04-07');
SELECT *
FROM TRAVEL_REQUEST;

DROP TABLE IF EXISTS travel_settlement;
CREATE TABLE travel_settlement (
	id bigint,
	travel_request_id bigint,
	item_name varchar(100),
	item_cost integer
);

INSERT INTO travel_settlement VALUES (1, 1, 'Tiket travel Do-Car berangkat', 165000);
INSERT INTO travel_settlement VALUES (2, 1, 'Hotel', 750000);
INSERT INTO travel_settlement VALUES (3, 1, 'Tiket travel Do-Car pulang', 165000);
INSERT INTO travel_settlement VALUES (4, 2, 'Tiket pesawat berangkat', 750000);
INSERT INTO travel_settlement VALUES (5, 2, 'Hotel', 650000);
INSERT INTO travel_settlement VALUES (6, 2, 'Tiket pesawat pulang', 1250000);
INSERT INTO travel_settlement VALUES (7, 3, 'Tiket pesawat berangkat', 4750000);
INSERT INTO travel_settlement VALUES (8, 3, 'Hotel', 6000000);
INSERT INTO travel_settlement VALUES (9, 2, 'Tiket pesawat pulang', 4250000);
SELECT *
FROM TRAVEL_SETTLEMENT;

DROP TABLE IF EXISTS position;
CREATE TABLE position (
	id bigint,
	name varchar(100)
);

INSERT INTO position VALUES (1, 'Direktur');
INSERT INTO position VALUES (2, 'General Manager');
INSERT INTO position VALUES (3, 'Manager');
INSERT INTO position VALUES (4, 'Staff');
SELECT *
FROM POSITION;

DROP TABLE IF EXISTS employee_position;
CREATE TABLE employee_position (
	id bigint,
	employee_id bigint,
	position_id bigint
);

INSERT INTO employee_position VALUES (1, 5, 1);
INSERT INTO employee_position VALUES (2, 4, 2);
INSERT INTO employee_position VALUES (3, 3, 3);
INSERT INTO employee_position VALUES (4, 2, 4);
INSERT INTO employee_position VALUES (5, 1, 4);
SELECT *
FROM EMPLOYEE_POSITION;

DROP TABLE IF EXISTS department;
CREATE TABLE department (
	id bigint,
	name varchar(100)
);

INSERT INTO department VALUES (1, 'Recruitment');
INSERT INTO department VALUES (2, 'Sales');
INSERT INTO department VALUES (3, 'Human Resource');
INSERT INTO department VALUES (4, 'General Affair');
SELECT *
FROM DEPARTMENT;

DROP TABLE IF EXISTS family;
CREATE TABLE family (
	id bigint, 
	biodata_id bigint, 
	name varchar(100), 
	status varchar(50)
);

INSERT INTO family VALUES (1, 3, 'Azka Fadlan Zikrullah', 'Suami');
INSERT INTO family VALUES (2, 3, 'Primrose Everdeen', 'Anak');
INSERT INTO family VALUES (3, 5, 'Jaka Samudera Buana', 'Suami');
INSERT INTO family VALUES (4, 5, 'Friska Davira', 'Anak');
INSERT INTO family VALUES (5, 5, 'Harum Indah Az Zahra', 'Anak');
INSERT INTO family VALUES (6, 6, 'Adya Pratama Yuda', 'Suami');
SELECT *
FROM FAMILY;

--MATERI
--CONCAT : MENGGABUNGKAN 2 ATAU LEBIH TEKS
SELECT * FROM BIODATA;

--CARA 1
SELECT 
	FIRST_NAME AS "FIRST NAME",
	LAST_NAME AS "LAST NAME",
	CONCAT(FIRST_NAME,' ',LAST_NAME) AS "FULL NAME"	
FROM BIODATA;

--CARA 2
SELECT 
	FIRST_NAME AS "FIRST NAME",
	LAST_NAME AS "LAST NAME",
	FIRST_NAME || ' ' || LAST_NAME AS "FULL NAME"	
FROM BIODATA;

--FUNGSI NOW() : MENAMPILKAN WAKTU/DATE SEKARANG
SELECT NOW(); --TIPE DATA DATE

--DATE_PART() : AMBIL/EXTRACT BAGIAN DARI WAKTU/DATE
SELECT DATE_PART('YEAR',NOW());
SELECT DATE_PART('MONTH',NOW());
SELECT DATE_PART('DAY',NOW());
SELECT DATE_PART('HOUR',NOW());
SELECT DATE_PART('MINUTE',NOW());
SELECT DATE_PART('SECOND',NOW());

SELECT DATE_PART('YEAR','2023/01/02'); --ERROR, KARENA '2023/01/02' TIPE DATANYA BUKAN DATE

--TO_DATE() : UNTUK CONVERT TIPE DATA STRING KE DATE
SELECT '2023/01/02'; --TIPE DATA TEXT
SELECT TO_DATE('2023/01/02','YYYY/MM/DD'); --TIPE DATA DATE
SELECT DATE_PART('YEAR',TO_DATE('2023/01/02','YYYY/MM/DD'));

SELECT
	FIRST_NAME || ' ' || LAST_NAME AS "FULL NAME",
	DOB,
	TO_DATE(DOB,'YYYY-MM--DD'),
	--DATE_PART('YEAR',TO_DATE(DOB,'YYYY-MM-DD')),
	--AGE(NOW(),TO_DATE(DOB,'YYYY-MM--DD')),
	DATE_PART('YEAR',AGE(NOW(),TO_DATE(DOB,'YYYY-MM--DD')))
FROM BIODATA
ORDER BY AGE(NOW(),TO_DATE(DOB,'YYYY-MM--DD')) ASC;

--AGE() : MENGHITUNG SELISIH DARI 2 DATE
SELECT NOW();
SELECT TO_DATE('15/04/2000','DD/MM/YYYY');
SELECT AGE(NOW(),TO_DATE('15/04/2000','DD/MM/YYYY'));
SELECT DATE_PART('YEAR',AGE(NOW(),TO_DATE('15/04/2000','DD/MM/YYYY')));

--CASE WHEN END -> KONDISI PERCABANGAN DI SQL
SELECT 
	--KOLOM 1
	POB,
	--KOLOM 2
	CASE
		WHEN POB ILIKE 'bali' THEN 'BALI'
		WHEN POB = 'Bandung' THEN 'BANDUNG PARIS VAN JAVA'
		ELSE 'KOTA ANTAH BERANTAH'
	END
FROM BIODATA;

--LATIHAN 1
--1 TAMPILKAN FULL NAME, JABATAN, USIA & JUMLAH ANAK DARI MASING - MASING KARYAWAN
SELECT * FROM BIODATA;
SELECT * FROM FAMILY;
SELECT
	B.FIRST_NAME || ' ' || B.LAST_NAME AS "FULL NAME",
	P.NAME AS "JABATAN",
	DATE_PART('YEAR',AGE(NOW(),TO_DATE(B.DOB,'YYYY-MM-DD'))) AS "USIA",
	SUM(CASE
			WHEN F.STATUS ILIKE 'ANAK' THEN 1
			ELSE 0
		END) 
	AS "JUMLAH ANAK" 
FROM BIODATA B
INNER JOIN EMPLOYEE E
	ON B.ID = E.BIODATA_ID
INNER JOIN EMPLOYEE_POSITION EP
	ON E.ID = EP.EMPLOYEE_ID
INNER JOIN POSITION P
	ON EP.POSITION_ID = P.ID
LEFT JOIN FAMILY F
	ON B.ID = F.BIODATA_ID
GROUP BY 
	"FULL NAME",
	"JABATAN",
	"USIA";

--2 HITUNG BERAPA HARI CUTI YANG SUDAH DIAMBIL MASING - MASING KARYAWAN
--COALESC() -> MENGUBAH YANG NULL JADI NILAI LAIN
SELECT
	B.FIRST_NAME || ' ' || B.LAST_NAME AS "FULL NAME",
	COALESCE(SUM(DATE_PART('DAY',AGE(LR.END_DATE,LR.START_DATE))),0) AS "JUMLAH CUTI",
	CASE
		WHEN SUM(DATE_PART('DAY',AGE(LR.END_DATE,LR.START_DATE))) IS NULL THEN 0
		ELSE SUM(DATE_PART('DAY',AGE(LR.END_DATE,LR.START_DATE)))
	END
	AS "JUMLAH CUTI"
FROM BIODATA B
INNER JOIN EMPLOYEE E
	ON B.ID = E.BIODATA_ID
LEFT JOIN LEAVE_REQUEST LR
	ON E.ID = LR.EMPLOYEE_ID
GROUP BY "FULL NAME";

--3 TAMPILKAN FULL NAME DAN JABATAN 3 KARYAWAN PALING TUA
SELECT
	B.FIRST_NAME || ' ' || B.LAST_NAME AS "FULL NAME",
	P.NAME AS "JABATAN"
	--AGE(NOW(),TO_DATE(DOB,'YYYY-MM-DD'))
FROM BIODATA B
INNER JOIN EMPLOYEE E
	ON B.ID = E.BIODATA_ID
INNER JOIN EMPLOYEE_POSITION EP
	ON E.ID = EP.EMPLOYEE_ID
INNER JOIN POSITION P
	ON EP.POSITION_ID = P.ID
ORDER BY AGE(NOW(),TO_DATE(DOB,'YYYY-MM-DD')) DESC
LIMIT 3;
	
--4 TAMPILKAN NAMA NAMA PELAMAR YANG TIDAK DITERIMA KARYAWAN
SELECT
	B.FIRST_NAME || ' ' || B.LAST_NAME AS "FULL NAME"
FROM BIODATA B
LEFT JOIN EMPLOYEE E
	ON B.ID = E.BIODATA_ID
WHERE E.ID IS NULL;

--5 HITUNG BERAPA GAJI RATA - RATA KARYAWAN DENGAN LEVEL STAFF
SELECT
	P.NAME AS "JABATAN",
	ROUND(AVG(E.SALARY)) AS "RATA - RATA GAJI STAFF"
FROM BIODATA B
INNER JOIN EMPLOYEE E
	ON B.ID = E.BIODATA_ID
INNER JOIN EMPLOYEE_POSITION EP
	ON E.ID = EP.EMPLOYEE_ID
INNER JOIN POSITION P
	ON EP.POSITION_ID = P.ID
WHERE P.NAME ILIKE 'STAFF'
GROUP BY P.NAME;

----------------------------------------------------------------------
SELECT * FROM BIODATA;
SELECT * FROM EMPLOYEE;
SELECT * FROM FAMILY;
--1 Tampilkan status karyawan dan jumlah karyawan untuk setiap statusnya
SELECT
	E.STATUS AS "STATUS KARYAWAN",
	COUNT(E.BIODATA_ID) AS "JUMLAH KARYAWAN"
FROM BIODATA B
INNER JOIN EMPLOYEE E
	ON B.ID = E.BIODATA_ID
GROUP BY E.STATUS;

--2 Tampilkan data biodata yang bukan merupakan karyawan
SELECT
	B.*
FROM BIODATA B
LEFT JOIN EMPLOYEE E
	ON B.ID = E.BIODATA_ID
WHERE E.ID IS NULL;

--3 Tampilkan fullname, status pernikahan (sudah menikah/belum menikah) dan nama anak dari data biodata yang sudah punya anak
SELECT
	B.FIRST_NAME || ' ' || B.LAST_NAME AS "FULLNAME",
	CASE
		WHEN B.MARITAL_STATUS = TRUE THEN 'SUDAH MENIKAH'
		ELSE 'BELUM MENIKAH'
	END 
	AS "STATUS PERNIKAHAN",
	F.NAME AS "NAMA ANAK"
FROM BIODATA B
LEFT JOIN EMPLOYEE E
	ON B.ID = E.BIODATA_ID
LEFT JOIN FAMILY F
	ON B.ID = F.BIODATA_ID
WHERE F.STATUS ILIKE 'ANAK';

--5 Tampilkan tahun lahir & jumlah karyawan yang mempunyai tahun lahir yang sama
SELECT
	DATE_PART('YEAR',TO_DATE(B.DOB,'YYYY-MM-DD')) AS "TAHUN LAHIR",
	COUNT(DATE_PART('YEAR',TO_DATE(B.DOB,'YYYY-MM-DD')))
FROM BIODATA B
INNER JOIN EMPLOYEE E
	ON B.ID = E.BIODATA_ID
GROUP BY "TAHUN LAHIR";

--6 Tampilkan data biodata & jabatan dari karyawan
SELECT
	B.*,
	P.NAME AS JABATAN
FROM BIODATA B
INNER JOIN EMPLOYEE E
	ON B.ID = E.BIODATA_ID
INNER JOIN EMPLOYEE_POSITION EP
	ON E.ID = EP.EMPLOYEE_ID
INNER JOIN POSITION P
	ON EP.POSITION_ID = P.ID;

--7 Tampilkan data biodata yang alamat & tempat lahirnya bukan jakarta
SELECT 
	B.*
FROM BIODATA B
WHERE B.POB NOT ILIKE 'JAKARTA' AND B.ADDRESS NOT ILIKE '%JAKARTA%';

--8 Tampilkan fullname, jabatan dan usia dari karyawan
SELECT
	B.FIRST_NAME || ' ' || B.LAST_NAME AS "FULLNAME",
	P.NAME AS "JABATAN",
	DATE_PART('YEAR',AGE(NOW(),TO_DATE(B.DOB,'YYYY-MM-DD'))) AS "USIA"
FROM BIODATA B
INNER JOIN EMPLOYEE E
	ON B.ID = E.BIODATA_ID
INNER JOIN EMPLOYEE_POSITION EP
	ON E.ID = EP.EMPLOYEE_ID
INNER JOIN POSITION P
	ON EP.POSITION_ID = P.ID;

--9 Tampilkan nama karyawan yang cutinya paling lama
SELECT T1.*
FROM
	(SELECT B.FIRST_NAME || ' ' || B.LAST_NAME AS "NAMA KARYAWAN",
			SUM(AGE(LR.END_DATE,

								LR.START_DATE)) AS "JUMLAH CUTI"
		FROM BIODATA B
		INNER JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
		LEFT JOIN LEAVE_REQUEST LR ON E.ID = LR.EMPLOYEE_ID
		GROUP BY "NAMA KARYAWAN") T1
WHERE T1."JUMLAH CUTI" =
		(SELECT MAX(T2."JUMLAH CUTI")
			FROM
				(SELECT B.FIRST_NAME || ' ' || B.LAST_NAME AS "NAMA KARYAWAN",
						SUM(AGE(LR.END_DATE,

											LR.START_DATE)) AS "JUMLAH CUTI"
					FROM BIODATA B
					INNER JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
					LEFT JOIN LEAVE_REQUEST LR ON E.ID = LR.EMPLOYEE_ID
					GROUP BY "NAMA KARYAWAN") T2);
					
--TEMPORARY TABLE
DROP TABLE IF EXISTS TEMP_TABLE;
CREATE TEMPORARY TABLE TEMP_TABLE(
	NAMA_KARYAWAN TEXT,
	JUMLAH_CUTI INTERVAL
);

INSERT INTO TEMP_TABLE
SELECT B.FIRST_NAME || ' ' || B.LAST_NAME AS FULLNAME,
	SUM(AGE(LR.END_DATE,

						LR.START_DATE))
FROM BIODATA B
INNER JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
LEFT JOIN LEAVE_REQUEST LR ON E.ID = LR.EMPLOYEE_ID
GROUP BY FULLNAME;

SELECT *
FROM TEMP_TABLE
WHERE JUMLAH_CUTI =
		(SELECT MAX(JUMLAH_CUTI)
			FROM TEMP_TABLE);

--10 Tampilkan nama karyawan, jenis perjalanan dinas, tanggal perjalanan dinas dan total pengeluarannya selama perjalanan dinas tersebut
SELECT B.FIRST_NAME || ' ' || B.LAST_NAME AS "NAMA KARYAWAN",
	TT.NAME AS "JENIS PERJALANAN DINAS",
	TR.START_DATE || ' s.d ' || TR.END_DATE AS "TANGGAL PERJALANAN DINAS",
	TT.TRAVEL_FEE + SUM(TS.ITEM_COST) AS "TOTAL PENGELUARAN"
FROM BIODATA B
INNER JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
RIGHT JOIN TRAVEL_REQUEST TR ON E.ID = TR.EMPLOYEE_ID
LEFT JOIN TRAVEL_TYPE TT ON TT.ID = TR.TRAVEL_TYPE_ID
LEFT JOIN TRAVEL_SETTLEMENT TS ON TR.ID = TS.TRAVEL_REQUEST_ID
GROUP BY "NAMA KARYAWAN",
	"JENIS PERJALANAN DINAS",
	"TANGGAL PERJALANAN DINAS",
	TT.TRAVEL_FEE;
	
--Casting atau convert tipe data yang ditampilkan atau diolah
SELECT '100' AS DATA;
SELECT '100'::INT AS DATA;
SELECT 100::TEXT AS DATA;
SELECT '100' + 50 AS DATA;
SELECT '100' + '50'::INT AS DATA;