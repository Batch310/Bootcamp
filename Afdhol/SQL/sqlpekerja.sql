--CONCAT = untuk menggabungkan dua atau lebih

select *from biodata

select
	first_name,
	last_name,
	concat(first_name,' ',last_name) as "FULL NAME 1",
	first_name || ' ' || last_name as "FULL NAME 2"
from biodata

--fungsi NOW() untuk menampilkan waktu/date sekarang
--tipe data nya DATE

select now();

-- DATE_PART = ambil/extract bagian dari waktu

select date_part('year',now());
select date_part('month',now());
select date_part('days',now());

select date_part('year','02/01/2023'); -- error karena '02/01/2023' bukan tipe data date


--TO_DATE() = melakukan convert dari STRING ke DATE

select to_date('02/01/2023','DD/MM/YYYY'); -- konversi dari string ke format tanggal dd/mm/yyyy
select date_part('year', to_date('02/01/2023','DD/MM/YYYY')); -- menampilkan yang sudah dikonversi ke date

select 
	dob,
	date_part('year', to_date(dob,'yyyy-mm-dd')) as "Tahun Lahir"
from biodata

select 
	dob,
	date_part('year', age(now(),to_date(dob,'yyyy-mm-dd')))
from biodata

-- AGE() = menghitung selisih dari dua DATE
--dua parameter dengan keduanya sama-sama DATE

select now();
select to_date('15/04/2000','dd/mm/yyyy');
select age(now(),to_date('15/04/2000','dd/mm/yyyy'));
select date_part('year',age(now(),to_date('15/04/2000','dd/mm/yyyy')));

select
	dob,
	to_date(dob,'yyyy-mm-dd'),
	age(now(),to_date(dob,'yyyy-mm-dd')),
	date_part('year',age(now(),to_date(dob,'yyyy-mm-dd'))) as "umur"
from biodata


-- CASE WHEN END = kondisi percabangan di sql
-- untuk memudahkan, buat case dan end terlebih dahulu lalu isi kondisinya

select 
	--Kolom 1
	pob,
	--kolom 2
	case
		when pob ilike 'bali' then 'BALI SKY'
		When pob ilike 'bandung' then 'Bandung van Java'
		else 'Kota entah'
	end
from biodata;

--LATIHAN 1

-- 1 tampilkan fullname, jabatan, usia dan jumlah anak dari masing-masing karyawan

select
	concat(first_name,' ',last_name) as "fullname",
	p.name as "Jabatan",
	date_part('year', age (now(),to_date(dob,'yyyy-mm-dd'))) as "Usia",
	--hitung status sebagai apa kemudian diganti 1 atau 0
	sum(case 
	when f.status ilike 'anak' then 1
	else 0
	end) as "Jumlah Anak"	

from biodata b
inner join employee e
	on b.id = e.biodata_id
inner join employee_position ep
	on e.id = ep.employee_id
inner join position p
	on ep.position_id = p.id
left join family f
	on b.id = f.biodata_id
group by p.name,fullname,"Usia";

--2 hitung berapa hari cuti yang sudah diambil masing masin karyawan
--fungsi COALESCE = digunakan untuk mengubah nilai nul menjadi nilai lain
select 
	concat(b.first_name, b.last_name) as fullname,
	sum(age(lr.end_date,lr.start_date)) as "nama karyawan", --hitung selisih dan jumlahkan
	coalesce(date_part('day',sum(age(lr.end_date,lr.start_date))),0) as "Jumlah cuti"
from biodata b
join employee e
	on b.id = e.biodata_id
left join leave_request lr
	on e.id = lr.employee_id
group by fullname;



--3 tampilkan fullname dan jabatan 3 karyawan paling tua

select
	concat (b.first_name,' ', b.last_name) as fullname,
	--p.name,
	date_part('year', age (now(),to_date(dob,'yyyy-mm-dd'))) as "Usia"
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = ep.employee_id
join position p
	on ep.position_id = p.id
order by  "Usia" desc
limit 3


--4 tampilkan nama nama pelamar yang tidak diterima karyawan

select 
	concat(b.first_name,' ',b.last_name) as "nama"
	--p.name
from biodata b
left join employee e
	on b.id = e.biodata_id
left join employee_position ep
	on e.id = ep.employee_id
left join position p
	on ep.position_id = p.id 
where p.name is null

--5 hitung berapa rata-rata gaji karyawan dengan level staff

select 
	--concat(b.first_name,' ',b.last_name) as "nama",
	p.name,
	round(avg(e.salary))
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = ep.employee_id
join position p
	on ep.position_id = p.id 
where p.name ilike 'staff'
group by  p.name





-LATIHAN (LAGI)

--1 TAMPILKAN STATUS KARYAWAN DAN JUMLAH KARYAWAN UNTUK SETIAP STATUSNYA

