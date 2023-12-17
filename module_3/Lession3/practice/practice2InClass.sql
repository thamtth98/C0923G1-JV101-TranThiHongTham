use demo2006;
select name,age,time
from customer, `order`
where `order`.customerId = customer.id;

use demo2006;
select name,age,time
from customer
	join `order`
	on `order`.customerId = customer.id
    join orderdetail
    on `order`.id=orderdetail.productId;