<--------------------->  SORU  <--------------------->

----> (ADIM 1) STUDENTS TABLOSUNU OLUŞTURALIM. NAME,SURNAME,GRADE EKLEYELİM
CREATE TABLE students (
	name VARCHAR(30),
	surname VARCHAR(15),
	grade INT
);

SELECT * FROM students;

----> (ADIM 2) 5 TANE ÖĞRENCİ OLUŞTURALIM
INSERT INTO students (name,surname,grade)	
VALUES 	
('Ahmet','İNAN',97),
('Melisa', 'İlhan', 98),
('Tuba', 'İNAN', 90),
('Alpaslan', 'Tuğra', 75),
('Mustafa','Karataş',80);

SELECT * FROM students;

----> (ADIM 3) ÖĞRENCİLERDEN BİRİNİN SOYİSMİNİ GÜNCELLEYELİM
UPDATE students
SET surname = 'Güzel'
WHERE name = 'Melisa'; 

SELECT * FROM students;

----> (ADIM 4) TABLOYA DOĞUM YILI KOLONUNU EKLEYELİM
ALTER TABLE students
ADD dateBirth INT; -- ADD dateBirth VARCHAR(4); yaparak 4 haneli sayıdan fazla izin vermiyoruz

SELECT * FROM students;

----> (ADIM 5) ÖĞRENCİLERDEN HER BİRİNE BİR DOĞUM YILI GİRELİM (HEPSİNİN DOĞUM YILI AYNI OLACAK)

/* 
UPDATE students
SET dateBirth = 2000    -- ÖĞRENCİLERİN HEPSİNİN DOĞUM YILINI AYNI YAPAR.
*/
UPDATE students
SET dateBirth = 2000
WHERE name = 'Ahmet';     -- ÖĞRENCİLERİN HER BİRİNE AYRI DOĞUM YILI VERDİM

UPDATE students
SET dateBirth = 2001
WHERE name = 'Melisa'; 

UPDATE students
SET dateBirth = 2002
WHERE name = 'Tuba'; 

UPDATE students
SET dateBirth = 1999
WHERE name = 'Mustafa';

UPDATE students
SET dateBirth = 1998
WHERE name = 'Alpaslan'; 

SELECT * FROM students;

----> (ADIM 6) ÖĞRENCİLERDEN BİRİNİN ADINI, SOYADINI, PUANINI VE DOĞUM TARİHİNİ GÜNCELLEYİN
UPDATE students
SET dateBirth = 2000,
    name = 'Tuba',
    surname = 'Kalite',
    grade = 89
WHERE name = 'Tubaa'; 
SELECT * FROM students;

----> (ADIM 7) 5 ÖĞRENCİDEN BİRİSİNİN KAYDINI SİLELİM
DELETE FROM students 
WHERE name = 'Alpaslan';
SELECT * FROM students;
