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

DROP TABLE IF EXISTS travel_type;
CREATE TABLE travel_type (
	id bigint,
	name varchar(50),
	travel_fee integer
);

INSERT INTO travel_type VALUES (1, 'In Indonesia', 200000);
INSERT INTO travel_type VALUES (2, 'Out Indonesia', 350000);

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

DROP TABLE IF EXISTS position;
CREATE TABLE position (
	id bigint,
	name varchar(100)
);

INSERT INTO position VALUES (1, 'Direktur');
INSERT INTO position VALUES (2, 'General Manager');
INSERT INTO position VALUES (3, 'Manager');
INSERT INTO position VALUES (4, 'Staff');

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

DROP TABLE IF EXISTS department;
CREATE TABLE department (
	id bigint,
	name varchar(100)
);

INSERT INTO department VALUES (1, 'Recruitment');
INSERT INTO department VALUES (2, 'Sales');
INSERT INTO department VALUES (3, 'Human Resource');
INSERT INTO department VALUES (4, 'General Affair');

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


---------------------------------------------------------------------------------------
select * from biodata;
select * from ;

--CONCAT : MENGGABUNGKAN DUA ATAU LEBIH TEXT

SELECT
	FIRST_NAME,
	LAST_NAME,
	CONCAT(FIRST_NAME, ' ',LAST_NAME) AS "FULL NAME 1",
	FIRST_NAME || ' '|| LAST_NAME AS "FULL NAME 2"
FROM BIODATA

--FUNGSI NOW() : MENAMPILKAN WAKTU / DATE SEKARANG

SELECT NOW();

--DATE_PART() : UNTUK AMBIL ATAU EKSTRAK BAGIAN DARI WAKTU

SELECT DATE_PART('YEAR',NOW());
SELECT DATE_PART('MONTH',NOW());
SELECT DATE_PART('DAY',NOW());
SELECT DATE_PART('HOUR',NOW());
SELECT DATE_PART('MINUTE',NOW());
SELECT DATE_PART('SECOND',NOW());	

--TO_DATE = KONVERSI STRING KE DATE

SELECT TO_DATE('02/01/2023', 'DD/MM/YYYY');

--CONTOH

SELECT
	DOB,
	DATE_PART('YEAR', TO_DATE(DOB,'YYYY-MM-DD'))
FROM BIODATA;


--AGE : MENGHITUNG SELISIH DARI DUA DATE
SELECT NOW();
SELECT TO_DATE('27/12/1997', 'DD/MM/YYYY');
SELECT AGE(NOW(), TO_DATE('27/12/1997','DD/MM/YYYY'));
SELECT DATE_PART('YEAR', AGE(NOW(), TO_DATE('27/12/1997', 'DD/MM/YYY')));

SELECT
	DOB,
	TO_DATE(DOB,'YYYY-MM-DD'),
	AGE(NOW(),TO_DATE(DOB,'YYYY-MM-DD')),
	DATE_PART('YEAR',AGE(NOW(),TO_DATE(DOB,'YYYY-MM-DD'))) AS UMUR
FROM BIODATA;

--CASE WHEN END : KONDISI PERCABANGAN DI SQL
SELECT
	--KOLOM 1
	POB,
	--KOLOM 2
	CASE
		WHEN POB ilike 'BAli' THEN 'Denpasar'
		WHEN POB = 'Bandung' THEN 'Paris Van Java'
		ELSE 'Kota Antah Berantah'
	END
FROM BIODATA;



--LATIHAN 1
-- 1 TAMPILKAN FULLNAME, JABATAN, USIA & JUMLAH ANAK DARI MASING2 KARYAWAN
SELECT 
	CONCAT(FIRST_NAME,' ',LAST_NAME) AS FULL_NAME,
	P.NAME AS JABATAN,
	DATE_PART('YEAR',AGE(NOW(),TO_DATE(B.DOB,'YYYY-MM-DD'))) AS USIA,
	SUM (CASE
		 WHEN F.STATUS ILIKE 'ANAK' THEN 1
		ELSE 0
		END) 
		AS JUMLAH_ANAK
