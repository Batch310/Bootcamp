INSERT INTO public.category(
	active, create_by, create_date, initial, name)
	VALUES
	(true, 'Admin', now(), 'KSH','Kesehatan'),
	(true, 'Admin', now(), 'AFH','Aksesoris Fashion'),
	(true, 'Admin', now(), 'ELK','Elektronik'),
	(true, 'Admin', now(), 'PPR','Pakaian Pria'),
	(true, 'Admin', now(), 'SPR','Sepatu Pria'),
	(true, 'Admin', now(), 'HPA','Handphone&Aksesoris'),
	(true, 'Admin', now(), 'FMM','Fashion Muslim'),
	(true, 'Admin', now(), 'KTT','Koper dan Tas Travel'),
	(true, 'Admin', now(), 'TWA','Tas WAnita');
	
	
INSERT INTO public.variant(
	active, category_id, create_by, create_date, initial, name)
	VALUES 
	(true, 1, 'Admin', now(), 'HSZ','Hand Sanitizer'),
	(true, 7, 'Admin', now(), 'JB','Jilbab'),
	(true, 4, 'Admin', now(), 'SS','Sepatu Slop'),
	(true, 3, 'Admin', now(), 'SPK','Speaker'),
	(true, 3, 'Admin', now(), 'MTR','Monitor'),
	(true, 9, 'Admin', now(), 'GDG','Tas Gendong'),
	(true, 6, 'Admin', now(), 'SM','Smartphone'),
	(true, 7, 'Admin', now(), 'PC','Peci'),
	(true, 6, 'Admin', now(), 'TG','Tempered Glass'),
	(true, 1, 'Admin', now(), 'OG','Obat Magh');
	
	
	INSERT INTO public.product(
	active, create_by, create_date, description, initial, name, price, stock, variant_id)
	VALUES 
	(true, 'Admin', now(), 'peci premium','PPR', 'Peci premium', 50000, 10, 8),
	(true, 'Admin', now(), 'SEPATU NIKE SLOP','SPn', 'Sepatu slop nike', 20000, 10, 3),
	(true, 'Admin', now(), 'obat mumet','BDX', 'Bodrex', 5000, 10, 1),
	(true, 'Admin', now(), 'sepatu bata','BTS', 'BATA slop', 50000, 10, 3),
	(true, 'Admin', now(), 'wadimor peci kita','PCW', 'PEci Wadimor', 15000, 10, 8),
	(true, 'Admin', now(), 'monior LG IPS','MLG', 'Monitor LG ', 5000000, 15, 5),
	(true, 'Admin', now(), 'Jebol beli lagi','JBL', 'Spekaer JBL', 100000, 10, 4),
	(true, 'Admin', now(), 'Jedag jedug','SBD', 'Simbadda speaker', 50000, 10, 4),
	(true, 'Admin', now(), 'obat magh','PRG', 'PRomag Solusi Lambung', 5000, 10, 10),
	(true, 'Admin', now(), 'buat cuci','NCE', 'Nice Produk Pembersih Tangan', 10000, 3, 1);
	
