-- Last updated: 7/9/2026, 3:07:16 PM
# Write your MySQL query statement below

SELECT MAX(num) as num
FROM mynumbers n
where num IN (
    SELECT num
    FROM mynumbers
    GROUP BY num
    HAVING COUNT(*)=1
)# Write your MySQL query statement below
