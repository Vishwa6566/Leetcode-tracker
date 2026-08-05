-- Last updated: 8/5/2026, 1:58:47 PM
# Write your MySQL query statement below
SELECT w1.Id
FROM Weather w1
JOIN Weather w2
ON DATEDIFF(w1.RecordDate, w2.RecordDate) = 1
WHERE w1.Temperature > w2.Temperature;