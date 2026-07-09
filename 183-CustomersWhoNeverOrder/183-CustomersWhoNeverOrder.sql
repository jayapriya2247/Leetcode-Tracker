-- Last updated: 7/9/2026, 3:08:00 PM
# Write your MySQL query statement below
SELECT name AS "Customers"
FROM Customers WHERE Customers.id not in (
    SELECT customerId FROM Orders
);
