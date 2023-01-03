Drop TABLE film;

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

select * from film;
select * from produser;
select * from negara;
select * from genre;
select * from artis;

--Latihan Soal Film 2
--14 Tampilkan nama film dan artisnya
select
	f.nm_film,
	a.nm_artis
from film f
inner join artis a
	on f.artis = a.kd_artis;
	
--15 Tampilkan film yang artisnya berasal dari negara hongkong
select
	f.nm_film,
	a.nm_artis,
	n.nm_negara
from film f
inner join artis a
	on f.artis = a.kd_artis
inner join negara n
	on a.negara = n.kd_negara
where n.nm_negara = 'HONGKONG';
--16 Tampilkan nama film, nama artis & nama negara yang artisnya berasal dari negara yang tidak mengandung huruf 'o'
select * from negara;
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
	
--17 Tampilkan nama film, artis & awardnya yang memiliki award terbanyak
select * from artis;
select
	f.nm_film,
	a.nm_artis,
	a.award
from film f
inner join artis a
	on f.artis = a.kd_artis
where a.award = (select max(award) from artis);

--18 Tampilkan nama film, nama artis & bayaran dengan artis bayaran terendah
select * from artis;
select
	f.nm_film,
	a.nm_artis,
	a.bayaran
from film f
inner join artis a
	on f.artis = a.kd_artis
where a.bayaran = (select min(bayaran) from artis);

--19 Tampilkan nama artis yang tidak pernah bermain film
select * from film;
select * from artis;
select
	a.nm_artis
from film f
right join artis a
	on f.artis = a.kd_artis
where f.nm_film is null;

--20 Tampilkan nama artis, film & genre yang bermain film dengan genre drama
select * from artis;
select * from film;
select * from genre;
select
	a.nm_artis,
	f.nm_film,
	g.nm_genre
from film f
inner join artis a
	on f.artis = a.kd_artis
inner join genre g
	on f.genre = g.kd_genre
where g.nm_genre = 'DRAMA'; --atau where lower(g.nm_genre) = lower('DRAMA'); atau where upper(g.nm_genre) = upper('drama'); atau where g.nm_genre ilike 'drama';

--21 Tampilkan nama artis, film & genre yang bermain film dengan genre horror
select * from film;
select * from artis;
select * from genre;
select 
	a.nm_artis,
	f.nm_film,
	g.nm_genre
from film f
inner join artis a
	on f.artis = a.kd_artis
inner join genre g
	on f.genre = g.nm_genre
where g.nm_genre ilike 'horror';

--22 Tampilkan nama film & dan artis yang dibintangi oleh artis yang huruf depannya 'J'
select 
	f.nm_film,
	a.nm_artis
from film f
inner join artis a
	on f.artis = a.kd_artis
where a.nm_artis ilike 'j%';

--23 Tampilkan nama artis yang paling banyak bermain film
select * from film;
select * from artis;

--Step 1 Menampilkan semua nama artis dan berapa jumlah filmnya
select
	a.nm_artis,
	count(*) as "jumlah film"
from film f
inner join artis a
	on f.artis = a.kd_artis
group by a.nm_artis;

--Step 2 Menampilkan jumlah maksimal film yang dimainkan
select
	max(t1."jumlah film")
from (
	  select
	  		a.nm_artis,
			count(*) as "jumlah film"
	  from film f
	  inner join artis a
			on f.artis = a.kd_artis
	  group by a.nm_artis
	 ) t1;

--Step 3 Menampilkan nama artis yang paling banyak bermain film
select
	*
from (select
			a.nm_artis,
			count(*) as "jumlah film"
	  from film f
	  inner join artis a
			on f.artis = a.kd_artis
	  group by a.nm_artis
	 ) t1
where t1."jumlah film" = (select
							max(t2."jumlah film")
						 from (
	  						   select
	  								a.nm_artis,
									count(*) as "jumlah film"
	  						   from film f
	  						   inner join artis a
									on f.artis = a.kd_artis
		  					   group by a.nm_artis
	 						  ) t2);
				
--Cara 2, pakai temporary table

--Step 1 Buat Tabel
drop table if exists temp_table;
create temporary table temp_table (
	nm_artis text,
	jml_film int
);

--Step 2 Query langsung insert ke tabel
insert into temp_table
select
	nm_artis,
	count(nm_film) as "jml film"
from film f
inner join artis a
	on f.artis = a.kd_artis
group by nm_artis;

--Cek isi tabel
select * from temp_table;

--Step 3 Menampilkan nama artis yang bermain film paling banyak
select 
	*
from temp_table t1
where t1.jml_film = (select max(jml_film) from temp_table);


--24 Tampilkan negara mana yang paling banyak filmnya
--Step 1 Menampilkan menampilkan tabel film dan negara
select * from film;
select * from artis;
select * from negara;
select
	f.nm_film,
	n.nm_negara
from film f
inner join artis a
	on f.artis = a.kd_artis
inner join negara n
	on a.negara = n.kd_negara;
--Step 2 Menampilkan banyak film masing - masing negara
select
	n.nm_negara,
	count(*) as "jumlah film"
from film f
inner join artis a
	on f.artis = a.kd_artis
inner join negara n
	on a.negara = n.kd_negara
group by n.nm_negara;

--Step 3 Mencari jumlah film terbanyak dari semua negara
select 
	max(t1."jumlah film")
from (
	  select
			n.nm_negara,
			count(*) as "jumlah film"
	  from film f
	  inner join artis a
			on f.artis = a.kd_artis
	  inner join negara n
			on a.negara = n.kd_negara
	  group by n.nm_negara
	 ) t1;

--Step 4 Menampilkan negara dengan film terbanyak
select
	*