select 
	e.status,
	count(e.status) as "Jumlah Karyawan"
from biodata b
join employee e
	on b.id = e.biodata_id
group by e.status

--2 TAMPILKAN DATA BIODATA YANG BUKAN MERUPAKAN KARYAWAN

select
	concat(b.first_name,' ',b.last_name) as "nama",
	b.dob as "Tanggal lahir",
	b.pob as "Tempat lahir",
	b.address as Alamat,
	b.marital_status as "Status Pernikahan"
	--p.name
from biodata b
left join employee e
	on b.id = e.biodata_id
left join employee_position ep
	on e.id = ep.employee_id
left join position p
	on ep.position_id = p.id 
where p.name is null


--3 TAMPILKAN FULLNAME, STATUS PERNIKAHAN (MENIKAH/BLM MENIKAH) DAN NAMA ANAK 
-- DARI DATA BIODATA YANG SUDAH PUNYA ANAK

select
	concat(b.first_name,' ',b.last_name) as "Fullname",
	case
	when b.marital_status = 'True' Then 'Menikah'
	when b.marital_status = 'False' Then 'Belum Menikah'
	end as "Status Pernikahan",
	f.name as "nama Anak"
from biodata b
left join family f
	on b.id = f.biodata_id

--4 TAMPILKAN NAMA LENGKAP KARYAWAN BESERTA DEPARTEMENNYA (BONUS TIDAK ADA RELASI)

--5 TAMPILKAN TAHUN LAHIR DAN JUMLAH KARYAWAN YANG MEMPUNYAI TAHUN LAHIR SAMA

select
	date_part('year', to_date(dob,'yyyy-mm-dd')) as "tahun lahir",
	count(first_name) as "Jumlah Karyawan"
from biodata
where 'tahun lahir' like  'tahun lahir' 
group by "tahun lahir"

--6 TAMPILKAN DATA BIODATA DAN JAbATAN DARI KARYAWAN

select 
	b.*,
	case
	when b.marital_status = 'True' Then 'Menikah'
	when b.marital_status = 'False' Then 'Belum Menikah'
	end as "Status Pernikahan",
	p.name as "Jabatan"
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = ep.employee_id
join position p
	on ep.position_id = p.id 

--7 TAMPILKAN DATA BIODATA YANG ALAMAT DAN TEMPAT LAHIRNYA BUKAN JAKARTA

select 
	concat (first_name,' ',last_name) as "Nama Lengkap",
	dob as "Tanggal lahir",
	pob as "Tempat lahir",
	address as Alamat,
	marital_status as "Status Pernikahan"
from biodata b
where pob not ilike 'Jakarta'
and address not ilike 'jakarta'

--8 TAMPILKAN FULLNAME, JABATAN DAN USIA DARI KARYAWAN

select 
	concat (first_name,' ',last_name) as "Nama Lengkap",
	date_part('year', age (now(),to_date(dob,'yyyy-mm-dd'))) as "Usia",
	p.name
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = ep.employee_id
join position p
	on p.id = ep.position_id;

--9 TAMPILKAN NAMA KARYAWAN YANG CUTINYA PALING LAMA

drop table if exists temp_table;
create temporary table temp_table(
	nama_karyawan text,
	jml_cuti text,
	lama_cuti integer
);

insert into temp_table(
select 
	concat (b.first_name,' ',b.last_name) as "Nama Karyawan",
	sum(age(end_date,start_date)) as "lamanya",
	count('lamanya')
from biodata b 
join employee e
	on b.id = e.biodata_id
join leave_request lr
	on e.id = lr.employee_id
group by "Nama Karyawan"
);

select * from temp_table;

select 	
	nama_karyawan,
	jml_cuti
from temp_table t1
where t1.jml_cuti = ( select max(t2.jml_cuti) from temp_table t2)

--10 TAMPILKAN NAMA KARYAWAN JENIS PERJALANAN DINAS, TANGGAL PERJALANAN DINAS
-- DAN TOTAL PENGELUARANNYA SELAMA PERJALANAN DINAS TERSEBUT

select 
	concat(b.first_name,' ',b.last_name) as "Nama",
	tt.name "Jenis Perjalanan",
	concat(tr.start_date,' s/d ',tr.end_date) as "Tanggal",
	sum(ts.item_cost) + tt.travel_fee  as "Total Pengeluaran"
from biodata b
join employee e
	on b.id = e.biodata_id
join travel_request tr
	on e.id = tr.employee_id
join travel_type tt
	on tr.travel_type_id = tt.id
join travel_settlement ts
	on tr.id = ts.travel_request_id
group by "Nama", tt.name,"Tanggal", tt.travel_fee;

--CASTING/CONVERT tipe data yang ditampilkan atau diolah
select '100' as data; --bentuk pertama adalah text
select '100'::int as data; -- ubah menjadi integer

select '100'+'50'::int;
	

