use demo2006;
select price, sum(quantity)
from demo2006.product
group by price;
    
-- tổng số lượng sản phẩm giá < 300
select sum(quantity)
from demo2006.product
where price < 300;

-- In ra sản phẩm có giá cao nhất
select product.name,  product.price
from product
where product.price = (select max( product.price) from product);

-- In ra giá trung bình của tất cả các sản phẩm
select avg(product.price)
from product;

-- tổng tiền nếu bán hết tất cả sản phẩm
select sum(price * quantity) as total_price
from demo2006.product;

-- Tính tổng số sản phẩm giá <300.
select product.name, sum(product.quantity) as total_quantity
from product
where product.price < 300
group by product.name;

-- Tìm giá bán cao nhất của các sản phẩm bắt đầu bằng chữ M.


-- in ra mã hóa đơn và giá trị hóa đơn
select `order`.id, sum(orderdetail.quantity * product.price) as total_price
from orderdetail
join `order`
on `order`.id = orderdetail.orderId
join product
on product.id = orderdetail.productId
group by `order`.id;

-- cacsh Ngắn hơn
select orderId, sum(p.price * orderDetail.quantity)
from orderDetail
join product p on p.id = orderDetail.productId
group by orderId;

    