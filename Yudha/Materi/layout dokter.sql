--Insert Super Admin
INSERT INTO m_user(created_by, created_on)
VALUES (1, now());

--Insert Education Level
INSERT INTO m_education_level(
	created_by, created_on, name)
	VALUES (1, NOW(), 'S1'),
	(1, NOW(), 'S2'),
	(1, NOW(), 'S3');


--Insert Doctor Treatment
INSERT INTO t_doctor_treatment(
	created_by, created_on, doctor_id, name)
	VALUES (1, now(), 1, 'Fisioterapi anak'),
	(1, now(),1, 'Konsultasi kesehatan anak'),
	(1, now(),2, 'Fisioterapi anak'),
	(1, now(),2, 'Konsultasi kesehatan anak'),
	(1, now(),2, 'Skrining tumbuh kembang anak'),
	(1, now(),2, 'Vaksin anak'),
	(1, now(),2, 'Konsultasi psikologi anak'),
	(1, now(),2, 'Tes pendengaran OEA'),
	(1, now(),3, 'Perawatan mata'),
	(1, now(),3, 'Operasi mata katarak'),
	(1, now(),4, 'Persalinan'),
	(1, now(),4, 'Operasi panggul'),
	(1, now(),5, 'Bedah listrik'),
	(1, now(),5, 'Operasi laser');

--Insert Biodata Nama
INSERT INTO m_biodata(
	created_by, created_on, fullname, image_path)
	VALUES (1, now(), 'Yudha','https://images.unsplash.com/photo-1597223557154-721c1cecc4b0?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=580&q=80'),
	(1, now(), 'dr.Tatjana Saphira, Sp.A','https://images.unsplash.com/photo-1597223557154-721c1cecc4b0?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=580&q=80'),
	(1, now(), 'Yuniartha','https://images.unsplash.com/photo-1597223557154-721c1cecc4b0?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=580&q=80'),
	(1, now(), 'Kusuma','https://images.unsplash.com/photo-1597223557154-721c1cecc4b0?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=580&q=80'),
	(1, now(), 'Wardhana','https://images.unsplash.com/photo-1597223557154-721c1cecc4b0?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=580&q=80');

--Insert Doctor	
INSERT INTO m_doctor(
	biodata_id, created_by, created_on, str)
	VALUES (1, 1, now(), 'Kemkes/01'),
	(2, 1, now(), 'Kemkes/02'),
	(3, 1, now(), 'Kemkes/03'),
	(4, 1, now(), 'Kemkes/04'),
	(5, 1, now(), 'Kemkes/05');

--Insert Spesialis Umum Doctor	
INSERT INTO m_specialization(
	created_by, created_on, name)
	VALUES (1, now(), 'Spesialisasi Mata'),
	(1, now(), 'Spesialisasi Anak'),
	(1, now(), 'Spesialisasi Jantung'),
	(1, now(), 'Spesialisasi Kulit'),
	(1, now(), 'Spesialisasi Kandungan'),
	(1, now(), 'Spesialisasi Tulang'),
	(1, now(), 'Spesialisasi Paru-paru'),
	(1, now(), 'Spesialisasi Saraf');

--Insert Doctor + Spesialisasi	
INSERT INTO t_current_doctor_specialization(
	doctor_id, specialization_id, created_by, created_on)
	VALUES 
	(1, 5, 1, now()),
	(2, 2, 1, now()),
	(3, 3, 1, now()),
	(4, 2, 1, now()),
	(5, 1, 1, now());

--Insert Doctor + Schedule	
INSERT INTO t_doctor_office_schedule(
	created_by, created_on, doctor_id, medical_facility_schedule_id, slot)
	VALUES 
	(1, now(), 1, 1, 1),
	(1, now(), 1, 2, 1),
        (1, now(), 1, 3, 1),
        (1, now(), 1, 3, 1),  --doctor 1 (4 jadwal)
	(1, now(), 2, 1, 1),  
	(1, now(), 2, 2, 1),
        (1, now(), 2, 2, 1),
        (1, now(), 2, 2, 1),
        (1, now(), 2, 3, 1),  --doctor 2  (5 jadwal)
	(1, now(), 3, 1, 1),
        (1, now(), 3, 2, 1),
        (1, now(), 3, 2, 1),
	(1, now(), 3, 3, 1), --doctor 3  (4 jadwal)
	(1, now(), 4, 1, 1),   
	(1, now(), 4, 2, 1),
        (1, now(), 4, 2, 1),
        (1, now(), 4, 2, 1),
        (1, now(), 4, 3, 1),  --doctor 4  (5 jadwal)
	(1, now(), 5, 1, 1),
        (1, now(), 5, 2, 1),
	(1, now(), 5, 3, 1);  --doctor 5  (3 jadwal)

