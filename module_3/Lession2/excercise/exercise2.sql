drop database if exists management_sell;
create database if not exists management_sell;
use management_sell;
CREATE TABLE customer (
    customer_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    customer_name VARCHAR(30) NOT NULL,
    customer_age INT CHECK (customer_age > 0)
);
CREATE TABLE order_goods (
    order_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    customer_id INT,
    order_date DATETIME NOT NULL,
    order_total_price LONG,
    FOREIGN KEY (customer_id)
        REFERENCES customer (customer_id)
);
CREATE TABLE product (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(30) NOT NULL,
    product_price INT CHECK (product_price > 0)
);
CREATE TABLE order_detail (
    order_id INT,
    product_id INT,
    order_detail_qty VARCHAR(30),
    PRIMARY KEY (order_id , product_id),
    FOREIGN KEY (order_id)
        REFERENCES order_goods (order_id),
    FOREIGN KEY (product_id)
        REFERENCES product (product_id)
);