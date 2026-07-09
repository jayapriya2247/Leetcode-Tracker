-- Last updated: 7/9/2026, 3:07:59 PM
select dp.name as Department, em.name as Employee, em.salary
from Employee as em join Department as dp 
on em.departmentId = dp.id 
where em.salary = ( select max(salary) from Employee where departmentId = dp.id )