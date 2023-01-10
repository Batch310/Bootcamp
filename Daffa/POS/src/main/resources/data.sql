INSERT INTO public.category(
	active, create_by, create_date, initial, name)
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
			(true, 'Admin', now(), 'PWA', 'Pakaian Wanita');

INSERT INTO public.variant(
	active, category_id, create_by, create_date, initial, name)
	VALUES 
		(true, 1, 'Admin', now(), 'HSZ', 'Hand Sanitizer'),
		(true, 1, 'Admin', now(), 'PRM', 'Perawatan Mata'),
		(true, 1, 'Admin', now(), 'PRT', 'Perawatan Telinga'),
		(true, 2, 'Admin', now(), 'ATG', 'Anting'),
		(true, 2, 'Admin', now(), 'KCM', 'Kacamata'),
		(true, 3, 'Admin', now(), 'RCK', 'Rice Cooker'),
		(true, 3, 'Admin', now(), 'LMP', 'Lampu'),
		(true, 4, 'Admin', now(), 'KMJ', 'Kemeja'),
		(true, 4, 'Admin', now(), 'HDS', 'Hoodie & Sweater'),
		(true, 5, 'Admin', now(), 'PTF', 'Pantofel');

INSERT INTO public.product(
	active, create_by, create_date, description, initial, name, price, stock, variant_id)
	VALUES 
		(true, 'Admin', now(), '','ANT', 'Antis Hand Sanitizer Gel', 18000, 100, 1),
		(true, 'Admin', now(), '','DTL', 'Dettol Hand Sanitizer Gel', 20000, 50, 1),
		(true, 'Admin', now(), '','RHT', 'Rohto Tetes Mata', 14000, 42, 2),
		(true, 'Admin', now(), '','INS', 'Insto Tetes Mata', 13000, 53, 2),
		(true, 'Admin', now(), '','JJC', 'Johnson Johnson Cutton Bud', 25000, 90, 3),
		(true, 'Admin', now(), '','CSC', 'Cussons Cutton Bud', 26000, 97, 3),
		(true, 'Admin', now(), '','ANM', 'Anting 2gr Emas Antam', 2000000, 5, 4),
		(true, 'Admin', now(), '','JBR', 'Anting 2gr Emas Jambrong', 3000000, 2, 4),
		(true, 'Admin', now(), '','RYB', 'Ray Ben Kacamata Hitam', 250000, 40, 5),
		(true, 'Admin', now(), '','ADS', 'Adidas Kacamata Hitam', 230000, 52, 5);