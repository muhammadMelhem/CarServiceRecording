# Car Service Recording
The application would keep record of the customers, their car(s), and the individual services and service notes associated with each car.

# Technologies:
● Java 1.8

● Spring Boot

● H2 data-base

● Maven

● Hibernate

● JPA

## Getting Started

To get a local copy up and running follow these simple example steps.

### Installation

1. Clone the repo
   ```sh
   https://github.com/muhammadMelhem/CarServiceRecording.git
   ```
2. Build the project

   ```sh
   mvn clean install

   ```
## OpenAPI documentation

   ```sh
    http://localhost:8080/swagger-ui/index.html?configUrl=/api-docs/swagger-config#/

   ```
 ## Logs Location

   ```sh
     /CarServiceRecording/logs
   ```

 
## Application Endpoints


Controller | Method | HTTP request |
------------ | ------------- | ------------- |
*CarServicesControllerApi* | **create** | **POST** /api/carServices/ | 
*CarServicesControllerApi* |  **findByCar**  | **GET** /api/carServices/car/{car_id} | 
*CarServicesControllerApi* |  **findByCustomer**  | **GET** /api/carServices/customer/{customer_id} | 
*CustomerControllerApi* |   **findAll**  | **GET** /api/customer/ | 

