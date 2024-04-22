-- JOIN
SELECT product_id, product_name, category_name
FROM products AS p --> diyerek products ismini p yaparız. AS p demeden de yapabiliriz.
INNER JOIN categories AS c --INNER JOIN categories AS c ON products.category_id = categories.category_id; -> yazarak da yapabiliriz
ON p.category_id = c.category_id;
-- products'daki catgeory_id ile categories'deki category_id arasında eşleşen veriler için;
-- product'tan product_id ve product_name, categories'den category_name sütununu birleştirir ve kayıtları döner.

SELECT * FROM products;

SELECT testproduct_id, product_name, category_name
FROM testproducts AS tp 
INNER JOIN categories AS c
ON  tp.category_id = c.category_id;
