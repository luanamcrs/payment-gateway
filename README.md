💳 Simulador de Gateway de Pagamento

Este projeto é uma aplicação back-end desenvolvida em Java com Spring Boot que simula o funcionamento de um gateway de pagamento.

O sistema recebe dados de pagamento, aplica validações de regras de negócio, identifica automaticamente a bandeira do cartão, realiza mascaramento de dados sensíveis e registra o resultado da transação.

O objetivo do projeto é praticar conceitos importantes de sistemas financeiros, como validação de transações, segurança de dados e arquitetura de APIs.

🚀 Funcionalidades
🔎 Validação de regras de negócio

O sistema analisa cada transação recebida e aplica algumas regras básicas:

Verificação de autenticação (senha do cartão)

Validação de limite de transação:

Crédito: até R$ 1000

Débito: até R$ 500

Identificação automática da bandeira do cartão:

Visa

Mastercard

🔐 Segurança de dados

Para simular boas práticas de segurança em sistemas financeiros:

O número do cartão é mascarado antes de ser exibido ou armazenado

Exemplo:

**** **** **** 1234

Esse processo simula práticas básicas relacionadas ao PCI Compliance, utilizadas em sistemas reais de pagamento.

🧾 Registro de transações

Todas as transações processadas são registradas em um banco de dados em memória (H2), permitindo:

histórico de pagamentos

consulta de transações

simulação de persistência de dados

🖥 Interface simples para testes

O projeto possui uma interface web simples (Single Page Application) para facilitar testes do sistema.

Nela é possível:

inserir dados de pagamento

simular uma transação

visualizar instantaneamente o resultado e o recibo da operação

🛠 Tecnologias Utilizadas
Backend

Java 21

Spring Boot 3

Spring Web

Spring Data JPA

Lombok

Banco de Dados

H2 Database (em memória)

Frontend

HTML5

CSS3

JavaScript

📂 Estrutura do Projeto
src
 ├── controller
 │    └── PaymentController
 │
 ├── service
 │    └── PaymentService
 │
 ├── model
 │    └── Payment
 │
 ├── repository
 │    └── PaymentRepository
 │
 └── PaymentGatewayApplication

Cada camada possui responsabilidades específicas:

Controller → recebe as requisições

Service → aplica regras de negócio

Repository → persiste os dados

Model → representa a transação

🔄 Fluxo de Processamento da Transação

1️⃣ O usuário envia os dados de pagamento pela interface
2️⃣ A requisição é recebida pelo Controller
3️⃣ O Service aplica as regras de negócio
4️⃣ O sistema valida limites e autenticação
5️⃣ O número do cartão é mascarado
6️⃣ A transação é salva no H2 Database
7️⃣ O sistema retorna o resultado da operação

▶ Como Executar o Projeto
1️⃣ Clonar o repositório
git clone <link-do-repositorio>
2️⃣ Abrir o projeto

Abra no:

IntelliJ IDEA
ou

VS Code

3️⃣ Verificar requisitos

Certifique-se de ter instalado:

JDK 17 ou superior

4️⃣ Executar a aplicação

Execute a classe:

PaymentGatewayApplication.java
5️⃣ Acessar no navegador
http://localhost:8080
🎯 Objetivo do Projeto

Este projeto foi desenvolvido com fins educacionais, com foco em aprender e praticar:

arquitetura de aplicações Spring Boot

desenvolvimento de APIs REST

aplicação de regras de negócio

simulação de sistemas financeiros

organização de projetos backend

⭐ Projeto desenvolvido para estudo de arquitetura de sistemas financeiros e APIs de pagamento.
