package Fundamentos01.Exercicios;

import java.util.Scanner;

public class ConversaoDeSalario {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira o primeiro salario: ");
    String wageString1 = sc.nextLine().replace(",", ".");
    double wage1 = Double.parseDouble(wageString1);
    System.out.print("Insira o segundo salario: ");
    String wageString2 = sc.nextLine().replace(",", ".");
    double wage2 = Double.parseDouble(wageString2);
    System.out.print("Insira o terceiro salario: ");
    String wageString3 = sc.nextLine().replace(",", ".");
    double wage3 = Double.parseDouble(wageString3);

    double sum = (wage1 + wage2 + wage3) / 3;

    System.out.printf("A média dos três salário é de: %.2f", sum);

    sc.close();
  }
}
