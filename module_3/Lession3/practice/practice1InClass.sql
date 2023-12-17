use demo2006;
select *
from product
where price > 200 and price < 400
order by price desc, quantity desc;

select *
from product
where name like '%m%';


