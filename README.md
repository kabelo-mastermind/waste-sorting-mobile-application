# Enviro365 Waste Sorting Application

## Description
This is a Spring Boot application developed for Enviro365, a leading environmental solutions company. The application aims to promote sustainable waste management practices by providing an API for waste sorting, disposal guidelines, and recycling tips. The application supports data retrieval and manipulation through RESTful APIs and uses an in-memory H2 database for storage.

## Features
- **Waste Category Management**: Allows users to create, read, update, and delete waste categories.
- **Disposal Guidelines**: Provides guidelines for proper waste disposal.
- **Recycling Tips**: Displays tips for recycling waste.
- **RESTful APIs**: JSON-based APIs for communication with mobile frontend.
- **Validation**: Input validation using Spring Boot annotations.
- **In-memory H2 Database**: Temporary storage for data during runtime.

## Technologies Used
- **Backend**: Spring Boot, Spring Data JPA, Hibernate
- **Database**: H2 (in-memory)
- **Validation**: Spring Boot Validation Annotations
- **Build Tool**: Maven
- **Java Version**: 11

## Getting Started

### Prerequisites
- Java 11+ installed
- Maven installed
- IDE (e.g., IntelliJ IDEA, Eclipse)

### Steps to Run the Application
1. Clone the repository:
   ```bash
   git clone <repository-url>
cd waste-sorting-mobile-application
mvn clean install
mvn spring-boot:run
Access the H2 console (optional) at: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: (leave blank)/password

Here’s a ready-to-copy README file for your Spring Boot waste sorting application:

markdown
Copy code
# Enviro365 Waste Sorting Application

## Description
This is a Spring Boot application developed for Enviro365, a leading environmental solutions company. The application aims to promote sustainable waste management practices by providing an API for waste sorting, disposal guidelines, and recycling tips. The application supports data retrieval and manipulation through RESTful APIs and uses an in-memory H2 database for storage.

## Features
- **Waste Category Management**: Allows users to create, read, update, and delete waste categories.
- **Disposal Guidelines**: Provides guidelines for proper waste disposal.
- **Recycling Tips**: Displays tips for recycling waste.
- **RESTful APIs**: JSON-based APIs for communication with mobile frontend.
- **Validation**: Input validation using Spring Boot annotations.
- **In-memory H2 Database**: Temporary storage for data during runtime.

## Technologies Used
- **Backend**: Spring Boot, Spring Data JPA, Hibernate
- **Database**: H2 (in-memory)
- **Validation**: Spring Boot Validation Annotations
- **Build Tool**: Maven
- **Java Version**: 11

## Getting Started

### Prerequisites
- Java 11+ installed
- Maven installed
- IDE (e.g., IntelliJ IDEA, Eclipse)

### Steps to Run the Application
1. Clone the repository:
   ```bash
   git clone <repository-url>
Navigate to the project directory:

bash
Copy code
cd enviro365-waste-sorting
Build the project:

bash
Copy code
mvn clean install
Run the application:

bash
Copy code
mvn spring-boot:run
Access the H2 console (optional) at: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: (leave blank)
API Endpoints
Waste Category
Method	Endpoint	Description
GET	/api/v1/waste-categories	Fetch all waste categories
POST	/api/v1/waste-categories	Add a new waste category
PUT	/api/v1/waste-categories/{id}	Update a specific category
DELETE	/api/v1/waste-categories/{id}	Delete a specific category
Disposal Guidelines
Method	Endpoint	Description
GET	/api/v1/disposal-guidelines	Fetch all disposal guidelines
POST	/api/v1/disposal-guidelines	Add a new disposal guideline
Recycling Tips
Method	Endpoint	Description
GET	/api/v1/recycling-tips	Fetch all recycling tips
POST	/api/v1/recycling-tips	Add a new recycling tip

src
├── main
│   ├── java
│   │   └── com.enviro.assessment.grad001.kabelodavidnkoane
│   │       ├── controller        // REST Controllers
│   │       ├── model             // Entity classes
│   │       ├── repository        // JPA Repositories
│   │       ├── service           // Business logic layer
│   │       └── Application.java  // Main application entry point
│   ├── resources
│       ├── application.properties // Configuration
│       └── data.sql               // Optional: Initial data for testing

Testing
You can test the application using:

Postman: Import the provided API endpoints and test their functionality.
H2 Console: View and query the in-memory database by visiting: http://localhost:8080/h2-console


Just replace `[Kabelo]`, `[kabelodavidnkoane@gmail.com]`, and `[[LinkedIn Profile](https://linkedin.com/in/kabelo-david)]` with your actual details, and you're good to go!

Let me know if you need further adjustments!

