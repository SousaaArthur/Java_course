package ClassesEMetodos;

public class Produto {
  String name;
  double price;
  double discount;

  double precoComDesconto() {
    return price * (1 - discount);
  }

  double precoComDesconto(double descontoDoGerente) {
    return price * (1 - (discount + descontoDoGerente));
  }

}
