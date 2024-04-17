

## Java

- Linguagem simples, orientada a objetos robusta, segura, independente de plataforma, interpretada e compilada, de alto desempenho.
- Sintaxe baseada em C.
- Tipos de dados básicos similares a C.

### Tipos Primitivos


- Números Inteiros

    - **byte** 1 byte
    - **short** 2 bytes
    - **int** 4 bytes (mais usado)
    - **long** 8 bytes

- Números em Ponto Flutuante

    - **float** 4 bytes
    - **double** 8 bytes (duas vezes a precisão do tipo float) (mais usado)

- Texto

    - **char** 2 bytes

- Lógico

    - **boolean** 1 byte (valores verdadeiros (true) e falso (false))

#### Lendo uma string pelo teclado

```python
  import java.util.Scanner();

  Scanner in = new Scanner(System.in);

  System.out.println("Digite seu nome!");
  String nome = in.nextLine();

  System.out.println("Digite sua idade!");
  String nome = in.nextInt();

  System.out.println("Digite seu salário!");
  String nome = in.nextDouble();

  in.close();
  ```

### ArrayList

Métodos

- Object **get(int index)** - retorna o elemento  na lista correspondende ao index especificado.
- int **indexOf(Object element)** - retorna a posição da primeira ocorrência do elemento especificado.
- boolean **isEmpty** - retorna verdadeiro se a lista estiver vazia e falso caso contrário.
- int **lastIndexOf(Object element)** - retorna a posição da última ocorrência do elemento especificado.
- boolean **add(Object element)**: Adiciona o elemento especificado no final da lista.
- void **add(int index, Object element)**: Insere o elemento especificado na posição indicada da lista.
- void **clear()**: Remove todos os elementos da lista.
- boolean **contains(Object element)**: Retorna verdadeiro se a lista contém o elemento especificado e falso caso contrário.
- Object **remove(int index)**: Remove o elemento da lista na posição especificada.
- Object **set(int index, Object element)**: Substitui o i-ésimo elemento da lista pelo elemento especificado.
- int **size()**: Retorna o número de elementos da lista.

#### Sintaxe for

```java
  int[] numeros = {1, 2, 3, 4, 5};

  for (int numero : numeros) {
      System.out.println(numero);
  }

  ```