INSERT INTO public.category(
	 active, create_by, create_date, initial, name)
	VALUES 
	(true, 'Admin', now(), 'KSH', 'Kesehatan'),
	(true, 'Admin', now(), 'KCT', 'Kecantikan'),
	(true, 'Admin', now(), 'OTM', 'Otomotif'),
	(true, 'Admin', now(), 'BKU', 'Buku'),
	(true, 'Admin', now(), 'DPR', 'Dapur'),
	(true, 'Admin', now(), 'ELK', 'Elektronik'),
	(true, 'Admin', now(), 'FAB', 'Fashion Anak & Bayi'),
	(true, 'Admin', now(), 'FSP', 'Fashion Pria'),
	(true, 'Admin', now(), 'FSW', 'Fashion Wanita'),
	(true, 'Admin', now(), 'OLR', 'Olahraga');

INSERT INTO public.variant(
	 active, category_id, create_by, create_date, initial, name)
	VALUES 
	(true, 1, 'Admin', now(), 'MSK', 'Masker'),
	(true, 1, 'Admin', now(), 'VIT', 'Vitamin'),
	(true, 2, 'Admin', now(), 'MUW', 'Make Up Wajah'),
	(true, 2, 'Admin', now(), 'MUT', 'Mak Up Tools'),
	(true, 3, 'Admin', now(), 'AKM', 'Aksesoris Mobil'),
	(true, 3, 'Admin', now(), 'PKK', 'Perkakas Kendaraan'),
	(true, 4, 'Admin', now(), 'KMK', 'Komik'),
	(true, 4, 'Admin', now(), 'NVL', 'Novel'),
	(true, 5, 'Admin', now(), 'PMM', 'Peralatan Makan Minum'),
	(true, 5, 'Admin', now(), 'PMK', 'Peralatan Masak')
	;

INSERT INTO public.product(
	active, create_by, create_date, description, initial, name, price, stock, variant_id)
	VALUES 
	(true, 'Admin', now(), 'Masker Anti Corona Terlaris', 'MSKSN4', 'Masker Sensi 4PLY', 128800, 100, 1),
	(true, 'Admin', now(), 'Masker Anti Corona jilid 2', 'MSKSN3', 'Masker Sensi Safeguard 3PLY', 43000, 100, 1),
	(true, 'Admin', now(), 'Make Up terlaris 2023', 'MUWWAF', 'Make Up Acnaderm Face Powder', 39840, 100, 2),
	(true, 'Admin', now(), 'Kuas wajah serba guna', 'MUTKSW', 'Kuas Masker Wajah', 1200, 100, 2),
	(true, 'Admin', now(), 'Kipas Angin tornado siap pakai', 'KAM12V', 'Kipas Angin Mobil 12 V', 52000, 100, 3),
	(true, 'Admin', now(), 'Kunci roda untuk motor dan mobil', 'KRMDM', 'Kunci Roda Motor & Mobil', 50000, 100, 3),
	(true, 'Admin', now(), 'Novel terlaris tapi belum jadi', 'NVLDNA', 'Buku Novel Dunia', 120900, 100, 4),
	(true, 'Admin', now(), 'Belum rilis', 'KMKOPC', 'Komik One Piece eps 2000', 200000, 100, 4),
	(true, 'Admin', now(), 'Cocok buat anak kost, tidak untuk harga', 'DPRSDB', 'Samono Dispenser Beras Rice Box', 189900, 100, 5),
	(true, 'Admin', now(), 'Beli ini serasa di korea', 'DPRSGM', 'Sendok Garpu Makan Korea', 19000, 100, 5)
;