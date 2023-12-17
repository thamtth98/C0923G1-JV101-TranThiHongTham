drop database if exists management_sell;
create database if not exists management_sell;
use management_sell;
create table customer(
customer_id int primary key auto_increment not null,
customer_name varchar(30) not null,
customer_age int check (customer_age>0)
);
create table order_goods(
order_id int primary key auto_increment not null,
customer_id int,
order_date datetime not null,
order_total_price long,
foreign key (customer_id) references customer (customer_id)
);
create table product(
product_id int primary key ,
product_name varchar(30) not null,
product_price int check (product_price>0)
);
create table order_detail(
order_id int,
product_id int,
order_detail_qty varchar(30),
primary key (order_id,product_id),
foreign key (order_id) references order_goods(order_id),
foreign key (product_id) references product(product_id)
);