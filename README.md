# 💳 Simulador de Gateway de Pagamento

Este projeto é uma aplicação de back-end desenvolvida em **Java** com o framework **Spring Boot**, simulando o fluxo de processamento de pagamentos de um gateway financeiro. O sistema valida regras de negócio, aplica mascaramento de dados sensíveis e gerencia o ciclo de vida de uma transação.

## 🚀 Funcionalidades
- **Validação de Regras de Negócio:** - Verificação de autenticação (senha).
    - Limites de crédito (até R$ 1000) e débito (até R$ 500).
    - Identificação automática de bandeiras (Visa/Mastercard).
- **Segurança:** Mascaramento do número do cartão (PCI Compliance básico).
- **Interface Dinâmica:** Front-end em uma única página (Single Page Application) que gera recibos de transação instantâneos.
- **Persistência:** Uso de banco de dados em memória (H2) para registro de transações.

## 🛠 Tecnologias Utilizadas
- **Java 21**
- **Spring Boot 3** (Web, JPA, Lombok)
- **H2 Database** (Banco de dados em memória)
- **HTML5, CSS3 & JavaScript** (Frontend)

## 📋 Como rodar o projeto
1. Clone este repositório:
   `git clone <link-do-seu-repositorio>`
2. Abra o projeto no **VS Code** ou **IntelliJ**.
3. Certifique-se de ter o **JDK 17 ou superior** instalado.
4. Execute a classe principal `PaymentGatewayApplication.java`.
5. Acesse no navegador: `http://localhost:8080/`

## 📈 Exemplo de Fluxo (Logística de Regras)


---
*Projeto desenvolvido para fins de estudo em arquitetura de sistemas financeiros.*
