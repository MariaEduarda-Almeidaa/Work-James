# Java CRUD API

## Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **Maven**
- **Docker**
- **Swagger**

---

## Estrutura do Projeto

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

---

## Passos para Rodar o Código

1. **Clonar o repositório**
   ```sh
   git clone <repository-url>
   cd java-crud-api
   ```

2. **Compilar o projeto**
   ```sh
   mvn clean install
   ```

3. **Rodar a aplicação sem Docker**
   ```sh
   mvn spring-boot:run
   ```

4. **Rodar com Docker**
   ```sh
   docker build -t java-crud-api .
   docker run -p 8080:8080 java-crud-api
   ```

---

## Acessar a API no Navegador

- [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---

## Uso da API

### Endpoints

- **Criar Item**
  - `POST /api/items`
  - Corpo da requisição: representação JSON do item.

- **Listar Todos os Itens**
  - `GET /api/items`

- **Buscar Item por ID**
  - `GET /api/items/{id}`

- **Atualizar Item**
  - `PUT /api/items/{id}`
  - Corpo da requisição: representação JSON do item atualizado.

- **Deletar Item**
  - `DELETE /api/items/{id}`