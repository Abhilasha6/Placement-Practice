# Write your MySQL query statement below
SELECT min(event_date) as first_login, player_id
FROM Activity
GROUP BY player_id