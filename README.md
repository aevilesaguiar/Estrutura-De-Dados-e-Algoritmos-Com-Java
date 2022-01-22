# Estrutura de Dados com Java - Curso Loiane 

## Vetores, Arrays e Listas 
- Aula 01 - Introdução a Estrutura de Dados e Algoritmos✅ 
- Aula 02 -Vetores e Arrays: Introdução✅ 
- Aula 03 - Adicionar elemento no final do vetor✅ 
- Aula 04 -Verificar tamanho e imprimir elementos do vetor✅ 
- Aula 05 -Obter elemento de uma posição✅ 
- Aula 06 - Verificar se elemento existe no vetor (busca sequencial)✅
- Aula 07 -Adicionar elemento em qualquer posição✅
- Aula 08 -Aumentar capacidade do vetor✅
- Aula 09 -Remover elemento do vetor✅
- Aula 10 -Generalizar o tipo do vetor✅
- Aula 11 -Configurar o tipo do vetor dinamicamente (Generics)✅
- Aula 12 -API Java: ArrayList✅
- Exer 01 método contém✅
- Exer 02 método último índice✅
- Exer 03 método remove elemento✅
- Exer 04 método obtém (get)✅
- Exer 05 método remover todos elementos (clear)✅
- Exer 06 Contatos – Lista✅
- Exer 07 Contatos – ArrayList✅


## Pilhas 
- Aula 13-Pilhas: Introdução✅
- Aula 14- Empilhar elemento (push)✅
- Aula 15 -Verificar se pilha está vazia✅
- Aula 16 -Espiar/Verificar elemento do topo (peek)✅
- Aula 17 -Desempilhar elemento (pop)✅
- API Java: Stack
- Empilha e desempilha
- Pilhas par ou ímpar
- Pilha de Livros
- Stack de Livros
- Desafio do Palíndromo
- Desafio dos símbolos balanceados
- Desafio conversão decimal-binário
- Desafio Torre de Hanoi


# Apontamentos

**Objetos StringBuilder são como objetos String, exceto que eles podem ser modificados . Internamente, esses objetos são tratados como matrizes de comprimento variável que contêm uma sequência de caracteres. A qualquer momento, o comprimento e o conteúdo da sequência podem ser alterados por meio de invocações de métodos.**


### API de Collections

** ArrayList aparece com maior frequência.**

Ex:
**ArrayList<String> aulas = new ArrayList<>();**
  
- Adicionando itens (em sequencia)
   **aulas.add(aula1);**
- Removendo elementos
  **aulas.remove(0);**
  
  - Percorrendo uma lista
  
 **for (String aula : aulas) {  
    System.out.println("Aula: " + aula);  
}**
 - Acessando elementos(o método utilizado é o get)
  **String primeiraAula = aulas.get(0);**
  
 - Usando o mesmo método para percorrer a lista toda
  **for (int i = 0; i < aulas.size(); i++) {    
    System.out.println("aula : " + aulas.get(i));    
}**  
                                                        
- Forma de percorrer elementos java 08
                                                        
**aulas.forEach(aula -> {  
    System.out.println("Percorrendo:");  
    System.out.println("Aula " + aula);  
});**

- Ordenando a lista
  
  **Collections.sort(aulas);**

  
 
  
  
 
  

![819px-Java util Collection_hierarchy svg](https://user-images.githubusercontent.com/52088444/150176834-9cf2f3ee-0885-4a85-9b5d-9e00590a8d49.png)
  
    
### Pilhas
  
  ![DiagramaDeClasse](https://user-images.githubusercontent.com/52088444/150648790-b9f85b6f-7f94-45f1-87e8-145986f17885.PNG)

  
  
  https://www.devmedia.com.br/pilhas-fundamentos-e-implementacao-da-estrutura-em-java/28241#:~:text=A%20estrutura%20da%20pilha%2C%20segundo,%2Dse%20remover%20o%20%C3%BAltimo%E2%80%9D.
  
**A pilha possui um comportamento especial chamdo de LIFO(LAST IN FIRST OUT) ultimo elemento ao entrar , primeiro elemento a sair
  ![image](https://user-images.githubusercontent.com/52088444/150649118-b8eded4f-8e80-4406-bf22-092088f7d96f.png)
