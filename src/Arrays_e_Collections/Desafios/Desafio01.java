package Arrays_e_Collections.Desafios;

import java.util.Scanner;

public class Desafio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira a quantidade de notas: ");
    int quant = sc.nextInt();

    double[] notas = new double[quant];

    for(int i = 0; i < quant; i++){
      System.out.print("Digite a nota do aluno: ");
      notas[i] = sc.nextDouble();
    }

    double sum = 0;

    for(double nota:notas){
      sum += nota;
    }

    double media = sum / quant;

    System.out.printf("A media das notas é: %.2f", media);

    sc.close();
  }
}
