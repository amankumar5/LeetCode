# Write your MySQL query statement below
Select Distinct P1.Email from Person P1, Person P2
Where P1.Email = P2.Email and P1.Id!=P2.Id