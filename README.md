# 🛒 ms-produto — API de Gerenciamento de Produtos

API REST desenvolvida com Java e Spring Boot para gerenciamento de produtos e categorias, com operações completas de CRUD, validações, tratamento de erros e banco de dados em memória H2.

---

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database (em memória)
- Bean Validation (Jakarta)
- Lombok
- Maven

---

## 📌 Funcionalidades

- ✅ Cadastro, listagem, atualização e exclusão de **Produtos**
- ✅ Cadastro, listagem, atualização e exclusão de **Categorias**
- ✅ Relacionamento entre Produto e Categoria (ManyToOne)
- ✅ Validações nos campos de entrada (nome, descrição, valor, categoria)
- ✅ Tratamento de erros personalizado (400, 404, 409, 422, 500)

---

## ⚙️ Como executar o projeto

1. Clone o repositório:
```bash
git clone https://github.com/keyladayanaj/ms-produto.git
```

2. Acesse a pasta do projeto:
```bash
cd ms-produto
```

3. Execute o projeto:
```bash
./mvnw spring-boot:run
```

Ou execute diretamente pela IDE (IntelliJ).

---

## 🌐 Acesso

- **API:** http://localhost:8080
- **Console H2:** http://localhost:8080/h2-console

**Configuração do H2:**
| Campo | Valor |
|-------|-------|
| JDBC URL | `jdbc:h2:mem:testdb` |
| User | `sa` |
| Password | *(vazio)* |

---

## 📡 Endpoints da API

### 🔹 Produtos — `/produtos`

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/produtos` | Lista todos os produtos |
| GET | `/produtos/{id}` | Busca produto por ID |
| POST | `/produtos` | Cria novo produto |
| PUT | `/produtos/{id}` | Atualiza produto |
| DELETE | `/produtos/{id}` | Remove produto |

### 🔹 Categorias — `/categorias`

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/categorias` | Lista todas as categorias |
| GET | `/categorias/{id}` | Busca categoria por ID |
| POST | `/categorias` | Cria nova categoria |
| PUT | `/categorias/{id}` | Atualiza categoria |
| DELETE | `/categorias/{id}` | Remove categoria |

---

## 📋 Exemplo de requisição

**POST /produtos**
```json
{
  "nome": "Notebook Dell",
  "descricao": "i7 16GB RAM SSD 512GB",
  "valor": 4500.0,
  "categoria": {
    "id": 1
  }
}
```

**Resposta 201 Created:**
```json
{
  "id": 4,
  "nome": "Notebook Dell",
  "descricao": "i7 16GB RAM SSD 512GB",
  "valor": 4500.0,
  "categoria": {
    "id": 1,
    "nome": "Eletrônicos"
  }
}
```

---

## 📸 Preview

### GET /produtos
<img width="885" height="615" alt="{6BB125E6-0094-4BC4-B745-CDC1209A655B}" src="https://github.com/user-attachments/assets/07330ffe-8599-468d-9267-9ee0d0c984de" />


### POST /categorias
<img width="613" height="209" alt="image" src="https://github.com/user-attachments/assets/c6c33f6d-e527-4fd8-a107-3cfe12dd4ba3" />

<img width="922" height="282" alt="image" src="https://github.com/user-attachments/assets/830b24d1-3f9b-4a4d-8204-13cb3d19bb05" />

<img width="908" height="190" alt="image" src="https://github.com/user-attachments/assets/d78bd293-5852-475e-b76f-facadbf50bc2" />


### POST /produtos
<img width="916" height="340" alt="image" src="https://github.com/user-attachments/assets/8d6e240b-8654-4c39-9e5b-e7b696d39597" />

<img width="910" height="361" alt="image" src="https://github.com/user-attachments/assets/0b205e5e-5613-4bbe-9fcc-68da8f6c3b7f" />

<img width="912" height="364" alt="image" src="https://github.com/user-attachments/assets/78fb2b4f-364e-4019-b10e-476771d69062" />


---

## ⚠️ Tratamento de Erros

| Status | Descrição |
|--------|-----------|
| 400 | JSON malformado ou parâmetro inválido |
| 404 | Recurso não encontrado |
| 409 | Conflito de integridade (ex: categoria inexistente) |
| 422 | Dados inválidos (falha na validação) |
| 500 | Erro interno inesperado |

---

## 📂 Estrutura do projeto

```
src/main/java/br/fiap/com/br/ms/produto/
├── controller/
│   ├── CategoriaController.java
│   └── ProdutoController.java
├── dto/
│   ├── CategoriaDTO.java
│   └── ProdutoDTO.java
├── entities/
│   ├── Categoria.java
│   └── Produto.java
├── exceptions/
│   ├── DatabaseException.java
│   ├── ResourceNotException.java
│   ├── dto/
│   │   ├── CustomErrorDTO.java
│   │   ├── FieldMessageDTO.java
│   │   └── ValidationErrorDTO.java
│   └── handler/
│       └── GlobalExceptionHandler.java
├── repository/
│   ├── CategoriaRepository.java
│   └── ProdutoRepository.java
└── service/
    ├── CategoriaService.java
    └── ProdutoService.java
```

---

## 🧠 Arquitetura

O projeto segue arquitetura em camadas:

- **Controller** — recebe as requisições HTTP e retorna as respostas
- **Service** — contém as regras de negócio e validações
- **Repository** — acesso ao banco de dados via Spring Data JPA
- **DTO** — transferência de dados entre camadas sem expor entidades
- **Exception Handler** — tratamento centralizado de erros via `@RestControllerAdvice`

---

## 👩‍💻 Autora

Desenvolvido por **Keyla Dayana**  
Estudante de Sistemas de Informação — FIAP  
[![GitHub](https://img.shields.io/badge/GitHub-keyladayanaj-181717?style=flat&logo=github)](https://github.com/keyladayanaj/ms-produto)
