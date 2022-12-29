--Ini comment di SQL
--DDL Buat Database
Create Database Batch310;

--DDL Hapus Database
Drop Database Batch310;

--DDL Buat Tabel
Create Table Pegawai(
	ID_Pegawai integer primary key, --Kalau mau auto increment, ubah tipe data menjadi serial
	Umur integer,
	Nama_Pegawai text
);

--DDL Hapus Tabel
Drop Table Pegawai;

--Buatlah Tabel KTP dengan Kolom
--NIK int pk
--Nama text
--TTL text
--Jenis_Kelamin text
--Alamat text
Create Table KTP(
	NIK integer primary key, 
	Nama text,
	TTL text,
	Jenis_Kelamin text,
	Alamat text
);

--DML Tampilkan Semua Kolom dari Tabel KTP
SELECT * FROM KTP;

--DDL Rename Kolom pada Tabel
Alter Table KTP
Rename Column TTL to Tempat_Tgl_Lahir;

--DDL Ubah Tipe Data Kolom
Alter Table KTP
Alter Column Jenis_Kelamin type boolean Using Jenis_Kelamin::boolean; 
--Tanpa Using nama_kolom::tipe_data, tipe data pada kolom tersebut tidak akan berubah. Fungsi Using ini untuk memaksa tipe data diubah menjadi yang diinginkan

--DDL Delete Kolom
Alter Table KTP
Drop Column Tempat_Tgl_Lahir;

--DDL Add Kolom
alter Table KTP
add Column tempat_lahir text,
add Column tgl_lahir date;


select * from pegawai;

--DDL Buat Tabel
Create Table Pegawai(
	ID_Pegawai serial primary key, --Kalau mau auto increment, ubah tipe data menjadi serial
	Umur integer,
	Nama_Pegawai text
);

--DDL Hapus Tabel
Drop Table Pegawai;

--DML Insert Data
--Cara 1
--1 Baris
insert into pegawai(id_pegawai,umur,nama_pegawai)
values(1,20,'Jambrong'); 

--2 Baris atau lebih
insert into pegawai(id_pegawai,umur,nama_pegawai)
values(2,22,'Tian Swaseneger'),
(3,25,'Panji Si Manusia Ular'); 

--1 Baris dengan id_pegawai di auto increment
insert into pegawai(umur,nama_pegawai)
values(20,'Jambrong'); 

--2 Baris atau lebih dengan id_pegawai di auto increment
insert into pegawai(umur,nama_pegawai)
values(22,'Tian Swaseneger'),
(25,'Panji Si Manusia Ular'); 

--Cara 2 Harus menginput data untuk setiap kolomnya
insert into pegawai
values(4,22,'Yudha the Resinging');

--
insert into pegawai(nama_pegawai)
values('Tian Swaseneger');

select * from pegawai;
--DML Update Data //Pada postgre, ketika kita update suatu data maka data itu akan menjadi data paling akhir
update pegawai
set umur = 15
where id_pegawai = 5;

update pegawai
set umur = 23, nama_pegawai = 'Panji Si Manusia Ular'
where id_pegawai = 6;

--DML Delete Data
delete from pegawai
where id_pegawai = 4;

select * from pegawai order by id_pegawai asc;
--DML Select
select * from pegawai;
select nama_pegawai from pegawai;
select nama_pegawai,umur from pegawai; --urut sesuai yang dipanggil dahulu 

--DML Alias Nama Kolom
select 
	nama_pegawai as "Nama Pegawai",
	umur as "Umur"
from
	pegawai;
	
--Coba coba postgre
select 23*4 as "Hasil Perkalian 23 x 4";
select 'Panji' as "Pak Ketua";

--Select order by asc atau desc
select * from pegawai;
select * from pegawai order by id_pegawai asc;
select * from pegawai order by nama_pegawai desc;

--Select distinct; Dia menggunakan logika dan
select * from pegawai;
select distinct umur,nama_pegawai from pegawai;
select distinct * from pegawai;
select distinct umur,nama_pegawai from pegawai order by umur asc;

--Select where biasa
select * from pegawai;
select * from pegawai where nama_pegawai = 'Pesulap Merah'; 
--^^Kalau data tidak ada, maka tabel tidak akan menampilkan data apapun. Dan untuk tipe data text atau varchar dia Case Sensitive
select * from pegawai where umur = 20 and id_pegawai = 1;
select distinct nama_pegawai from pegawai where umur = 25;
select distinct umur,nama_pegawai from pegawai where id_pegawai = 1;

--Select where in
select * from pegawai;
select * from pegawai where umur in (22,25); 
select * from pegawai where nama_pegawai in ('Jambrong','Pesulap Merah','Panji Si Manusia Ular');

--Select where between
select * from pegawai;
select * from pegawai where umur between 20 and 23;

--Select where like
select * from pegawai;
select * from pegawai where nama_pegawai like 'Panji%';
select * from pegawai where nama_pegawai like '%Ular';
select * from pegawai where nama_pegawai like '%an%';

