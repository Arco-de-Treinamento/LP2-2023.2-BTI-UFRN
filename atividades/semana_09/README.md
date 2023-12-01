## Atividade

Escreva um programa que implementa um produtor/consumidor com as seguintes regras:

1. O produtor deve produzir números para calculo do seu dobro
2. O consumidor deve receber esses dados na ordem de postagem
3. O produtor e o consumidor devem estar em threads separadas (veja o ExecutorService)
4. O produtor deve produzir um novo dado em uma frequência aleatória seguindo uma distribuição uniforme entre 200ms e 800ms
5. A fila deve estar protegida para problemas de sincronia
6. O consumidor deve imprimir o resultado da computação no console
7. O número de threads produtoras e consumidoras deve ser um parâmetro do programa

## Resposta
O codigo aqui presente implementa as classes Producer e Consumer, conforme o solicitado no enunciado. Para executar o programa deve-se seguir:

1. Navegue até o diretório onde o Main.java está localizado;
```console
$ cd src/main/java
```
2. Compile o Main.java e todas as classes dependentes;
```console
$ javac br/ufrn/imd/*.java Main.java
```
3. Execute o Main com o número de threads como argumento onde 'n' é o numero de threads desejado. 
```console
$ java Main n
```

## Referências

* [Producer Consumer Solution using BlockingQueue in Java Thread
](https://www.geeksforgeeks.org/producer-consumer-solution-using-blockingqueue-in-java-thread/)
* [Class Thread
  ](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html)
* [Scale Up Your Code With Java Concurrency](https://openclassrooms.com/en/courses/5684021-scale-up-your-code-with-java-concurrency/6667996-implement-a-producer-consumer-pattern-using-a-blockingqueue)
* [The Producer Consumer Pattern](https://jenkov.com/tutorials/java-concurrency/producer-consumer.html)