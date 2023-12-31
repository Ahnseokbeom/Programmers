SELECT O.PRODUCT_ID, P.PRODUCT_NAME,
SUM(P.PRICE*O.AMOUNT) AS TOTAL_SALES
FROM FOOD_ORDER O JOIN (SELECT * FROM FOOD_PRODUCT) P
ON O.PRODUCT_ID = P.PRODUCT_ID
WHERE O.PRODUCE_DATE LIKE "2022-05%"
GROUP BY O.PRODUCT_ID
ORDER BY TOTAL_SALES DESC, P.PRODUCT_ID; 
