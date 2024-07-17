                     Loan Application
 ## Overview
This is a Spring Boot application that allows authenticated users to apply for loans, view their loans, make repayments, and have an admin approve loans. 
The project demonstrates the use of Spring Boot, JPA, and Spring Security to create a simple loan management system.

## Features
User registration and authentication
Apply for loans with a specified amount and term
Admin approval of pending loans
View loans specific to the authenticated user
Make repayments towards approved loans
Automatic loan status update upon full repayment

## Requirements
Java 11 or higher
Maven
H2 Database (for development)
Setup
Clone the repository



## API Endpoints

Postman Collection :-
[Loan Application APIs.postman_collection.json](Loan%20Application%20APIs.postman_collection.json)


## Security
The application uses Spring Security for authentication and authorization. The endpoints for applying for loans, viewing loans, and making repayments require authentication. The endpoint for approving loans is restricted to users with admin privileges.

## Example Data
For testing purposes, you can use the following example data:

User Credentials:

Username: user1

Password: password

Username: admin

Password: adminpassword

## Notes
Ensure you replace getUserIdFromPrincipal(userDetails) in LoanController with actual user ID retrieval logic.
Customize the exception handling and validation logic as needed.
For a production setup, use a persistent database and configure proper security measures.