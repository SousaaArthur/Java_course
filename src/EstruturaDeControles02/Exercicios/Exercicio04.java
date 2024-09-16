package EstruturaDeControles02.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int contadorDeDivisores = 0;
    System.out.print("Insira um número: ");
    double num = sc.nextDouble();

    for (int i = 0; i < num; i++) {
      if (num % i == 0) {
        contadorDeDivisores++;
      }
    }

    if (contadorDeDivisores == 0) {
      System.out.println("O número " + num + " é um número primo.");
    } else {
      System.out.println("O número " + num + "não é um número primo.");
    }

    sc.close();
  }
}