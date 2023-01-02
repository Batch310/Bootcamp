create table mahasiswa(
	id_mhs integer primary key,
	nama_mhs text,
	alamat text,
	id_pinjam integer,
	buku_pinjam text
);

alter table mahasiswa
alter column buku_pinjam type text;

select  * from mahasiswa

insert into mahasiswa (id_mhs,nama_mhs,alamat,id_pinjam,buku_pinjam)
values
(2,'jeki','ja solo',101,'sains'),
(3,'sony','solo',102,'biologi'),
(4,'iser','porco',103,'mtk'),
(5,'iser','porco',104,'fisika');

create table pinjam(
	id_pinjam int primary key,
	buku_pinjam text,
	nomor_buku integer
);

insert into pinjam (id_pinjam,buku_pinjam,nomor_buku)
values
(100,'matematika',998),
(101,'sains',123),
(102,'biologi',215),
(103,'mtk',140),
(104,'fisika',436);

select *from mahasiswa;
select *from pinjam;

select mahasiswa.nama_mhs, mahasiswa.alamat, pinjam.buku_pinjam, pinjam.nomor_buku
from mahasiswa
join pinjam
on pinjam.id_pinjam = mahasiswa.id_pinjam;