--Fungsi Agregat
--AVG -> Average, untuk menghitung rata - rata
--SUM -> Menghitung penjumlahan
--COUNT -> Menghitung banyak data
--MIN -> Mencari nilai terendah
--MAX -> Mencari niali tertinggi
select * from pegawai;
select max(umur) from pegawai where umur in (23,25);
select min(umur) from pegawai where umur between 20 and 23;
select avg(umur) from pegawai where nama_pegawai like '%an%';
select sum(umur) from pegawai where umur between 20 and 23;
select count(umur) from pegawai where umur = 25;

--Group by untuk menampilkan data selain data yang diagregat dengan fungsi agregat
select nama_pegawai,sum(umur) from pegawai group by nama_pegawai;
select count(nama_pegawai),umur from pegawai group by umur;

select round(2.5); --Membulatkan angka ke atas jika koma >= 5, ke bawah jika koma < 5
select floor(2.8); --Membulatkan angka ke atas
select ceil(2.1); --Membulatkan angka ke bawah

--Fungsi lower atau upper
select lower('HAIDAR');
select upper('amir faruqi');

--Fungsi ilike (incase sensitive like) tidak memperhatikan case sensitive
select nama_pegawai from pegawai where nama_pegawai ilike 'p%';

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

--1 Tampilkan nama film dan nominasi dari nominasi yang terbesar
select 
	nm_film as "nama film",
	nominasi 
from film 
order by nominasi desc;

--2 Tampilkan nama film dan pendapatan dari yang terkecil
select 
	nm_film as "nama film",
	pendapatan 
from film 
order by pendapatan asc;

--3 Tampilkan nama film dan nominasi yang tidak dapat nominasi
select 
	nm_film as "nama film",
	nominasi 
from film 
where nominasi = 0;
--atau
--select nm_film,nominasi from film where nominasi = (select min(nominasi) from film);
--tapi ini mencari nominasi terkecil, yangmana nominasi terkecil belum pasti 0

--4 Tampilkan nama film dan nominasi yang paling banyak mendapatkan nominasi
select 
	nm_film as "nama film",
	nominasi 
from film 
where nominasi = (select max(nominasi) from film);

--5 Tampilkan nama film dan pendapatan yang terbesar
select 
	nm_film as "nama film",
	pendapatan 
from film 
where pendapatan = (select max(pendapatan) from film);

--6	Tampilkan nama film dan pendapatan yang terkecil
select
	nm_film as "nama film",
	pendapatan
from film
where pendapatan = (select min(pendapatan) from film);

--7	Tampilkan rata - rata pendapatan film keseluruhan
select 
	round(avg(pendapatan)) as "rata-rata pendapatan"
from film;

--8 Tampilkan rata - rata nominasi film keseluruhan 
select
	round(avg(nominasi)) as "rata-rata nominasi"
from film;

--9 Tampilkan nama film yang huruf depannya 'p'
select
	nm_film as "nama film"
from film 
where nm_film ilike 'p%'; 

--10 Tampilkan nama film yang huruf terakhirnya 's'
select
	nm_film as "nama film"
from film 
where nm_film ilike '%s';

--11 Tampilkan nama film yang mengandung huruf 'd'
select
	nm_film as "nama film"
from film 
where nm_film ilike '%d%';

--12 Tampilkan nama film dengan pendapatan terkecil yang mengandung huruf 'b'
select * from film where nm_film ilike '%v%';
select 
	nm_film as "nama film",
	pendapatan
from film
where 
	nm_film ilike '%v%'
and 
	pendapatan = (select min(pendapatan) from film where nm_film ilike '%v%');
	
--13 Tampilkan nama film dengan pendapatan terbesar yang mengandung huruf 'd'
select 
	nm_film as "nama film",
	pendapatan
from film
where
	pendapatan = (select max(pendapatan) from film where nm_film ilike '%d%');
	
	
-- Multiple Table
Create Table Kota(
	id integer primary key,
	nama text,
	id_provinsi integer
);

Create Table Provinsi(
	id integer primary key,
	nama text
);

select * from kota;

insert into kota
values (1,'Jakarta',1),
(2,'Bandung',2),
(3,'Sumedang',2),
(4,'Makassar',4),
(5,'Surabaya',5),
(6,'Medan',6);

select * from provinsi;

insert into provinsi
values (1,'DKI Jakarta'),
(2,'Jawa Barat'),
(3,'Papua Barat'),
(4,'Sulawesi Selatan'),
(5,'Jawa Timur');

select 
	*
from kota
inner join provinsi
	on kota.id_provinsi = provinsi.id;
--1 join / inner join
select * from kota;
select * from provinsi;
select
	kota.nama as "Kota",
	provinsi.nama as "Provinsi"
from kota
inner join provinsi
	on kota.id_provinsi = provinsi.id;
	
--Alias nama tabel
select
	k.nama as "Kota",
	p.nama as "Provinsi"
from kota k
inner join provinsi p
	on k.id_provinsi = p.id;
	
--2 left join
select
	k.nama as "Kota",
	p.nama as "Provinsi"
from kota k
left join provinsi p
	on k.id_provinsi = p.id;
	
--3 right join
select
	k.nama as "Kota",
	p.nama as "Provinsi"
from kota k
right join provinsi p
	on k.id_provinsi = p.id;
	
--3 full outer join / full join
select
	k.nama as "Kota",
	p.nama as "Provinsi"
from kota k
full join provinsi p
	on k.id_provinsi = p.id;