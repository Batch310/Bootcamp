--DDL Buat Database
create database batch310;

--DDL Hapus Database
drop database batch310;

--DDL Buat Table
create table pegawai(
	ID_Pegawai serial primary key, 
	Umur integer,
	Nama_Pegawai text
);

--DDL Hapus Table
drop table pegawai;

--Buatlah Table KTP dengan kolom

create table KTP(
	nik integer primary key,
	nama text,
	ttl text,
	jenis_kelamin text,
	alamat text
);

--DML, tampilkan semua kolom dari table
select * from ktp;


--DDL, rename kolom tabel
alter table KTP
rename column ttl to tempat_tgl_lahir;

--DDL, ubah tipe data kolom
alter table KTP
alter column jenis_kelamin type boolean using jenis_kelamin::boolean;

--DDL, delete kolom
alter table ktp
drop column tempat_tgl_lahir;

--DDL, add kolom
alter table ktp
add column tempat_lahir text,
add column tgl_lahir date;

--DML, insert data
insert into pegawai(umur,nama_pegawai)
values(24,'Panji'),(22,'Dewa');

--DML, update data
update pegawai
set nama_pegawai = 'Nur Rohman'
where id_pegawai = 4;

update pegawai
set umur = 23, nama_pegawai = 'Bernadinus'
where id_pegawai = 1;

select * from pegawai;
--DML, delete data
delete from pegawai
where id_pegawai = 4;

--DML, select
select * from pegawai;
select * from ktp;

select nama_pegawai from pegawai;
select nama_pegawai, umur from pegawai;

--Alias nama kolom
select nama_Pegawai as pegawai, umur from pegawai;

--select order by
select * from pegawai order by id_pegawai ASC; --mengurutkan data dari kecil ke besar brdasarkan id_pegawai
select * from pegawai order by id_pegawai DESC; --mengurutkan data dari besar ke kecil 

--select distinct
select * from Pegawai;
select distinct umur from pegawai;

--select where
select * from pegawai where umur = 23 and id_pegawai = 1;

--Select where pake in
select * from pegawai where umur in (23);
select * from pegawai where umur in (23,25);

--select where pake between / diantara (khusus buat integer/numeric)
select * from pegawai where umur between 22 and 24;

--select where like / sepeerti / mengandung
select * from pegawai where nama_pegawai like '%Panji';
select * from pegawai where nama_pegawai like '%an%';

--select agregat
--Average >> menghitung rata-rata
--Sum >> menjumlahkan
--Count >> menghitung
--Min >> nilai terendah
--Max >> nilai tertinggi

--menampilkan nilai tertinggi di variabel umur
select max(umur) from pegawai; 
--menampilkan nilai terendah di variabel umur
select min(umur) from pegawai;
--menghitung nilai rata-rata di variabel umur
select avg(umur) from pegawai;
--menjumlahkan data umur
select sum(umur) from pegawai;
select count(umur) from pegawai;

--group by
select nama_pegawai,sum(umur) from pegawai group by nama_pegawai;

--Latihan Film
create table film(
    kd_film text primary key,
    nm_film text,
    pendapatan integer,
    nominasi integer
);

insert into film values
('F001','IRON MAN',2000000000,3),
('F002','IRON MAN 2',1800000000,2),
('F003','IRON MAN 3',1200000000,0),
('F004','AVENGER:CIVIL WAR',2000000000,1),
('F005','SPIDERMAN HOME COMING',1300000000,0),
('F006','THE RAID',800000000,5),
('F007','FAST & FURIOUS',830000000,2),
('F008','HABIBI DAN AINUN',670000000,4),
('F009','POLICE STORY',700000000,3),
('F010','POLICE STORY 2',710000000,1),
('F011','POLICE STORY 3',615000000,0),
('F012','RUSH HOUR',695000000,2),
('F013','KUNGFU PANDA',923000000,5);

select * from film;


--1. Tampilkan nama film dan nominasi dari nominasi yang terbasar
select nm_film as "nama film",nominasi from film order by nominasi desc;

--2. Tampilkan nama film dan pendataan dari yang terkecil
select nm_film as "nama film",pendapatan from film order by pendapatan asc;

