# Dev-tecnico

Este repositório contém a resolução de um teste técnico proposto em um processo seletivo para desenvolvedor Java. O desafio consiste em uma série de exercícios de lógica e manipulação de dados utilizando a linguagem Java, com foco em leitura de arquivos, estruturas de repetição e condicionais.

## 📁 Estrutura do Projeto

```

Dev-tecnico/
├── .idea/
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── example/
│                   ├── dados.json  
│                   ├── Teste1.java
│                   ├── Teste2.java
│                   ├── Teste3.java
│                   ├── Teste4.java
│                   └── Teste5.java
├── .gitignore
├── pom.xml
└── README.md

````

## 🚀 Tecnologias Utilizadas

- Java 17
- Maven
- IDE: IntelliJ IDEA
- Leitura de arquivos: `BufferedReader`
- Entrada de dados: `Scanner`

---

## 📄 Descrição dos Testes

### ✅ Teste1 - Soma com Laço de Repetição

**Objetivo**: Calcular a soma dos números de 1 até um índice determinado (13).

```java
int INDICE = 13;
int SOMA = 0;
int K = 0;

if (K < INDICE) {
    K = K + 1;
    SOMA = SOMA + K;
}
````

**Resultado esperado**: `SOMA = 1`

---

### ✅ Teste2 - Verificação de Número na Sequência de Fibonacci

**Objetivo**: Verificar se um número inserido pelo usuário pertence à sequência de Fibonacci.

**Entrada**: Um número inteiro
**Saída**: Mensagem indicando se o número pertence ou não à sequência.

---

### ✅ Teste3 - Análise de Faturamento Mensal

**Objetivo**: A partir de um arquivo JSON com valores diários de faturamento, calcular:

* O menor valor de faturamento diário
* O maior valor de faturamento diário
* Quantos dias tiveram faturamento acima da média mensal

> ⚠️ Importante: Dias com faturamento 0 (feriados e fins de semana) são ignorados.

**Fonte de dados**: `dados.json` (localizado na raiz do projeto)

---

### ✅ Teste4 - Percentual de Faturamento por Estado

**Objetivo**: Calcular a porcentagem de contribuição de cada estado no faturamento mensal total da distribuidora.

**Dados fornecidos**:

| Estado | Valor (R\$) |
| ------ | ----------- |
| SP     | 67.836,43   |
| RJ     | 36.678,66   |
| MG     | 29.229,88   |
| ES     | 27.165,48   |
| Outros | 19.849,53   |

**Saída esperada**: Percentual de participação de cada estado.

---

### ✅ Teste5 - Inversão de String

**Objetivo**: Inverter manualmente os caracteres de uma string sem utilizar métodos prontos como `StringBuilder.reverse()`.

**Exemplo**:

```java
String org = "desenvolvimento";
String invt = "otnemivlosneved";
```

---

## 🔧 Como Executar o Projeto

1. Clone este repositório:

   ```bash
   git clone https://github.com/kkilmer/Dev-test.git
   ```

2. Navegue até o diretório:

   ```bash
   cd Dev-tecnico
   ```

> 📝 *Nota: Substitua `Teste1` pelo nome da classe desejada para testar outros casos.*

---

## 📂 Requisitos

* Java 17+
* Maven instalado
* IDE Java (opcional, mas recomendado)

---

## 📌 Observações

* O arquivo `dados.json` deve estar corretamente formatado para que o `Teste3` funcione corretamente.
* Este projeto foi realizado como parte de um teste técnico e demonstra conhecimentos em estruturas de controle, manipulação de dados, leitura de arquivos e boas práticas de desenvolvimento com Java.

---

## 🧠 Autor

Desenvolvido por Kevin Kilmer.
Para fins de avaliação técnica.

---

## 📬 Contato

Caso queira entrar em contato, envie um e-mail para: `kp827767@gmail.com`

