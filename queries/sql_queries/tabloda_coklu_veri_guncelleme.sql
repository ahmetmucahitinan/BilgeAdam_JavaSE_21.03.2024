-- Çoklu veri güncelleme -> Birden fazla sütunu aynı anda güncelleme
UPDATE cars
SET color = 'white', year=1990
WHERE brand = 'Nissan'; -- OR brand = 'Ford'; Burada birden fazla markayı tanımlamak için yapılır.

SELECT * FROM cars;