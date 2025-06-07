## Tecnologias utilizadas
Java
Spring Boot
Maven
Docker
Swagger

## Estrutura do projeto
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

## Passos para roda o codigo
1. **Clonar o repositório**
git clone <repository-url>
cd java-crud-api

2. **Compilar o projeto**
mvn clean install

3. **Caso queira rodar a aplicacao nomal sem o docker**
mvn spring-boot:run

4. **Rodar com o docker**
docker build -t java-crud-api .

docker run -p 8080:8080 java-crud-api

## Para acessar a API no navegador
http://localhost:8080/swagger-ui.html

## Uso da API

### Endpoints

**Criar Item**

`POST /api/items`  
Corpo da requisição: representação JSON do item.

**Listar Todos os Itens**

`GET /api/items`

**Buscar Item por ID**

`GET /api/items/{id}`

**Atualizar Item**

`PUT /api/items/{id}`  
Corpo da requisição: representação JSON do item atualizado.

**Deletar Item**

`DELETE /api/items/{id}`





