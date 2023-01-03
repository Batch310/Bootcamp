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


--TO_DATE() = melakukan conver dari STRING ke DATE

select to_date('02/01/2023','DD/MM/YYYY'); -- konversi dari string ke format tanggal dd/mm/yyyy
select date_part('year', to_date('02/01/2023','DD/MM/YYYY')); -- menampilkan yang sudah dikonversi ke date

