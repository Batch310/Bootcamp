INSERT INTO public.category
	(active, create_by, create_date, initial, name)
VALUES 
	(true, 'Admin', now(), 'KSH', 'Kesehatan'),
	(true, 'Admin', now(), 'AFH', 'Aksesoris Fashion'),
	(true, 'Admin', now(), 'ELK', 'Elektronik'),
	(true, 'Admin', now(), 'PPR', 'Pakaian Pria'),
	(true, 'Admin', now(), 'SPR', 'Sepatu Pria'),
	(true, 'Admin', now(), 'HPA', 'Hanphone & Aksesoris'),
	(true, 'Admin', now(), 'FMM', 'Fashion Muslim'),
	(true, 'Admin', now(), 'KTT', 'Koper & Tas Travel'),
	(true, 'Admin', now(), 'TWA', 'Tas Wanita'),
	(true, 'Admin', now(), 'PWA', 'Pakaian Wanita')
;

INSERT INTO public.variant
	(active, category_id, create_by, create_date, initial, name)
VALUES 
	(true, 1, 'Admin', now(), 'HSZ', 'Hand Sanitizer'),
	(true, 1, 'Admin', now(), 'PRM', 'Perawatan Mata'),
	(true, 2, 'Admin', now(), 'CCN', 'Cincin'),
	(true, 2, 'Admin', now(), 'ATG', 'Anting'),
	(true, 3, 'Admin', now(), 'SKS', 'Stop Kontak & Sambungan Kabel'),
	(true, 3, 'Admin', now(), 'SKR', 'Saklar'),
	(true, 4, 'Admin', now(), 'CPJ', 'Celana Panjang Jeans'),
	(true, 4, 'Admin', now(), 'HST', 'Hoodie & Sweatshirt'),
	(true, 5, 'Admin', now(), 'BOT', 'Boot'),
	(true, 5, 'Admin', now(), 'SND', 'Sandal')
;

INSERT INTO public.product
	(active, create_by, create_date, description, initial, name, price, stock, variant_id)
VALUES 
	(true, 'Admin', now(), 'A', 'ANT', 'Antis Hand Sanitazer Liquid', 42000, 100, 1),
	(true, 'Admin', now(), 'B', 'DTL', 'Dettol Hand Sanitazer Bottle', 62000, 100, 1),
	(true, 'Admin', now(), 'C', 'MMC', 'Masker Mata Collagen Crystal', 1500, 100, 2),
	(true, 'Admin', now(), 'D', 'SCM', 'Skintific Crystal Massage', 156000, 100, 2),
	(true, 'Admin', now(), 'E', 'CTF', 'Cincin Tungsten Figu Ring', 429000, 100, 3),
	(true, 'Admin', now(), 'F', 'CBE', 'Cincin Berlian Eropa Solitare', 8725000, 100, 3),
	(true, 'Admin', now(), 'G', 'AJP', 'Anting Jepit Pria Tanpa Tindik', 8500, 100, 4),
	(true, 'Admin', now(), 'H', 'ARE', 'Anting Ring Emas Muda', 130000, 100, 4),
	(true, 'Admin', now(), 'I', 'SK4', 'Stop Kontak 4 Lubang', 40000, 100, 5),
	(true, 'Admin', now(), 'J', 'USK', 'Uticon Stop Kontak Kabel', 175000, 100, 5)
;