# API de Agendamentos - Spring Boot

Esta é uma API RESTful robusta desenvolvida para gerenciar sistemas de agendamento. O projeto foca em escalabilidade, organização de código e facilidade de integração com front-ends modernos.

## 🚀 Tecnologias Utilizadas

O projeto foi construído com as seguintes tecnologias e ferramentas:

- **Java 17** (ou versão superior)
- **Spring Boot 3**
- **Spring Data JPA** para persistência de dados
- **PostgreSQL** (Banco de dados relacional)
- **Hibernate** como provedor ORM
- **Maven** para gerenciamento de dependências
- **Docker** para containerização da aplicação e banco de dados

## ✨ Funcionalidades (Previstas/Implementadas)

- [x] **Gerenciamento de Agendamentos:** CRUD completo para criar, listar, atualizar e cancelar horários.
- [x] **Regras de Negócio:** Validação de disponibilidade de horários para evitar conflitos.
- [x] **Controle de Status:** Gestão do ciclo de vida do agendamento (Pendente, Confirmado, Realizado, Cancelado).
- [x] **Integração com Banco de Dados:** Migrations via Flyway ou configuração via Hibernate.

## 🛠️ Como Executar o Projeto

### Pré-requisitos
- JDK 17+ instalado.
- Maven instalado.
- Docker (opcional, para rodar o banco de dados via container).

### Configuração e Instalação

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/FIGU3IR4/api-agendamentos-springboot.git](https://github.com/FIGU3IR4/api-agendamentos-springboot.git)
Configure o banco de dados:
Ajuste as credenciais no arquivo src/main/resources/application.properties ou application.yml:

Properties

spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
Execute a aplicação:

Bash

mvn spring-boot:run
