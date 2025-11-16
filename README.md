# 📘 Sistema de Pagamento de Professores & Sistema de Comissão de Vendedores
### *(Dois Exercícios Implementados – POO e Sem POO)*

Este repositório contém **dois sistemas completos**, cada um implementado em **duas versões**:

- ✔ **Exercício 1 — Sistema de Pagamento de Professores**
  - Versão **POO**
  - Versão **Sem POO**
- ✔ **Exercício 2 — Sistema de Comissão de Vendedores**
  - Versão **POO**
  - Versão **Sem POO (Estrutural / Procedural)**

Os objetivos incluem comparar paradigmas, aplicar princípios de orientação a objetos e demonstrar domínio de lógica e organização de software.

---

# 📂 Organização do Projeto

```
TrabalhoFinalPOO1
│
├── Trabalho_pagamento_professores
│   ├── comPOO     → Versão orientada a objetos (POO)
│   └── semPOO     → Versão estrutural (sem POO)
│
└── Trablho_comisao_vendedores
    ├── comPOO     → Versão orientada a objetos (POO)
    └── semPOO     → Versão estrutural (sem POO)
```

---

# 🎥 Vídeo Explicativo

<div align="center">
<a href="./Explicao.mp4?raw=true">
  <img src="./thumb.png" alt="Download Explicação" width="260">
</a>

<br><br>

👉 <a href="./Explicao.mp4?raw=true"><strong>Clique aqui para baixar o vídeo</strong></a>
</div>

---

# 🧠 EXERCÍCIO 1 — Sistema de Pagamento de Professores

Implementado em:

- ✔ **POO (Programação Orientada a Objetos)**
- ✔ **Sem POO (Programação Estrutural)**

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

### ✔ Estrutura
- `Professor` (classe abstrata)
- `ProfessorHorista`
- `ProfessorDedicacaoExclusiva`
- `ProfessorPesquisador`
- `Main.java`

### ✔ Conceitos aplicados
- Herança  
- Polimorfismo  
- Sobrescrita de métodos  
- Encapsulamento  

---

# 🟥 Versão Procedural — Sem POO

- Código centralizado em um arquivo  
- Uso de `switch-case`  
- Estrutura direta e simples  
- Menos reutilização  

Boa para treinar lógica, porém pouco escalável.

---

# 🖼 Resultados — EXERCÍCIO 1

### 🟦 Resultados (POO)
```
Ana Silva - ProfessorHorista → R$ 8.500,00
Bruno Costa - ProfessorHorista → R$ 13.600,00
...
```

### 🟥 Resultados (Sem POO)
```
[Ana Silva / HORISTA] R$ 8.500,00
[Bruno Costa / HORISTA] R$ 13.600,00
...
```

---

# 🧮 EXERCÍCIO 2 — Sistema de Comissão de Vendedores

Implementado em:

- ✔ **POO (com herança e polimorfismo)**
- ✔ **Sem POO (versão estrutural)**

---

# 📚 Regras de Negócio — Vendedores

### 🟢 Vendedor Júnior
- 5% das vendas

### 🔵 Vendedor Sênior
- 8% das vendas  
- + R$ 500 por meta de R$ 10.000 atingida

### 🟣 Gerente Comercial
- Salário fixo: R$ 3.000  
- + 2% sobre vendas totais da equipe  

---

# 🖼 Resultados — EXERCÍCIO 2

```
Junior - Ana → R$ 400,00
Junior - Paulo → R$ 600,00
Senior - Marcos → R$ 1.700,00
Senior - Laura → R$ 2.840,00
Gerente - Roberto → R$ 3.560,00
---------------------------------------
Total: R$ 9.100,00
```

---

# 🆚 Comparação Geral – POO vs Procedural

| Critério | POO | Sem POO |
|----------|------|---------|
| Organização | ⭐⭐⭐⭐⭐ | ⭐⭐ |
| Reuso | Alto | Baixo |
| Polimorfismo | ✔ | ❌ |
| Escalabilidade | Alta | Baixa |
| Manutenção | Fácil | Difícil |
| Crescimento | Natural | Exige retrabalho |
| Ideal para | Sistemas Reais | Exercícios Simples |

---

# ▶️ Como Executar

## 🟦 Professores — POO
```bash
cd Trabalho_pagamento_professores/comPOO
javac *.java
java Main
```

## 🟥 Professores — Sem POO
```bash
cd Trabalho_pagamento_professores/semPOO
javac MainProcedural.java
java MainProcedural
```

## 🟦 Vendedores — POO
```bash
cd Trablho_comisao_vendedores/comPOO
javac *.java
java Main
```

## 🟥 Vendedores — Sem POO
```bash
cd Trablho_comisao_vendedores/semPOO
javac MainProcedural.java
java MainProcedural
```

---

# 🛠 Tecnologias Utilizadas

- Java 17+
- Programação Orientada a Objetos
- Programação Estrutural
- Polimorfismo e Herança
- Listas e coleções (`List<>`)
- `DecimalFormat` para formatação

---

# 📄 Licença
Uso livre para fins acadêmicos.
