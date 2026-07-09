-- Last updated: 7/9/2026, 3:07:55 PM
# Write your MySQL query statement below
DELETE p2 FROM Person p1 
JOIN Person p2 
ON p1.email = p2.email AND p1.id < p2.id;# Write your MySQL query statement below
