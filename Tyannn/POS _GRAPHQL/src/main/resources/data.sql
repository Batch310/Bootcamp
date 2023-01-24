INSERT INTO public.category
	(active, create_by, create_date, initial, name)
VALUES 
	(true, 'Admin', now(), 'KSH', 'Kesehatan'),
	(true, 'Admin', now(), 'AFH', 'Aksesoris Fashion'),
	(true, 'Admin', now(), 'ELK', 'Elektronik'),
	(true, 'Admin', now(), 'PPR', 'Pakaian Pria'),
	(true, 'Admin', now(), 'SPR', 'Sepatu Pria'),
	(true, 'Admin', now(), 'HPA', 'Handphone & Aksesoris'),
	(true, 'Admin', now(), 'FMM', 'Fashion Muslim'),
	(true, 'Admin', now(), 'KTT', 'Koper & Tas Travel'),
	(true, 'Admin', now(), 'TWA', 'Tas Wanita'),
	(true, 'Admin', now(), 'PWA', 'Pakaian Wanita')
;
	
INSERT INTO public.variant
	(active, category_id, crated_by, create_date, initial, name)
VALUES 
	(true, 1, 'Admin', now(), 'HSZ', 'Handsanitaizer'),
	(true, 1, 'Admin', now(), 'PRM', 'Perawatan Mata'),
	(true, 2, 'Admin', now(), 'ANT', 'anting'),
	(true, 2, 'Admin', now(), 'CIN', 'Cincing'),
	(true, 3, 'Admin', now(), 'SKS', 'Stop kontak & Sambungan Kabel'),
	(true, 3, 'Admin', now(), 'SAK', 'Saklar'),
	(true, 4, 'Admin', now(), 'CLP', 'Celana Panjang'),
	(true, 4, 'Admin', now(), 'HDS', 'Hoodie & Sweatshirt'),
	(true, 5, 'Admin', now(), 'BOO', 'Boot'),
	(true, 6, 'Admin', now(), 'SAN', 'Sandal')
;

INSERT INTO public.product
	(active, create_by, create_date, description, initial, name, price, stock, variant_id)
VALUES 
	(true, 'admin', now(), 'A', 'ANT', 'Antis Hand Sanitazer Liquid', 42000, 100, 1),
	(true, 'admin', now(), 'B', 'DHS', 'Dettol Hand Sanitazer Bottle', 62000, 100, 1),
	(true, 'admin', now(), 'C', 'LMO', 'Lensa Mata Olahraga', 1500, 100, 2),
	(true, 'admin', now(), 'D', 'SCM', 'Skynific Crystal Message', 156000, 100, 2),
	(true, 'admin', now(), 'F', 'CTF', 'Cincing Tungsten', 429000, 100, 3),
	(true, 'admin', now(), 'G', 'CBE', 'Cincin Berlian', 8725000, 100, 3),
	(true, 'admin', now(), 'H', 'AJP', 'Anting Jepit Pria', 8500, 100, 4),
	(true, 'admin', now(), 'I', 'ARE', 'Anting Ring Mas Muda', 130000, 100, 4),
	(true, 'admin', now(), 'J', 'SK4', 'Stop Kontak 4 Lubang', 4000, 100, 5),
	(true, 'admin', now(), 'K', 'USK', 'Stop Kontak kabel', 175000, 100, 5)
;