--Insert Doctor + Janjinya	
INSERT INTO public.t_appointment(
	created_by, created_on, appointment_date, customer_id, 
	doctor_office_id, doctor_office_schedule_id, doctor_office_treatment_id)
	VALUES 								    --schedule doctor colomn 6							    
	(1, now(), to_date('25-03-2023', 'dd-MM-yyyy') + time '09:00',1, 1, 1, 1),   --d 
        (1, now(), to_date('25-03-2023', 'dd-MM-yyyy') + time '11:00',2, 2, 2, 2),    --c
        (1, now(), to_date('25-03-2023', 'dd-MM-yyyy') + time '13:00',3, 3, 3, 3),           --4 
	(1, now(), to_date('25-03-2023', 'dd-MM-yyyy') + time '15:00',4, 4, 4, 4),        --doctor 1 (aktif = 2 ) 
	(1, now(), to_date('26-03-2023', 'dd-MM-yyyy') + time '09:00',5, 5, 5, 5),  --d
        (1, now(), to_date('26-03-2023', 'dd-MM-yyyy') + time '11:00',6, 6, 6, 6),  --c
        (1, now(), to_date('26-03-2023', 'dd-MM-yyyy') + time '13:00',7, 7, 7, 7),
        (1, now(), to_date('26-03-2023', 'dd-MM-yyyy') + time '15:00',8, 8, 8, 8),    --5
	(1, now(), to_date('26-03-2023', 'dd-MM-yyyy') + time '16:00',9, 9, 9, 9),           -- doctor 2  (aktif = 3 ) 
        (1, now(), to_date('27-03-2023', 'dd-MM-yyyy') + time '11:00',10, 10, 10, 10),   --d
	(1, now(), to_date('27-03-2023', 'dd-MM-yyyy') + time '13:00',11, 11, 11, 11),   --c
        (1, now(), to_date('27-03-2023', 'dd-MM-yyyy') + time '15:00',12, 12, 12, 12),  --4
	(1, now(), to_date('27-03-2023', 'dd-MM-yyyy') + time '16:00',13, 13, 13, 13),      -- doctor 3  (aktif = 2 ) 
        (1, now(), to_date('28-03-2023', 'dd-MM-yyyy') + time '09:00',14, 14, 14, 14),   --d
        (1, now(), to_date('28-03-2023', 'dd-MM-yyyy') + time '13:00',15, 15, 15, 15),   --c
        (1, now(), to_date('28-03-2023', 'dd-MM-yyyy') + time '14:00',16, 16, 16, 16),
	(1, now(), to_date('28-03-2023', 'dd-MM-yyyy') + time '15:00',17, 17, 17, 17),   --5
	(1, now(), to_date('28-03-2023', 'dd-MM-yyyy') + time '16:00',18, 18, 18, 18),         -- doctor 4   (aktif = 3 ) 
        (1, now(), to_date('29-03-2023', 'dd-MM-yyyy') + time '09:00',19, 19, 19, 19),     --d
	(1, now(), to_date('29-03-2023', 'dd-MM-yyyy') + time '11:00',20, 20, 20, 20),  --3  --c
	(1, now(), to_date('29-03-2023', 'dd-MM-yyyy') + time '13:00',21, 21, 21, 21);            -- doctor 5   (aktif = 1 ) 

--Insert Pendidikan
INSERT INTO m_doctor_education(
	doctor_id, education_level_id,institution_name,major,start_year,end_year, created_by, created_on)
	VALUES 
	(2, 1, 'Universitas Padjadjaran','Kedokteran Umum','2007','2011',1, now()),
	(2, 2, 'Universitas Padjadjaran','Spesialisasi Anak','2014','2016',1, now()),
	(1, 1, 'UPN','Kedokteran Umum','2012','2016',1, now()),
	(1, 2, 'UGM','Spesialisasi Jantung','2016','2018',1, now()),
	(1, 3, 'UI','Spesialisasi Jantung','2018','2020',1, now());
	
--Insert Location
INSERT INTO public.m_location(
	created_by, created_on, location_level_id, name, parent_id)
	VALUES 
	(1, now(), 2, 'Depok', null),
	(1, now(), 2, 'Jakarta Pusat', null),
	(1, now(), 2, 'Bandung', null),
	(1, now(), 4, 'Pancoran Mas', 1),
	(1, now(), 4, 'Gambir', 2),
	(1, now(), 4, 'Astana Anyar', 3);

