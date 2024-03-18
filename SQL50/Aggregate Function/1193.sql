# Write your MySQL query statement below
select
    date_format(trans_date, "%Y-%m") as month,
    country,
    count(*) as trans_count,
    sum(if(state = "Approved", 1, 0)) as approved_count,
    sum(amount) as trans_total_amount,
    sum(if(state="Approved", amount, 0)) as approved_total_amount
from Transactions
group by month, country;