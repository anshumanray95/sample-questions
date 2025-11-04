-- 1. Movie Reviews
SELECT DISTINCT reviewer_name 
FROM movie_reviews 
WHERE review_stars >= 6;

-- 2. Average Prices
SELECT man_com_code, AVG(item_price) AS avg_price 
FROM items 
GROUP BY man_com_code;

-- 3. Customer Order Retrieval
SELECT customer_name 
FROM customers 
WHERE order_date > '2023-08-31';

-- 4. Highest GPA Query
SELECT stu_id, first_name 
FROM students 
WHERE gpa = (SELECT MAX(gpa) FROM students);

-- 5. Course Enrollment Report
SELECT DISTINCT course_id 
FROM enrollments 
WHERE join_date > '2023-09-25';

-- 6. Customer Purchase Report
SELECT customer_name, total_amount 
FROM purchases 
WHERE total_amount > 100;

-- 7. High Scorers
SELECT student_name 
FROM exam_results 
WHERE score > 90;
