package Arrays_e_Collections;

import java.util.Arrays;

public class Arrays01 {
  public static void main(String[] args) {
    double[] notasAluno = new double[4];

    notasAluno[0] = 7.9;
    notasAluno[1] = 8;
    notasAluno[2] = 6.7;
    notasAluno[3] = 5.5;

    System.out.println(Arrays.toString(notasAluno));
    Arrays.toString(notasAluno);

    double totalA = 0;
    for(int i = 0; i < notasAluno.length; i++){
      totalA += notasAluno[i];
    }

    System.out.println(totalA / notasAluno.length);

    double[] notasAlunoB = {6.3, 8.6, 9.9, 2.4};

    int totalB = 0;
    for(int i = 0; i < notasAlunoB.length; i++){
      totalB += notasAlunoB[i];
    }

    System.out.println(totalB / notasAlunoB.length);
  }
}
