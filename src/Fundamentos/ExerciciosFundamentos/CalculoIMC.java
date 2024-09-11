package Fundamentos.ExerciciosFundamentos;

import java.util.Scanner;

public class CalculoIMC {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira o seu peso: ");
    double peso = sc.nextDouble();
    System.out.print("Insira sua altura: ");
    double altura = sc.nextDouble();

    double calc = peso / Math.pow(altura, 2);

    System.out.println("O IMC é de: " + calc);

    sc.close();
  }
}