--3. Tampilkan nama film dan nominasi yang tidak dapat nominasi
select nm_film,nominasi from film where nominasi in (0);

--4. Tampilkan nama film dan nominasi yang paling banyak mendapatkan nominasi
select nm_film,nominasi from film 
where nominasi = (select max(nominasi) from film);

--5. Tampilkan nama film dan pndapatan yang terbesar
select nm_film as "nama film",pendapatan 
from film 
where pendapatan = (select max(pendapatan) from film);

--6. Tampilkan nama film dan pendapatan yang terkecil
select nm_film as "nama film",pendapatan 
from film 
where pendapatan = (select min(pendapatan) from film);

--7. Tampilkan rata-rata pendapatan film keseluruhan
select round(avg(pendapatan)) as "Pendapatan" from film;

--8. Tampilkan rata2 nominasi film keseluruhan
select round(avg(nominasi)) as "Nominasi" from film;

--9. Tampilkan nama film yang huruf depannya 'p'
select nm_film as "nama film" from film where nm_film ilike 'P%'

--10. Tampilkan nama film yang huruf terakhirnya 's'
select nm_film as "nama film" from film where nm_film ilike '%S'

--11. Tampilkan nama film yang mengandung huruf 'd'
select nm_film as "nama film" from film where nm_film ilike '%D%'

--12. Tampilkan nama film dengan pendapatan terkecil yang mengandung huruf 'b'
select nm_film as "nama film",pendapatan from film
where 
nm_film ilike '%m%' and pendapatan = (select min(pendapatan) from film where 
nm_film ilike '%m%'); 

--13. Tampilkan nama film dengan pendapatan terbesar yang mengandung huruf 'd'
select nm_film as "nama film",pendapatan from film
where 
nm_film ilike '%d%' 
and pendapatan = (select max(pendapatan) from film where nm_film ilike '%d%');

--lower / upper
select lower('PANJI');
select upper('panji');

--Buat tabel kota
create table kota(
	id int primary key,
	nama text,
	id_provinsi int
);
insert into kota values
(1,'Jakarta',1),
(2,'Bandung',2),
(3,'Sumedang',2),
(4,'Makasar',4),
(5,'Surabaya',5),
(6,'Medan',6);

select * from kota;

--Buat tabel provinsi
create table provinsi(
	id int primary key,
	nama text
);
insert into provinsi values
(1,'DKI Jakarta'),
(2,'Jawa Barat'),
(3,'Papua Barat'),
(4,'Sulawesi Selatan'),
(5,'Jawa timur');

select * from provinsi;

--inner join
select 
	provinsi.nama as "Provinsi",
	kota.nama as "Kota"
from kota inner join provinsi
on kota.id_provinsi = provinsi.id; --on sbagai pengunci apa yang mau disambungkan

--left join
select 
	provinsi.nama as "Provinsi",
	kota.nama as "Kota"
from kota left join provinsi
on kota.id_provinsi = provinsi.id;

--right join
select 
	provinsi.nama as "Provinsi",
	kota.nama as "Kota"
from kota right join provinsi
on kota.id_provinsi = provinsi.id;

--full outer join
select 
	provinsi.nama as "Provinsi",
	kota.nama as "Kota"
from kota full outer join provinsi
on kota.id_provinsi = provinsi.id;

------------------Day 10------------------------------
drop TABLE film;

select * from film;
CREATE TABLE public.film (
    kd_film character varying(5) primary key,
    nm_film character varying(50),
    genre character varying(5),
    artis character varying(5),
    produser character varying(5),
    pendapatan integer,
    nominasi integer
);
select * from produser;
CREATE TABLE public.produser (
    kd_produser character varying(5) primary key,
    nm_produser character varying(50),
    international character varying(10)
);
select * from negara;
CREATE TABLE public.negara (
    kd_negara character varying(5) primary key,
    nm_negara character varying(50)
);
select * from genre;
CREATE TABLE public.genre (
    kd_genre character varying(5) primary key,
    nm_genre character varying(50)
);
select * from artis;
CREATE TABLE public.artis (
    kd_artis character varying(5) primary key,
    nm_artis character varying(50),
    jk character varying(10),
    bayaran integer,
    award integer,
    negara character varying(5)
    );

INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) 
VALUES ('F001', 'IRON MAN', 'G001', 'A001', 'PD01', 2000000000, 3);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) 
VALUES ('F002', 'IRON MAN 2', 'G001', 'A001', 'PD01', 1800000000, 2);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) 
VALUES ('F003', 'IRON MAN 3', 'G001', 'A001', 'PD01', 1200000000, 0);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) 
VALUES ('F004', 'AVENGER:CIVIL WAR', 'G001', 'A001', 'PD01', 2000000000, 1);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) 
VALUES ('F005', 'SPIDERMAN HOMCOMING', 'G001', 'A001', 'PD01', 1300000000, 0);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) 
VALUES ('F006', 'THE RAID', 'G001', 'A004', 'PD03', 800000000, 5);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) 
VALUES ('F007', 'FAST N FURIOUS', 'G001', 'A004', 'PD05', 830000000, 2);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) 
VALUES ('F008', 'HABIBI N AINUN', 'G004', 'A005', 'PD03', 670000000, 4);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) 
VALUES ('F009', 'POLICE STORY', 'G001', 'A003', 'PD02', 700000000, 3);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) 
VALUES ('F010', 'POLICE STORY 2', 'G001', 'A003', 'PD02', 710000000, 1);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) 
VALUES ('F011', 'POLICE STORY 3', 'G001', 'A003', 'PD02', 615000000, 0);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) 
VALUES ('F012', 'RUSH HOUR', 'G003', 'A003', 'PD05', 695000000, 2);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) 
VALUES ('F013', 'KUNGFU PANDA', 'G003', 'A003', 'PD05', 923000000, 5);


INSERT INTO public.produser (kd_produser, nm_produser, international) 
VALUES ('PD01', 'MARVEL', 'YA');
INSERT INTO public.produser (kd_produser, nm_produser, international) 
VALUES ('PD02', 'HONGKONG CINEMA', 'YA');
INSERT INTO public.produser (kd_produser, nm_produser, international) 
VALUES ('PD03', 'RAPI FILM', 'TIDAK');
INSERT INTO public.produser (kd_produser, nm_produser, international) 
VALUES ('PD04', 'PARKIT FILM', 'TIDAK');
INSERT INTO public.produser (kd_produser, nm_produser, international) 
VALUES ('PD05', 'PARAMOUNT PICTURE', 'YA');

INSERT INTO public.negara (kd_negara, nm_negara) VALUES ('AS', 'AMERIKA SERIKAT');
INSERT INTO public.negara (kd_negara, nm_negara) VALUES ('HK', 'HONGKONG');
INSERT INTO public.negara (kd_negara, nm_negara) VALUES ('ID', 'INDONESIA');
INSERT INTO public.negara (kd_negara, nm_negara) VALUES ('IN', 'INDIA');

INSERT INTO public.genre (kd_genre, nm_genre) VALUES ('G001', 'ACTION');
INSERT INTO public.genre (kd_genre, nm_genre) VALUES ('G002', 'HORROR');
INSERT INTO public.genre (kd_genre, nm_genre) VALUES ('G003', 'COMEDY');
INSERT INTO public.genre (kd_genre, nm_genre) VALUES ('G004', 'DRAMA');
INSERT INTO public.genre (kd_genre, nm_genre) VALUES ('G005', 'THRILER');
INSERT INTO public.genre (kd_genre, nm_genre) VALUES ('G006', 'FICTION');

INSERT INTO public.artis (kd_artis, nm_artis, jk, bayaran, award, negara) 
VALUES ('A001', 'ROBERT DOWNEY JR', 'PRIA', 1000000000, 2, 'AS');
INSERT INTO public.artis (kd_artis, nm_artis, jk, bayaran, award, negara) 
VALUES ('A003', 'JACKIE CHAN', 'PRIA', 1200000000, 7, 'HK');
INSERT INTO public.artis (kd_artis, nm_artis, jk, bayaran, award, negara) 
VALUES ('A004', 'JOE TASLIM', 'PRIA', 350000000, 1, 'ID');
INSERT INTO public.artis (kd_artis, nm_artis, jk, bayaran, award, negara) 
VALUES ('A005', 'CHELSEA ISLAN', 'WANITA', 300000000, 0, 'ID');
INSERT INTO public.artis (kd_artis, nm_artis, jk, bayaran, award, negara) 
VALUES ('A002', 'ANGELINA JOLIE', 'WANITA', 700000000, 1, 'AS');


