# Write your MySQL query statement below
Select D.Name as Department, E.Name as Employee, E.Salary from 
Department D JOIN Employee E 
on E.DepartmentId=D.Id
where (E.DepartmentId,E.salary) in (Select DepartmentId, Max(Salary) from Employee group by DepartmentId  )