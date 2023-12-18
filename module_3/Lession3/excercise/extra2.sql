use demo2006;
select price, sum(quantity)
from demo2006.product
group by price;
    
-- tổng số lượng sản phẩm giá < 300
select sum(quantity)
from demo2006.product
where price < 300;

-- tổng tiền nếu bán hết tất cả sản phẩm

select sum(price * quantity) as total_price
from demo2006.product;

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

    