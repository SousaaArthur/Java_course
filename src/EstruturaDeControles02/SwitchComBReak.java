package EstruturaDeControles02;

import java.util.Scanner;

public class SwitchComBReak {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String conceito = "";
    System.out.print("Informe a nota: ");
    int nota = sc.nextInt();

    switch (nota) {
      case 10, 9:
        conceito = "A";
        break;
      case 8, 7:
        conceito = "B";
        break;
      case 6, 5:
        conceito = "C";
        break;
      case 4, 3:
      conceito = "D";
      break;
      case 2, 1:
      conceito = "E";
      break;
      default:
        conceito = "Não infomado!";
        break;
    }
    System.out.println("Conceito é " + conceito );
    sc.close();
  }
}
