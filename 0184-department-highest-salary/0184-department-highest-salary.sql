select d.name AS Department,
e.name as Employee,
e.salary AS Salary
 from Employee e join Department d on e.departmentId=d.id
  where e.salary=(select  max(e1.salary) from employee e1 where e1.departmentId=e.departmentId );