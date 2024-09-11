package Fundamentos.ExerciciosFundamentos;

import java.util.Scanner;

public class ValorAoQuadrado {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira um valor: ");
    int num = sc.nextInt();

    double square = Math.pow(num, 2);
    double cube = Math.pow(num, 3);

    System.out.println("O valor ao quadrado é  " + square + " e o valor ao cubo é " + cube + ".");

    sc.close();
  }
}
