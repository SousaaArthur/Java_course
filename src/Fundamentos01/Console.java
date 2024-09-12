package Fundamentos01;
import java.util.Scanner;

public class Console {
  public static void main(String[] args) {
    System.out.print("Sem quebra de linha!!");
    System.out.print(" Sem quebra de linha!! \n");

    System.out.println("Com quebra de linha!!");
    System.out.println("Com quebra de linha!!");

    System.out.printf("Número da loteria: %d %d %d %d %d \n", 1, 4, 7, 3, 7);
    System.out.printf("Sálario: %.2f%n", 1234.5013);
    System.out.printf("Nome: %s%n", "Arthur");

    Scanner sc = new Scanner(System.in);

    System.out.print("Insira seu nome: ");
    String name = sc.nextLine();
    System.out.print("Insira seu sobre nome: ");
    String lastname = sc.nextLine();

    System.out.print("Insira a sua idade: ");
    int age = sc.nextInt();

    System.out.print("Insira seu sálario: ");
    double wage = sc.nextDouble();

    System.out.printf("O %s %s tem %s anos e ganha R$%.2f por mês.", name, lastname, age, wage);

    sc.close();
  }
}
