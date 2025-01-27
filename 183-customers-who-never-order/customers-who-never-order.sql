# Write your MySQL query statement below
SELECT NAME AS Customers
from Customers
where id not in (
    select customerid
    from orders
);