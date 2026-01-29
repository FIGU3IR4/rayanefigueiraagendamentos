Rayane Figueira – Sistema de Agendamentos

Sistema de agendamentos desenvolvido para a profissional Rayane Figueira, permitindo que clientes realizem agendamentos de horários e que a administradora visualize e gerencie a agenda diária de forma simples e eficiente.

Tecnologias Utilizadas

Java 17+

Spring Boot

Spring Web

Spring Data JPA

Hibernate

PostgreSQL

Maven

Insomnia / Postman (testes de API)

🎯 Objetivo do Projeto

Automatizar o processo de agendamento de serviços, evitando conflitos de horários e facilitando a visualização da agenda diária pela administradora.

🧩 Funcionalidades
👤 Cliente

Criar agendamento de horário

Cancelar agendamento

Visualizar seus próprios agendamentos

👩‍💼 Administradora (Rayane Figueira)

Visualizar todos os agendamentos do dia

Visualizar agenda organizada por data e horário

Gerenciar agendamentos

🏗️ Arquitetura

O projeto segue uma arquitetura em camadas, garantindo organização e fácil manutenção:

Controller – Camada responsável pelas requisições HTTP

Service – Regras de negócio

Repository – Acesso ao banco de dados

Entity – Mapeamento das tabelas do banco

🗃️ Principais Entidades

Cliente

Agendamento

Servico

Administrador

🔗 Endpoints Principais (Exemplo)

POST /agendamentos → Criar agendamento

GET /agendamentos/{data} → Listar agendamentos por data

DELETE /agendamentos/{id} → Cancelar agendamento

🛠️ Configuração do Banco de Dados

No arquivo application.properties ou application.yml:

spring.datasource.url=jdbc:postgresql://localhost:5432/rayane_agendamentos
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

▶️ Como Executar o Projeto

Clone o repositório:

git clone https://github.com/figu3ir4/rayane-figueira-agendamentos.git


Acesse a pasta do projeto:

cd rayane-figueira-agendamentos


Execute a aplicação:

mvn spring-boot:run


A API estará disponível em:

http://localhost:8080

🧪 Testes da API

Recomenda-se o uso do Insomnia ou Postman para testar os endpoints REST.

📌 Melhorias Futuras

Autenticação e autorização (Spring Security + JWT)

Integração com frontend em React

Envio de notificações por e-mail ou WhatsApp

Dashboard administrativo

👨‍💻 Autor

Projeto desenvolvido por Victor Figueira
Estudante de Análise e Desenvolvimento de Sistemas – CESAR School
