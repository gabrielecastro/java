
### LOTOFÁCIL

##### Sistema de jogos aleatórios onde os jogadores fazem suas apostas.

![gif lotofacil](src/video/lotofacil.gif)

#### Regras de negócio/requisitos:

#### Regras para a aposta de 0 a 100
- Utiliza a biblioteca **Random** para sortear aleatoriamente um número de 0 a 100.
- Compara o número escolhido pelo usuário apostador com o número sorteado pelo sistema.
- Caso o usuário acerte a aposta, mostra a mensagem “Você ganhou R$ 1.000,00 reais.”. Caso o usuário erre, mostra a mensagem: “Que pena! O número sorteado foi: X.”

#### Regras para a aposta de A à Z
- A letra premiada é a letra **G**.
- Compara a letra selecionada com a letra premiada.
- Caso o usuário acerte a aposta, mostra a mensagem “Você ganhou R$ 500,00 reais.”. Caso o usuário erre, mostra a mensagem: “Que pena! A letra sorteada foi: X.”.

#### Regras para a aposta de número par ou ímpar
- Utiliza o operador de módulo (%) para verificar se o número é par ou ímpar.
- O prêmio será dado caso o usuário digite um número par. O sistema não premia jogadores que digitarem um número ímpar.
- Se o número digitado for par, imprime a mensagem: “Você ganhou R$ 100,00 reais.”. Caso o usuário digite um número ímpar, imprime a mensagem: “Que pena! O número digitado é ímpar e a premiação foi para números pares.”.

#### Clonando o projeto

```bash
  git clone git@github.com:gabrielecastro/java.git
  cd LotoFacil
```

#### Bibliotecas usadas
- [Random](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html)


#### Versão do JDK
21.0.2
