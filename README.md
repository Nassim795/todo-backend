# Todo-List Backend

This is a simple Todo-List application backend built with Spring Boot. The backend provides RESTful APIs to manage todo items.

## Features

- Create, read, update, and delete (CRUD) todo items
- Uses Spring Boot for backend framework
- Integrates with MySQL database

## Prerequisites

- Java 11 or higher
- Maven
- MySQL

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/Nassim795/todo-backend.git
cd todo-backend
```
### Configuration
1. Create a MySQL database named todo_db.
2. Update the src/main/resources/application.properties file with your MySQL database credentials:

```java
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Build and Run the Application
The application will start and be accessible at [http://localhost:8080/api/todos](http://localhost:8080/api/todos)

## API Endpoints

| Method  | Endpoint  | Description |
| :------------ |:---------------:| :-----:|
| GET      | /api/todos | Retrieve all todos |
| POST      | /api/todos        |   Create a new todo |
| GET | /api/todos/{id}        |   Retrieve a todo by ID |
| PUT | /api/todos/{id}        |   Update a todo by ID |
| DELETE | /api/todos/{id}        |   Delete a todo by ID |


#### Example Request:

To create a new todo, send a POST request to http://localhost:8080/api/todos with the following JSON body:
```js
{
  "title": "Learn Spring Boot",
  "description": "Build a simple Todo application",
  "completed": false
}
```
