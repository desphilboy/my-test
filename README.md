# WholeSale ANZ using Spring Boot, H2 JPA

Build Restful APIs to support accounts summary and transactions history as per requested test.

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

## Setup

**1. Clone the application**

```bash
git clone git@github.com:desphilboy/my-test.git
```

**2. Build and run the app using maven**

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following GET APIs.
for getting the summary view: 

    GET /accounts/listall

for getting the transactions history on the specific account:
    
    GET /accounts/{acctNumber}/transactions
    

example: you can use this in POSTMAN to get transactions history:
	GET localhost:8080/accounts/2284874435/transactions

You can test them using postman or any other rest client.

## Description:

this is for ANZ coding test. as test says I just created APIs to support the story defined it the provided pdf file.
I ignored the navigation and UI parts as requested.
Sample data is in  src/main/resources/data.sql
I have written couple of tests , ofcourse this is just a demonstration not a 100% coverage.
hibernate is being used here and url mapping is done by Spring annotations.




