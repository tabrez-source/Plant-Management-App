Plant Management Application


Introduction

The Plant Management Application is a Java-based project developed using the Spring Boot framework. This application enables users to efficiently manage plant information by allowing them to add new plants, view existing plant details, and calculate the total value of their plant collection. Additionally, the application incorporates advanced functionalities such as string filtering, logic puzzle solving, and data normalization, demonstrating comprehensive Java programming skills and the application of GRASP (General Responsibility Assignment Software Patterns) design principles.

Features

Add New Plants
Input plant name, type, price, and description.
View Existing Plants
Display a list of all plants with detailed information.
Calculate Total Plant Value
Compute and display the aggregate value of all plants.
String Filtering
Clean and tag plant descriptions for better readability.
Logic Puzzle Solving
Match students to their respective pets based on predefined criteria.
Data Normalization
Normalize datasets within specified bounds and verify statistical proportionality.
Comprehensive Testing
JUnit test cases ensure the reliability and correctness of functionalities.
Technologies Used
Programming Language: Java
Framework: Spring Boot
Build Tool: Maven
Testing Framework: JUnit 5
Version Control: Git & GitHub
Documentation: Markdown (README.md)
Design Patterns: GRASP Principles
Installation
Prerequisites
Java Development Kit (JDK): Version 11 or higher. Download JDK
Maven: For dependency management. Download Maven
Git: For version control. Download Git
GitHub Account: To host the repository. 

The application will perform predefined operations such as adding plants, displaying them, string filtering, logic puzzle solving, and data normalization.

Application Functionalities
Add Plants: Input detailed information for each plant.
Display Plants: View a comprehensive list of all plants.
Calculate Total Value: Get the sum of all plant prices.
String Filtering: Clean and tag plant descriptions.
Logic Puzzle: Solve puzzles related to matching students and pets.
Data Normalization: Normalize and verify datasets.
Project Structure
plaintext
Copy code

plant-management-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ca.on.conestogac.assignment_one_scaffold/
│   │   │       ├── AssignmentOneScaffoldApplication.java
│   │   │       ├── PlantController.java
│   │   │       ├── PlantManager.java
│   │   │       ├── PlantOperations.java
│   │   │       ├── Plants.java
│   │   │       └── PartA.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── ca.on.conestogac.assignment_one_scaffold/
│               ├── LogicPuzzleTest.java
│               └── PlantTest.java
├── README.md
├── pom.xml
└── .gitignore

Explanation of Key Components
AssignmentOneScaffoldApplication.java: The main class that bootstraps the Spring Boot application.
PlantController.java: Handles user interactions and delegates tasks to the PlantManager.
PlantManager.java: Implements the business logic for managing plants.
PlantOperations.java: An interface defining operations related to plant management.
Plants.java: Represents the Plant entity with attributes like name, type, price, and description.
PartA.java: Contains additional functionalities like string filtering, logic puzzles, and data normalization.
LogicPuzzleTest.java & PlantTest.java: JUnit test classes ensuring the reliability of core functionalities.
Testing
Running Test Cases

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running ca.on.conestogac.assignment_one_scaffold.LogicPuzzleTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.025 sec

Running ca.on.conestogac.assignment_one_scaffold.PlantTest
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.012 sec

Results:

Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
Contributing
Contributions are welcome! To contribute to the Plant Management Application, please follow these steps:


Acknowledgements
Spring Boot Community: For providing a robust framework for building Java applications.
JUnit: For the testing framework ensuring code reliability.
GRASP Principles: For guiding the design and architecture of the application.
Additional Resources
GitHub Documentation: https://docs.github.com/
Spring Boot Guides: https://spring.io/guides
JUnit 5 Documentation: https://junit.org/junit5/docs/current/user-guide/
GRASP Principles: https://en.wikipedia.org/wiki/GRASP_(object-oriented_design)
Git Commands to Commit and Push README.md

