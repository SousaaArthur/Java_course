package EstruturaDeControles02.Exercicios;

import java.util.Scanner;
import java.util.Random;

public class Exercicio06 {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  Random random = new Random();
  int numRandom = random.nextInt(100);

  int attempt = 10;
  int num;
  int exite = 1;

  do{
    System.out.print("Insira um número de 0 a 100: ");
    num = sc.nextInt();

    if (attempt == 0) {
      exite = 0;
      System.out.println("Você perdeu!!! Acabou o número de tentativas...");
    }

    if (num <= 100 && num >= 0) {
      attempt--;
      System.out.println("Tentativas restante: " + attempt);
      if (num > numRandom){
        System.out.println("O número é menor que " + num);
      } else if (num == numRandom){
        System.out.println("Parabéns, você ganho!!! O número era " + numRandom);
        exite = 0;
      } else{
        System.out.println("O número é maior que " + num);
      }
    } else {
      System.out.println("Insira um número entre 0 a 100...");
    }

  } while(exite != 0);

  sc.close();
}
}
