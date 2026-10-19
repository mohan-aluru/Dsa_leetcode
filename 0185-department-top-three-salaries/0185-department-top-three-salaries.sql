# Write your MySQL query statement below
select Department,Employee,Salary from(select d.name as Department,e.name as Employee ,e.salary as Salary,
DENSE_RANK()over(partition by d.id order by e.salary desc)as dept_rank from Department d join Employee e on d.id=e.departmentId
) as ranked where dept_rank<=3;