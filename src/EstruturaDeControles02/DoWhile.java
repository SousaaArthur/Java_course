package EstruturaDeControles02;

import java.util.Scanner;

public class DoWhile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String texto = "";
    do {
      System.out.println("Digite sair, para sair da execução do programa:");
      System.out.print("Digite aqui:");
      texto = sc.nextLine();
    } while(!texto.equalsIgnoreCase("Sair"));

    sc.close();
  }
}
