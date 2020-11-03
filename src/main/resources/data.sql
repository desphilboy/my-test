INSERT INTO accounts (acct_Number, customer_Id, name, type, currency, balance, balance_Date)
values
(2284874435, '11111111111',  'SGSaving726', 'Saving', 'SGD', '415678.89', '08/11/2018'),
(2284828523, '11111111111',  'MyAUDSaving', 'Saving', 'AUD', '105678.89', '08/11/2019'),
(2284833245, '11111111111', 'MyUSDSaving', 'Saving', 'USD', '150678.89', '08/11/2019'),
(2284825656, '11111111111',  'SGSCurrent726', 'Current', 'SGD', '315678.89', '08/11/2020'),
(2284811827, '11111111111',  'MyAUDCurrent', 'Current', 'AUD', '215678.89', '09/12/2018'),
(2284843899, '11111111111', 'MyAUDCurrent', 'Current', 'AUD', '2154678.89', '09/12/2018'),
(2284829833, '11111111111', 'My Business', 'Current', 'AUD', '92015678.89', '09/12/2020'),
(2284826411, '11111111111',  'Singa saving', 'Saving', 'SGD', '1564478.89', '09/11/2018');

INSERT INTO transactions (id, acct_Number, value_Date, debit_Amount, credit_Amount, debit_Credit, narrative)
values
(22234567777771, 2284874435, 'Jan 12, 2012', 0, 9540.98, 'Credit', 'Payment from my customer'),
(22234567777772, 2284874435, 'Jan 12, 2012', 0, 85140.98, 'Credit', 'Second Payment from my customer'),
(22234567777773, 2284874435, 'Jan 12, 2012', 0, 85140.98, 'Debit', 'Payment to employees'),
(22234567777774, 2284874435, 'Jan 12, 2012', 0, 85140.98, 'Debit', 'Second Payment from my customer');