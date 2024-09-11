package Fundamentos.ExerciciosFundamentos;

import java.util.Scanner;

public class TemperaturaFahreheit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira um valor: ");
    int fahreheit = sc.nextInt();

    final int ajuste = 32;
    final double fator = 5 / 9.0;

    double result = (fahreheit - ajuste) * fator;

    System.out.println(fahreheit + " Fahreheit" + " = " + result + "° Degree Celsius");

    sc.close();
  }
}
