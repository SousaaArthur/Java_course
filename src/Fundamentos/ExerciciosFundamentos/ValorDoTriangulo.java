package Fundamentos.ExerciciosFundamentos;

import java.util.Scanner;

public class ValorDoTriangulo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o valor base: ");
    int base = sc.nextInt();
    System.out.print("Digite o valor da altura: ");
    int altura = sc.nextInt();

    double area = (base * altura) / 2;

    System.out.println("A area do triangulo é de: " + area);

    sc.close();
  }
}
