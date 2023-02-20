INSERT INTO public.brand(nama)
	VALUES ('TOYOTA'),
		   ('DAIHATSU');
		   
INSERT INTO public.type(brand_id, harga, nama, tahun, kapasitas_kursi, bahan_bakar, transmisi, url_foto_besar, url_foto_kecil)
				VALUES (1, 'Rp 1.229.400.000', 'ALL NEW ALPHARD', '2022', '7 Kursi', 'Bensin', 'Otomatis', 'https://images.prod.seva.id/Toyota/New%20Alphard/main_color/main_banner_toyota_new_alphard_black1.png', 'https://netimg.acc.co.id/ACCONE/UNIT/27292/ezgif.com-gif-maker-(20).webp'),
					   (1, 'Rp 771.300.000', 'ALL NEW CAMRY', '2022', '5 Kursi', 'Bensin', 'Otomatis', 'https://images.prod.seva.id/Toyota/All%20New%20Camry/main_color/main_banner_toyota_camry_hybrid_attitude_black.png', 'https://netimg.acc.co.id/ACCONE/UNIT/27289/CAR-TYT-CAMRY-2021-01.webp'),
					   (2, 'Rp 208.250.000', 'ROCKY', '2022', '5 Kursi', 'Bensin', 'Manual', 'https://images.prod.seva.id/Daihatsu/Rocky/main_color/mainbanner_rocky_6.png', 'https://netimg.acc.co.id/ACCONE/UNIT/25286/Daihatsu-Rocky_2021_Exterior_Side-View_Color_Type-R_Yellow-Metallic.webp');