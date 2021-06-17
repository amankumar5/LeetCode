# Write your MySQL query statement below
Select MAX(Salary) as SecondHighestSalary from Employee
Where Salary < (Select MAX(Salary) from Employee)