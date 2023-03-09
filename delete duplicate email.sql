# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
DELETE p
FROM Person p, Person q
WHERE p.email=q.email and p.id>q.id 
#> comparision is done so that different id values are checked for duplicates and not compared with themselves