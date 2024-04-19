INSERT INTO public.tbl_customer_orders(
	customer_name, customer_email, order_id, order_date, order_total_amount)
	VALUES ('Ahmet', 'ahmetkalite@gmail.com', 2, '9654404861', 1864.52);
	
SELECT * FROM tbl_customer_orders;

INSERT INTO public.tbl_customer(
	customer_name, customer_email)
	VALUES ('Muhammet', 'muhammet@gmail.com');

SELECT * FROM tbl_customer;

INSERT INTO public.tbl_orders(
	order_date, order_total_amount, customer_id)
	VALUES (651362532, 1878.54, 2);

SELECT * FROM tbl_orders;