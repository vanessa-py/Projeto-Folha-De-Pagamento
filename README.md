# Projeto Folha de Pagamento - Java & Swing

Este projeto consiste em um sistema desktop para gerenciamento e cálculo de folha de pagamento, desenvolvido para a disciplina de Programação Orientada a Objetos. O sistema utiliza interface gráfica (Swing), o paradigma de Orientação a Objetos (POO) e estruturas de dados específicas solicitadas em aula.

## 👥 Equipe
* **Nome do Aluno 1** - Carla Vanessa
* **Nome do Aluno 2** - Queite Lorrane
* **Nome do Aluno 3** - Julia Nogueira
* **Nome do Aluno 4** -Heloisa Cristina

## 🚀 Funcionalidades
* **Carga Inicial:** O sistema inicia com 5 funcionários pré-cadastrados para teste.
* **Gestão de Funcionários:** Inclusão e listagem (Nome, Cargo, Salário).
* **Cálculo de Folha (Holerite):** Cálculo automatizado de:
    * INSS e IRRF (conforme faixas atuais).
    * Vale Transporte (limite de 6%).
    * Salário Família (baseado no número de filhos).
    * FGTS (provisão de 8%).
    * Salário Líquido.

## 🛠️ Tecnologias e Regras Técnicas
* **Linguagem:** Java.
* **Interface Gráfica:** Java Swing.
* **Cálculos Financeiros:** Uso de `BigDecimal` para garantir precisão decimal.
* **Arquitetura:** Padrão de pacotes dividido em `model`, `service` e `view`.
* **Estrutura de Dados:** Implementação de TAD com Pilha Estática, conforme as diretrizes da disciplina.

## 📁 Estrutura do Projeto
```text
folha-pagamento/
 ├── src/
 │   ├── model/         # Interfaces e classes de entidade (POJO)
 │   ├── service/       # Regras de negócio e lógica de cálculo
 │   ├── view/          # Telas do sistema em Swing
 │   └── Main.java      # Ponto de entrada do sistema
 └── bin/               # Arquivos compilados