--14. Tampilkan nama film dan artis
select 
	f.nm_film,
	a.nm_artis 
from film f 
inner join artis a 
on f.artis = a.kd_artis; 

--15. Tampilkan film yang artisnya berasal dari negara HONGKONG
select
	f.nm_film,
	a.nm_artis,
	n.nm_negara
from film f
inner join artis a
	on f.artis = a.kd_artis
inner join negara n
on a.negara = n.kd_negara
where n.nm_negara = 'HONGKONG';

--16. Tampilkan film, nama artis & nama negara yang artisnya berasal dari 
--negara yang tidak mengandung huruf 'o'
select
	f.nm_film,
	a.nm_artis,
	n.nm_negara
from film f
inner join artis a
	on f.artis = a.kd_artis
inner join negara n
	on a.negara = n.kd_negara
where nm_negara not ilike '%o%';

--17. Tampilkan nama film, artis & awardnya yang memiliki award terbanyak
select 
	f.nm_film,
	a.nm_artis,
	award
from film f
inner join artis a
	on f.artis = a.kd_artis
where award = (select max(award) from artis);

--18. Tampilkan nama film, nama artis & bayaran dengan artis bayaran terendah
select
	f.nm_film,
	a.nm_artis,
	bayaran
from film f
inner join artis a
	on f.artis = a.kd_artis
where bayaran = (select min(bayaran) from artis);

--19. Tampilkan nama artis yang tidak pernah bermain film
select
	a.nm_artis,
	f.nm_film
from film f
right join artis a
	on f.artis = a.kd_artis
where nm_film is null;

--20. tampilkan nama artis, film & genre yang bermain film genre drama
select
	a.nm_artis,
	f.nm_film,
	g.nm_genre
from film f
inner join artis a
	on f.artis = a.kd_artis
inner join genre g
	on f.genre = g.kd_genre
where g.nm_genre ilike 'drama';

--21. Tampilkan nama artis, film & genre yang bermain film dengan genre horor
select
	a.nm_artis,
	f.nm_film,
	nm_genre
from film f
inner join artis a
 on f.artis = a.kd_artis
inner join genre g
	on f.genre = g.kd_genre
where g.nm_genre ilike 'horor';

--22. Tampilkan nama film & artis yang dibintangi oleh artis yang huruf depannya 'J'
select
	f.nm_film,
	a.nm_artis
from film f
inner join artis a
	on f.artis = a.kd_artis
where a.nm_artis ilike 'j%';

--23. Tampilkan nama artis yang paling banyak bermain film
SELECT *
FROM
	(SELECT NM_ARTIS,
			COUNT(*) AS "jml film"
		FROM FILM F
		INNER JOIN ARTIS A ON F.ARTIS = A.KD_ARTIS
		GROUP BY NM_ARTIS)T1
WHERE T1."jml film" =
		(SELECT MAX(T2."jml film")
			FROM
				(SELECT NM_ARTIS,
						COUNT(*) AS "jml film"
					FROM FILM F
					INNER JOIN ARTIS A ON F.ARTIS = A.KD_ARTIS
					GROUP BY NM_ARTIS)T2)

--24. Tampilkan negara mana yang paling banyak filmnya
SELECT *
FROM
	(SELECT N.NM_NEGARA,
			COUNT(*) AS "JUMLAH FILM"
		FROM FILM F
		INNER JOIN ARTIS A ON F.ARTIS = A.KD_ARTIS
		INNER JOIN NEGARA N ON A.NEGARA = N.KD_NEGARA
		GROUP BY N.NM_NEGARA)T1
WHERE T1."JUMLAH FILM" =
		(SELECT MAX(T2."JUMLAH FILM")
			FROM
				(SELECT N.NM_NEGARA,
						COUNT(*) AS "JUMLAH FILM"
					FROM FILM F
					INNER JOIN ARTIS A ON F.ARTIS = A.KD_ARTIS
					INNER JOIN NEGARA N ON A.NEGARA = N.KD_NEGARA
					GROUP BY N.NM_NEGARA)T2)

