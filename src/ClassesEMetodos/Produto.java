package ClassesEMetodos;

public class Produto {
  String name;
  double price;
  static double discount = 0.25;

  Produto(String nameInitial, double priceInitial) {
    name = nameInitial;
    price = priceInitial;
  }
  
  Produto() {
  }

  double precoComDesconto() {
    return price * (1 - discount);
  }

  double precoComDesconto(double descontoDoGerente) {
    return price * (1 - (discount + descontoDoGerente));
  }

}
