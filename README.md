API de Gerenciamento de Fornecedores

Sistema REST para controle de fornecedores com dados comerciais.

Tecnologias

* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database

Estrutura do projeto

* models → entidades JPA
* repositories → acesso ao banco de dados
* services → regras de negócio
* controllers → endpoints REST

Endpoints

* POST /fornecedores
* GET /fornecedores
* GET /fornecedores/{id}
* PUT /fornecedores/{id}
* DELETE /fornecedores/{id}

Como testar

Os endpoints podem ser testados utilizando:

Postman
ou
Swagger: http://localhost:8080/swagger-ui/index.html
