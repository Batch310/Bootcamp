--Insert Super Admin
INSERT INTO public.m_user(created_by, created_on)
VALUES (1, now());

--Super Admin Create Roles
INSERT INTO public.role(created_by, created_on, code, name)
VALUES 
(1,now(),'ADMIN','ADMIN'),
(1,now(),'WAREHOUSE','WAREHOUSE'),
(1,now(),'CASHIER','CASHIER');

--Super Admin Create Dummy User
INSERT INTO public.m_user(created_by, created_on, email, password, role_id)
VALUES 
(1, now(), 'admin@batch310.com', 123456, 1),
(1, now(), 'warehouse@batch310.com', 123456, 2),
(1, now(), 'cashier@batch310.com', 123456, 3);

--Dummy Biodata for Dummy User
INSERT INTO public.biodata(
	created_by, created_on, fullname)
	VALUES 
	(2, now(), 'Nama Admin'),
	(3, now(), 'Nama Warehouse'),
	(4, now(), 'Nama Cashier');

--Modify User Into Biodata
UPDATE public.m_user
	SET biodata_id=1
	WHERE id = 2;
UPDATE public.m_user
	SET biodata_id=2
	WHERE id = 3;
UPDATE public.m_user
	SET biodata_id=3
	WHERE id = 4;

--Add Menu
INSERT INTO public.menu(
	created_by, created_on, name, url)
	VALUES 
	(1, now(), 'Category', '/api/category/home'),
	(1, now(), 'Variant', '/api/variant/home'),
	(1, now(), 'Product', '/api/product/home'),
	(1, now(), 'Order', '/api/order/home')
	;

--Add Menu By Role
INSERT INTO public.menu_role(
	created_by, created_on, role_id, menu_id)
	VALUES 
	(1, now(), 1, 1),
	(1, now(), 1, 2),
	(1, now(), 1, 3),
	(1, now(), 1, 4),
	(1, now(), 2, 1),
	(1, now(), 2, 2),
	(1, now(), 3, 3),
	(1, now(), 3, 4);

--Insert Category
INSERT INTO public.category
	(active, created_by, created_on, initial, name)
VALUES 
	(true, 3, now(), 'KSH', 'Kesehatan'),
	(true, 3, now(), 'AFH', 'Aksesoris Fashion'),
	(true, 3, now(), 'ELK', 'Elektronik'),
	(true, 3, now(), 'PPR', 'Pakaian Pria'),
	(true, 3, now(), 'SPR', 'Sepatu Pria'),
	(true, 3, now(), 'HPA', 'Hanphone & Aksesoris'),
	(true, 3, now(), 'FMM', 'Fashion Muslim'),
	(true, 3, now(), 'KTT', 'Koper & Tas Travel'),
	(true, 3, now(), 'TWA', 'Tas Wanita'),
	(true, 3, now(), 'PWA', 'Pakaian Wanita')
;

--Insert Variant
INSERT INTO public.variant
	(active, category_id, created_by, created_on, initial, name)
VALUES 
	(true, 1, 3, now(), 'HSZ', 'Hand Sanitizer'),
	(true, 1, 3, now(), 'PRM', 'Perawatan Mata'),
	(true, 2, 3, now(), 'CCN', 'Cincin'),
	(true, 2, 3, now(), 'ATG', 'Anting'),
	(true, 3, 3, now(), 'SKS', 'Stop Kontak & Sambungan Kabel'),
	(true, 3, 3, now(), 'SKR', 'Saklar'),
	(true, 4, 3, now(), 'CPJ', 'Celana Panjang Jeans'),
	(true, 4, 3, now(), 'HST', 'Hoodie & Sweatshirt'),
	(true, 5, 3, now(), 'BOT', 'Boot'),
	(true, 5, 3, now(), 'SND', 'Sandal')
;

--Insert Product
INSERT INTO public.product
	(active, created_by, created_on, description, initial, name, price, stock, variant_id)
VALUES 
	(true, 3, now(), 'A', 'ANT', 'Antis Hand Sanitazer Liquid', 42000, 100, 1),
	(true, 3, now(), 'B', 'DTL', 'Dettol Hand Sanitazer Bottle', 62000, 100, 1),
	(true, 3, now(), 'C', 'MMC', 'Masker Mata Collagen Crystal', 1500, 100, 2),
	(true, 3, now(), 'D', 'SCM', 'Skintific Crystal Massage', 156000, 100, 2),
	(true, 3, now(), 'E', 'CTF', 'Cincin Tungsten Figu Ring', 429000, 100, 3),
	(true, 3, now(), 'F', 'CBE', 'Cincin Berlian Eropa Solitare', 8725000, 100, 3),
	(true, 3, now(), 'G', 'AJP', 'Anting Jepit Pria Tanpa Tindik', 8500, 100, 4),
	(true, 3, now(), 'H', 'ARE', 'Anting Ring Emas Muda', 130000, 100, 4),
	(true, 3, now(), 'I', 'SK4', 'Stop Kontak 4 Lubang', 40000, 100, 5),
	(true, 3, now(), 'J', 'USK', 'Uticon Stop Kontak Kabel', 175000, 100, 5)
;