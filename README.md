# 💼 Sistema de Folha de Pagamento

Sistema desenvolvido em Java com interface gráfica Swing para cálculo e gerenciamento de folha de pagamento de funcionários.

---

## 👥 Integrantes do Grupo

- Carla Vanessa
- Julia Nogueira
- Queite Lorrane
- Heloisa


---

## 📋 Sobre o Projeto

Projeto acadêmico da disciplina de Programação Orientada a Objetos, com o objetivo de simular um sistema de folha de pagamento contendo cadastro de funcionários, listagem e emissão de holerite individual com todos os cálculos trabalhistas.

---

## 🗂️ Estrutura do Projeto

```
folha-pagamento/
├── src/
│   ├── model/
│   │   ├── IFuncionario.java        # Interface com os métodos de acesso
│   │   └── Funcionario.java         # Classe que implementa a interface
│   │
│   ├── service/
│   │   ├── CalculadoraFolha.java    # Regras de negócio e cálculos
│   │   └── FuncionarioService.java  # Gerenciamento da lista de funcionários
│   │
│   ├── view/
│   │   ├── MenuPrincipal.java           # Tela inicial com o menu
│   │   ├── TelaCadastroFuncionario.java # Tela para incluir novo funcionário
│   │   ├── TelaListaFuncionarios.java   # Tela de listagem dos funcionários
│   │   └── TelaFolhaPagamento.java      # Tela do holerite individual
│   │
│   └── Main.java                    # Ponto de entrada da aplicação
│
└── bin/                             # Gerado automaticamente na compilação
```

---

## ⚙️ Funcionalidades

- ✅ Carga inicial com 5 funcionários pré-cadastrados
- ✅ Inclusão de novos funcionários via interface gráfica
- ✅ Listagem de todos os funcionários (nome, cargo, salário)
- ✅ Geração de holerite individual com os seguintes cálculos:
  - INSS (tabela progressiva)
  - IRRF (com dedução por dependente)
  - Vale-Transporte
  - Salário Família
  - FGTS (depositado, não descontado)
  - Salário Líquido

---

## 🛠️ Tecnologias Utilizadas

- **Java** — linguagem principal
- **Swing** — interface gráfica
- **BigDecimal** — precisão nos cálculos monetários
- **Programação Orientada a Objetos (POO)**
- **TAD com Pilha Estática** — conforme conteúdo da disciplina

---

## ▶️ Como Compilar e Executar

### Compilação

No terminal, dentro da pasta raiz do projeto:

```bash
javac -d bin src/model/*.java src/service/*.java src/view/*.java src/Main.java
```

### Execução

```bash
java -cp bin Main
```

> **Pré-requisito:** Java JDK instalado (versão 8 ou superior).

---




