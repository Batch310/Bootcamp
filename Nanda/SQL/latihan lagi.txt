drop TABLE film;

CREATE TABLE public.film (
    kd_film character varying(5) primary key,
    nm_film character varying(50),
    genre character varying(5),
    artis character varying(5),
    produser character varying(5),
    pendapatan integer,
    nominasi integer
);
CREATE TABLE public.produser (
    kd_produser character varying(5) primary key,
    nm_produser character varying(50),
    international character varying(10)
);
CREATE TABLE public.negara (
    kd_negara character varying(5) primary key,
    nm_negara character varying(50)
);
CREATE TABLE public.genre (
    kd_genre character varying(5) primary key,
    nm_genre character varying(50)
);
CREATE TABLE public.artis (
    kd_artis character varying(5) primary key,
    nm_artis character varying(50),
    jk character varying(10),
    bayaran integer,
    award integer,
    negara character varying(5)
    );

INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F001', 'IRON MAN', 'G001', 'A001', 'PD01', 2000000000, 3);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F002', 'IRON MAN 2', 'G001', 'A001', 'PD01', 1800000000, 2);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F003', 'IRON MAN 3', 'G001', 'A001', 'PD01', 1200000000, 0);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F004', 'AVENGER:CIVIL WAR', 'G001', 'A001', 'PD01', 2000000000, 1);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F005', 'SPIDERMAN HOMCOMING', 'G001', 'A001', 'PD01', 1300000000, 0);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F006', 'THE RAID', 'G001', 'A004', 'PD03', 800000000, 5);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F007', 'FAST N FURIOUS', 'G001', 'A004', 'PD05', 830000000, 2);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F008', 'HABIBI N AINUN', 'G004', 'A005', 'PD03', 670000000, 4);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F009', 'POLICE STORY', 'G001', 'A003', 'PD02', 700000000, 3);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F010', 'POLICE STORY 2', 'G001', 'A003', 'PD02', 710000000, 1);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F011', 'POLICE STORY 3', 'G001', 'A003', 'PD02', 615000000, 0);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F012', 'RUSH HOUR', 'G003', 'A003', 'PD05', 695000000, 2);
INSERT INTO public.film (kd_film, nm_film, genre, artis, produser, pendapatan, nominasi) VALUES ('F013', 'KUNGFU PANDA', 'G003', 'A003', 'PD05', 923000000, 5);


INSERT INTO public.produser (kd_produser, nm_produser, international) VALUES ('PD01', 'MARVEL', 'YA');
INSERT INTO public.produser (kd_produser, nm_produser, international) VALUES ('PD02', 'HONGKONG CINEMA', 'YA');
INSERT INTO public.produser (kd_produser, nm_produser, international) VALUES ('PD03', 'RAPI FILM', 'TIDAK');
INSERT INTO public.produser (kd_produser, nm_produser, international) VALUES ('PD04', 'PARKIT FILM', 'TIDAK');
INSERT INTO public.produser (kd_produser, nm_produser, international) VALUES ('PD05', 'PARAMOUNT PICTURE', 'YA');

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

INSERT INTO public.artis (kd_artis, nm_artis, jk, bayaran, award, negara) VALUES ('A001', 'ROBERT DOWNEY JR', 'PRIA', 1000000000, 2, 'AS');
INSERT INTO public.artis (kd_artis, nm_artis, jk, bayaran, award, negara) VALUES ('A003', 'JACKIE CHAN', 'PRIA', 1200000000, 7, 'HK');
INSERT INTO public.artis (kd_artis, nm_artis, jk, bayaran, award, negara) VALUES ('A004', 'JOE TASLIM', 'PRIA', 350000000, 1, 'ID');
INSERT INTO public.artis (kd_artis, nm_artis, jk, bayaran, award, negara) VALUES ('A005', 'CHELSEA ISLAN', 'WANITA', 300000000, 0, 'ID');
INSERT INTO public.artis (kd_artis, nm_artis, jk, bayaran, award, negara) VALUES ('A002', 'ANGELINA JOLIE', 'WANITA', 700000000, 1, 'AS');