FROM BIODATA B
INNER JOIN EMPLOYEE E
	ON B.ID = E.BIODATA_ID
INNER JOIN EMPLOYEE_POSITION EP
	ON E.ID = EP.EMPLOYEE_ID
INNER JOIN POSITION P
	ON EP.POSITION_ID = P.ID
LEFT JOIN FAMILY F
	ON B.ID = F.BIODATA_ID
GROUP BY FULL_NAME, JABATAN, USIA;

-- 2 HITUNG BERAPA HARI CUTI YANG SUDAH DI AMBIL MASING MASING KARYAWAN
--COALESCE untuk mengubah null menjadi yang lain

SELECT
	 B.FIRST_NAME || ' ' || B.LAST_NAME AS NAMA_KARYAWAN,
	COALESCE (DATE_PART('DAY', SUM (AGE(LR.END_DATE, LR.START_DATE))),0) AS JUMLAH_CUTI
FROM BIODATA B
JOIN EMPLOYEE E
	ON B.ID = E.BIODATA_ID
LEFT JOIN LEAVE_REQUEST LR
	ON E.ID = LR.EMPLOYEE_ID
GROUP BY NAMA_KARYAWAN;

-- 3 TAMPILKAN FULLNAME DAN JABATAN 3 KARYAWAN PALING TUA
SELECT
	B.FIRST_NAME || ' ' || B.LAST_NAME AS FULL_NAME,
	P.NAME AS JABATAN
FROM BIODATA B
JOIN EMPLOYEE E
	ON B.ID = E.BIODATA_ID
JOIN EMPLOYEE_POSITION EP
	ON E.ID = EP.EMPLOYEE_ID
LEFT JOIN POSITION P
	ON EP.POSITION_ID = P.ID
ORDER BY DOB ASC
LIMIT 3;

-- 4 TAMPILKAN NAMA NAMA PELAMAR YANG TIDAK DITERIMA KARYAWAN
SELECT
	B.FIRST_NAME || ' ' || B.LAST_NAME AS FULL_NAME,
FROM BIODATA B
LEFT JOIN EMPLOYEE E
	ON B.ID = E.BIODATA_ID
WHERE E.BIODATA_ID is null;

-- 5 HITUNG BERAPA RATA-RATA GAJI KARYAWAN DENGAN LEVEL STAFF
SELECT
	--B.FIRST_NAME || ' ' || B.LAST_NAME,
	--P.NAME 
	ROUND(AVG(E.SALARY)) AS "RATA-RATA_GAJI"
FROM BIODATA B
JOIN EMPLOYEE E
	ON B.ID = E.BIODATA_ID
JOIN EMPLOYEE_POSITION EP
	ON EP.EMPLOYEE_ID = E.ID
JOIN POSITION P
	ON P.ID = EP.POSITION_ID
	
	
	
-- 1 tampilkan status karyawan dan jumlah karyawan untuk setiap statusnya
SELECT
	E.STATUS,
	COUNT(B.FIRST_NAME)
FROM BIODATA B
JOIN EMPLOYEE E
	ON B.ID = E.BIODATA_ID
GROUP BY E.STATUS;

-- 2 tampilkan data biodata yang bukan karyawan
select
	b.*
from biodata b
left join employee e
	on b.id = e.biodata_id
where e.biodata_id is null;

-- 3 tampilkan fullname, status pernikahan dan nama anak dari data biodata yang sudah punya anak
select
	b.first_name || ' ' || b.last_name as full_name,
	case 
		when b.marital_status = true then 'sudah menikah'
		else 'belum menikah'
	end
	as "status pernikahan",
	f.name
from biodata b
full join family f
	on b.id = f.biodata_id;

