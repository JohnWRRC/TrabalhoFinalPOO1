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
O `Main` utiliza:

```java
List<Professor> professores = new ArrayList<>();


---

# 🆚 Diferença Entre a Versão POO e a Versão Sem POO

A seguir você encontrará uma explicação clara, organizada e interativa mostrando a diferença entre as duas implementações realizadas no projeto.

---

## 🔍 Visão Geral

| Abordagem | Característica Principal | Vantagens | Desvantagens |
|-----------|--------------------------|-----------|--------------|
| **POO** | Cada tipo de professor é uma classe diferente | Polimorfismo, herança, escalabilidade, organização | Exige mais arquivos |
| **Sem POO (Procedural)** | A lógica inteira fica centralizada em um único método com `switch-case` | Simples e rápida para pequenas tarefas | Difícil de manter, não reutiliza código, não escala |

---

# 📦 Explicações Interativas

Você pode clicar para abrir / fechar cada explicação.

---

<details>
<summary><strong>📁 Estrutura do Código (POO vs Procedural)</strong></summary>

### 🟦 Versão POO
O sistema é dividido em várias classes:

- `Professor` (classe abstrata)
- `ProfessorHorista`
- `ProfessorDedicacaoExclusiva`
- `ProfessorPesquisador`
- `Main` para executar tudo

Isso gera um código **organizado**, fácil de entender e **escalável**.

### 🟥 Versão Procedural
Tudo é concentrado em:

- 1 única classe (`MainProcedural`)
- 1 método principal `calcularPagamento()`
- Um `switch-case` controla todas as regras

Aqui o código fica **rápido**, porém **menos organizado**, e difícil de expandir.

</details>

---

<details>
<summary><strong>⚙️ Polimorfismo (POO) vs Switch-case (Procedural)</strong></summary>

### 🟦 POO – Polimorfismo
Cada professor calcula seu pagamento com sua própria regra.

```java
for (Professor p : professores) {
    p.calcularPagamento();
}
