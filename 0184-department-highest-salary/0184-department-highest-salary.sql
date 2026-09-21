# Write your MySQL query statement below
 select d.name as "Department",e.name as "Employee",e.salary as "Salary" from Department d join Employee e on e.departmentId=d.id where(e.departmentId,e.salary) in(    SELECT departmentId, MAX(salary)
    FROM Employee
    GROUP BY departmentId); 