--25. Tampilkan data negara dengan jumlah filmnya

SELECT
	N.NM_NEGARA,
	COUNT(*) AS "JUMLAH FILM"
FROM FILM F
INNER JOIN ARTIS A ON F.ARTIS = A.KD_ARTIS
INNER JOIN NEGARA N ON A.NEGARA = N.KD_NEGARA
GROUP BY N.NM_NEGARA;

--26 tampilkan nama produser yg skalanya international
SELECT
	NM_PRODUSER,
	INTERNATIONAL
	FROM PRODUSER WHERE INTERNATIONAL = 'YA'
	
--27 tampilkan jumlah film dr masing2 produser
SELECT 
	P.NM_PRODUSER,
	COUNT(NM_FILM) AS "JUMLAH FILM"
FROM FILM F
RIGHT JOIN PRODUSER P ON F.PRODUSER = P.KD_PRODUSER
GROUP BY P.NM_PRODUSER

--28 tampilkan jumlah nominasi dari masing2 produser
SELECT 
	P.NM_PRODUSER,
	SUM(NOMINASI) AS "JUMLAH NOMINASI"
FROM FILM F
RIGHT JOIN PRODUSER P ON F.PRODUSER = P.KD_PRODUSER
GROUP BY P.NM_PRODUSER


--29 tampilkan jumlah pendapatan produser marvel secara keseluruhan
SELECT 
	P.NM_PRODUSER,
	SUM(PENDAPATAN) AS "JUMLAH PENDAPATAN"
FROM FILM F
INNER JOIN PRODUSER P ON F.PRODUSER = P.KD_PRODUSER
WHERE P.NM_PRODUSER = 'MARVEL'
GROUP BY P.NM_PRODUSER

--30 tampilkan jumlah pendapatan produser yg skalanya tidak international
SELECT 
	P.NM_PRODUSER,
	SUM(PENDAPATAN) AS "JUMLAH PENDAPATAN"
FROM FILM F
RIGHT JOIN PRODUSER P ON F.PRODUSER = P.KD_PRODUSER
WHERE INTERNATIONAL = 'TIDAK'
GROUP BY P.NM_PRODUSER

--31 tampilkan produser yg tidak punya film
SELECT
	P.NM_PRODUSER,
	F.NM_FILM
FROM FILM F
RIGHT JOIN PRODUSER P ON F.PRODUSER = P.KD_PRODUSER
WHERE NM_FILM IS NULL

--32 tampilkan produser film yg memilikI artis termahal
SELECT
	P.NM_PRODUSER,
	A.NM_ARTIS
FROM FILM F
INNER JOIN PRODUSER P ON F.PRODUSER = P.KD_PRODUSER
INNER JOIN ARTIS A  ON F.ARTIS = A.KD_ARTIS
WHERE BAYARAN = (SELECT MAX(BAYARAN) FROM ARTIS)

--33 tampilkan produser yg memiliki artis paling banyak	
SELECT *
FROM
	(SELECT P.NM_PRODUSER,
			COUNT(DISTINCT ARTIS) AS "JUMLAH ARTIS"
		FROM FILM F
		INNER JOIN PRODUSER P ON F.PRODUSER = P.KD_PRODUSER
		INNER JOIN ARTIS A ON F.ARTIS = A.KD_ARTIS
		GROUP BY P.NM_PRODUSER)T1
WHERE T1."JUMLAH ARTIS" =
		(SELECT MAX(T2."JUMLAH ARTIS")
			FROM
				(SELECT P.NM_PRODUSER,
						COUNT(DISTINCT ARTIS) AS "JUMLAH ARTIS"
					FROM FILM F
					INNER JOIN PRODUSER P ON F.PRODUSER = P.KD_PRODUSER
					INNER JOIN ARTIS A ON F.ARTIS = A.KD_ARTIS
					GROUP BY P.NM_PRODUSER)T2)

