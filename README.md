# UserManagementSystem
>`This is a User Management System implemented using the Model-View-Controller (MVC) architecture in Spring Boot. It provides a set of RESTful APIs for managing user entities.`
---
**<ins> Prerequisites </ins>**
Before running the application, make sure you have the following prerequisites installed:

* Java Development Kit (JDK)
* Maven
* Swagger (Here, it is used to test the APIs like Postman. Swagger is user-friendly compared to Postman).
---
**<ins> API Documentation </ins>**
This application uses the springdoc-openapi library to generate Swagger. By the following URL, we can access it:

` http://localhost:8080/swagger-ui.html `

This library is also used to generate API documentation. The API documentation provides detailed information about the available endpoints, request/response structures, and example requests.
 
---
**<ins> Dependencies: </ins>**
This project relies on the following dependencies:

* **Spring Boot starter web:** Framework for creating standalone Spring applications.
* **Lombok:**  Java library that helps reduce boilerplate code by automatically generating getters, setters, constructors, and more.
* **springdoc-openapi-starter-webmvc-ui:** Library for generating API documentation based on OpenAPI.
  
All the necessary dependencies are managed through Maven and will be automatically downloaded when you open the project using spring initializer. But we should add Swagger dependency separately.

---

