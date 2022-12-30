--Buat Database

--perintah DDL
create database batch310;

--DDL DROP database
drop database batch310;

--DDL CREATE tabel
create table pegawai(
	id_pegawai integer primary key, 
	--ubah integer menjadi serial untuk membuat auto increment
	umur integer,
	nama_pegawai text
);

--DDL DROP tabel
drop table pegawai;


create table ktp(
	nik integer primary key,
	nama text,
	ttl text,
	jenis_kelamin text,
	alamat text
);

--DML menampilkan kolom dari tabel

select *from ktp;

--DDL ALTER TABLE mengubah nama kolom
alter table ktp
rename column ttl to tempat_tgl_lahir;

--DDL mengubah tipe data kolom
alter table ktp 
alter column jenis_kelamin type boolean USING jenis_kelamin::boolean 
--using jenis_kelamin boolean :: digunakan untuk memaksa mengubah menjadi boolean apabila sudah ada data

--DDL menghapus kolom 
alter table ktp
drop column tempat_tgl_lahir;

--DDL menambah kolom
alter table ktp
add column tempat_lahir text,
add column tgl_lahir date;


--DML INSERT data

create table pegawai(
	id_pegawai integer primary key,
	umur integer,
	nama_pegawai text
);



--DML INSERT data

--cara 1
insert into pegawai(id_pegawai,umur,nama_pegawai)
values 
(5,20,'Bror'),
(4,24,'Joko');


--cara 2
insert into pegawai
values
(12,12,'harun');

--DDL update data 
update pegawai
set umur = 15 --yang ingin diubah
where id_pegawai = 4; -- pilih id yg mana 

update pegawai
set umur = 25, nama_pegawai = 'pesulap merah' -- ubah umur dan nama
where id_pegawai = 4;

select *from pegawai;


--DML Delete data
delete from pegawai 
where id_pegawai=4;

--DML SELECT

select nama_pegawai from pegawai; 

--menampilkan berdasarkan urutan yang ditentukan
select nama_pegawai, umur from pegawai;
select umur,nama_pegawai from pegawai;

--Alias nama kolom
select
	nama_pegawai as "Pegawai", --"" digunakan untuk lebih dari 1 kata, 
	umur
from
	pegawai;

--Coba coba
--hanya menampilkan
SELECT 2*3 as "Hasil Kali 2x3";
select 'Joko' as "Warga RT 02";

--Select ORDER BY
select * from pegawai order by id_pegawai desc; --mengurutkan data ascending atau descending
select * from pegawai order by id_pegawai asc; 

--select DISTINCT
--hanya mengambil data yang unik

select distinct umur,nama_pegawai from pegawai;

select distinct umur from pegawai;

select *from pegawai;

--select WHERE 
select *from pegawai where nama_pegawai = 'Bror';

select *from pegawai where umur = 20 and nama_pegawai='Jambronx';

select distinct nama_pegawai from pegawai where umur =20;

select distinct nama_pegawai,umur --apa yang ditampilkan
from pegawai --tabel mana
where umur = 20; --dimana umur = 20

--select WHERE IN
--digunakan untuk menyeleksi dengan kondisi
select *from pegawai where umur in (23,25); -- umur yang termasuk dari 23-25

select *from pegawai where nama_pegawai 
in ('harun','Bror');

--select WHERE BETWEEN (diantara)
select *from pegawai where umur between 20 and 23; 
--memilih diantara 20 dan 23, hanya bisa untuk numerik

--select where LIKE 
select *from pegawai where nama_pegawai like 'Panji%'; --kata depan

select *from pegawai where nama_pegawai like '%ular'; --kata belakang

select *from pegawai where nama_pegawai like '%anu%' --kata tengah

--fungsi AGREGAT

--1. AVG untuk menghitung rata- rata
--2. SUM untuk menjumlahkan
--3. COUNT untuk menghitung
--4. MIN mendapatkan nilai terendah
--5. MAX untuk nilai tertinggi

select max(umur) from pegawai;

select min(umur) from pegawai;

select sum(umur) from pegawai;

select avg(umur) from pegawai;

select count(umur) from pegawai;

--fungsi GROUP BY
--jika kita ingin menampilkan kolom dengan agregat function wajib menggunakan group by

select nama_pegawai,max (umur) from pegawai group by nama_pegawai;










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

