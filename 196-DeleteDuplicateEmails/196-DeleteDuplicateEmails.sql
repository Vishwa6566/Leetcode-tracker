-- Last updated: 8/5/2026, 1:58:51 PM
# Write your MySQL query statement below
DELETE p1
FROM Person p1,
     Person p2
WHERE p1.Email = p2.Email
  AND p1.Id > p2.Id;