--Latihan Soal Film 2
select * from film;
select * from produser;
select * from negara;
select * from genre;
select * from artis;

--14 tampilkan nama film dan artisnya
select
	f.nm_film,
	a.nm_artis
from film f
inner join artis a
	on f.artis = a.kd_artis;
	
--15 tampilkan nama film yang artisnya berasal dari negara hongkong
select
	f.nm_film,
	a.nm_artis,
	n.nm_negara
from film f
inner join artis a
	on f.artis = a.kd_artis
inner join negara n
	on a.negara = n.kd_negara
where n.nm_negara ilike 'hongkong';

--16 tampilkan nama film, nama artis dan nama negara yang artisnya
--	berasal dari negara yang tidak mengandung huruf 'o'
select
	f.nm_film,
	a.nm_artis,
	n.nm_negara
from film f
inner join artis a
	on f.artis = a.kd_artis
inner join negara n
	on a.negara = n.kd_negara
where n.nm_negara not ilike '%o%';

--17 tampilkan nama film, artis dan awardnya yang memiliki award terbanyak
select
	f.nm_film,
	a.nm_artis,
	a.award
from film f
inner join artis a
	on f.artis = a.kd_artis
where award = (select max(award) from artis);

--18 tampilkan nama film, nama artis dan bayaran dengan artis bayaran terendah
select
	f.nm_film,
	a.nm_artis,
	a.bayaran
from film f
inner join artis a
	on f.artis = a.kd_artis
where bayaran = (select min(bayaran) from artis);

--19 tampilkan nama artis yang tidak pernah bermain film
select
	--f.nm_film
	a.nm_artis
from film f
right join artis a
	on f.artis = a.kd_artis
where f.nm_film is null;

--20 tampilkan nama artis, film dan genre yang bermain film dengan genre drama
select
	a.nm_artis,
	f.nm_film,
	g.nm_genre
from artis a
inner join film f
	on a.kd_artis = f.artis
inner join genre g
	on g.kd_genre =  f.genre
where lower(g.nm_genre) = lower('DrAmA');


--21 tampilkan nama artis, film & genre yang bermain film dengan genre horror
select
	a.nm_artis,
	f.nm_film,
	g.nm_genre
from artis a
inner join film f
	on a.kd_artis = f.artis
inner join genre g
	on g.kd_genre = f.genre
where g.nm_genre ilike 'horror';
	
--22 tampilkan nama film dan artis yang dibintangi oleh artis yang huruf depannya 'J'
select
	f.nm_film,
	a.nm_artis
from artis a
inner join film f
	on f.artis = a.kd_artis
where a.nm_artis ilike 'j%';

--23 tampilkan nama artis yang paling banyak bermain film
--step 1 tampilkan nama artis dan brp jml filmnya
select
	a.nm_artis,
	count(nm_film) as "jml film"
from film f
inner join artis a
	on f.artis = a.kd_artis
group by nm_artis

--step 2 tampilkan jumlah maksimal film yang dimainkan
select
	max(t1."jml film")
from (
	select
		a.nm_artis,
		count(nm_film) as "jml film"
	from film f
	inner join artis a
		on f.artis = a.kd_artis
	group by nm_artis
	)t1
	
--step 3 menampilkan nama artis yang paling banyak bermain film
select
	*
from (
	select
		a.nm_artis,
		count(nm_film) as "jml film"
	from film f
	inner join artis a
		on f.artis = a.kd_artis
	group by nm_artis
	)t1
where t1."jml film" = (select
						max(t2."jml film")
					from (
						select
							a.nm_artis,
							count(nm_film) as "jml film"
						from film f
						inner join artis a
							on f.artis = a.kd_artis
						group by nm_artis
						)t2
					  )
					  
--Cara 2, dengan  temporary table
	-- buat table temporary
drop table if exists temp_table;
create temporary table temp_table(
	nm_artis text,
	jml_film int
);

	--query langsung insert ke table