--34 tampilkan produser yg memiliki artis paling sedikit
SELECT *
FROM
	(SELECT P.NM_PRODUSER,
			COUNT(DISTINCT ARTIS) AS "JUMLAH ARTIS"
		FROM FILM F
		RIGHT JOIN PRODUSER P ON F.PRODUSER = P.KD_PRODUSER
		GROUP BY P.NM_PRODUSER)T1
WHERE T1."JUMLAH ARTIS" =
		(SELECT MIN(T2."JUMLAH ARTIS")
			FROM
				(SELECT P.NM_PRODUSER,
						COUNT(DISTINCT ARTIS) AS "JUMLAH ARTIS"
					FROM FILM F
					RIGHT JOIN PRODUSER P ON F.PRODUSER = P.KD_PRODUSER
					GROUP BY P.NM_PRODUSER)T2)
					
					
------------------------DAY 11-------------------------------

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

---------------------------------------------------------
--CONCAT : MENGGABUNGKAN 2 ATAU LEBIH KATA

SELECT * FROM BIODATA

SELECT
	FIRST_NAME,
	LAST_NAME,
	CONCAT(FIRST_NAME,' ',LAST_NAME) AS "FULL NAME 1",
	FIRST_NAME||' '||LAST_NAME AS "FULL NAME 2"
FROM BIODATA

--FUNGSI NOW() : MENAMPILKAN WAKTU/DATE SEKARANG

SELECT NOW()

--FUNGSI DATE_PART : AMBIL/EXTRACT BAGIAN DARI WAKTU
SELECT DATE_PART('YEAR',NOW())
SELECT DATE_PART('MONTH',NOW())
SELECT DATE_PART('DAY',NOW())

SELECT DATE_PART('YEAR','02/01/2023')--EROR KARENA '02/01/2023' BUKAN DATE

--FUNGSI TO_DATE() = UNTUK MENGKONVERSI STRING KE DATE
SELECT TO_DATE('02/01/2023','DD/MM/YYYY') AS "TANGGAL"

SELECT DOB,
	DATE_PART('YEAR',TO_DATE(DOB,'YYYY-MM-DD')) AS "TAHUN"
FROM BIODATA

--FUNGSI AGE() : MENGHITUNG USIA/ SELISIH DARI 2 DATE

SELECT NOW();
SELECT TO_DATE('15/04/2000','DD/MM/YYYY')
SELECT AGE(NOW(),TO_DATE('15/04/2000','DD/MM/YYYY'))
SELECT DATE_PART('YEAR',AGE(NOW(),TO_DATE('15/05/2000','DD/MM/YYYY')))

SELECT 
FIRST_NAME||' '||LAST_NAME AS "FULL NAME",
	DOB,
	TO_DATE(DOB,'YYYY-MM-DD'),
	AGE(NOW(),TO_DATE(DOB,'YYYY-MM-DD')),
	DATE_PART('YEAR',AGE(NOW(),TO_DATE(DOB,'YYYY-MM-DD'))) AS "UMUR"
FROM BIODATA

--CASE WHEN END -> KONDISI PECABANGAN DI SQL
SELECT POB,
	CASE 
		WHEN POB ILIKE 'BALI' THEN 'BALI SKUY'
		WHEN POB = 'Bandung' THEN 'PARIS VAN JAVA'
		ELSE 'KOTA TIDAK DITEMUKAN'
	END
FROM BIODATA

--LATIHAN 1
--1. TAMPILKAN FULLNAME, JABATAN, USIA & JUMLAH ANAK DARI MASING2 KARYAWAN
SELECT 
	B.FIRST_NAME||' '||LAST_NAME AS FULLNAME,
	P.NAME AS JABATAN,
	DATE_PART('YEAR',AGE(NOW(),TO_DATE(DOB,'YYYY-MM-DD'))) AS USIA,
	SUM(CASE 
			WHEN F.STATUS ILIKE 'ANAK' THEN 1
			ELSE 0
		END) AS "JUMLAH ANAK"
FROM BIODATA B
INNER JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
INNER JOIN EMPLOYEE_POSITION EP ON E.ID = EP.EMPLOYEE_ID
INNER JOIN POSITION P ON EP.POSITION_ID = P.ID
LEFT JOIN FAMILY F ON B.ID = F.BIODATA_ID
GROUP BY FULLNAME,JABATAN,USIA


