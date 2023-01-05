1--
select 
	e.status,
	count (b.first_name)
from biodata b
join employee e
	on b.id = e.biodata_id
group by e.status;

2--
select
	b.*
from biodata b
left join employee e
	on b.id = e.biodata_id
where e.biodata_id is null;

--3
select
	b.first_name || ' ' || b.last_name as full_name,
	case
	when b.marital_status = true then 'Sudah Menikah'
	else 'Belum Menikah'
	end
	as Status_pernikahan,
	sum (case 
		 when f.status ilike 'anak' then 1
		else 0
		end) as jumlah_anak
from biodata b
join family f
	on b.id = f.biodata_id
group by full_name, Status_pernikahan;

--4
select * from department;

--5
select
	date_part ('year', to_date (b.dob, 'yyyy-mm-dd')) as tahun_lahir,
	count (b.dob) as jumlah_tahun_lahir
from biodata b
join employee e
	on b.id = e.biodata_id
group by tahun_lahir;

--6
select
	b.*,
	p.name
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = ep.employee_id
join position p
	on p.id = ep.position_id
	
--7
select
	b.*
from biodata b
where b.pob ilike 'jakarta' and not address ilike '%jakarta';

--8
select
	b.first_name || ' ' || b.last_name as full_name,
	p.name as jabatan,
	date_part('year', age(now(),to_date(b.dob,'yyyy-mm-dd'))) as usia,
	sum (case 
	when f.status ilike 'anak' then 1
	else 0
	end ) as jml_anak
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = ep.employee_id
join position p
	on p.id = ep.position_id
left join family f
	on b.id = f.biodata_id
group by full_name, jabatan, usia;

--9
select
	b.first_name as nama,
	coalesce(sum(date_part('day', age(lr.end_date, lr.start_date))),0) as jmlh_hari_cuti
from biodata b
join employee e
	on b.id = e.biodata_id
join leave_request lr
	on e.id = lr.employee_id
group by nama;

--10
select
	b.first_name || ' ' || b.last_name as nama_karyawan,
	tt.name as jenis_perjalanan_dinas,
	tr.start_date || ' s.d ' || tr.end_date as tanggal_perjalanan_dinas,
	sum (ts.item_cost) + tt.travel_fee as total_pengeluaran
from biodata b
join employee e
	on b.id = e.biodata_id
join travel_Request tr
	on e.id = tr.employee_id
join travel_type tt
	on tt.id = tr.travel_type_id
join travel_settlement ts
	on tr.id = ts.travel_request_id
group by nama_karyawan, jenis_perjalanan_dinas, tanggal_perjalanan_dinas, tt.travel_fee;