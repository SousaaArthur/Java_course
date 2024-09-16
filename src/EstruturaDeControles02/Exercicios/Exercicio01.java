package EstruturaDeControles02.Exercicios;

import java.util.Scanner;

public class Exercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira algum número: ");
    int num = sc.nextInt();

    if (num > 0 && num < 10) {
      if(num % 2 == 0) {
        System.out.println("O número" + num + " está entre 0 e 10 e é par!");
      } else {
        System.out.println("O número" + num + " está entre 0 e 10 e não é par!");
      }
    } else {
      System.out.println("O número" + num + " não está entre 0 e 10");
    }

    sc.close();
  }
}
