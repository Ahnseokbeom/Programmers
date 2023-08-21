SELECT distinct c.CAR_ID
from CAR_RENTAL_COMPANY_CAR c join CAR_RENTAL_COMPANY_RENTAL_HISTORY h
on c.CAR_ID = h.CAR_ID
where c.CAR_TYPE = '세단' and DATE_FORMAT(h.START_DATE,"%m")='10'
order by c.CAR_ID desc;
