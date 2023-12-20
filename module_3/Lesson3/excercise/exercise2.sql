use management_sell;
insert into customer
values (1,'Minh Quan',10),
(2,'Ngoc Oanh',20),
(3,'Hong Ha',50);

insert into order_goods(order_id,customer_id,order_date,order_total_price)
values (1,1,'2006-03-21',null),
(2,2,'2006-03-23',null),
(3,1,'2006-03-16',null);

insert into product(product_id,product_name,product_price)
values (1,'May Giat',3),
(2,'Tu lanh',5),
(3,'Dieu hoa',7),
(4,'Quat',1),
(5,'Bep dien',2);

insert into order_detail(order_id,product_id,order_detail_qty)
values (1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);

SELECT 
    order_id, order_date, order_total_price
FROM
    order_goods;

SELECT 
    customer.customer_id,
    customer.customer_name,
    order_goods.order_id
FROM
    customer
        JOIN
    order_goods ON customer.customer_id = order_goods.customer_id;

SELECT 
    customer.customer_id,
    customer.customer_name,
    order_goods.order_id
FROM
    customer
        LEFT JOIN
    order_goods ON customer.customer_id = order_goods.customer_id
WHERE
    order_goods.order_id IS NULL;

SELECT 
    order_goods.order_id,
    order_goods.order_date,
    SUM(order_detail.order_detail_qty * product.product_price) AS order_total_price
FROM
    order_detail
        JOIN
    product ON product.product_id = order_detail.product_id
        JOIN
    order_goods ON order_goods.order_id = order_detail.order_id
GROUP BY order_goods.order_id , order_goods.order_date;





