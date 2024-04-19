INSERT INTO cars (brand,model,year)	
VALUES 
('Ford', 'Mustang', 1969),
('Toyota', 'Camry', 2015),		
('Fiat', '124', 1972),
('Nissan', 'R32', 1989),
('Toyota', 'Supra', 1995),
('Dodge', 'Challenger', 1970),
('Mercury', 'Cougar', 1967),
('Renault', '5 GT', 1992),
('Toyota', 'GT 86', 2013);

SELECT * FROM cars


SELECT * FROM cars
WHERE brand = 'Nissan'; -- Markası Nissan olanları getir

SELECT * FROM cars
WHERE year < 1975; -- Modeli 1975'ten küçük olanları getir


SELECT * FROM cars
WHERE year > 1975; -- Modeli 1975'ten büyük olanları getir


SELECT * FROM cars
WHERE year <= 1989; -- Modeli 1989'dan küçük olanları getir.


SELECT * FROM cars
WHERE year >= 1989; -- Modeli 1989'dan büyük olanları getir.

SELECT * FROM cars
WHERE brand <> 'Fiat'; -- Markası Fiat olmayanları getir.

SELECT * FROM cars
WHERE brand != 'Fiat'; -- Markası Fiat olmayanları getir. Yukarıdaki ile aynı işi yapar.

 -- % işareti sıfır, bir ve birden fazla karakteri temsil eden bir wildcard'dır.
SELECT * FROM cars
WHERE model LIKE 'R%'; -- Model olarak 'R' ile başlayanları getirir
					
SELECT * FROM cars
WHERE model ILIKE '%r'; -- Model olarak 'r' ile bitenleri getirir.

SELECT * FROM cars
WHERE brand ILIKE '%a%'; -- Markasının içinde 'a' harfi içerenleri getirir.

SELECT * FROM cars
WHERE brand ILIKE '%ta%'; -- Markasının içinde 'ta' içerenleri getirir.

-- wildcard karakteri tek bir karakteri temsil eder. Herhangi bir karakter veya sayı olabilir.
SELECT * FROM cars
WHERE brand LIKE 'N__sa_'; -- Markası N ile başlayan iki adet wildcard karakter alan (__),
						   -- ardından 'sa' ve ardından bir adet (_) wildcard karakter alan markayı döndürür.
						   

-- Birden fazla koşulu kontrol etmek istediğimizde AND operatörü kullanılır.
SELECT * FROM cars
WHERE brand = 'Toyota'
AND model = 'GT 86'; -- Markası 'Toyota' VE (AND) modeli 'GT 86' olan tüm kayıtları döndürür.

-- Birden fazla koşuldan herhangi birisinin doğruluğunu kontrol etmek için OR operatörü kullanılır.
SELECT * FROM cars
WHERE brand = 'Toyota'
OR model = 'Camry'; -- Markası 'Toyota' VEYA (AND) modeli 'Camry' olan tüm kayıtları döndürür.

-- IN operatörü bir sütunun değeri listedeki değerlerden herhangi
-- biriyle/birileriyle eşleştiğinde kullanılır. Bir liste verileceği zaman çok kullanışlıdır
SELECT * FROM cars
WHERE brand IN ('Ford', ('Renault'), 'Toyota'); -- Markası (Ford, Renault, Toyota) olanları getirsin.

						   
