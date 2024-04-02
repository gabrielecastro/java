
### LOTOFÁCIL



##### O sistema gera jogos aleatórios, permitindo que os jogadores façam suas apostas, verifiquem os resultados e os prêmios de acordo com as regras da loteria. Este sistema funciona por meio do terminal, lendo e escrevendo dados.

#### Regras de negócio/requisitos:
Cria um menu para a loteria utilizando as estruturas **switch case** e **do while**. Enquanto
o usuário não digitar 0, para sair, novas apostas serão permitidas.
**************************
    Menu LOTOFÁCIL:
    1) Apostar de 0 a 100
    2) Apostar de A à Z
    3) Apostar em par ou ímpar
    0) Sair
**************************

#### Regras para a aposta de 0 a 100
- Utilizando a biblioteca **Scanner**, lê um número inteiro via teclado, de 0 a 100, caso o número seja maior que 100 ou menor que 0, imprime a mensagem: “Aposta inválida.”
- Utiliza a biblioteca **Random** para sortear aleatoriamente um número de 0 a 100.
- Compara o número escolhido pelo usuário apostador com o número sorteado pelo sistema.
- Caso o usuário acerte a aposta, imprime a mensagem “Você ganhou R$ 1.000,00 reais.”. Caso o usuário erre, imprime a mensagem: “Que pena! O número sorteado foi: X.”

#### Regras para a aposta de A à Z
- Utilizando o método **System.in.read()**, lê um char via teclado, de A à Z, podendo ser lido como maiúsculo ou minúsculo. Caso não seja uma letra, imprime a mensagem: “Aposta inválida.”
- Utiliza o método **Character.isLetter()** para verificar se a entrada digitada é uma letra válida.
- Converte a entrada do usuário apostador para maiúsculo, utilizando o método **CharactertoUpperCase()**.
- A letra premiada é a letra **G**.
- Compara a letra lida via teclado, e convertida para maiúsculo, com a letra premiada.
- Caso o usuário acerte a aposta, imprime a mensagem “Você ganhou R$ 500,00 reais.”. Caso o usuário erre, imprime a mensagem: “Que pena! A letra sorteada foi: X.”.

#### Regras para a aposta de número par ou ímpar
- Utilizando a biblioteca **Scanner**, lê um número inteiro via teclado. Exemplo: 600.
- Utiliza o operador de módulo (%) para verificar se o número é par ou ímpar.
- O prêmio será dado caso o usuário digite um número par. O sistema não premia jogadores que digitarem um número ímpar.
- Se o número digitado for par, imprime a mensagem: “Você ganhou R$ 100,00 reais.”. Caso o usuário digite um número ímpar, imprime a mensagem: “Que pena! O número digitado é ímpar e a premiação foi para números pares.”.

#### Clonando o projeto

```bash
  git clone ...
  cd my-project
```

#### Bibliotecas usadas
- [Scanner](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)
- [Random](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html)
- [Character](https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html)

#### Versão do JDK