--2. HITUNG BERAPA HARI CUTI YANG SUDAH DI AMBIL MASING2 KARYAWAN
SELECT 
	B.FIRST_NAME||' '||LAST_NAME AS FULLNAME,
	SUM(AGE(END_DATE, START_DATE)) AS JUMLAHCUTI,
	COALESCE(DATE_PART('DAY',SUM(AGE(END_DATE,START_DATE))),0) AS JUMLAHCUTI
FROM BIODATA B
INNER JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
LEFT JOIN LEAVE_REQUEST LR ON E.ID = LR.EMPLOYEE_ID
GROUP BY FULLNAME

--3. TAMPILKAN FULLNAME DAN JABATAN 3 KARYAWAN PALING TUA
SELECT 
	B.FIRST_NAME||' '||LAST_NAME AS FULLNAME,
	P.NAME AS JABATAN,
	DATE_PART('YEAR',AGE(NOW(),TO_DATE(DOB,'YYYY-MM-DD'))) AS USIA
FROM BIODATA B
INNER JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
INNER JOIN EMPLOYEE_POSITION EP ON E.ID = EP.EMPLOYEE_ID
INNER JOIN POSITION P ON EP.POSITION_ID = P.ID
ORDER BY USIA DESC LIMIT 3

--4. TAMPILKAN NAMA2 PELAMAR YANG TIDAK DITERIMA KARYAWAN
SELECT 
	B.FIRST_NAME||' '||LAST_NAME AS FULLNAME,
	P.NAME AS JABATAN
FROM BIODATA B
LEFT JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
LEFT JOIN EMPLOYEE_POSITION EP ON E.ID = EP.EMPLOYEE_ID
LEFT JOIN POSITION P ON EP.POSITION_ID = P.ID
WHERE NAME IS NULL

--5. HITUNG BERAPA RATA-RATA GAJI KARYAWAN DENGAN LEVEL STAFF
SELECT 
	ROUND(AVG(SALARY)) AS RATA_RATA
FROM BIODATA B
INNER JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
LEFT JOIN EMPLOYEE_POSITION EP ON E.ID = EP.EMPLOYEE_ID
LEFT JOIN POSITION P ON EP.POSITION_ID = P.ID
WHERE NAME ILIKE 'STAFF'


--1. TAMPILKAN STATUS KARYAWAN DAN JUMLAH KARYAWAN UNTUK SETIAP STATUSNYA
SELECT 
	E.STATUS,
	COUNT(STATUS) AS JUMLAH_STATUS
FROM BIODATA B
INNER JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
GROUP BY E.STATUS

--2. TAMPILKAN DATA YANG BUKAN MERUPAKAN KARYAWAN
SELECT 
	B.FIRST_NAME||' '||LAST_NAME AS FULLNAME,
	P.NAME AS JABATAN
FROM BIODATA B
LEFT JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
LEFT JOIN EMPLOYEE_POSITION EP ON E.ID = EP.EMPLOYEE_ID
LEFT JOIN POSITION P ON EP.POSITION_ID = P.ID
WHERE NAME IS NULL

--3. TAMPILKAN FULLNAME, STATUS PERNIKAHAN (SUDAH MENIKAH/ BELUM MENIKAH) DAN NAMA ANAK
-- DARI DATA BIODATA YANG SUDAH PUNYA ANAK
SELECT 
	B.FIRST_NAME||' '||LAST_NAME AS FULLNAME,
	CASE
		WHEN MARITAL_STATUS IS TRUE THEN 'SUDAH MENIKAH'
		ELSE 'BELUM MENIKAH'
	END AS STATUS_MENIKAH,
	F.NAME
FROM BIODATA B
LEFT JOIN FAMILY F ON B.ID = F.BIODATA_ID


--4. TAMPILKAN NAMA LENGKAP KARYAWAN BESERTA DEPARTEMENTNYA
-- (BONUS KARENA TABEL DEPARTEMENT TIDAK ADA RELASI)


