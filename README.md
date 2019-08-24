# Exercício 1 - THREADS!

1. Execute o projeto e observe o comportamento.

2. Execute o exemplo Produtor-Consumidor. Experimente trocar o notifyAll() por notify() e verifique o que muda no seu comportamento.

3. Escreva uma classe Pilha com métodos sincronizados char pop() e push(char) que armazenem caracteres em um buffer de seis posições (use um array de 6 elementos) e um cursor (inteiro) que aponte para o próximo espaço livre.
    - push() insere um caractere no array (havendo espaço) e incrementa a posição do cursor. Não havendo espaço, espera até um espaço ser liberado (essa é a condição). Tendo inserido um caractere, notifica threads que queiram consumir.
    - pop() devolve o último caractere inserido (havendo caracteres) e decrementa a posição do cursor. Não havendo caracteres, espera até que um seja inserido. Tendo consumido um caractere, notifica threads que queiram inserir. 
4. Implemente um mecanismo Produtor-Consumidor com a pilha do exercício 5:
  a) Escreva um Produtor que insira as 26 letras do alfabeto na Pilha.
  b) Escreva um Consumidor imprima cada caractere encontrado quando chegar. 
  c) Teste com uma classe executável que crie uma pilha, consumidor e produtor
