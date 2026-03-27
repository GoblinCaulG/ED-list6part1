![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-Repository-black?style=for-the-badge&logo=github)
![Status](https://img.shields.io/badge/status-Em%20Desenvolvimento-yellow?style=for-the-badge)

# 📚 Implementação de ArrayList em Java (Estrutura de Dados)

Este repositório contém o desenvolvimento de uma **Lista Sequencial (ArrayList)** implementada manualmente em **Java**, sem o uso da estrutura pronta da linguagem.

O projeto encontra-se atualmente em fase de **construção**, onde foi definido o **esqueleto da estrutura** e as assinaturas dos métodos que serão implementados.

---

# 🧠 Objetivo

O principal objetivo é compreender, na prática, como funciona uma lista baseada em **arrays**, desenvolvendo manualmente operações como:

- Inserção de elementos
- Remoção de elementos
- Busca
- Manipulação de índices
- Controle de tamanho

---

# 🏗️ Estrutura Atual

## 📌 Interface (TAD)

Arquivo: `MyArrayListTAD.java`

Define todas as operações que a estrutura deve possuir, seguindo o conceito de **Tipo Abstrato de Dados (TAD)**.

---

## ⚙️ Classe Principal

Arquivo: `MyArrayList.java`

Atualmente contém:

- Estrutura base da classe
- Declaração dos atributos:
  - `int[] vetor`
  - `int tamanhoAtual`
- Assinatura de todos os métodos
- Uso de `@Override` para garantir implementação correta da interface

📌 **Importante:**  
Os métodos ainda não possuem implementação e estão marcados com `TODO`.

---

# 🚧 Funcionalidades Planejadas

As seguintes operações serão implementadas:

### ➕ Inserção
- `addLast(int valor)`
- `addFirst(int valor)`
- `insertAT(int indice, int valor)`
- `addSorted(int valor)`

### ➖ Remoção
- `removeLast()`
- `removeFirst()`
- `removeAt(int indice)`
- `remove(int item)`

### 🔍 Busca e Acesso
- `find(int item)`
- `get(int indice)`
- `set(int indice, int valor)`

### 📊 Estado da Lista
- `isEmpty()`
- `isFull()`
- `count()`

### 🖥️ Exibição
- `display()`

---

# 🧠 Conceitos Aplicados

- Estruturas de Dados
- Arrays (Vetores)
- Interface (TAD)
- Encapsulamento
- Organização de código
- Planejamento de implementação

---

# ⚙️ Tecnologias Utilizadas

- Java
- JDK 17+
- IntelliJ IDEA
- Git
- GitHub

---

# 🚀 Próximos Passos

- Implementar todos os métodos da lista
- Testar cada operação individualmente
- Criar menu interativo para manipulação da lista
- Validar casos de erro (lista cheia, vazia, índices inválidos)

---

# 🎯 Objetivo Acadêmico

Este projeto foi desenvolvido com fins educacionais para reforçar o entendimento sobre o funcionamento interno de estruturas de dados.

---

# 👨‍💻 Autor

Carlos Sales