--5. TAMPILKAN TAHUN LAHIR & JUMLAH KARYAWAN YANG MEMPUNYAI TAHUN LAHIR YANG SAMA
SELECT 
	DATE_PART('YEAR',TO_DATE(DOB,'YYYY-MM-DD')) AS TAHUN,
	COUNT(DOB) AS JUMLAH_KARYAWAN
FROM BIODATA B
LEFT JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
LEFT JOIN EMPLOYEE_POSITION EP ON E.ID = EP.EMPLOYEE_ID
LEFT JOIN POSITION P ON EP.POSITION_ID = P.ID
WHERE NAME IS NOT NULL
GROUP BY TAHUN

--6. TAMPILKAN DATA BIODATA & JABATAN DARI KARYAWAN
SELECT 
	B.*,
	P.NAME AS JABATAN
FROM BIODATA B
INNER JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
INNER JOIN EMPLOYEE_POSITION EP ON E.ID = EP.EMPLOYEE_ID
INNER JOIN POSITION P ON EP.POSITION_ID = P.ID

--7. TAMPILKAN DATA BIODATA YANG ALAMAT & TEMPAT LAHIRNYA BUKAN JAKARTA
SELECT 
	B.*
FROM BIODATA B
WHERE B.POB NOT ILIKE 'Jakarta'

--8. TAMPILKAN FULLNAME, JABATAN DAN USIA DARI KARYAWAN
SELECT 
	B.FIRST_NAME||' '||LAST_NAME AS FULLNAME,
	P.NAME AS JABATAN,
	DATE_PART('YEAR',AGE(NOW(),TO_DATE(DOB,'YYYY-MM-DD'))) AS USIA
FROM BIODATA B
INNER JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
INNER JOIN EMPLOYEE_POSITION EP ON E.ID = EP.EMPLOYEE_ID
INNER JOIN POSITION P ON EP.POSITION_ID = P.ID

--9. TAMPILKAN NAMA KARYAWAN YANG CUTINYA PALING LAMA
SELECT *
FROM
	(SELECT B.FIRST_NAME || ' ' || LAST_NAME AS FULLNAME,
			SUM(AGE(END_DATE,START_DATE)) AS JUMLAHCUTI
		FROM BIODATA B
		INNER JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
		LEFT JOIN LEAVE_REQUEST LR ON E.ID = LR.EMPLOYEE_ID
		GROUP BY FULLNAME)T1
WHERE T1.JUMLAHCUTI = (SELECT MAX(T2.JUMLAHCUTI)
					  FROM (SELECT B.FIRST_NAME || ' ' || LAST_NAME AS FULLNAME,
									SUM(AGE(END_DATE,START_DATE)) AS JUMLAHCUTI
							FROM BIODATA B
							INNER JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
							LEFT JOIN LEAVE_REQUEST LR ON E.ID = LR.EMPLOYEE_ID
							GROUP BY FULLNAME)T2)


--10. TAMPILKAN NAMA KARYAWAN, JENIS PERJALANAN DINAS, TANGGAL PERJALANAN DINAS
-- DAN TOTAL PENGELUARANNYA SELAMA PERJALANAN DINAS TERSEBUT
SELECT
	B.FIRST_NAME||' '||LAST_NAME AS FULLNAME,
	TT.NAME AS JENIS_PERJALANAN,
	TR.START_DATE|| ' S.D '||TR.END_DATE AS TANGGAL_PERJALANAN,
	SUM(TS.ITEM_COST) + TT.TRAVEL_FEE AS TOTAL_PENGELUARAN
FROM BIODATA B
LEFT JOIN EMPLOYEE E ON B.ID = E.BIODATA_ID
LEFT JOIN TRAVEL_REQUEST TR ON E.ID = TR.EMPLOYEE_ID
LEFT JOIN TRAVEL_TYPE TT ON TR.TRAVEL_TYPE_ID = TT.ID
JOIN TRAVEL_SETTLEMENT TS ON TR.ID = TS.TRAVEL_REQUEST_ID
GROUP BY FULLNAME,JENIS_PERJALANAN,TANGGAL_PERJALANAN,TT.TRAVEL_FEE


--CASTING/CONVERT TIPE DATA YANG DITAMPILKAN 
SELECT '100' AS DATA;
SELECT '100'::INT AS DATA;

SELECT '50' + '50'::INT;














