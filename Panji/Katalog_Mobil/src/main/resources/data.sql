INSERT INTO public.tabel_brand(
	name, url_image)
	VALUES ('TOYOTA', 'https://netimg.acc.co.id/ACCONE/content/Toyota.png'),
	('DAIHATSU', '/etc.clientlibs/ds2-webcomponents/clientlibs/clientlib/resources/img/BMW_White_Logo.svg');

INSERT INTO public.tabel_type(
	brand_id, harga, tahun, type, url_image1, url_image2)
	VALUES (1, 'Rp 1.399.800.000', 2000, 'Velfire', 'https://images.prod.seva.id/Toyota/Vellfire/main_color/main_banner_toyota_new_vellfire_black.png', 'https://images.prod.seva.id/Toyota/Vellfire/main_color/main_banner_toyota_new_vellfire_black.png'),
	(1, 'Rp 2.188.400.000', 2000, 'Supra', 'https://images.prod.seva.id/Toyota/Supra/main_color/blackmetallic.png', 'https://images.prod.seva.id/Toyota/Supra/main_color/blackmetallic.png');
	

INSERT INTO public.tabel_type(
	brand_id, harga, tahun, type, url_image1, url_image2)
	VALUES (2, 'Rp 133.200.000', 2000, 'SIGRA', 'https://netimg.acc.co.id/ACCONE/UNIT/4122/5.JPG', 'https://netimg.acc.co.id/ACCONE/UNIT/4122/5.JPG'),
	(2, 'Rp 208.250.000', 2000, 'DAIHATSU ROCKY', 'https://netimg.acc.co.id/ACCONE/UNIT/25286/Daihatsu-Rocky_2021_Exterior_Side-View_Color_Type-R_Yellow-Metallic.webp', 'https://netimg.acc.co.id/ACCONE/UNIT/25286/Daihatsu-Rocky_2021_Exterior_Side-View_Color_Type-R_Yellow-Metallic.webp');
	