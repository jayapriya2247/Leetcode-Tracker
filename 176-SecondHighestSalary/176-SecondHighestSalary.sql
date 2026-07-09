-- Last updated: 7/9/2026, 3:08:11 PM
select
(select distinct Salary 
from Employee order by salary desc 
limit 1 offset 1) 
as SecondHighestSalary;# Write your MySQL query statement below
