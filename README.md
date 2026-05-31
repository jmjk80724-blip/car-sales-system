#Car Sale System 
A REST API BACKEND for managing car sales built with Spring Boot.

## Techologies
   - Java
   - Spring Boot
   - JWT Security
   - PostgreSQL
   - Maven
   - Postman (for Test API)
## Featur
 - Car Management (CRUD)
 - Employee & customer Management
 - Sale & Payment Tracking 
 - JWT Authentication
 - Input Validation
 - Exception Handling
 - Unit Test 

## Getting Started

### Prerquisites
   - Java 21
   - PostgreSQL
   - Maven

### Run the Applicaption
'''bash
./mvnw spring-boot:run

## API Endpoints

| Method | Endpoint | Description          | 
|-------|----------|----------------------|
| POST  | /auth/login | Login & get JWT Token |
| GEt   | /cars | Get All cars         |
| POSt  | /cars | Add new cars         |
| GEt   | /cars/{id} | Get Car by ID        |
| DELETE | /cars/{id} | Delete car           |
| GET   | /employees | Get all employees    |
| GET  | /customers | Get all customer     |
| GET | /sales | Get all sales        |
| Get | /payment | Get all payments |
  
