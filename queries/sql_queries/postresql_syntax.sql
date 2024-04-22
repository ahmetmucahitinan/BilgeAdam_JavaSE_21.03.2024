-- SELECT STATEMENT
SELECT customer_name, country FROM customers;
-- customer_name ve country sütunlarını ve bilgilerini 'customers' tablosundan getirir.

SELECT * FROM customers;
-- '*' ALL anlamına gelir. Bu durumda da customers tablosuna ait bütün sütunları verileriyle birlikte getirir.

------------------------------------------------------------------------

-- DISTINCT STATEMENT
SELECT DISTINCT country
FROM customers;
-- Yalnızca farklı (distinct) değerleri döndürmek için kullanılır. Yinelenme olmadan özgün veri getirir.
 -- customers tablosunda tekrar eden ülkeler vardı, ancak yukarıdaki sorgu aracılığıyla ülkeleri
 -- özgün bir şekilde getirir.
 
 SELECT COUNT (DISTINCT country)
 FROM customers;
 -- Kaç adet distinct ülke olduğunu döndürür.
 
 ------------------------------------------------------------------------
 
 -- WHERE CLAUSE (Filtrelemek için)
 SELECT * FROM customers WHERE city = 'London';
 -- Yalnızca belirli bir koşulu karşılayan verileri getirir.
 -- Yukarıdaki örnekte bu koşul, şehrin adının 'London' olması koşuludur.
 
 ------------------------------------------------------------------------
 
 -- ORDER BY (Sıralamak için)
 SELECT * FROM customers
 ORDER BY city;
 -- Kayıtları belli bir sütuna göre sıralamak için kullanılır.
 -- Hem artan, hem azalan sıralama yapılabilir. (ASC/DESC)
 
 SELECT * FROM customers
 ORDER BY city ASC;
 -- ASC (Ascending) -> Artan sıralama (doğal sıralamadır). Kayıtları ilgili sütunun artacağı şekilde sıralar
 
 SELECT * FROM customers
 ORDER BY city DESC;
 -- DESC (Descending) -> Azalan sıralama (reverse order). Kayıtları ilgili sütunun azalacağı şekilde sıralar.
 
 ------------------------------------------------------------------------
 
 -- LIMIT CLAUSE
 SELECT * FROM customers
 LIMIT 20;
 -- LIMIT döndürülecek maksimum kayıt sayısını sınırlandırır.
 -- Yukarıdaki örnekte customers tablosundan ilk 20 kaydı döndürür.
 
 ------------------------------------------------------------------------
 
 -- OFFSET CLAUSE
 SELECT * FROM customers
 LIMIT 20 OFFSET 40;
-- OFFSET döndürülecek kayıtları seçmeye nereden başlayacağımızı belirtmek için kullanılır.
-- Yukarıdaki örnekte 20 kayıt döndürmek istiyoruz. OFFSET 40 diyerek bu 20 kaydı
-- 40. kayıttan sonra gelen ilk 20 kayıttan alıyoruz. (OFFSET 40 yazdığım için ilk kayıt 41. kayıt olacaktır.)

------------------------------------------------------------------------

-- MIN() and MAX() Functions
SELECT MIN(city)
FROM customers;
-- MIN() fonksiyonu minimum(en düşük) değeri döndürür. Bu bir sayı ise en küçük sayıyı.
-- Bu bir kelime ise Alfabetik olarak en önde gelen kelimeyi döndürür.

SELECT MAX(city)
FROM customers;
-- MAX() fonksiyonu maximum(en büyük) değeri döndürür. Bu bir sayı ise en büyük sayıyı.
-- Bu bir kelime ise Alfabetik olarak en sonda gelen kelimeyi döndürür.

------------------------------------------------------------------------

-- SÜTUNU yeniden adlandırma
SELECT MAX(city) AS alphabetically_last_city
FROM customers;
-- Bulduğu değerleri farklı bir sütun isminde görüntülemek için AS anahtar kelimesi kullanılır.

