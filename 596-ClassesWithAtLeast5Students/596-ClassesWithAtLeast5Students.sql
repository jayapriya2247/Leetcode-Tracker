-- Last updated: 7/9/2026, 3:07:23 PM
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;# Write your MySQL query statement below
