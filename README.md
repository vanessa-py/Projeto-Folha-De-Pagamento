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

## 📐 Regras de Cálculo

### INSS (Tabela Progressiva)

| Faixa Salarial | Alíquota |
|---|---|
| Até R$ 1.412,00 | 7,5% |
| R$ 1.412,01 até R$ 2.666,68 | 9% |
| R$ 2.666,69 até R$ 4.000,03 | 12% |
| R$ 4.000,04 até R$ 7.786,02 | 14% |

### IRRF

| Base de Cálculo | Alíquota | Dedução |
|---|---|---|
| Até R$ 2.259,20 | Isento | — |
| Até R$ 2.826,65 | 7,5% | R$ 169,44 |
| Até R$ 3.751,05 | 15% | R$ 381,44 |
| Até R$ 4.664,68 | 22,5% | R$ 662,77 |
| Acima | 27,5% | R$ 896,00 |

> Dedução por dependente: **R$ 189,59**

### Vale-Transporte
- Valor diário (ida e volta): **R$ 12,00**
- Dias úteis considerados: **20 dias**
- Limite máximo de desconto: **6% do salário bruto**

### Salário Família
- Concedido para salários até **R$ 1.819,26**
- Valor: **R$ 62,04 por filho menor de 14 anos**

### FGTS
- **8% do salário bruto**
- Não é descontado do funcionário — é depositado na conta FGTS

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

## 👤 Funcionários Pré-cadastrados

| Matrícula | Nome | Cargo | Salário | Dependentes | Filhos < 14 | VT/dia |
|---|---|---|---|---|---|---|
| 1 | Ana Silva | Analista | R$ 3.000,00 | 2 | 1 | R$ 8,50 |
| 2 | Bruno Souza | Dev | R$ 5.000,00 | 1 | 1 | R$ 10,00 |
| 3 | Carlos Lima | Suporte | R$ 1.800,00 | 3 | 2 | R$ 6,00 |
| 4 | Daniela Rocha | Gerente | R$ 8.000,00 | 0 | 0 | R$ 12,00 |
| 5 | Eduardo Alves | Estagiário | R$ 1.200,00 | 0 | 0 | R$ 5,00 |

---

## 📅 Informações Acadêmicas

- **Disciplina:** Programação Orientada a Objetos
- **Valor:** 1,5 pontos
- **Data de apresentação:** 11 de Maio
- **Entrega:** Arquivos zipados com nomes dos integrantes
