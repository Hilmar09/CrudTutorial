# **Tutorial Management System**

# **Project Context**

A client has requested a demo of a tutorial management system. In the future, this system will allow users to upload and view tutorials similar to Udemy, as well as edit or delete them.

# **Project Description**

The goal of this project is to develop a tutorial management system using Java and MySQL that allows users to:
View a list of tutorials
Add tutorials to the database
Delete tutorials from the database
Edit an existing tutorial

# **Project Objectives**

Reinforce object-oriented programming concepts for students.
Apply inheritance, MVC, dependency injection, and encapsulation to hide the internal implementation of classes and protect data.
Utilize SOLID principles.

# **Project Requirements**

Knowledge of Java programming, Spring Boot, and MySQL.
Understanding of Object-Oriented Programming (OOP).
Adherence to best practices in programming.

# **Evaluation Modalities**

The project will be evaluated as a group. The project submission deadline is Monday, 12/07.

# **Expected Deliverables**

A tutorial management system implemented in Java that allows users to upload and view tutorials, edit a tutorial, or delete it (CRUD).
Implementation of inheritance, MVC, dependency injection, and encapsulation to hide the internal implementation of classes and protect data.
Available Resources
Access to videos and resources on object-oriented programming.
Support and guidance provided by the training team.

**Project Timeline**
Week 1: Design the classes and structure of the tutorial management system. Implement classes, encapsulation, and inheritance. Ensure Create and Read (CRUD) methods are functioning.
Performance Criteria
Diagram explaining the system.
GitHub repository with the corresponding README.
Project Structure
**Packages**
The project is divided into three main packages:

Model: Contains the data models for the tutorials.
Controller: Contains the controllers that handle HTTP requests and responses.
Service: Contains the service classes that contain the business logic and interact with the repository.
CRUD Methods and Tests
Each package includes CRUD methods and their respective tests to ensure the functionality is working correctly.

**Model Package**
Contains the data models representing the structure of tutorials.

**Controller Package**
Handles HTTP requests and responses:

Post: Adds a new tutorial to the database.
Get: Retrieves tutorials from the database.
Put: Edits an existing tutorial.
Delete: Removes a tutorial from the database.

**Service Package**
Contains business logic and interactions with the repository:

Implements CRUD operations.
Validates data before processing.

**Tests**
Each package includes tests to verify the functionality of CRUD operations.