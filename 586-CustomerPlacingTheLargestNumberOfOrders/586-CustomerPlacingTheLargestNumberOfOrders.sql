-- Last updated: 7/9/2026, 3:07:26 PM
SELECT customer_number
FROM Orders 
GROUP BY customer_number
ORDER BY COUNT(customer_number) DESC
LIMIT 1;# Write your MySQL query statement below
