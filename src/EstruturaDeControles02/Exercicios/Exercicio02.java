package EstruturaDeControles02.Exercicios;

import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira um ano: ");
    int year = sc.nextInt();  

    if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0)){
      System.out.println(year + " é um ano bissexto.");
    } else {
      System.out.println(year + " não é um ano bissexto.");
    }

    sc.close();
  }
}
