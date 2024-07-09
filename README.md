
# **Tutorial Management System**

# **Project Context**

A client has requested a demo of a tutorial management system. In the future, this system will allow users to upload and view tutorials similar to Udemy, as well as edit or delete them.

# **Project Description**

The goal of this project is to develop a tutorial management system using Java and MySQL that allows users to:
- View a list of tutorials
- Add tutorials to the database
- Delete tutorials from the database
- Edit an existing tutorial
To achieve this, we have used the MVC design pattern, implemented a complete CRUD and performed unit tests for each functionality of the CRUD.

## Used technology

- **Java**
- **Spring Boot**
- **MySQL**
- **JUnit**

## Principles and Good Practices

We have followed object-oriented programming principles and SOLID best practices to ensure that our code is robust, maintainable and extensible.

## Project Structure

The project follows the MVC (Model-View-Controller) architecture to separate responsibilities and improve code organization.

- **Model**: Represents the data and business logic. Uses JPA entities to interact with the MySQL database.
- **View**: In this project, a specific view layer has not been implemented since it is a backend. However, data is exposed through REST endpoints.
- **Controller**: Manages HTTP requests and coordinates responses using services.

## Features

1. **See List of Tutorials**
 - Endpoint: `GET /tutorials`
 - Description: Allows you to view all the tutorials available in the database.

2. **Add Tutorial**
 - Endpoint: `POST /tutorials`
 - Description: Allows you to add a new tutorial to the database.
 - Body: `{ "title": "titulo", "description": "descripcion", "published": true/false }`

3. **Delete Tutorial**
 - Endpoint: `DELETE /tutorials/{id}`
 - Description: Allows you to delete an existing tutorial from the database.

4. **Edit Tutorial**
 - Endpoint: `PUT /tutorials/{id}`
 - Description: Allows you to update an existing tutorial.
 - Body: `{ "title": "new title", "description": "new description", "published": true/false }`

## Evidence

Unit tests have been carried out for each of the CRUD functionalities using JUnit.

## Installation and Execution

### Previous requirements

- Java 11 or higher
-Maven
-MySQL

### Instructions

1. Clone the repository:

 ```bash
 git clone https://github.com/usuario/tutorial-management-system.git
 cd tutorial-management-system
 ```

2. Configure MySQL database:

 - Create a database called `tutorial_db`.
 - Configure database credentials in the `src/main/resources/application.properties` file.

3. Compile and run the application:

 ```bash
 mvn clean install
 mvn spring-boot:run
 ```

4. The application will be available at `http://localhost:8080`.

## Contributions

Contributions are welcome. Please open an issue or pull request to discuss any changes you would like to make.
- Hilmar Hernandez - [GitHub](https://github.com/Hilmar09)
- Asdrubal Bello - [GitHub](https://github.com/abelloch)
- Maksym Hryshchuk - [GitHub](https://github.com/Ruji7576)
- Eva Martínez - [GitHub](https://github.com/EvaMartinez94)

