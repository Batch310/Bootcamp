INSERT INTO public.category(
	active, create_by, create_date, initial, name)
	VALUES 
	(true, 'Admin', now(), 'KSH', 'Kesehatan'),
	(true, 'Admin', now(), 'AFH', 'Aksesoris Fasion'),
	(true, 'Admin', now(), 'ELK', 'Elektronik'),
	(true, 'Admin', now(), 'PPR', 'Pakaian Pria'),
	(true, 'Admin', now(), 'SPR', 'Sepatu Pria'),
	(true, 'Admin', now(), 'HPA', 'Handphone & Aksesoris'),
	(true, 'Admin', now(), 'FMM', 'Fashion Muslim'),
	(true, 'Admin', now(), 'KTT', 'Koper & Tas Travel'),
	(true, 'Admin', now(), 'TWA', 'Tas Wanita'),
	(true, 'Admin', now(), 'PWA', 'Pakaian Wanita');

INSERT INTO public.variant(
	active, category_id, create_by, create_date, initial, name)
	VALUES 
	(true, 1, 'Admin', now(), 'HSZ', 'Handsanitazer'),
	(true, 1, 'Admin', now(), 'PRM', 'Perawatan Mata'),
	(true, 2, 'Admin', now(), 'CCN', 'Cincin'),
	(true, 2, 'Admin', now(), 'ATN', 'Anting'),
	(true, 3, 'Admin', now(), 'SKK', 'Stop Kontak & Sambungan Kabel'),
	(true, 3, 'Admin', now(), 'SKL', 'Saklar'),
	(true, 4, 'Admin', now(), 'CPJ', 'Celana Panjang Jeans'),
	(true, 4, 'Admin', now(), 'HAS', 'Hoodie & Sweater'),
	(true, 5, 'Admin', now(), 'SFP', 'Sepatu Fantofel Pria'),
	(true, 5, 'Admin', now(), 'SOP', 'Sepatu Olahraga Pria');

INSERT INTO public.product(
	active, create_by, create_date, description, initial, name, price, stock, variant_id)
	VALUES 
	(true, 'Admin', now(), 'a','ANT', 'Antis Hand Sanitazer Liquid' , 42000, 100, 1),
	(true, 'Admin', now(), 'b','DTL', 'Dettol Hand Sanitazer Liquid' , 62000, 100, 1),
	(true, 'Admin', now(), 'c','MMC', 'Masker Mata Collagen Crystal' , 1500, 100, 2),
	(true, 'Admin', now(), 'd','SCM', 'Skintific Crystal Massage' , 156000, 100, 2),
	(true, 'Admin', now(), 'e','CTF', 'Cincin Tunangan Figu Ring' , 429000, 100, 3),
	(true, 'Admin', now(), 'f','CBE', 'Cincin Berlian Eropa Solitare' , 8725000, 100, 3),
	(true, 'Admin', now(), 'g','AJP', 'Anting Jepit Pria Tanpa Tindik' , 8500, 100, 4),
	(true, 'Admin', now(), 'h','ARE', 'Anting Ring Emas Muda' , 130000, 100, 4),
	(true, 'Admin', now(), 'j','SK4', 'Stop Kontak 4 Lubang' , 46000, 100, 5),
	(true, 'Admin', now(), 'k','SK9', 'Stop Kontak 9 Lubang' , 222000, 100, 5);