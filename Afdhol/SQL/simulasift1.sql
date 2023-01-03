--1
select 
	p.name as "Status",
	count(ep.position_id) as "jumlah karyawan"
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = ep.employee_id
join position p 
	on ep.position_id = p.id
group by p.name;

--2

select
	b.*,
	p.name as position
from biodata b
left join employee e
	on b.id = e.biodata_id
left join employee_position ep
	on e.id = ep.employee_id
left join position p 
	on ep.position_id = p.id 
where p.name is null;


-- 3

select  
	concat(b.first_name,' ', b.last_name) as "fullname",
	count(f.name) as jml,
	case
	when b.marital_status = 'true' then 'Menikah'
	when b.marital_status = 'false' then 'Belum Menikah'
	end as "Status pernikahan"
from biodata b
left join family f
	on b.id = f.biodata_id
group by "fullname", f.name,"Status pernikahan";

--4

select *from department;

--5
select
	count(dob),
	date_part(dob,'yyyy-mm-dd'),--lupa
	to_date('year','yyyy-mm-dd') as th_lahir

from biodata
where dob like th_lahir;


--6

select
	b.*,
	p.name as jabatan
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = ep.employee_id
join position p 
	on ep.position_id = p.id ;

--7

select 
	*
from biodata
where pob like 'Jakarta' 
and
address not ilike '%Jakarta%';

--8

select 
	concat(b.first_name,' ',b.last_name) as fullname,
--	age(now(),b.dob) as usia,
	p.name,
	case
	when f.name = 'null' then 0
	end as a,
	count(f.name) as jml_anak
from biodata b
join employee e
	on b.id = e.biodata_id
join employee_position ep
	on e.id = employee_id
join position p
	on p.id = ep.position_id
left join family f
	on b.id = f.biodata_id
group by fullname, p.name,a;	

--9

select
	concat(first_name,' ',last_name) as fullname,
	sum(age(end_date,start_date)) as cuti
from biodata b
join employee e
	on b.id = e.biodata_id
join leave_request lr
	on lr.employee_id = e.id
group by fullname


--10
select 
	b.first_name,
	tt.name,
	tr.start_date,
	tr.end_date,
	sum(ts.item_cost)+sum(tt.travel_fee) as "Total Pengeluaran"
	
from biodata b
join employee e
	on b.id = e.biodata_id
join travel_request tr
	on e.id = tr.employee_id
join travel_type tt
	on tt.id= tr.travel_type_id
join travel_settlement ts
	on tr.id = ts.travel_request_id
group by
	b.first_name,
	tt.name,
	tr.start_date,
	tr.end_date
