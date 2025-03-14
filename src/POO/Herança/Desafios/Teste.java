package POO.Herança.Desafios;

public class Teste {
  public static void main(String[] args) {
    System.out.println("CARRO GENÉRICO");
    Carro c1 = new Carro();
    c1.acelerar();
    c1.acelerar();
    c1.acelerar();
    System.out.println("Velocidade: " + c1.vel + "km");
    c1.frear();
    c1.frear();
    System.out.println("Velocidade: " + c1.vel + "km");
    c1.frear();
    c1.frear();
    c1.frear();
    System.out.println("Velocidade: " + c1.vel + "km");

    System.out.println("\nHONDA CIVIC");
    Civic civic = new Civic();
    civic.acelerar();
    civic.acelerar();
    System.out.println("Velocidade: " + civic.vel + "km");
    civic.frear();
    civic.frear();
    civic.frear();
    System.out.println("Velocidade: " + civic.vel + "km");
    civic.frear();
    civic.frear();
    System.out.println("Velocidade: " + civic.vel + "km");

    System.out.println("\nFERRARI");
    Ferrari ferrari = new Ferrari();
    ferrari.acelerar();
    ferrari.acelerar();
    System.out.println("Velocidade: " + ferrari.vel + "km");
    ferrari.frear();
    ferrari.frear();
    ferrari.frear();
    ferrari.frear();
    System.out.println("Velocidade: " + ferrari.vel + "km");
    ferrari.frear();
    ferrari.frear();
    ferrari.frear();
    ferrari.frear();
    System.out.println("Velocidade: " + ferrari.vel + "km");
  }
}
