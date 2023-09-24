Claro, aqui está uma lista resumida dos métodos da API de Streams em Java em formato Markdown para um arquivo `README.md`:

## Métodos da API de Streams em Java

A API de Streams em Java oferece uma variedade de métodos para realizar operações de processamento de dados de maneira funcional em coleções. Abaixo estão alguns dos métodos mais comuns:

- `filter(Predicate<T> predicate)`: Filtra elementos com base em um predicado.
- `map(Function<T, R> mapper)`: Transforma elementos em outro tipo usando uma função.
- `flatMap(Function<T, Stream<R>> mapper)`: Transforma elementos em streams e as achatam.
- `distinct()`: Remove elementos duplicados.
- `sorted()`: Ordena os elementos em ordem natural.
- `peek(Consumer<T> action)`: Executa uma ação em cada elemento.
- `limit(long maxSize)`: Limita o número de elementos.
- `skip(long n)`: Pula os primeiros elementos.
- `forEach(Consumer<T> action)`: Executa uma ação em cada elemento.
- `toArray()`: Converte em array.
- `reduce(BinaryOperator<T> accumulator)`: Combina elementos em um resultado.
- `min(Comparator<T> comparator)`: Encontra o mínimo.
- `max(Comparator<T> comparator)`: Encontra o máximo.
- `count()`: Conta elementos.
- `allMatch(Predicate<T> predicate)`: Verifica se todos atendem ao predicado.
- `anyMatch(Predicate<T> predicate)`: Verifica se algum atende ao predicado.
- `noneMatch(Predicate<T> predicate)`: Verifica se nenhum atende ao predicado.
- `findFirst()`: Encontra o primeiro elemento.
- `findAny()`: Encontra qualquer elemento.
- `parallel()`: Converte em stream paralela.
- `sequential()`: Converte em stream sequencial.
- `empty()`: Cria uma stream vazia.
- `of(T... values)`: Cria uma stream a partir dos valores.
- `generate(Supplier<T> s)`: Cria uma stream infinita com base em fornecedores.
- `iterate(T seed, UnaryOperator<T> f)`: Cria uma stream infinita aplicando uma função.
- `concat(Stream<T> a, Stream<T> b)`: Concatena duas streams.
- `ofNullable(T t)`: Cria uma stream que pode conter zero ou um elemento, dependendo de `t`.

Esta lista representa uma seleção dos métodos disponíveis na API de Streams em Java para operações funcionais em coleções de dados. Esses métodos podem ser combinados para realizar tarefas complexas de processamento de dados de maneira concisa e funcional.