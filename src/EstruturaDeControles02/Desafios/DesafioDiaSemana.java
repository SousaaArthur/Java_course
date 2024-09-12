package EstruturaDeControles02.Desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Escreva um nome dos dias da semana. (Domingo, Segunda, Terça, Quarta, Quinta, Sexta, Sábado)");
    System.out.print("Insira um dia: ");
    String diaSemana = sc.nextLine();

    if (diaSemana.equalsIgnoreCase("Domingo")){
      System.out.println("O número associado a " + diaSemana + " é 1");
    } else if (diaSemana.equalsIgnoreCase("Segunda")){
      System.out.println("O número associado a " + diaSemana + " é 2");
    } else if (diaSemana.equalsIgnoreCase("Terça")){
      System.out.println("O número associado a " + diaSemana + " é 3");
    } else if (diaSemana.equalsIgnoreCase("Quarta")){
      System.out.println("O número associado a " + diaSemana + " é 4");
    } else if (diaSemana.equalsIgnoreCase("Quinta")){
      System.out.println("O número associado a " + diaSemana + " é 5");
    } else if (diaSemana.equalsIgnoreCase("Sexta")){
      System.out.println("O número associado a " + diaSemana + " é 6");
    } else if (diaSemana.equalsIgnoreCase("Sábado")){
      System.out.println("O número associado a " + diaSemana + " é 7");
    }

    sc.close();
  }
}
