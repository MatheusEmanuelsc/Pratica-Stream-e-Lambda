# Lista de Funções Lambda e Stream em Java

## Codígos:

(lambdas)[./src/lambdas/README.md]
(Stream)[./src/stream/README.md]
(extra...)[./src/metodosAuxiliares/README.md]

Este README apresenta uma lista de funções lambda e operações de stream em Java, juntamente com uma breve descrição do que cada função faz. Essas funcionalidades são essenciais para manipular coleções de dados e simplificar a lógica de programação.

## Funções Lambda

### 1. `Consumer`

- **Descrição**: `Consumer` é uma interface funcional que representa uma operação que aceita um argumento de entrada e não retorna nenhum resultado. É frequentemente usado em operações de iteração, como `forEach`.

```java
Consumer<T> consumer = (elemento) -> ação(elemento);
```

### 2. `Function`

- **Descrição**: `Function` é uma interface funcional que representa uma função que aceita um argumento de entrada e retorna um resultado. É usado para mapear elementos de entrada para elementos de saída.

```java
Function<T, R> function = (entrada) -> transformação(entrada);
```

### 3. `Predicate`

- **Descrição**: `Predicate` é uma interface funcional que representa uma condição booleana. É usado em operações de filtragem, como `filter`, para testar elementos e decidir se eles devem ser incluídos ou não.

```java
Predicate<T> predicate = (elemento) -> condição(elemento);
```

### 4. `Supplier`

- **Descrição**: `Supplier` é uma interface funcional que não aceita argumentos e fornece um resultado. É frequentemente usado para gerar ou fornecer valores.

```java
Supplier<T> supplier = () -> fornecerValor();
```

### 5. `BiFunction`

- **Descrição**: `BiFunction` é uma interface funcional que representa uma função que aceita dois argumentos de entrada e retorna um resultado. É útil em situações que requerem operações em pares de elementos.

```java
BiFunction<T, U, R> biFunction = (arg1, arg2) -> operação(arg1, arg2);
```

### 6. `UnaryOperator`

- **Descrição**: `UnaryOperator` é uma interface funcional que representa uma função que aceita um único argumento e retorna um resultado do mesmo tipo. É útil quando a entrada e saída têm o mesmo tipo.

```java
UnaryOperator<T> unaryOperator = (elemento) -> operação(elemento);
```

### 7. `BinaryOperator`

- **Descrição**: `BinaryOperator` é uma interface funcional que representa uma função que aceita dois argumentos do mesmo tipo e retorna um resultado do mesmo tipo. É útil para operações binárias.

```java
BinaryOperator<T> binaryOperator = (arg1, arg2) -> operação(arg1, arg2);
```

## Operações de Stream

### 1. `filter`

- **Descrição**: A operação `filter` é usada para filtrar elementos com base em uma condição especificada, retornando um novo stream contendo apenas os elementos que atendem à condição.

```java
Stream<T> streamFiltrado = stream.filter(elemento -> condição(elemento));
```

### 2. `map`

- **Descrição**: A operação `map` é usada para transformar cada elemento do stream em outro elemento, produzindo um novo stream com os elementos transformados.

```java
Stream<R> streamMapeado = stream.map(elemento -> transformação(elemento));
```

### 3. `forEach`

- **Descrição**: A operação `forEach` permite executar uma ação em cada elemento do stream. É frequentemente usado para iterações e operações de impressão.

```java
stream.forEach(elemento -> ação(elemento));
```

### 4. `sorted`

- **Descrição**: A operação `sorted` classifica os elementos do stream com base em um comparador especificado, retornando um novo stream com os elementos ordenados.

```java
Stream<T> streamOrdenado = stream.sorted((elemento1, elemento2) -> comparador(elemento1, elemento2));
```

### 5. `distinct`

- **Descrição**: A operação `distinct` remove elementos duplicados do stream, retornando um novo stream com apenas valores distintos.

```java
Stream<T> streamSemDuplicatas = stream.distinct();
```

### 6. `limit`

- **Descrição**: A operação `limit` limita o número de elementos no stream, produzindo um novo stream com os primeiros N elementos.

```java
Stream<T> streamLimitado = stream.limit(número);
```

### 7. `reduce`

- **Descrição**: A operação `reduce` combina os elementos do stream em um único valor usando uma operação binária especificada.

```java
Optional<T> resultado = stream.reduce((acumulador, elemento) -> operação(acumulador, elemento));
```

### 8. `count`

- **Descrição**: A operação `count` retorna o número de elementos no stream.

```java
long contagem = stream.count();
```

### 9. `collect`

- **Descrição**: A operação `collect` permite coletar os elementos do stream em uma coleção ou valor específico, como uma lista, conjunto ou mapa.

```java
Collection<T> coleção =


