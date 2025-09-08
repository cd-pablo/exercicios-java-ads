# Exercícios - Repetição

1. Escreva um programa em Java que exiba os números de 1 a 10 utilizando um laço `while`.

2. Crie um programa que exiba o seguinte menu até que o usuário escolha a opção 0:

    1 - Dizer Olá
    2 - Mostrar data atual
    0 - Sair

Use `do...while` para repetir o menu.  
Não precisa implementar a funcionalidade das opções, apenas simular com mensagens como “Olá!” ou “Data: simulada”.

3. Faça um programa que leia um número e imprima a sua tabela de multiplicação de 1 até 10.  
O programa deve parar quando o número informado for 0.

4. Peça ao usuário vários números positivos. O programa deve somar os valores até que o usuário digite um número negativo. Utilize `while`.

5. Criar um programa que informa quantos números entre 100 e 200 foram digitados.  
O programa pára quando o usuário digitar 0.

6. Ler um determinado número e dizer quantos números pares e ímpares há, de 1 até o número informado.

7. Faça um programa que leia um conjunto de dados numéricos (X) e imprima o maior (Máximo) dentre eles.  
O programa deverá parar ao ser digitado o número **9999**.  
Ex.: `1, 2, 3 => Maior=3`

8. Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo.  
O último dado, que não entrará nos cálculos, contém o valor de idade negativa.  
Calcular e imprimir a idade média deste grupo de indivíduos.

9. A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística do resultado de vários GRENAIS.  
Escreva um programa para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL.  
Logo após escrever a mensagem `"Novo grenal (1-sim 2-nao)"` e solicitar uma resposta.  

- Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o número de gols marcados pelos times em uma nova partida.  
- Caso contrário, deve ser encerrado imprimindo:  
  - Quantos GRENAIS fizeram parte da estatística.  
  - O número de vitórias do Inter.  
  - O número de vitórias do Grêmio.  
  - O número de Empates.  
  - Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou "Não houve vencedor", caso termine empatado).

10. Um marciano chegou a uma floresta e se escondeu atrás de uma das 100 árvores quando viu um caçador.  
 O caçador só tinha cinco balas em sua espingarda.  
 Cada vez que ele atirava, e não acertava, o marciano dizia: "estou mais à direita" ou "mais à esquerda".  
 Se o caçador não conseguir acertar o marciano, ele será levado para marte.  

 Utilize os comandos que já vimos para gerar aleatoriamente a escolha da árvore em que ele se escondeu.  
 O jogo termina com o caçador vitorioso ao acertar o marciano ou derrotado e levado à Marte, dessa forma, exiba a mensagem correspondente ao final.

11. Ao observar a curva de velocidade de um motor, o engenheiro Zé percebeu que sempre ocorria uma queda quando as medidas eram feitas em intervalos de 10 ms.  
 Mas esta queda acontecia em medidas diferentes a cada novo teste do motor.  

 Zé ficou curioso com essa falta de padrão e quer saber, para cada teste do motor, qual a primeira medida em que ocorre uma queda de velocidade.  

 O seu programa deverá receber do usuário:  
 - o número de medidas de velocidade do motor  
 - os valores representando o número de RPM (rotações por minuto) de cada medida.  

 Uma medida é considerada uma queda se é menor que a medida anterior.  
 Mostre na tela a posição da medida em que houve a primeira queda de velocidade no teste.  
 Caso não aconteça uma queda de velocidade a saída deve ser o número zero.  

 **Exemplo:**  

 ```
 Número de medidas: 5
 Medida 1: 100
 Medida 2: 199
 Medida 3: 199
 Medida 4: 198
 Medida 5: 0

 Resultado: 4
 ```

12. Uma string é utilizada para representar uma das fitas de uma cadeia de DNA.  
 Para tanto, as bases **Adenina, Guanina, Citosina, Timina e Uracila** são representadas pelas letras **A, G, C, T e U**, respectivamente.  

 Deseja-se construir um programa que, dada uma sequência de DNA, seja fornecida a sequência de RNA-m equivalente de acordo com a transformação indicada.  

 **Exemplo:**  

 ```
 DNA: A T C C G T T A A
 RNA-m: U A G G C A A U U
 ```


