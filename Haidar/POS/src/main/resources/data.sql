INSERT INTO PUBLIC.CATEGORY
	(active, create_by, create_date, initial, name)
VALUES 
	(true, 'Admin', NOW(), 'PLS', 'Pulsa & Paket Data'),
	(true, 'Admin', NOW(), 'RMT', 'Rumah Tangga'),
	(true, 'Admin', NOW(), 'ELK', 'Elektronik'),
	(true, 'Admin', NOW(), 'HPT', 'Handphone & Tablet'),
	(true, 'Admin', NOW(), 'FSM', 'Fashion Muslim'),
	(true, 'Admin', NOW(), 'KSH', 'Kesehatan'),
	(true, 'Admin', NOW(), 'MNH', 'Mainan & Hobi'),
	(true, 'Admin', NOW(), 'KPL', 'Komputer & Laptop'),
	(true, 'Admin', NOW(), 'OTO', 'Otomotif'),
	(true, 'Admin', NOW(), 'OLR', 'Olahraga');
	
INSERT INTO PUBLIC.VARIANT
	(active, category_id, create_by, create_date, initial, name)
VALUES 
	(true, 1, 'Admin', NOW(), 'PLT', 'Pulsa Three'),
	(true, 3, 'Admin', NOW(), 'PNR', 'Pendingin Ruangan'),
	(true, 3, 'Admin', NOW(), 'TLV', 'Televisi'),
	(true, 4, 'Admin', NOW(), 'SMG', 'Samsung'),
	(true, 5, 'Admin', NOW(), 'SRG', 'Sarung'),
	(true, 6, 'Admin', NOW(), 'MSK', 'Masker'),
	(true, 7, 'Admin', NOW(), 'CDG', 'Card Game'),
	(true, 8, 'Admin', NOW(), 'SUS', 'Asus'),
	(true, 9, 'Admin', NOW(), 'HLM', 'Helm'),
	(true, 10, 'Admin', NOW(), 'SPD', 'Sepeda');
	
INSERT INTO PUBLIC.PRODUCT
	(active, create_by, create_date, description, initial, name, price, stock, variant_id)
VALUES 
	(true, 'Admin', NOW(), 'A', 'T1K', 'Pulsa Three 1.000', 1800, 99, 1),
	(true, 'Admin', NOW(), 'B', 'S15', 'Kipas Angin Sekai HDO 615-S', 105000, 99, 2),
	(true, 'Admin', NOW(), 'D', 'A31', 'HP OPPO A31 4G LTE 2/32', 1000000, 99, 4),
	(true, 'Admin', NOW(), 'E', 'PRJ', 'Peci Rajut', 4000, 99, 5),
	(true, 'Admin', NOW(), 'F', 'S50', 'Masker Sensi Safeguard 50pcs', 43000, 99, 6),
	(true, 'Admin', NOW(), 'G', 'UNO', 'UNO Card', 70000, 99, 7),
	(true, 'Admin', NOW(), 'H', 'LI3', 'Lenovo Ideapad Gaming 3i i7 RTX3050Ti', 16200000, 99, 8),
	(true, 'Admin', NOW(), 'H1', 'F15', 'ASUS TUF Gaming F15 i5 GTX1650', 10600000, 99, 8),
	(true, 'Admin', NOW(), 'I', 'HBC', 'Helm Bogo Retro Classic', 60000, 99, 9),
	(true, 'Admin', NOW(), 'J', 'CST', 'Cover Sepeda Plastik Transparan', 18500, 99, 10);