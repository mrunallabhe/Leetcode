SELECT
    Department,
    Employee,
    salary
FROM (
    SELECT
        d.name AS Department,
        e.name AS Employee,
        e.salary,
        DENSE_RANK() OVER (
            PARTITION BY d.id
            ORDER BY e.salary DESC
        ) AS ranked_salaries
    FROM employee e
    JOIN department d
        ON e.departmentid = d.id
) AS ranked_employees
WHERE ranked_salaries <= 3;