INSERT INTO public.m_medical_facility_category(
	created_by, created_on, name)
	VALUES 
	(1, now(), 'Rumah Sakit'),
	(1, now(), 'Klinik'),
	(1, now(), 'Online');
select * from m_medical_facility_category;
--Insert Medical Facility
select * from m_medical_facility;
INSERT INTO public.m_medical_facility(
	created_by, created_on, location_id, medical_facility_category_id, name, deleted_on, is_delete)
	VALUES 
	 (1,  to_date('25-03-2019', 'dd-MM-yyyy'), 4, 1, 'RS Mitra', null, false),
	 (1,  to_date('25-03-2018', 'dd-MM-yyyy'), 5, 1, 'RSIA Bunda', null, false),
	 (1,  to_date('25-03-2016', 'dd-MM-yyyy'), 6, 1, 'RSUP Hasan Sadikin', to_date('25-03-2018', 'dd-MM-yyyy'), true),
	 (1,  to_date('25-03-2016', 'dd-MM-yyyy'), 4, 3, 'Online RS Depok', to_date('25-03-2018', 'dd-MM-yyyy'), true),
	 (1,  to_date('25-03-2015', 'dd-MM-yyyy'), 5, 1, 'RS SENTOSA', null, false),
	 (1,  to_date('25-03-2014', 'dd-MM-yyyy'), 6, 3, 'Online RSUD JENGGLONG', to_date('25-03-2016', 'dd-MM-yyyy'), true),
	 (1,  to_date('25-03-2013', 'dd-MM-yyyy'), 4, 1, 'PKU BERSERI', null, false),
	 (1,  to_date('25-03-2012', 'dd-MM-yyyy'), 5, 3, 'Online RS GIYANTI', to_date('25-03-2014', 'dd-MM-yyyy'), true),
	 (1,  to_date('25-03-2011', 'dd-MM-yyyy'), 6, 1, 'RS TEGUH', null, false),
     (1,  to_date('25-03-2010', 'dd-MM-yyyy'), 4, 1, 'RS PULIH', to_date('25-03-2012', 'dd-MM-yyyy'), true);
--Insert TDoktorOffice
INSERT INTO public.t_doctor_office(
	created_by, created_on, doctor_id, medical_facility_id, specialization)
	VALUES 
	(1, now(), 2, 1, 'Dokter Anak'),
	(1, now(), 2, 2, 'Dokter Anak'),
	(1, now(), 2, 3, 'Dokter Anak'),
	(1, now(), 1, 1, 'Dokter Kandungan'),
	(1, now(), 3, 4, 'Dokter Jantung');

select * from m_doctor;
select institution_name, major, end_year from m_doctor_education where doctor_id = 1 order by end_year desc;
select * from m_specialization;
select * from m_education_level;
select * from m_location;
select * from m_medical_facility;
select * from t_doctor_office;
select * from t_doctor_treatment;

select mf.name "Nama Rumah Sakit", l.name "Lokasi", tdo.specialization
from m_medical_facility mf
join m_location l on mf.location_id = l.id
join t_doctor_office tdo on tdo.medical_facility_id = mf.id
join m_doctor d on d.id = tdo.doctor_id;

select 
   d.id ,
   TDO.specialization,
   mf.name as "Nama fasilitas",
   l.name as "Lokasi"
from m_doctor d
inner join t_doctor_office TDO
 on d.id = TDO.doctor_id
inner join m_medical_facility mf
 on TDO.medical_facility_id = mf.id
inner join m_location l
 on mf.location_id= l.id
where d.id = 1;

select
        d.id,
        b.fullname,
        s.name as "Specialization",
        b.image_path
from m_doctor d
inner join t_current_doctor_specialization cs
        on d.id = cs.doctor_id
inner join m_specialization s
        on cs.specialization_id = s.id
inner join m_biodata b
        on b.id = d.biodata_id
where d.id = 2;

select 
    d.id as "Dokter",
        count(a.doctor_office_schedule_id) as "Jumlah janji"
from m_doctor d
inner join t_doctor_office_schedule dos
 on d.id=dos.doctor_id
inner join t_appointment a
 on dos.id = a.doctor_office_schedule_id
where d.id = 2
group by d.id 
order by d.id asc;

select * from t_doctor_treatment;



select tdt.name from t_doctor_treatment tdt where doctor_id = 1;

select 
d.id ,
TDO.specialization,
	mf.name as "Nama fasilitas",
	 l.name as "Lokasi",
	Cast(date_part('year',mf.created_on) as text) as "Dari tahun",
	mf.is_delete,
	COALESCE(cast(date_part('year',mf.deleted_on)as text),'Sekarang') as Sampai
