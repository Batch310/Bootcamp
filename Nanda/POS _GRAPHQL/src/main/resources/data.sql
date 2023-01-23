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
	(true, 'Admin', now(), 'DPR', 'Peralatan Dapur'),
	(true, 'Admin', now(), 'KTT', 'Koper & Tas Travel'),
	(true, 'Admin', now(), 'TWA', 'Tas Wanita')
;

INSERT INTO public.variant(
	active, category_id, create_by, create_date, initial, name)
	VALUES 
	(true, 1, 'Admin', now(), 'HSZ', 'Hand Sanitizer'),
	(true, 1, 'Admin', now(), 'OSG', 'Obat Sakit Gigi'),
	(true, 2, 'Admin', now(), 'PHS', 'Perhiasan'),
	(true, 2, 'Admin', now(), 'JDI', 'Jedai'),
	(true, 3, 'Admin', now(), 'SKK', 'Stop Kontak'),
	(true, 3, 'Admin', now(), 'SKR', 'Saklar'),
	(true, 4, 'Admin', now(), 'JNS', 'Jeans'),
	(true, 4, 'Admin', now(), 'HOO', 'Hoodie'),
	(true, 5, 'Admin', now(), 'BOO', 'Boot'),
	(true, 5, 'Admin', now(), 'SNE', 'Sneaker')
;

INSERT INTO public.product(
	active, create_by, create_date, description, initial, name, price, stock, variant_id)
	VALUES 
	(true, 'Admin', now(), 'A', 'ANT', 'Antis Hand Sanitizer Liquid', 42000, 100, 1),
	(true, 'Admin', now(), 'B', 'DTL', 'Detol Hand Sanitizer Bottle', 62000, 100, 1),
	(true, 'Admin', now(), 'C', 'CAT', 'Cataflam Kapsul', 15000, 100, 2),
	(true, 'Admin', now(), 'D', 'PON', 'Ponstan Tablet', 10000, 100, 2),
	(true, 'Admin', now(), 'E', 'KLE', 'Kalung Emas', 1500000, 100, 3),
	(true, 'Admin', now(), 'F', 'GLG', 'Gelang', 10000000, 100, 3),
	(true, 'Admin', now(), 'G', 'JDH', 'Jedai Hercules', 10000, 100, 4),
	(true, 'Admin', now(), 'H', 'JDE', 'Jedai Athena', 15000, 100, 4),
	(true, 'Admin', now(), 'I', 'SK4', 'Stop Kontak 4 Lubang', 50000, 100, 5),
	(true, 'Admin', now(), 'J', 'SKT', 'Stop Kontak T', 42000, 100, 5)
;