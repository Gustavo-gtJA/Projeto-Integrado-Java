# 🚗 Projeto Integrado – Sistema de Estacionamento (JavaFX)

Projeto desenvolvido como parte do **Projeto Integrador**, com foco na criação de um **sistema de gerenciamento de estacionamento**, utilizando **JavaFX**, **persistência em CSV** e **boas práticas de organização de código**.

---

## 📌 Visão Geral

O sistema permite:

- Registrar **entrada de veículos**
- Registrar **saída com cálculo de pagamento**
- Listar veículos estacionados em tempo real
- Armazenar dados de forma persistente em arquivo `.csv`
- Utilizar interface gráfica com **JavaFX + CSS**
- Manter arquitetura organizada (Model / Repository)

---

## ⚙️ Funcionalidades

- ✅ Cadastro de veículos (placa, modelo e proprietário)
- ✅ Listagem automática dos veículos estacionados
- ✅ Registro de saída com cálculo de valor
- ✅ Persistência de dados em arquivo CSV
- ✅ Interface gráfica estilizada
- ✅ Atualização dinâmica da tela (sem abrir novas janelas)

---

## 🛠️ Tecnologias Utilizadas

- **Java 21**
- **JavaFX**
- **Maven**
- **CSS**
- **CSV (armazenamento de dados)**
- **Git & GitHub**

---

## 📂 Estrutura do Projeto

```

Projeto-Integrado-Java
├── .idea
├── .mvn
│   └── wrapper
├── dados
│   └── veiculos.csv
├── src
│   └── Main
│       ├── java
│       │   ├── module-info.java
│       │   └── com.example.projetointegradorjava
│       │       ├── HelloApplication.java
│       │       ├── HelloController.java
│       │       ├── Launcher.java
│       │       ├── model
│       │       │   ├── Veiculo.java
│       │       │   └── VeiculoRegistro.java
│       │       └── repository
│       │           └── VeiculoRepository.java
│       └── resources
│           └── com.example.projetointegradorjava
│               ├── hello-view.fxml
│               └── style.css

````

### 📁 Descrição das Pastas

- **`dados/`**  
  Contém o arquivo `veiculos.csv`, responsável pelo armazenamento persistente.

- **`model/`**  
  Classes que representam os dados do sistema.

- **`repository/`**  
  Camada responsável por leitura, gravação, busca e remoção no CSV.

- **`resources/`**  
  Arquivos de interface (`FXML`) e estilização (`CSS`).

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/CubicNostalgia/Projeto-Integrado-Java.git
````

2. Abra o projeto no **IntelliJ IDEA**

3. Verifique:

   * Java **21** configurado
   * JavaFX corretamente vinculado

4. Execute:

   ```
   Launcher.java
   ```

---

## 📑 Documentações Relacionadas

* 📄 **Requisitos**
  *Gustavo Teixeira / Gustavo Vitor*
  [https://docs.google.com/spreadsheets/d/1fpbgcQNcR0x18EM1p0_W3T6nmyyHZjQs](https://docs.google.com/spreadsheets/d/1fpbgcQNcR0x18EM1p0_W3T6nmyyHZjQs)

* 📄 **Casos de Uso**
  *Gustavo Teixeira*
  [https://drive.google.com/file/d/1EfDNFUsmzCBv3ODPwSlLSt4x6j9m5P1K/view](https://drive.google.com/file/d/1EfDNFUsmzCBv3ODPwSlLSt4x6j9m5P1K/view)

* 📄 **Packet Tracer**
  *Gustavo Teixeira*
  [https://drive.google.com/file/d/1-DWpuKFhNA0KqNL2hrAkXU2Yr_8x5oZt/view](https://drive.google.com/file/d/1-DWpuKFhNA0KqNL2hrAkXU2Yr_8x5oZt/view)

* 🎨 **Figma – Sistema**
  *Gustavo Teixeira / Gustavo Vitor*
  [https://www.figma.com/design/wyyPwwBRbz1xJv3svy8tgv](https://www.figma.com/design/wyyPwwBRbz1xJv3svy8tgv)

* 🌐 **Página Web**
  *Pedro Rodrigues*
  [https://github.com/Gustavo-gtJA/Projeto-Integrador](https://github.com/Gustavo-gtJA/Projeto-Integrador)

* 🎨 **Figma – Página Web**
  *Pedro Rodrigues*
  [https://www.figma.com/design/FrANVDtxkhl1zzLHrURFbo](https://www.figma.com/design/FrANVDtxkhl1zzLHrURFbo)

---

## 👨‍💻 Autores

* **Gustavo Vitor** — Desenvolvimento Java / Interface / Persistência
* **Gustavo Teixeira** — Requisitos, Casos de Uso e Infraestrutura
* **Pedro Rodrigues Cruz** — Página Web

## 📌 Observações Finais

Projeto desenvolvido com fins **educacionais**, integrando conceitos de:

* Programação Orientada a Objetos
* Interface gráfica
* Persistência de dados
* Versionamento com Git
