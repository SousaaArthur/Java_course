package Arrays_e_Collections.Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
  public static void main(String[] args) {
    
    Queue<String> fila = new LinkedList<>();

    // Offer e Add -> adicionam elementos na filla
    // A diferença é o comportamento quando a fila está cheia!
    fila.add("Ana"); // retorna falso
    fila.offer("Bia");
    fila.offer("Luiz"); // lança uma exceção
    fila.offer("Leandro");
    fila.offer("Larissa");

    // Peek e Element -> obter o proximo elementos da fila (sem remover)
    // Retorna um valor nullo quando a fila estiver vazia
    System.out.println(fila.peek());
    // Retorna uma exceção quando a fila estiver vazia
    System.out.println(fila.element());
  
    // Poll e Remove -> obter o proximo elemento 
    // da fila e remove!
    // Diferençã é o comportamento ocorre quando a fila estiver vazia
    System.out.println(fila.poll());
    System.out.println(fila.poll()); // retorna null
    System.out.println(fila.poll());
    System.out.println(fila.poll());
    System.out.println(fila.remove());
    System.out.println(fila.remove()); // Lança uma exceção

    // fila.size();
    // fila.clear();
    // fila.isEmpty();
    // fila.contains(...)
  }
}
