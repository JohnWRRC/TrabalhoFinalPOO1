# Sistema de Pagamento de Professores

Este projeto implementa um sistema completo de cálculo salarial para diferentes categorias de professores de uma universidade, utilizando duas abordagens:

- **POO (Programação Orientada a Objetos)**
- **Programação Procedural (sem POO)**

O objetivo é comparar, na prática, os dois paradigmas de desenvolvimento, destacando vantagens, desvantagens e diferenças de implementação.

---

## 📚 Regras de Negócio

### **Professor Horista**
- Recebe **R$ 85,00 por hora-aula**
- Máximo de **160h/mês**

### **Professor Dedicação Exclusiva**
- Salário fixo de **R$ 8.000,00**
- + **R$ 1.500,00 por titulação** (mestre/doutor)

### **Professor Pesquisador**
- Salário base de **R$ 5.000,00**
- + **R$ 2.000,00 por projeto ativo**

---

# 🟦 Versão POO (Programação Orientada a Objetos)

A estrutura é composta por:

### **✔ Classe abstrata `Professor`**
Define:
- nome do professor  
- assinatura do método abstrato `calcularPagamento()`

### **✔ Três subclasses:**
- `ProfessorHorista`
- `ProfessorDedicacaoExclusiva`
- `ProfessorPesquisador`

Cada uma sobrescreve o método `calcularPagamento()` com sua própria regra.

### **✔ Polimorfismo e lista heterogênea**
#🆚 Diferença Entre a Versão POO e a Versão Sem POO

A seguir você encontrará uma explicação clara, organizada e interativa mostrando a diferença entre as duas implementações realizadas no projeto.
