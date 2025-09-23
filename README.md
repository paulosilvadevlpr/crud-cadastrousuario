# CRUD de Usuários com Spring Boot

Este projeto é uma aplicação back-end simples para gerenciamento de usuários, construída com **Java** e **Spring Boot**. Ele implementa as operações básicas de um **CRUD (Create, Read, Update, Delete)** para servir como um projeto de portfólio, demonstrando o uso de tecnologias e práticas essenciais no desenvolvimento web com Java.

O projeto foi desenvolvido com base no tutorial do canal **Javanauta**.

---

## 🛠️ Tecnologias Utilizadas

* **Java** (versão 24)
* **Spring Boot** (versão 3.5.0)
* **Spring Data JPA**: Facilita a interação com o banco de dados.
* **H2 Database**: Banco de dados em memória, ideal para desenvolvimento e testes.
* **Maven**: Gerenciador de dependências.
* **Lombok**: Reduz o código boilerplate com anotações.
* **Postman**: Utilizado para testar os endpoints da API.

---

## 📂 Arquitetura do Projeto

O projeto segue a arquitetura de camadas, proporcionando uma organização clara e modular:

* `controller`: Responsável por receber as requisições HTTP e retornar as respostas.
* `service`: Camada que contém as regras de negócio da aplicação.
* `repository`: Interface que interage diretamente com o banco de dados.
* `entity`: Classes que representam as tabelas do banco de dados (`Usuário`).

---

## ⚙️ Funcionalidades (Endpoints da API)

A aplicação disponibiliza os seguintes endpoints para manipular os dados de usuários:

| Método HTTP | Endpoint           | Descrição                       |
| :---------- | :----------------- | :------------------------------ |
| `POST`      | `/usuario`         | Cria um novo usuário.           |
| `GET`       | `/usuario?email=`  | Busca um usuário pelo e-mail.   |
| `PUT`       | `/usuario?id=`     | Atualiza um usuário por ID.     |
| `DELETE`    | `/usuario?email=`  | Deleta um usuário pelo e-mail.  |

---

## ▶️ Como Executar o Projeto

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/nome-do-seu-projeto.git](https://github.com/seu-usuario/nome-do-seu-projeto.git)
    ```

2.  **Abra o projeto:**
    * Abra a pasta do projeto em sua IDE favorita (ex: IntelliJ IDEA).

3.  **Aguarde a resolução das dependências:**
    * O Maven irá baixar automaticamente todas as dependências necessárias.

4.  **Execute a aplicação:**
    * Execute a classe principal da aplicação, `CadastroUsuarioApplication.java`.
    * A aplicação será iniciada na porta `8081`.

---

## 🧪 Testando os Endpoints

Utilize o Postman ou outra ferramenta de sua preferência para testar os endpoints.

**1. Criar um usuário (`POST`)**

* **URL**: `http://localhost:8081/usuario`
* **Método**: `POST`
* **Body** (raw - JSON):
    ```json
    {
        "nome": "João Silva",
        "email": "joao.silva@email.com"
    }
    ```

**2. Buscar um usuário (`GET`)**

* **URL**: `http://localhost:8081/usuario?email=joao.silva@email.com`
* **Método**: `GET`

**3. Atualizar um usuário (`PUT`)**

* **URL**: `http://localhost:8081/usuario?id=1` (substitua `1` pelo ID do usuário)
* **Método**: `PUT`
* **Body** (raw - JSON):
    ```json
    {
        "nome": "João Atualizado"
    }
    ```
    *Obs: O projeto foi configurado para atualizar apenas os campos que você fornecer no corpo da requisição.*

**4. Deletar um usuário (`DELETE`)**

* **URL**: `http://localhost:8081/usuario?email=joao.silva@email.com`
* **Método**: `DELETE`

---
