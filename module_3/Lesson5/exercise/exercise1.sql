drop database if exists demo;
create database if not exists demo;

use demo;
CREATE TABLE products (
    product_id INT PRIMARY KEY AUTO_INCREMENT,
    product_code VARCHAR(20) UNIQUE,
    product_name VARCHAR(70),
    product_price INT,
    product_amount INT,
    product_description VARCHAR(100),
    product_status BIT
);
INSERT INTO products  
VALUES (1,'P-001','Tivi Samsung',7000,20,'New',1),
(2,'P-002','Máy tính để bàn',10000,10,'Like New',0),
(3,'P-003','Máy giặt',10000,7,'New',1),
(4,'P-004','Tủ Lạnh',12000,8,'New',1);

-- So sánh câu truy vấn trước và sau khi tạo index
select * from products;

-- sau khi tạo index
create unique index pr_code_index on products(product_code);
create  index pr_name_price_index on products(product_name,product_price);
select * from products;

explain select * from products;

-- Tạo view lấy về các thông tin:productCode, productName, productPrice, productStatus từ bảng products.

create view product_view as
select product_code,product_name,product_price,product_status
from products;

select * from product_view;

update product_view
set product_status = 1
where product_status = 0;
select * from product_view;

DROP VIEW product_view;

-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
DELIMITER //
create procedure all_product_procedure()
   begin
   select * from products;
   end;
    //DELIMITER ;
    
    DELIMITER //
create procedure insert_product_procedure(
in product_id INT,
in product_code VARCHAR(20) ,
in product_name VARCHAR(70),
in product_price INT,
in product_amount INT,
in product_description VARCHAR(100),
in product_status BIT
)
   begin
   insert into products
   values(product_id,product_code,product_name,product_price, product_amount,product_description,product_status);
   end;
    //DELIMITER ;
    
    call insert_product_procedure(5,'P-005','Máy game',12000,8,'New',1);
    
    -- Tạo store procedure sửa thông tin sản phẩm theo id
DELIMITER //
CREATE PROCEDURE edit_product_procdure(
	IN p_product_id INT,
    IN p_product_code VARCHAR(20),
    IN p_product_name VARCHAR(70),
    IN p_product_price INT,
	IN p_product_amount INT,
	IN p_product_description VARCHAR(100),
	IN p_product_status BIT
)
BEGIN
    UPDATE products
    SET 
        product_code = p_product_code,
        product_name = p_product_name,
        product_price = p_product_price,
        product_amount = p_product_amount,
        product_description = p_product_description,
        product_status = p_product_status
    WHERE product_id = p_product_id;
END //
DELIMITER ;

call insert_product_procedure(5,'P-005','Máy nghe nhạc',12000,8,'New',1);
    
    -- Tạo store procedure xoá sản phẩm theo id
    	DELIMITER //
    create procedure del_product_procedure(in del_product_id INT)
    begin 
    delete from products
    where del_product_id = product_id;
    end;
    //DELIMITER ;
    call del_product_procedure(2)
    
    