package Fundamentos;
public class OperadoresTernario {
  public static void main(String[] args) {
    double media = 4.6;
    String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
    String resultadoFinal = media >= 7.0 ? "aprovado" : resultadoParcial;
    System.out.println("O aluno está " + resultadoFinal);

    double nota = 9.9;
    boolean bomComportamento = true;
    boolean passouPorMedia = nota >= 7;
    boolean temDesconto = bomComportamento && passouPorMedia;
    String resultado = temDesconto ? "sim" : "não";

    System.out.println("Tem desconto? " + resultado);
  }
}