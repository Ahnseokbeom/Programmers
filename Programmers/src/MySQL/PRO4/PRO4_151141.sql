SELECT HISTORY_ID, 
    ROUND(DAILY_FEE * (DATEDIFF(h.END_DATE,h.START_DATE)+1)
    * (CASE 
    WHEN DATEDIFF(END_DATE,START_DATE)+1 < 7 THEN 1
    WHEN DATEDIFF(END_DATE,START_DATE)+1 < 30 THEN 0.95
    WHEN DATEDIFF(END_DATE,START_DATE)+1 < 90 THEN 0.92
    ELSE 0.85 END)) AS "FEE"

FROM CAR_RENTAL_COMPANY_CAR AS c 
    JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY AS h
    ON c.CAR_ID = h.CAR_ID
    JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN AS p
    ON c.CAR_TYPE = p.CAR_TYPE

WHERE c.CAR_TYPE = "트럭"

GROUP BY HISTORY_ID

ORDER BY FEE DESC , HISTORY_ID DESC
