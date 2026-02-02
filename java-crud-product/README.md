Java In-Memory CRUD / CRUD em Memória em Java
Português
Descrição do Projeto

Este projeto implementa um CRUD (Create, Read, Update, Delete) para produtos utilizando Java puro, sem banco de dados, funcionando totalmente em memória. O objetivo é demonstrar boas práticas de arquitetura, organização de código, Clean Code, validações e Fail Fast, mantendo uma estrutura profissional e fácil de evoluir.

O projeto inclui:

Criação de produtos (Create)

Consulta individual e listagem completa (Read)

Atualização de produtos (Update)

Exclusão de produtos (Delete)

Tudo é manipulado em memória, utilizando uma List<Product> como repositório.

Estrutura do Projeto
project-root/
 ├─ src/
 │   ├─ model/
 │   │   └─ Product.java           // Representa o produto e suas validações
 │   ├─ repository/
 │   │   └─ ProductRepository.java // Gerencia dados em memória
 │   ├─ service/
 │   │   └─ ProductService.java    // Regras de negócio e validações
 │   └─ Main.java                  // Classe de execução e testes
 └─ README.md

Tecnologias Utilizadas

Java 11+

BigDecimal para valores monetários

LocalDate para datas de validade

Listas para armazenamento em memória

Como Executar

## 🔗 Clone o Repositório
git clone https://github.com/FelipeFalcaoDev/JAVA-CRUD-InMEMORY.git

Abra no seu IDE Java favorito (Eclipse, IntelliJ, VSCode).

Execute a classe Main.java.

Todas as operações (Create, Read, Update, Delete) são realizadas na mesma execução, pois os dados não são persistidos em disco. Cada execução inicia a lista de produtos do zero.

Fluxo de Uso

Create: os produtos são criados e validados pelo ProductService. IDs duplicados não são permitidos.

Read: é possível consultar todos os produtos ou filtrar por ID.

Update: atualiza um produto existente em memória, mantendo as validações do objeto Product.

Delete: remove produtos da lista por ID.

Nota: Como o armazenamento é em memória, ao finalizar a execução do programa, todos os dados são perdidos.

Diferenciais do Projeto

Validações Fail Fast para regras de negócio (IDs, nome, preço, estoque, validade).

Código organizado em camadas (Model, Repository, Service, Main).

Implementação de CRUD completo em memória de forma profissional e escalável.

Código limpo e legível, seguindo princípios básicos de Clean Code.

--------------------------------------------------------------------------------------

English
Project Description

This project implements a CRUD (Create, Read, Update, Delete) system for products using pure Java, without a database, operating entirely in memory. The goal is to demonstrate professional architecture, code organization, Clean Code, validations, and Fail Fast, in a structure that is easy to extend.

The project supports:

Product creation (Create)

Individual and full listing queries (Read)

Product updates (Update)

Product deletion (Delete)

All data is stored in memory using a List<Product> as repository.

Project Structure
project-root/
 ├─ src/
 │   ├─ model/
 │   │   └─ Product.java           // Represents a product and its validations
 │   ├─ repository/
 │   │   └─ ProductRepository.java // Manages in-memory data
 │   ├─ service/
 │   │   └─ ProductService.java    // Business rules and validations
 │   └─ Main.java                  // Execution and tests
 └─ README.md

Technologies Used

Java 11+

BigDecimal for monetary values

LocalDate for validity dates

Lists for in-memory storage

How to Run

## 🔗 Clone the Repository
git clone https://github.com/FelipeFalcaoDev/JAVA-CRUD-InMEMORY.git

Open it in your preferred Java IDE (Eclipse, IntelliJ, VSCode).

Run Main.java.

All operations (Create, Read, Update, Delete) occur within the same run, as data is not persisted. Each execution starts with an empty product list.

Usage Flow

Create: Products are created and validated by ProductService. Duplicate IDs are not allowed.

Read: You can query all products or filter by ID.

Update: Updates an existing in-memory product, keeping Product validations intact.

Delete: Removes products from the list by ID.

Note: Since storage is in memory, all data is lost when the program ends.

Project Highlights

Fail Fast validations for business rules (ID, name, price, stock, validity).

Code organized in layers (Model, Repository, Service, Main).

Full in-memory CRUD implementation in a professional, scalable way.

Clean, readable code following basic Clean Code principles.
