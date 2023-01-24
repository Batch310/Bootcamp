INSERT INTO public.category(
	active, create_by, create_date, initial, name)
VALUES 
	(true, 'Admin', now(), 'KSH', 'Kesehatan'),
	(true, 'Admin', now(), 'AFH', 'Aksesoris Fashion'),
	(true, 'Admin', now(), 'ELK', 'Elektronik'),
	(true, 'Admin', now(), 'PPR', 'Pakaian Pria'),
	(true, 'Admin', now(), 'SPR', 'Sepatu Pria'),
	(true, 'Admin', now(), 'HPA', 'Hanphone & Aksesoris'),
	(true, 'Admin', now(), 'FMM', 'Fashion Mulim'),
	(true, 'Admin', now(), 'KTT', 'Koper & Tas Travel'),
	(true, 'Admin', now(), 'TWA', 'Tas Wanita'),
	(true, 'Admin', now(), 'PWA', 'Pakaian Wanita');

INSERT INTO public.variant(
	active, category_id, create_by, create_date, initial, name)
VALUES 
	(true, 1, 'Admin', now(), 'HSZ', 'Hand Sanitizer'),
	(true, 1, 'Admin', now(), 'PMT', 'Perawatan Mata'),
	(true, 2, 'Admin', now(), 'CIN', 'Cincin'),
	(true, 2, 'Admin', now(), 'ANT', 'Anting'),
	(true, 3, 'Admin', now(), 'KBL', 'Kabel'),
	(true, 3, 'Admin', now(), 'SAK', 'Saklar'),
	(true, 4, 'Admin', now(), 'CPN', 'Celana Panjang'),
	(true, 4, 'Admin', now(), 'HDE', 'Hoodie'),
	(true, 5, 'Admin', now(), 'PAN', 'Pantopel'),
	(true, 5, 'Admin', now(), 'SAN', 'Sandal');

INSERT INTO public.product(
	active, create_by, create_date, description,initial, name, price, stock, variant_id)
	VALUES 
	(true, 'Admin', now(), 'Pembersih tangan', 'ASL', 'Antis Hand Sanitazer Liquid', 4000, 100,1),
	(true, 'Admin', now(), 'Pembersih tangan', 'DHZ', 'Dettol Hand Sanitazer', 5200, 100,1),
	(true, 'Admin', now(),'Perawat Mata', 'MMT', 'Masker Mata', 2000, 100,2),
	(true, 'Admin', now(),'Kaca Nata Sehat', 'SOF', 'Softlen', 1500, 100,2),
	(true, 'Admin', now(),'Antik', 'BAT', 'Batu Akik', 2000, 100,3),
	(true, 'Admin', now(),'Cincin lucu', 'CIN', 'Cincin Bayi', 30000, 100,3),
	(true, 'Admin', now(),'Aksesoris Telinga', 'ABE', 'Anting Berlian', 500000, 100,4),
	(true, 'Admin', now(),'Ating penyanyi', 'ATS', 'Anting Solo', 60000, 100,4),
	(true, 'Admin', now(),'Aksesoris Wifi', 'KBO', 'Kabel Fiber Optic', 200000, 100,5),
	(true, 'Admin', now(),'Aksesoris TV', 'KAN', 'Kabel Antena', 70000, 100,5);