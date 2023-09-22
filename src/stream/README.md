# Principais Funções Lambda em Java

Este README fornece uma lista detalhada das principais funções lambda em Java, explicando cada uma delas e incluindo exemplos de uso. Funções lambda são uma característica importante introduzida no Java 8 para permitir a passagem de comportamentos como argumentos para métodos ou para a criação de expressões mais concisas.

## 1. **Expressões Lambda Simples**

- As expressões lambda permitem definir funções anônimas de forma mais compacta. Por exemplo:
  ```java
  (parâmetros) -> expressão
  ```

  Exemplo:
  ```java
  // Definindo uma função lambda que calcula o quadrado de um número
  Function<Integer, Integer> quadrado = (x) -> x * x;
  ```

## 2. **Operações em Listas com Lambda**

- Você pode usar lambdas para realizar operações em coleções, como mapeamento, filtragem e redução.
  ```java
  lista.stream().map(elemento -> transformação(elemento)).collect(Collectors.toList());
  ```

  Exemplo:
  ```java
  // Mapeando uma lista de nomes para seus comprimentos
  List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
  List<Integer> comprimentos = nomes.stream().map(nome -> nome.length()).collect(Collectors.toList());
  ```

## 3. **Filtragem com Lambda**

- A função `filter` é usada para filtrar elementos com base em uma condição.
  ```java
  lista.stream().filter(elemento -> condição(elemento)).collect(Collectors.toList());
  ```

  Exemplo:
  ```java
  // Filtrando números pares de uma lista
  List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
  List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
  ```

## 4. **Mapeamento com Lambda**

- A função `map` é usada para transformar elementos em outros.
  ```java
  lista.stream().map(elemento -> transformação(elemento)).collect(Collectors.toList());
  ```

  Exemplo:
  ```java
  // Mapeando uma lista de strings para maiúsculas
  List<String> palavras = Arrays.asList("java", "é", "legal");
  List<String> maiusculas = palavras.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
  ```

## 5. **Ordenação com Lambda**

- Para classificar elementos, use a função `sorted`.
  ```java
  lista.stream().sorted((elemento1, elemento2) -> comparador(elemento1, elemento2)).collect(Collectors.toList());
  ```

  Exemplo:
  ```java
  // Ordenando uma lista de números em ordem decrescente
  List<Integer> numeros = Arrays.asList(5, 2, 8, 1, 3);
  List<Integer> ordenados = numeros.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
  ```

## 6. **Redução com Lambda**

- A função `reduce` permite reduzir uma lista a um único valor usando uma operação binária.
  ```java
  lista.stream().reduce((acumulador, elemento) -> operação(acumulador, elemento)).orElse(valorPadrão);
  ```

  Exemplo:
  ```java
  // Reduzindo uma lista de números para a soma
  List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
  int soma = numeros.stream().reduce(0, (a, b) -> a + b);
  ```

## 7. **Foreach com Lambda**

- A função `forEach` executa uma ação em cada elemento da lista.
  ```java
  lista.forEach(elemento -> ação(elemento));
  ```

  Exemplo:
  ```java
  // Imprimindo elementos de uma lista
  List<String> frutas = Arrays.asList("maçã", "banana", "laranja");
  frutas.forEach(fruta -> System.out.println(fruta));
  ```

## 8. **Referências a Métodos**

- Você pode usar referências a métodos para simplificar lambdas que chamam métodos existentes.
  ```java
  lista.forEach(System.out::println);
  ```

  Exemplo:
  ```java
  // Usando uma referência a método para imprimir elementos
  List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
  numeros.forEach(System.out::println);
  ```

## 9. **Escopo de Variáveis**

- Lambdas podem acessar variáveis locais efetivamente finais ou variáveis de instância.
  ```java
  int variavel = 42;
  lista.forEach(elemento -> System.out.println(variavel));
  ```

  Exemplo:
  ```java
  // Acessando uma variável no escopo da lambda
  int contador = 0;
  List<String> palavras = Arrays.asList("uma", "lista", "de", "palavras");
  palavras.forEach(palavra -> System.out.println(palavra + " " + contador));
  ```

## 10. **Interfaces Funcionais**

- Muitas funções lambda são usadas com interfaces funcionais, como `Predicate`, `Function` e `Consumer`, que definem um único método abstrato.

Este README fornece uma visão geral das principais funções lambda em Java e como usá-las em várias situações, incluindo exemplos ilustrativos. Certifique-se de consultar a documentação oficial do Java e exemplos adicionais para obter informações mais detalhadas.