insert into temp_table
select
	nm_artis,
	count(nm_film) as "jmlh film"
from film f
inner join artis a
	on f.artis = a.kd_artis
group by nm_artis;

	--cek isi table
select * from temp_table;

	--tampilkan artis dengan film paling banyak
select *
from temp_table t1
where t1.jml_film =
		(select max(t2.jml_film)
			from temp_table t2);

--24 tampilkan negara mana yang paling banyak filmnya
	--table temporary
drop table if exists temp_table;
create temporary table temp_table(
	nm_artis text,
	nm_negara text,
	jml_film int
	);
	
	--query ke table
insert into temp_table
select
	a.nm_artis,
	n.nm_negara,
	count(nm_film) as "jml film"
from film f
inner join artis a
	on f.artis = a.kd_artis
inner join negara n
	on n.kd_negara = a.negara
group by nm_artis, nm_negara;

	--cek isi table
select * from temp_table;

	--tampilkan negara dengan film terbanyak
select 
	nm_negara
from temp_table t1
where t1.jml_film =
	(select max(t2.jml_film)
		from temp_table t2);

--25 tampilkan data negara dengan jumlah filmnya
select
	n.nm_negara,
	count(nm_film) as "jml film"
from film f
inner join artis a
	on f.artis = a.kd_artis
inner join negara n
	on n.kd_negara = a.negara
group by nm_negara;
	

--26 tampilkan nama produser yg skalanya international
select
	nm_produser
from produser
where international ilike 'ya%';

--27 tampilkan jumlah film dr masing2 produser
select
	p.nm_produser,
	count(nm_film) as "jml film"
from film f
right join produser p
	on f.produser = p.kd_produser
group by nm_produser;
	
--28 tampilkan jumlah nominasi dari masing2 produser
select
	p.nm_produser,
	f.nominasi
from film f
right join produser p
	on f.produser = p.kd_produser;

--29 tampilkan jumlah pendapatan produser marvel secara keseluruhan
select
	p.nm_produser,
	sum(pendapatan) as "total pendapatan"
from film f
inner join produser p
	on f.produser = p.kd_produser
where p.nm_produser ilike 'marvel'
group by nm_produser;

--30 tampilkan jumlah pendapatan produser yg skalanya tidak international
select
	p.nm_produser,
	international,
	f.pendapatan
from film f
inner join produser p
	on f.produser = p.kd_produser
where p.international ilike 'tidak';

--31 tampilkan produser yg tidak punya film
select
	p.nm_produser,
	f.nm_film
from film f
right join produser p
	on f.produser = p.kd_produser
where nm_film is null;

--32 tampilkan produser film yg memilik artis termahal
select
	p.nm_produser,
	a.nm_artis,
	a.bayaran
from film f
inner join artis a
	on f.artis = a.kd_artis
inner join produser p
	on f.produser = p.kd_produser
where bayaran = (select max(bayaran) from artis);

--33 tampilkan produser yg memiliki artis paling banyak
	
--
select *
from (
	select
		p.nm_produser,
		count (distinct artis) as "jml artis"
	from film f
	inner join produser p
		on f.produser = p.kd_produser
	group by nm_produser
	)t1
where t1."jml artis" = (select
							max(t2."jml artis")
						from(
							select distinct
								p.nm_produser,
								count (distinct artis) as "jml artis"
							from film f
							inner join produser p
								on f.produser = p.kd_produser
							group by nm_produser
						)t2

);



--34 tampilkan produser yg memiliki artis paling sedikit

select *
from (
	select
		p.nm_produser,
		count (distinct artis) as "jml artis"
	from film f
	inner join produser p
		on f.produser = p.kd_produser
	group by nm_produser
	)t1
where t1."jml artis" = (select
							min(t2."jml artis")
						from(
							select distinct
								p.nm_produser,
								count (distinct artis) as "jml artis"
							from film f
							inner join produser p
								on f.produser = p.kd_produser
							group by nm_produser
						)t2

);



















