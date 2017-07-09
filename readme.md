# Spring Boot REST application with Spring Security

## Redis Session Storage
1. Startup Redis
   
    \<Redis_home\>/redis-server
    
2. Update connection details in /redis.conf

## Database
Data is stored in a SQLite database file /sample1.db

## To build and run the application:
    ./gradlew clean build && java -jar build/libs/exercise-0.1.0.jar

## To login and get a new token ( x-auth-token )
    curl -v http://localhost:8080/ -u amurray4:2JTLEqMR

## To Read the user's account
    curl -X GET -v http://localhost:8080/account -H "x-auth-token: 345a0536-ffc5-4b62-8ebc-a29d1fcef683"

## To Update the user's account balance
    curl -X PUT -v http://localhost:8080/account -H "Content-Type: application/json" -H "x-auth-token: 3c0060b4-98e2-485c-80be-2111c86e2653" -d '{"balance":"500.00"}' 




