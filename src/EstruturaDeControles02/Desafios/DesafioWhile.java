package EstruturaDeControles02.Desafios;

import java.util.Scanner;

public class DesafioWhile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int nota = 0;
    int total = 0;
    int notaDigitadas = 0;
    double media;

    System.out.println("Calculadora de média de nota: " + "\nDigite '-1' para sair.");

    while (nota != -1) {
      System.out.print("Digite uma nota: ");
      nota = sc.nextInt();
      if (nota >= 0 && nota <= 10){
        total += nota;
        notaDigitadas++;
        media = total / notaDigitadas;
        System.out.println(
          "Soma das notas: " + total +
          "\nNota digitadas: " + notaDigitadas +
          "\nMédia: " + media
        );
      } else if (nota == -1){
        System.out.println("Saindo...");
      } else {
        System.out.println("Nota invalida! Digite uma nova nota!!!");
      }
    }

    sc.close();
  }
}
