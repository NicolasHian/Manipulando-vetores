# Exercícios de Java

Repositório com os exercícios que estou fazendo para aprender Java na faculdade (Análise e Desenvolvimento de Sistemas).

O foco aqui é praticar a base da linguagem: vetores, laços de repetição, condicionais, leitura de dados com `Scanner` e organização do código em métodos.

## O que tem aqui

### `Exercicio.java`

| Parte | O que faz |
|---|---|
| Ordenar números | Lê um vetor de inteiros e ordena em ordem crescente com dois `for` aninhados |
| Ordenar palavras | Lê um vetor de palavras e ordena em ordem alfabética usando `compareTo` |
| `EX2` | Lê um vetor de números e mostra separadamente quais são pares e quais são ímpares |
| `EX3` | Lê um nome e mostra ele invertido, letra por letra |

Os outros arquivos do projeto são exercícios de treino com os mesmos conceitos.

## Conceitos praticados

- Criação e preenchimento de vetores (`int[]`, `String[]`, `char[]`)
- Laços `for` e `while`, incluindo `for` aninhado
- Ordenação manual trocando elementos com variável auxiliar
- Operador `%` para verificar par e ímpar
- Comparação de `String` com `compareTo`
- Leitura do teclado com `Scanner` e o problema do Enter que sobra no buffer depois do `nextInt()`
- Separação do código em métodos `static`

## Como rodar

Precisa ter o Java (JDK) instalado.

Pelo terminal, na pasta do arquivo:

```bash
javac Exercicio.java
java Exercicio
```

Ou abra o projeto no IntelliJ IDEA e clique em **Run** no método `main`.

## Exemplo

```
Digite o tamanho do vetor:
4
Digite o valor da posição 0 do vetor:
5
Digite o valor da posição 1 do vetor:
3
Digite o valor da posição 2 do vetor:
8
Digite o valor da posição 3 do vetor:
1
Ordenado: [1, 3, 5, 8]
...
Digite um nome:
Paulo
Invertido: oluaP
```

## Autor

**Nicolas Hian**

- GitHub: [NicolasHian](https://github.com/NicolasHian)
- LinkedIn: [nicolashian](https://www.linkedin.com/in/nicolashian)
