-- Last updated: 7/9/2026, 3:08:12 PM
select FirstName, LastName, City, State
from Person left join Address
on Person.PersonId = Address.PersonId
;# Write your MySQL query statement below
