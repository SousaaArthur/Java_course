package Arrays_e_Collections;

import java.util.Scanner;

public class Matriz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos alunos? ");
    int quantAluno = sc.nextInt();

    System.out.print("Quantos notas por alunos? ");
    int quantNotas = sc.nextInt();

    double[][] notasDaTurma = new double[quantAluno][quantNotas];

    double total = 0;
    for (int i = 0; i < notasDaTurma.length; i++){
      for (int j = 0; j < notasDaTurma[i].length; j++){
        System.out.printf("Informe a nota %d do aluno %d: ", i + 1, j + 1);
        notasDaTurma[i][j] = sc.nextDouble();
        total += notasDaTurma[i][j];
      }
    }

    double media = total / (quantAluno * quantNotas);
    System.out.printf("Media da turma: %.1f", media);

    for(double[] notasDoAluno : notasDaTurma){
      System.out.println(notasDoAluno);
    }

    sc.close();
  }
}