select *from film;

--ROUND Membuat pembulatan 
select round(2.3);
select round(2.6);
select floor9(2.8);
select ceil(2.1);

--1 tampilkan nama film dan nominasi dari nominasi terbesar

select nm_film as "nama film", nominasi from film order by nominasi desc;

--2 tampilkan nama film dan pendapatan dari yang terkecil

select nm_film, pendapatan from film order by pendapatan asc;

--3 tampilkan nama film dan nominasi yang tidak dapat nominasi

select nm_film, nominasi from film 
where nominasi=0;

-- 4 tampikan nama film dan nominasi yang paling banyak mendapatkan nominasi

select nm_film,nominasi 
from film  
where nominasi = (select max(nominasi) from film);

--5 tampilkan nama film dan pendapatan yang terbesar

select nm_film, pendapatan 
from film 
where pendapatan = (select max(pendapatan) from film)

--6 tampilkan rata2 pendapatan seluruh film
select round(avg(pendapatan)) as "Rata-rata"
from film;

--7 tampilkan rata-rata nominasi film keseluruhan
select round(avg(nominasi)) as "Rata-rata"
from film;

--mengubah huruf kecil atau kapital
--LOWER dan UPPER
select lower('YUDHA');
select upper('yudha');

select nm_film as "nama film"
from film
where lower(nm_film) like 'p%';

--Cara 2: iLIKE 

select nm_film as "Nama film"
from film
where nm_film ilike 'p%'

--8 tampilkan nama film huruf depan 'p'

select * from film;

select nm_film as "Nama Film" 
from film
where nm_film ilike 'p%';

-- 9tampilkan nama film huruf terakhir 's'

select nm_film as "Nama Film"
from film
where nm_film ilike '%s';

----tampilkan nama film mengandung huruf 'd'

select nm_film as "Nama film"
from film
where nm_film ilike '%D%';

--12 tampilkan nama film dengan pendapatan terkecil yang mengandung huruf 'b'


--select nm_film,min(pendapatan)
--from film
--where nm_film like '%B%'
--group by nm_film;


select nm_film, pendapatan 
from film 
where pendapatan = (select min(pendapatan) from film where nm_film ilike '%B%');

-- 13 tampikan nama film dengan pendapatan terbesar yang mengandung huruf 'd'

--select nm_film, max(pendapatan)
--from film 
--where nm_film like '%D%'
--group by nm_film;



select nm_film, pendapatan 
from film 
where pendapatan = (select max(pendapatan) from film where nm_film ilike '%D%');


--JOIN DUA TABLE

create table kota(
	id integer primary key,
	nama text,
	id_propinsi integer 
)

create table propinsi(
	id integer primary key,
	nama text
)

select *from propinsi;


select *from kota;

insert into  propinsi (id,nama)
values (5,'Jawa Timur');

insert into  kota (id,nama,id_propinsi)
values 
(1,'Jakarta',1),
(2,'Bandung',2),
(3,'Sumedang',3),
(4,'Makasar',4),
(5,'Surabaya',5),
(6,'Medan',6);

--JOIN / INNER JOIN

select
	kota.nama as "Kota",	
	propinsi.nama as "Provinsi"
from kota
join propinsi
on kota.id_propinsi = propinsi.id; -- join berdasarkan apa

--Membuat alias nama tabel 

select
	k.nama as "Kota",	
	p.nama as "Provinsi"
from kota k --membuat alias dari kota menjadi 'k'
join propinsi p -- membuat aliasa dari propinsi menjadi 'p'
	on k.id_propinsi = p.id;
	
--LEFT JOIN

select
	k.nama as "Kota",	
	p.nama as "Provinsi"
from kota k 
left join propinsi p -- left join sesuai urutan (disini kota sebagai kiri)
	on k.id_propinsi = p.id;
	
--RIGHT JOIN
select
	k.nama as "Kota",	
	p.nama as "Provinsi"
from kota k 
right join propinsi p -- left join sesuai urutan (disini propinsi sebagai kanan)
	on k.id_propinsi = p.id;

--FULL JOIN
select
	k.nama as "Kota",	
	p.nama as "Provinsi"
from kota k 
full outer join propinsi p -- left join sesuai urutan (disini propinsi sebagai kanan)
	on k.id_propinsi = p.id;
