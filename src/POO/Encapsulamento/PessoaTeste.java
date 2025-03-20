package POO.Encapsulamento;

public class PessoaTeste {
  public static void main(String[] args) {

    Pessoa p1 = new Pessoa("Arthur",  "Sousa", 21);
    p1.setIdade(18);

    System.out.println(p1.getIdade());
    System.out.println(p1);
  }
}
