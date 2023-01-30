--Insert Super Admin
INSERT INTO public.m_user(created_by, created_on)
VALUES (1, now());

INSERT INTO public.m_medical_item_category(
	created_by, created_on, name)
	VALUES (1, NOW(), 'Demam'),
	(1, NOW(), 'Alergi'),
	(1, NOW(), 'Kulit'),
	(1, NOW(), 'Batuk & Flu'),
	(1, NOW(), 'Saluran Pencernaan'),
	(1, NOW(), 'Vitamin & Suplemen'),
	(1, NOW(), 'Kebutuhan Pria'),
	(1, NOW(), 'Produk Susu'),
	(1, NOW(), 'Mata'),
	(1, NOW(), 'Diet'),
	(1, NOW(), 'Asma');