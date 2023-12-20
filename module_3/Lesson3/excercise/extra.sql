use demo2006;
SELECT 
    *
FROM
    product
WHERE
    quantity >= 30;

SELECT 
    *
FROM
    product
WHERE
    quantity >= 30
        AND (price BETWEEN 100 AND 200);

SELECT 
    *
FROM
    customer
WHERE
    age > 18;

SELECT 
    *
FROM
    customer
WHERE
    age > 20 AND name LIKE 'Nguyễn%';

SELECT 
    *
FROM
    product
WHERE
    name LIKE 'M%';

SELECT 
    *
FROM
    product
WHERE
    name LIKE '%e';

SELECT 
    *
FROM
    product
ORDER BY quantity;

SELECT 
    *
FROM
    product
ORDER BY price DESC;

SELECT 
    customer.name, `order`.time
FROM
    `order`
        JOIN
    customer ON customer.id = `order`.customerId;
    
SELECT 
    customer.name, product.name
FROM
    orderdetail
        JOIN
    product ON orderdetail.productId = product.id
        JOIN
    `order` ON `order`.id = orderdetail.orderId
        JOIN
    customer ON customer.id = `order`.customerId;
    
SELECT
    `order`.*, product.name
FROM
    `order`
        JOIN
    orderdetail ON `order`.id = orderdetail.orderId
        JOIN
    product ON orderdetail.productId = product.id
WHERE
    time BETWEEN '2006-06-19' AND '2006-06-20';