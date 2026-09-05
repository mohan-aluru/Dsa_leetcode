SELECT today.id
FROM Weather AS yesterday
JOIN Weather AS today
    ON DATEDIFF(today.recordDate, yesterday.recordDate) = 1
WHERE today.temperature > yesterday.temperature;
