package EstruturaDeControles02.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira a primeira nota: ");
    double n1 = sc.nextDouble();
    System.out.println("Insira a segunda nota: ");
    double n2 = sc.nextDouble();

    double media = (n1 + n2) / 2;

    if (media >= 7.0){
      System.out.println("Aprovado!!");
    } else if (media >= 4.0) {
      System.out.println("Recuperação!!");
    } else {
      System.out.println("Reprovado!!");
    }

    sc.close();
  }
}
