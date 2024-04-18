-- Tabloya yeni kolon ekleme, mevcut kolonu değiştirme veya silme;

-- EKLEME
ALTER TABLE cars
ADD color VARCHAR(255);

SELECT * FROM cars;

-- SİLME
ALTER TABLE cars
DROP color;

-- ADINI DEĞİŞTİRME
ALTER TABLE cars
RENAME COLUMN  colorrrr TO color;

-- VERİ BOYUTUNU/TÜRÜNÜ DEĞİŞTİRME
ALTER TABLE cars
ALTER COLUMN color TYPE VARCHAR(255);

