# Write your MySQL query statement below
# SELECT empId as emp, name 
# from Employee

# select empId as bonemp, bonus
# from Bonus

# where 

select emp.name, bon.bonus 
from Employee emp
left outer join Bonus bon
on emp.empId=bon.empId
where bon.bonus<1000 or bonus is null