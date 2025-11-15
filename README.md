# 📘 Sistema de Pagamento de Professores & Sistema de Comissão de Vendedores
### *(Dois Exercícios Implementados – POO e Sem POO)*

Este repositório contém **dois sistemas completos**, cada um implementado em **duas versões** (quando aplicável):

- ✔ **Exercício 1 — Sistema de Pagamento de Professores**
  - Versão **POO**
  - Versão **Sem POO**
- ✔ **Exercício 2 — Sistema de Comissão de Vendedores**
  - Versão **POO**

Os objetivos incluem comparar paradigmas, aplicar princípios de orientação a objetos e demonstrar domínio de lógica e organização de software.

---

# 📂 Organização do Projeto

A estrutura de pastas está organizada da seguinte forma:

```
TrabalhoFinalPOO1
│
├── Trabalho_pagamento_professores
│   ├── comPOO     → Versão orientada a objetos (POO)
│   └── semPOO     → Versão estrutural (sem POO)
│
└── Trablho_comisao_vendedores
    └── comPOO     → Versão orientada a objetos (POO) do exercício 2
```

---

# 🎥 Vídeo Explicativo

Clique na imagem para baixar o vídeo:
<div>
<a href="./Explicao.mp4?raw=true">
  <img src="./thumb.png" alt="Download Explicação" width="130">
</a>

**[Baixar vídeo de explicação](./Explicao.mp4?raw=true)**
</div>

---

# 🧠 EXERCÍCIO 1 — Sistema de Pagamento de Professores

Implementado em duas abordagens:

- **✔ POO (Programação Orientada a Objetos)**
- **✔ Sem POO (Programação Estrutural)**

---

# 📚 Regras de Negócio — Professores

### 👤 Professor Horista
- R$ 85,00 por hora
- Limite de 160h/mês

### 🎓 Professor Dedicação Exclusiva
- Salário fixo de R$ 8.000,00
- + R$ 1.500,00 por titulação

### 🔬 Professor Pesquisador
- Salário base de R$ 5.000,00
- + R$ 2.000,00 por projeto ativo

---

# 🟦 Versão POO — Pagamento de Professores

### ✔ Estrutura de Classes
- `Professor` (classe abstrata)
- `ProfessorHorista`
- `ProfessorDedicacaoExclusiva`
- `ProfessorPesquisador`
- `Main.java`

### ✔ Polimorfismo
```java
List<Professor> professores = new ArrayList<>();
p.calcularPagamento();
```

### ✔ Vantagens
- Código mais limpo
- Fácil de expandir
- Manutenção simples

---

# 🟥 Versão Procedural — Sem POO

- Toda a lógica concentrada em `MainProcedural`
- Uso de `switch-case`
- Estrutura simples e direta

Ideal para exercícios iniciais, mas não escalável.

---

# 🖼 Resultados Ilustrativos — EXERCÍCIO 1

### 🟦 POO — Saída Exemplo
```
=== Pagamentos (POO) ===
Ana Silva - ProfessorHorista → R$ 8.500,00
Bruno Costa - ProfessorHorista → R$ 13.600,00
Carla Pereira - ProfessorDedicacaoExclusiva → R$ 9.500,00
Diego Souza - ProfessorDedicacaoExclusiva → R$ 11.000,00
Elisa Rocha - ProfessorPesquisador → R$ 11.000,00
Fábio Lima - ProfessorPesquisador → R$ 5.000,00
-----------------------------------------------------
Total da folha: R$ 58.600,00
```

### 🟥 Procedural — Saída Exemplo
```
=== Pagamentos (Sem POO) ===
[Ana Silva / HORISTA] R$ 8.500,00
[Bruno Costa / HORISTA] R$ 13.600,00
[Carla Pereira / DEDICACAO] R$ 9.500,00
[Diego Souza / DEDICACAO] R$ 11.000,00
[Elisa Rocha / PESQUISADOR] R$ 11.000,00
[Fábio Lima / PESQUISADOR] R$ 5.000,00
-----------------------------------------------------
TOTAL: R$ 58.600,00
```

---

# 🧮 EXERCÍCIO 2 — Sistema de Comissão de Vendedores (POO)

Localizado em:

```
Trablho_comisao_vendedores/comPOO
```

---

# 📚 Regras de Negócio — Vendedores

### 🟢 Vendedor Júnior
- 5% do total de vendas

### 🔵 Vendedor Sênior
- 8% das vendas
- + R$ 500 por meta de 10.000 ultrapassada

### 🟣 Gerente Comercial
- Salário fixo: R$ 3.000
- + 2% sobre vendas totais da equipe

---

# 🖼 Resultados Ilustrativos — EXERCÍCIO 2

```
=== Comissões ===
Junior - Ana → R$ 400,00
Junior - Paulo → R$ 600,00
Senior - Marcos → R$ 1.700,00
Senior - Laura → R$ 2.840,00
Gerente - Roberto → R$ 3.560,00
-----------------------------------------------------
Total a pagar: R$ 9.100,00
```

---

# 🆚 Comparação Geral – POO vs Procedural (Exercício 1)

| Critério | POO | Sem POO |
|----------|------|---------|
| Organização | ⭐⭐⭐⭐⭐ | ⭐⭐ |
| Reuso | Alto | Baixo |
| Polimorfismo | ✔ | ❌ |
| Escalabilidade | Alta | Baixa |
| Manutenção | Fácil | Difícil |
| Crescimento do sistema | Natural | Exige retrabalho |
| Recomenda-se para | Projetos reais | Exercícios simples |

---

# ▶️ Como Executar

## 🟦 Pagamento de Professores (POO)
```bash
cd Trabalho_pagamento_professores/comPOO
javac *.java
java Main
```

## 🟥 Pagamento de Professores (Sem POO)
```bash
cd Trabalho_pagamento_professores/semPOO
javac MainProcedural.java
java MainProcedural
```

## 🟧 Comissão de Vendedores (POO)
```bash
cd Trablho_comisao_vendedores/comPOO
javac *.java
java Main
```

---

# 🛠 Tecnologias Utilizadas

- Java 17+
- Programação Orientada a Objetos
- Polimorfismo e Herança
- Programação Estrutural
- Listas e coleções (`List<>`)
- Formatação com `DecimalFormat`

---

# 📄 Licença

Uso livre para fins acadêmicos.
