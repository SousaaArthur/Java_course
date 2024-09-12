package Fundamentos01.Exercicios;

import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira um número: ");
    double num1 = sc.nextDouble();
    System.out.print("Insira outro número: ");
    double num2 = sc.nextDouble();

    System.out.println("Operações +, -, *, /, %");
    System.out.print("Escolha uma operação: ");
    String operacao = sc.next();

    double sum = num1 + num2;
    double sub = num1 - num2;
    double mult = num1 * num2;
    double div = num1 / num2;
    double module = num1 % num2;

    double calc = operacao.equals("+") ? sum : operacao.equals("-") ? sub : operacao.equals("*") ? mult : operacao.equals("/") ? div : operacao.equals("%") ? module : 0;

    System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, calc);

    sc.close();
  }
}
