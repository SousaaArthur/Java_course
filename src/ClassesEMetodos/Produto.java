package ClassesEMetodos;

public class Produto {
  String name;
  double price;
  double discount;

  Produto(String nameInitial) {
    name = nameInitial;
  }

  Produto(String nameInitial, double priceInitial, double discountInitial) {
    name = nameInitial;
    price = priceInitial;
    discount = discountInitial;
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
