package EstruturaDeControles02.Exercicios;

import java.util.Scanner;

public class Exercicio06 {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  int randomValue = 46;
  int attempt = 10;
  int num;

  do{
    System.out.println("Insira um número de 0 a 100: ");
    num = sc.nextInt();


    if (num <= 100 || num <= 0) {
      if (num > randomValue){
        System.out.println("O número é menor que " + num);
      } else{
        System.out.println("O número é maior que " + num);
      }
    } else {
      System.out.println("Insira um número entre 0 a 100...");
    }

    attempt--;
    System.out.println("Tentativas restante: " + attempt);

  } while(attempt != 0);

  sc.close();
}
}
