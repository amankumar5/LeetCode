# Write your MySQL query statement below
Select E1.Name as Employee
from Employee E1 Inner Join Employee E2
on E1.ManagerId = E2.Id
and E1.Salary >E2.Salary