-- COUNT() Function
SELECT COUNT(customer_id)
FROM customers;
-- COUNT() fonksiyonu belirtilen ölçütle eşleşen satır sayısını döndürür.
-- NOT : NULL değerler sayılmaz.

SELECT COUNT(customer_id)
FROM customers
WHERE city = 'London';
-- Şehri 'London' olanların adedini getirdi.

------------------------------------------------------------------------

-- SUM() Function
SELECT SUM(customer_id)
FROM customers;
-- Kayıtların belirtilen sütuna ait olan değerini toplar ve sonucu döner.

-- AVG() Function
SELECT AVG(customer_id)
FROM customers;
-- Kayıtların belirtilen sütuna ait olan değerleri ortalamasını döner.
 
------------------------------------------------------------------------

-- IN Operatörü
SELECT * FROM customers
WHERE country IN ('Germany', 'France', 'UK');
-- IN opertörü WHERE clause'undaki olası değerlerin bir listesini belirtmemize olanak tanır.
-- IN operatörü birden fazla OR koşulunun kısaltmasıdır.
-- Yukarıdaki örnekteki durum; 'Germany', 'France', yada 'UK' de olan tüm müşterileri getir.

SELECT * FROM customers
WHERE country NOT IN ('Germany', 'France', 'UK');
-- IN operatörünün önüne NOT keyword'ü kullanarak,
-- listedeki değerlerden herhangi biri DEĞİL(NOT) olan tüm kayıtları döndürürsünüz.
-- Yukarıdaki örnekteki durum; 'Germany', 'France' yada 'UK' OLMAYAN tüm müşterileri getir.

-- IN(SELECT)

SELECT * FROM customers
WHERE customer_id IN(1,2,3,4);
-- WHERE customer_id IN(SELECT customer_id FROM orders) -> dersek orders'daki customer_id' yi döner.
-- Daha önce sipariş vermiş olan kullanıcıları getirir.
-- Önce orders tablosuna gider ve her bir sipariş için customer_id'leri toplar ve bir liste(tablo) haline getirir.
-- Ondan sonra bu listedeki id'leri customers tablosundaki id'ler ile eşleştirir.
-- Eşleşen sonuçları birer customer olarak yazdırır.
------------------------------------------------------------------------

WHERE customer_id IN(SELECT customer_id FROM orders);
-- Daha önce sipariş vermemiş olan kullanıcıları getirir.

------------------------------------------------------------------------

-- BETWEEN Operatörü
SELECT * FROM customers
WHERE customer_id BETWEEN 10 AND 15;
-- BETWEEN operatörü belirli bir aralıktaki değerleri seçer. Değerler sayı, metin yada tarih olabilir.
-- BETWEEN operatörü kapsayıcıdır. Başlangıç ve bitiş değerleri dahildir. 
-- WHERE country BETWEEN 'A' AND 'E'; -> Metin karşılaştırmalarında char olarak son değeri dahil etmez.

SELECT * FROM customers --> SELECT country FROM customers dersek sadece ülkeleri gösterir.
WHERE country BETWEEN 'Austria' AND 'UK';
-- 'Austria' ile 'UK' arasında olan bütün kalan customer'ları döndürür.

------------------------------------------------------------------------

-- ORDER BY CLAUSE
SELECT * FROM customers 
WHERE country BETWEEN 'Austria' AND 'UK'
ORDER BY country;
-- 'Austria' ile 'UK' arasında olan bütün ülkeleri ülkeleri baz alınarak sıralamaya sokar ve döndürür.(İsim sırasına göre yapar)

------------------------------------------------------------------------

-- Aliases (Takma İsim)
SELECT customer_id AS id --> Tablo başlık ismini değiştirir.
FROM customers;
-- SQL Aliases bir tabloya veya tablodaki bir sütuna geçici bir ad vermek için kullanılır.
-- Genellikle sütun adlarını daha okunaklı hale getirmek için kullanılır.
-- Bir aliases yalnızca söz konusu sorgu süresince geçerlidir.
-- AS anahtar sözcüğü ile oluşturulur.

------------------------------------------------------------------------