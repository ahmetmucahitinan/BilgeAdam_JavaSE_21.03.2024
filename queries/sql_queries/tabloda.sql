-- cars tablosunu güncelle, brand'i Ford olanların color kolonunu 'red' yap.

UPDATE cars
SET color = 'red'
WHERE brand = 'Ford'; -- WHERE brand IN ('Ford','Fiat'); yaparsak bir ve birden fazla 
					  -- yazdığım ne kadar brand yazarsam o kadar color'ı 'red' yapar.

SELECT * FROM cars;

/* 
UPDATE cars
SET color = 'red'
--> Where brand = 'Marka Adı' <






-- yazmazsak bütün arabaların rengini 'red yapar.'
*/