-- === STOK YÖNETİMİ ===
INSERT INTO product (name, description, price, stock_quantity)
VALUES
    ('Ürün A', 'Açıklama A', 25.50, 100),
    ('Ürün B', 'Açıklama B', 15.75, 50),
    ('Ürün C', 'Açıklama C', 12.30, 200),
    ('Ürün D', 'Açıklama D', 35.40, 150),
    ('Ürün E', 'Açıklama E', 40.00, 80);

INSERT INTO warehouse (name, location)
VALUES
    ('Depo 1', 'İstanbul, Türkiye'),
    ('Depo 2', 'Ankara, Türkiye'),
    ('Depo 3', 'İzmir, Türkiye'),
    ('Depo 4', 'Bursa, Türkiye'),
    ('Depo 5', 'Antalya, Türkiye');

INSERT INTO inventory (product_id, warehouse_id, quantity)
VALUES
    (1, 1, 50),
    (2, 2, 30),
    (3, 3, 100),
    (4, 4, 80),
    (5, 5, 60);

-- === MUHASEBE ===
INSERT INTO account (name, type, balance)
VALUES
    ('Gelir Hesabı', 'GELİR', 10000.00),
    ('Gider Hesabı', 'GİDER', 5000.00),
    ('Varlık Hesabı', 'VARLIK', 15000.00),
    ('Yükümlülük Hesabı', 'YÜKÜMLÜLÜK', 2000.00),
    ('Tasarruf Hesabı', 'VARLIK', 7000.00);

INSERT INTO transaction (from_account_id, to_account_id, amount, description)
VALUES
    (1, 2, 1000.00, 'Gelirden gider hesabına transfer'),
    (3, 1, 5000.00, 'Varlık hesabından gelir hesabına transfer'),
    (4, 3, 2000.00, 'Yükümlülükten varlığa transfer'),
    (2, 5, 1500.00, 'Gider hesabından tasarruf hesabına transfer'),
    (5, 4, 3000.00, 'Tasarruf hesabından yükümlülük hesabına transfer');

-- === İNSAN KAYNAKLARI ===
INSERT INTO department (name, description)
VALUES
    ('İnsan Kaynakları', 'Çalışan alımı, eğitimi ve personel yönetimi süreçlerini yürütür.'),
    ('Finans', 'Şirketin mali işlemlerini, bütçesini ve finansal raporlamasını yönetir.'),
    ('Satış', 'Müşterilere ürün veya hizmetlerin satışı ile ilgilenir.'),
    ('Pazarlama', 'Marka bilinirliğini artırmak ve müşteri kazanımı için stratejiler geliştirir.'),
    ('Üretim', 'Ürünlerin üretim sürecini planlar ve yürütür.');

INSERT INTO employee (first_name, last_name, email, phone, hire_date, salary, department_id)
VALUES
    ('Ali', 'Yılmaz', 'ali.yilmaz@example.com', '0555 123 45 67', '2020-01-15', 5000.00, 1),
    ('Ayşe', 'Kara', 'ayse.kara@example.com', '0555 234 56 78', '2019-03-20', 6000.00, 2),
    ('Mehmet', 'Öztürk', 'mehmet.ozturk@example.com', '0555 345 67 89', '2021-05-25', 5500.00, 3),
    ('Fatma', 'Aydın', 'fatma.aydin@example.com', '0555 456 78 90', '2020-08-10', 4500.00, 4),
    ('Hakan', 'Baysal', 'hakan.baysal@example.com', '0555 567 89 01', '2018-06-05', 7000.00, 5);

INSERT INTO leave_request (employee_id, start_date, end_date, reason, status)
VALUES
    (1, '2022-06-01', '2022-06-05', 'Yıllık izin', 'ONAYLANDI'),
    (2, '2022-07-10', '2022-07-12', 'Hastalık', 'REDDEDİLDİ'),
    (3, '2022-08-15', '2022-08-17', 'Ailevi nedenler', 'BEKLEMEDE'),
    (4, '2022-09-01', '2022-09-03', 'Yıllık izin', 'ONAYLANDI'),
    (5, '2022-10-05', '2022-10-10', 'Hastalık', 'ONAYLANDI');

-- === SATIŞ ve SİPARİŞ ===
INSERT INTO customer (name, email, phone, address)
VALUES
    ('Müşteri A', 'musteri.a@example.com', '0555 678 90 12', 'İstanbul, Türkiye'),
    ('Müşteri B', 'musteri.b@example.com', '0555 789 01 23', 'Ankara, Türkiye'),
    ('Müşteri C', 'musteri.c@example.com', '0555 890 12 34', 'İzmir, Türkiye'),
    ('Müşteri D', 'musteri.d@example.com', '0555 901 23 45', 'Bursa, Türkiye'),
    ('Müşteri E', 'musteri.e@example.com', '0555 012 34 56', 'Antalya, Türkiye');

INSERT INTO "order" (customer_id, order_date, status, total_amount)
VALUES
    (1, '2022-06-01', 'BEKLEMEDE', 1500.00),
    (2, '2022-07-10', 'HAZIRLANIYOR', 2000.00),
    (3, '2022-08-15', 'KARGOLANDI', 1800.00),
    (4, '2022-09-01', 'TESLİM EDİLDİ', 2200.00),
    (5, '2022-10-05', 'BEKLEMEDE', 1700.00);

INSERT INTO order_item (order_id, product_id, quantity, price)
VALUES
    (1, 1, 5, 25.50),
    (2, 2, 3, 15.75),
    (3, 3, 4, 12.30),
    (4, 4, 2, 35.40),
    (5, 5, 3, 40.00);

-- === CRM ===
INSERT INTO lead (customer_id,name, source, status, contact_date, notes)
VALUES
    (1,'Lider A', 'Web', 'YENİ', '2022-05-01', 'İlk temas yapıldı.'),
    (2,'Lider B', 'Telefon', 'İLGİLİ', '2022-06-15', 'Ürünle ilgili detaylı bilgi istendi.'),
    (3,'Lider C', 'E-posta', 'KAPANDI', '2022-07-20', 'Alışveriş yapmadı.'),
    (4,'Lider D', 'Web', 'YENİ', '2022-08-10', 'Bilgi isteniyor.'),
    (5,'Lider E', 'E-posta', 'İLGİLİ', '2022-09-05', 'Fiyat teklifi gönderildi.');

INSERT INTO interaction (customer_id, type, date, notes)
VALUES
    (1, 'email', '2022-05-02', 'İlk e-posta gönderildi.'),
    (2, 'telefon', '2022-06-16', 'Telefonla bilgi verildi.'),
    (3, 'görüşme', '2022-07-22', 'Bire bir görüşme yapıldı.'),
    (4, 'email', '2022-08-12', 'E-posta yanıtı alındı.'),
    (5, 'telefon', '2022-09-07', 'Telefonla satış teklifinde bulunuldu.');
