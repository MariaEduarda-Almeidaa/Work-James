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

## Observacao
- **Como Baixar e Instalar o Maven no Windows**

1. **Baixar o Maven**
   - Acesse: [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)
   - Clique em “Binary zip archive” para baixar o arquivo `.zip`.

2. **Extrair o Maven**
   - Extraia o arquivo `.zip` baixado para uma pasta de sua preferência, por exemplo: `C:\Program Files\Apache\maven`.

3. **Configurar a variável de ambiente `MAVEN_HOME`**
   - Clique com o botão direito em “Este Computador” > “Propriedades” > “Configurações avançadas do sistema” > “Variáveis de Ambiente”.
   - Em “Variáveis do sistema”, clique em “Novo” e adicione:
     - Nome da variável: `MAVEN_HOME`
     - Valor da variável: caminho onde você extraiu o Maven (ex: `C:\Program Files\Apache\maven\apache-maven-3.9.6`)

4. **Adicionar o Maven ao PATH**
   - Ainda em “Variáveis de Ambiente”, encontre a variável `Path` em “Variáveis do sistema” e clique em “Editar”.
   - Adicione o caminho:  
     ```
     C:\Program Files\Apache\maven\apache-maven-3.9.6\bin
     ```
     (ajuste conforme a pasta onde extraiu)

5. **Verificar a instalação**
   - Abra o Prompt de Comando e digite:
     ```
     mvn -version
     ```
   - Se aparecer a versão do Maven, está instalado corretamente!

---
