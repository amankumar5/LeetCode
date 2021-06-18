# Write your MySQL query statement below
Select C.Name as Customers from Customers C
Where C.id not in (Select distinct CustomerId from Orders)