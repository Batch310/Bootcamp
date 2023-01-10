select 
	b.*,
	p.name as jabatan
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = ep.employee_id
join position p
	on p.id = ep.position_id


--3
select
	concat(b.first_name,' ',b.last_name) as "Nama Lengkap",
	case
	when b.marital_status = 'True' then 'Menikah'
	else 'Belum Menikah'
	end as "Status Pernikahan",
	sum(
	case
		when f.status = 'Anak' then 1
		else 0
	end	
	)
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = ep.employee_id
join position p
	on p.id = ep.position_id
left join family f
	on b.id = f.biodata_id
group by "Nama Lengkap","Status Pernikahan"


--5
select * from department

select 
	date_part('year',dob) as th,
	count (date_part('year',dob)) as jumlah
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = ep.employee_id
join position p
	on p.id = ep.position_id
group by th
order by th desc
limit 2

where th ilike '1991'


select 
	b.*,
	p.name as jabatan
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = ep.employee_id
join position p
	on p.id = ep.position_id

--edit
select 
	concat(first_name,' ',last_name) as "Nama Karyawan"
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = ep.employee_id
join position p
	on p.id = ep.position_id
where 
	pob ilike 'Jakarta'
and address not ilike '%Jakarta%'
	
--submit ulang	
select 
	concat(b.first_name,' ',b.last_name) as "Nama Karyawan",
	date_part('year',age(now(),b.dob)) as usia,
	p.name as jabatan,
	sum(
	case
	when f.status = 'Anak' then 1
	else 0
	end
	) as "Jumlah Anak"
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = ep.employee_id
join position p
	on p.id = ep.position_id
join family f
	on b.id = f.biodata_id
group by "Nama Karyawan", usia, jabatan;
	
	
select
	concat(b.first_name,' ',b.last_name) as "Nama Karyawan",
	sum(age(lr.end_date,lr.start_date)) as jumlah_cuti
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = ep.employee_id
join position p
	on p.id = ep.position_id
join leave_request lr
	on e.id = lr.employee_id
group by "Nama Karyawan"


select
	concat(b.first_name,' ',b.last_name) as fullname,
	tt.name as "Jenis Perjalanan",
	sum(ts.item_cost) + tt.travel_fee as "Total Biaya"
from biodata b
join employee e
	on b.id = e.biodata_id
join travel_request tr
	on e.id = tr.employee_id
join travel_type tt
	on tt.id = tr.travel_type_id
join travel_settlement ts
	on ts.travel_request_id = tr.id
group by fullname, "Jenis Perjalanan", tt.travel_fee




select
	concat(b.first_name,' ',b.last_name) as "Nama Lengkap",
	case
	when b.marital_status = 'True' then 'Menikah'
	else 'Belum Menikah'
	end as "Status Pernikahan",
	f.name

from biodata b
left join family f
	on b.id = f.biodata_id

select 
	status,
	count(status) as "Jumlah"
from employee
group by status;

