package ClassesEMetodos.Desafio;

public class Jantar {
  public static void main(String[] args) {
    Comida c1 = new Comida("Arroz", 0.225);
    Comida c2 = new Comida("Feijão", 0.300);
    Pessoa p1 = new Pessoa("Arthur", 75.00);

    final double pesoInicial = p1.peso;
    p1.comer(c1);
    p1.comer(c2);

    System.out.printf("Peso inicial: %.2fKg%n", pesoInicial);
    System.out.printf("Peso final: %.2fKg", p1.peso);
  }
}
