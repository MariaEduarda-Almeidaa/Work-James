# Java CRUD API

This project is a Spring Boot application that provides a RESTful API for performing CRUD (Create, Read, Update, Delete) operations on items. The API is documented using Swagger and can be run in a Docker container.

## Project Structure

```
java-crud-api
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── demo
│   │   │               ├── DemoApplication.java
│   │   │               ├── controller
│   │   │               │   └── ItemController.java
│   │   │               ├── model
│   │   │               │   └── Item.java
│   │   │               └── service
│   │   │                   └── ItemService.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── demo
│                       └── DemoApplicationTests.java
├── Dockerfile
├── docker-compose.yml
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Clone the repository:**
   ```
   git clone <repository-url>
   cd java-crud-api
   ```

2. **Build the project:**
   ```
   mvn clean install
   ```

3. **Run the application using Docker:**
   ```
   docker-compose up
   ```

4. **Access the API:**
   The API will be available at `http://localhost:8080/api/items`.

5. **Swagger Documentation:**
   The Swagger UI can be accessed at `http://localhost:8080/swagger-ui.html`.

## API Usage

### Endpoints

- **Create Item**
  - **POST** `/api/items`
  - Request Body: JSON representation of the item.

- **Get All Items**
  - **GET** `/api/items`

- **Get Item by ID**
  - **GET** `/api/items/{id}`

- **Update Item**
  - **PUT** `/api/items/{id}`
  - Request Body: JSON representation of the updated item.

- **Delete Item**
  - **DELETE** `/api/items/{id}`

## Running Tests

To run the tests, use the following command:
```
mvn test
```

## License

This project is licensed under the MIT License.