from (
	  select
			n.nm_negara,
			count(*) as "jumlah film"
	  from film f
	  inner join artis a
			on f.artis = a.kd_artis
	  inner join negara n
			on a.negara = n.kd_negara
	  group by n.nm_negara
	 ) t1
where t1."jumlah film" = (
						  select 
								max(t2."jumlah film")
					  	  from (
	  							select
									n.nm_negara,
									count(*) as "jumlah film"
	  							from film f
	 			 				inner join artis a
									on f.artis = a.kd_artis
	  							inner join negara n
									on a.negara = n.kd_negara
	 		 					group by n.nm_negara
	 						   ) t2
						 );

--Cara 2 Menggunakan temporary table
drop table if exists temp_table;
create temporary table temp_table (
	nm_negara text,
	jml_film int
);

select * from temp_table;

insert into temp_table
select 
	n.nm_negara,
	count(*) as "jumlah film"
from film f
inner join artis a
	on f.artis = a.kd_artis
inner join negara n
	on a.negara = n.kd_negara
group by n.nm_negara;

select
	*
from temp_table t1
where t1.jml_film = (select max(jml_film) from temp_table);


--25 Tampilkan data negara dengan jumlah filmnya
select * from film;
select * from artis;
select * from negara;
select
	n.nm_negara,
	count(f.*) as "jumlah film"
from film f
inner join artis a
	on f.artis = a.kd_artis
right join negara n
	on a.negara = n.kd_negara
group by n.nm_negara;

--26 tampilkan nama produser yg skalanya international
select * from film;
select * from artis;
select * from produser;
select * from genre;
select * from negara;

select
	nm_produser
from produser
where international ilike 'ya';

--27 tampilkan jumlah film dr masing2 produser
select
	p.nm_produser,
	f.nm_film
	--count(f.nm_film) as "jumlah film"
from film f
right join produser p
	on f.produser = p.kd_produser
group by p.nm_produser;

--28 tampilkan jumlah nominasi dari masing2 produser
select * from film;
select * from artis;
select * from produser;
select * from genre;
select * from negara;

select 
	p.nm_produser,
	sum(f.nominasi) as "jumlah nominasi"
from film f
right join produser p
	on f.produser = p.kd_produser
group by p.nm_produser;

--29 tampilkan jumlah pendapatan produser marvel secara keseluruhan
select
	p.nm_produser,
	sum(f.pendapatan)
from film f
inner join produser p
	on f.produser = p.kd_produser
where p.nm_produser ilike 'marvel'
group by p.nm_produser;

--30 tampilkan jumlah pendapatan produser yg skalanya tidak international
select
	p.nm_produser,
	sum(f.pendapatan)
from film f
right join produser p
	on f.produser = p.kd_produser
where p.international ilike 'tidak'
group by p.nm_produser;

--31 tampilkan produser yg tidak punya film
select * from film;
select * from artis;
select * from produser;
select * from genre;
select * from negara;

select
	p.nm_produser
from film f
right join produser p
	on f.produser = p.kd_produser
where f.nm_film is null;

--32 tampilkan produser film yg memilik artis termahal
select distinct
	p.nm_produser,
	a.nm_artis,
	a.bayaran
from film f
inner join artis a
	on f.artis = a.kd_artis
inner join produser p
	on f.produser = p.kd_produser
where a.bayaran = (select max(bayaran) from artis);

--33 tampilkan produser yg memiliki artis paling banyak	
--Cara dengan membuat temporary table
drop table if exists temp_table;
create temporary table temp_table(
	nm_produser text,
	jml_artis int
);

select * from temp_table;

insert into temp_table
select
	nm_produser,
	count(artis) as "jml artis"
from (
		select distinct
			p.nm_produser,
			f.artis
		from film f
		right join produser p
			on f.produser = p.kd_produser
	 ) t1
group by nm_produser;

select
	*
from temp_table t1
where t1.jml_artis = (select max(jml_artis) from temp_table);

--Cara tanpa temporary table (recommended, too long)
select
	*
from (
		select
			nm_produser,
			count(artis) as "jml artis"
	    from (
			select distinct
				p.nm_produser,
				f.artis
			from film f
			right join produser p
				on f.produser = p.kd_produser
	 	   ) t1
group by nm_produser
	 ) t2
where t2."jml artis" = (select max("jml artis") from (select
			nm_produser,
			count(artis) as "jml artis"
	    from (
			select distinct
				p.nm_produser,
				f.artis
			from film f
			right join produser p
				on f.produser = p.kd_produser
	 	   ) t1
group by nm_produser
	 ) t2);

--34 tampilkan produser yg memiliki artis paling sedikit
drop table if exists temp_table;
create temporary table temp_table(
	nm_produser text,
	jml_artis int
);

select * from temp_table;

insert into temp_table
select
	nm_produser,
	count(artis) as "jml artis"
from (
		select distinct
			p.nm_produser,
			f.artis
		from film f
		right join produser p
			on f.produser = p.kd_produser
) t1
group by nm_produser;

select
	*
from temp_table t1
where t1.jml_artis = (select min(jml_artis) from temp_table);

--Cara tanpa temporary table (recommended, too long)
select
	*
from (
		select
			nm_produser,
			count(artis) as "jml artis"
	    from (
			select distinct
				p.nm_produser,
				f.artis
			from film f
			right join produser p
				on f.produser = p.kd_produser
	 	   ) t1
group by nm_produser
	 ) t2
where t2."jml artis" = (select min("jml artis") from (select
			nm_produser,
			count(artis) as "jml artis"
	    from (
			select distinct
				p.nm_produser,
				f.artis
			from film f
			right join produser p
				on f.produser = p.kd_produser
	 	   ) t1
group by nm_produser
	 ) t2);