from m_doctor d
inner join t_doctor_office TDO
	on d.id = TDO.doctor_id
inner join m_medical_facility mf
	on TDO.medical_facility_id = mf.id
inner join m_location l
	on mf.location_id= l.id
where d.id = 2;

select * from m_biodata;
select * from m_doctor;

select * from m_user;

INSERT INTO public.m_user(
	created_by, created_on, biodata_id, role_id)
	VALUES (1,now(),2,2);
	
select biodata_id from m_user where id = 3;


select 
 d.id,
 b.fullname,
 s.name as "Specialization",
 b.image_path,
 mf.name as "Nama fasilitas",
 l.name as "Lokasi"
from m_doctor d
inner join t_doctor_office TDO
	on d.id = TDO.doctor_id
inner join m_medical_facility mf
	on TDO.medical_facility_id = mf.id
inner join m_biodata b
 on b.id=d.biodata_id
inner join t_current_doctor_specialization cds
 on d.id =cds.doctor_id
inner join m_specialization s
 on cds.specialization_id = s.id
 inner join m_location l
	on mf.location_id= l.id;

select * from t_current_doctor_specialization;
-----alamat---------------
select 
	l.id,
	l.parent_id,
	l.name||', '||l2.name as "Lokasi"
from m_location l
 inner join m_location l2
on l.parent_id=l2.id;
---------nama---------------
select d.id as doctor_id, b.fullname
from m_doctor d
join m_biodata b on b.id=d.biodata_id;

select
 mf.id,
 d.id as doctor_id,
 mf.name as "Nama fasilitas",
 l.name||', '||l2.name as "Lokasi"
from m_doctor d
inner join t_doctor_office tod
 on d.id=tod.doctor_id
inner join m_medical_facility mf
on tod.medical_facility_id = mf.id
 inner join m_location l
on mf.location_id=l.id
 inner join m_location l2
on l.parent_id=l2.id;



select 
 d.id,
 cast(MAX(COALESCE(date_part('year',mf.deleted_on), date_part('year',NOW()))) -   
 MIN(date_part('year',mf.created_on)) as int)as "Pengalaman" 
from m_doctor d
inner join t_doctor_office TDO
        on d.id = TDO.doctor_id
inner join m_medical_facility mf
        on TDO.medical_facility_id = mf.id
GROUP BY D.ID;

--*Nama faskes + Lokas
select *  from m_medical_facility_category;
select
 mf.id, l.id as "id_location",
 d.id as "doctor_id",
 mf.name as "Nama fasilitas",
 l.name||', '||l2.name as "Lokasi"
from m_doctor d
inner join t_doctor_office tod
 on d.id=tod.doctor_id
inner join m_medical_facility mf
 on tod.medical_facility_id = mf.id
inner join m_location l
 on mf.location_id=l.id
inner join m_location l2
 on l.parent_id=l2.id 
order by mf.id asc;


--Name, speci, filter Chat

select DISTINCT 
 d.id,cds.doctor_id,
 b.fullname,
 s.name as "Specialization",
 b.image_path, 
 s.id as "id_Specialization",
 (case
  	when mf.medical_facility_category_id =3 then 'Online'
  	else 'offline'
 end) as "Chat" 
from m_doctor d
inner join m_biodata b
 on b.id=d.biodata_id
inner join t_current_doctor_specialization cds
 on d.id = cds.doctor_id
inner join m_specialization s
 on cds.specialization_id = s.id
 inner join t_doctor_office tod
 on d.id=tod.doctor_id
 inner join m_medical_facility mf
on tod.medical_facility_id = mf.id
 inner join m_medical_facility_category mfc
 on mfc.id = mf.medical_facility_category_id
order by d.id asc;

select DISTINCT 
 d.id,cds.doctor_id,
 b.fullname,
 s.name as "Specialization",
 b.image_path, 
 s.id as "id_Specialization",
 (case
  	when mf.medical_facility_category_id =3 then 'Online'
  	else 'offline'
 end) as "Chat" 
from m_doctor d
inner join m_biodata b
 on b.id=d.biodata_id
inner join t_current_doctor_specialization cds
 on d.id = cds.doctor_id
inner join m_specialization s
 on cds.specialization_id = s.id
 inner join t_doctor_office tod
 on d.id=tod.doctor_id
 inner join m_medical_facility mf
on tod.medical_facility_id = mf.id
 inner join m_medical_facility_category mfc
 on mfc.id = mf.medical_facility_category_id
order by d.id asc;

select distinct * from t_current_doctor_specialization;