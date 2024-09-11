package Fundamentos.ExerciciosFundamentos;

import java.util.Scanner;

public class TemperaturaCelsius {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira um valor: ");
    int celsius = sc.nextInt();

    final int ajuste = 32;
    final double fator = 9.0 / 5;

    double result = (celsius * fator) + ajuste;

    System.out.println(celsius + " Degree Celsius" + " = " + result + "º Fahreheit");

    sc.close();
  }
}
