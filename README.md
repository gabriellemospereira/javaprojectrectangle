-----

# 📐 Calculadora de Retângulo em Java

Este projeto simples em Java demonstra o uso de estruturas de entrada de dados (`Scanner`), variáveis do tipo `double` e cálculos matemáticos básicos para determinar as principais propriedades geométricas de um retângulo.

## ✨ Funcionalidades

O programa executa os seguintes cálculos com base na largura (width) e altura (height) fornecidas pelo usuário:

  * **Cálculo da Área** (`Area = Largura * Altura`)
  * **Cálculo do Perímetro** (`Perímetro = 2 * (Largura + Altura)`)
  * **Cálculo da Diagonal** (`Diagonal = Raiz Quadrada (Largura² + Altura²)`)

## 💻 Tecnologias Utilizadas

| Item | Descrição |
| :--- | :--- |
| **Linguagem** | Java |
| **Biblioteca** | `java.util.Scanner` (para entrada de dados) |
| **Função Matemática** | `Math.sqrt()` (para calcular a raiz quadrada da diagonal) |

## ▶️ Como Rodar o Projeto

### Pré-requisitos

  * Java Development Kit (JDK) instalado na sua máquina.

### 1\. Clonar o Repositório

```bash
git clone https://github.com/gabriellemospereira/javaprojects
# Navegue até a pasta do projeto
cd javaprojects/CalculadoraRetangulo 
```

*(Assumindo que o projeto está em uma subpasta chamada `CalculadoraRetangulo`)*

### 2\. Compilar e Executar

1.  **Compile o código:**

    ```bash
    javac Retangulo.java 
    ```

    *(Ou o nome que você deu ao seu arquivo principal.)*

2.  **Execute o programa:**

    ```bash
    java Retangulo
    ```

3.  O console solicitará que você insira os valores da largura e altura.

## 📝 Exemplo de Saída

```
Digite a Largura do Retângulo: 5.0
Digite a Altura do Retângulo: 3.0

AREA = 15.00
PERÍMETRO = 16.00
DIAGONAL = 5.83
```

-----

Desenvolvido por **Gabriel Rafael de Lemos Pereira** 👩‍💻
