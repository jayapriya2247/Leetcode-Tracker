-- Last updated: 7/9/2026, 3:07:31 PM
# Write your MySQL query statement below
SELECT e.name, b.bonus
FROM Employee e
LEFT JOIN Bonus b
ON e.empID = b.empID
WHERE b.bonus IS NULL OR b.bonus < 1000; # Write your MySQL query statement below
