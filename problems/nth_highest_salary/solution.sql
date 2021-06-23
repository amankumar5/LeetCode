CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
 DECLARE temp Int;
 SET temp = N-1;
  RETURN (
      # Write your MySQL query statement below.
      select Distinct Salary from Employee ORDER BY Salary DESC limit temp,1
  );
END