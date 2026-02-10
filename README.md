<p align="center">
  <img src="assets/logo.png" width="500">
</p>
<h1 align="center">StudentHub</h1>
<p align="center">
  Sistema Desktop de Cadastro de Alunos desenvolvido em JavaFX
</p>
Sistema Desktop de Cadastro de Alunos desenvolvido em **JavaFX**, estruturado com **Maven**, aplicando conceitos de **Programação Orientada a Objetos (POO)** e padrões de projeto.

---

## 📌 Sobre o Projeto

O **StudentHub** é uma aplicação desktop criada para auxiliar instituições de ensino no gerenciamento de alunos.

O sistema permite:

- ✅ Cadastro de alunos  
- ✅ Listagem dinâmica em TableView  
- ✅ Pesquisa por nome ou matrícula  
- ✅ Remoção de alunos  
- ✅ Sistema de login  
- ✅ Persistência de dados em JSON  
- ✅ Tratamento de exceções customizadas  
- ✅ Testes automatizados com JUnit  

O projeto foi desenvolvido como **Projeto Final da disciplina de Linguagem de Programação II** do curso de **Bacharelado em Sistemas de Informação**.

---

## 🏗️ Arquitetura do Sistema

O projeto foi estruturado em camadas, seguindo boas práticas de organização e separação de responsabilidades:

- Model  
- Service  
- Repository  
- Controller  
- Factory  
- Exception  

---

## 📂 Estrutura de Pacotes

```
com.empresa.leonardoteixeiralucassiconeli_projetofinal
│
├── controller
├── model
├── service
├── repository
├── factory
├── exception
├── App.java
└── module-info.java
```

---

## 🧠 Conceitos Aplicados

### ✔ Programação Orientada a Objetos
- Encapsulamento (classe `Aluno`)
- Separação de responsabilidades
- Organização em camadas

### ✔ Padrões de Projeto

**Singleton**
- `AlunoService`
- `AlunoRepositoryJSON`

**Factory Method**
- `MensagemFactory` para criação padronizada de `Alert`

### ✔ Tratamento de Exceções
- Exceção customizada: `RegraNegocioException`
- Lançamento de exceções na camada Service
- Tratamento via `try/catch` nos Controllers

### ✔ Collections
- Uso de `ObservableList<Aluno>` para atualização automática da TableView

### ✔ Persistência
- Arquivo `alunos.json`
- Serialização e desserialização com **Gson**

### ✔ Testes Automatizados
- JUnit 5
- Testes da camada Service
- Testes da camada Model
- 6 testes cobrindo cenários principais

---

## 🖥️ Tecnologias Utilizadas

| Tecnologia | Versão |
|------------|--------|
| Java | 17+ |
| JavaFX | 17+ |
| Maven | 3.6+ |
| JUnit | 5 |
| Gson | 2.x |
| NetBeans | 21+ |

---

## 🚀 Como Executar o Projeto

### ✔ Pré-requisitos

- JDK 11 ou superior  
- Apache NetBeans (ou IDE compatível com Maven)  
- Maven instalado (ou integrado à IDE)  

---

### 🔹 Clonar o repositório

```bash
git clone https://github.com/SEU-USUARIO/studenthub.git
```

Ou via NetBeans:

```
Team → Git → Clone
```

---

### 🔹 Executar

1. Abrir o projeto no NetBeans  
2. Aguardar download automático das dependências  
3. Clicar com botão direito → **Clean and Build**  
4. Executar com **Run**

---

## 🔐 Credenciais de Login

```
Usuário: admin
Senha: 1234
```

---

## 📸 Telas do Sistema

- Tela de Login  
- Tela Principal com TableView  
- Tela de Cadastro de Alunos  
- Alerts personalizados (sucesso, erro, confirmação)

---

## 🔍 Fluxo de Funcionamento

1. Login  
2. Acesso à tela principal  
3. Cadastro de aluno  
4. Validação via Service  
5. Persistência em JSON  
6. Atualização automática da TableView  

---

## 🧪 Testes

Os testes estão localizados em:

```
src/test/java
```

Para rodar:

```bash
mvn test
```

Os testes validam:

- Cadastro válido  
- Lançamento de exceção para nome inválido  
- Funcionamento da ObservableList  
- Integridade dos dados da classe Aluno  

---

## 🎯 Objetivo Acadêmico

Este projeto foi desenvolvido com o objetivo de aplicar na prática:

- Programação Orientada a Objetos  
- Arquitetura em camadas  
- JavaFX com FXML  
- Padrões de projeto  
- Tratamento de exceções  
- Testes automatizados  
- Gerenciamento de dependências com Maven  

---

## 👨‍💻 Desenvolvedores

- Lucas dos Santos Siconeli  
- Leonardo Teixeira Silva  

Disciplina: Linguagem de Programação II  
Curso: Bacharelado em Sistemas de Informação  
Professor: Alexandre Aparecido de Souza  

---

## 📄 Licença

Projeto acadêmico desenvolvido para fins educacionais.