-- 5 tampilkan tahun lahir dan jumlah karyawan yang mempunyai tahun lahir yang sama
select
	distinct (date_part('year', to_date (b.dob, 'yyyy-mm-dd'))) as "tahun lahir",
	count (date_part('year', to_date (b.dob, 'yyyy-mm-dd'))) as "jumlah karyawan"
from biodata b
join employee e
	on b.id = e.biodata_id
group by "tahun lahir";

-- 6 tampilkan data biodata & jabatan dari karyawan
select
	b.*,
	p.name
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = ep.employee_id
join position p
	on ep.position_id = p.id;

-- 7 tampilkan data biodata yang alamat dan tempat lahirnya bukan jakarta
select
	b.*
from biodata b
where not b.pob ilike '%jakarta%' and not address ilike '%jakarta';

-- 8 tampilkan fullname, jabatan dan usia dari karyawan
select
	b.first_name || ' ' || b.last_name as full_name,
	p.name,
	date_part('year',age(now(), to_date (b.dob, 'yyyy-mm-dd'))) as usia
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = ep.employee_id
join position p
	on ep.position_id = p.id;
	
-- 9 tampilkan nama karyawan yang cutinya paling lama

-- tabel 1
SELECT
	B.FIRST_NAME || ' ' || B.LAST_NAME AS NAMA_KARYAWAN,
	SUM (AGE(LR.END_DATE, LR.START_DATE))) AS JUMLAH_CUTI
FROM BIODATA B
JOIN EMPLOYEE E
	ON B.ID = E.BIODATA_ID
JOIN LEAVE_REQUEST LR
	ON E.ID = LR.EMPLOYEE_ID
GROUP BY NAMA_KARYAWAN;

select max(t.JUMLAH_CUTI) from (SELECT B.FIRST_NAME || ' ' || B.LAST_NAME AS NAMA_KARYAWAN,
	SUM (AGE(LR.END_DATE, LR.START_DATE))) AS JUMLAH_CUTI
FROM BIODATA B
JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
JOIN LEAVE_REQUEST LR ON E.ID = LR.EMPLOYEE_ID
GROUP BY NAMA_KARYAWAN)t

--jadi
SELECT *
FROM
	(SELECT B.FIRST_NAME || ' ' || B.LAST_NAME AS FULLNAME,
			SUM(AGE(LR.END_DATE,

								LR.START_DATE)) AS JUMLAH_CUTI
		FROM BIODATA B
		JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
		JOIN LEAVE_REQUEST LR ON E.ID = LR.EMPLOYEE_ID
		GROUP BY FULLNAME) T
WHERE T.JUMLAH_CUTI =
		(SELECT MAX(T.JUMLAH_CUTI)
			FROM
				(SELECT B.FIRST_NAME || ' ' || B.LAST_NAME AS FULLNAME,
						SUM(AGE(LR.END_DATE,

											LR.START_DATE)) AS JUMLAH_CUTI
					FROM BIODATA B
					JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
					JOIN LEAVE_REQUEST LR ON E.ID = LR.EMPLOYEE_ID
					GROUP BY FULLNAME) T)



-- 10 tampilkan nama karyawan, jenis perjalanan dinas, tanggal perjalanan dinas dan total
-- pengeluarannya selama perjalanan dinas tersebut
select
	b.first_name || ' ' || b.last_name as full_name,
	tt.name as jenis_perjalanan,
	tr.start_date || ' S.D ' || tr.end_date as tanggal_perjalanan,
	sum(ts.item_cost) + tt.travel_fee as total_pengeluaran
from biodata b
join employee e
	on b.id = e.biodata_id
join travel_request tr
	on e.id = tr.employee_id
join travel_type tt
	on tt.id = tr.travel_type_id
join travel_settlement ts
	on ts.travel_request_id = tr.id
group by full_name, jenis_perjalanan, tanggal_perjalanan, tt.travel_fee
	

--casting / convert tipe data yang ditampilkan / diolah
select '100' as data;
select '100'::int as data;
select 100 as data;
select 100::text as data;

