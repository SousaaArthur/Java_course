package Classes;

public class ProdutoTeste {
  public static void main(String[] args) {
    Produto p1 = new Produto();
    p1.name = "Notebook";
    p1.price = 4356.89;
    p1.discount = 0.25;
    var p2 = new Produto();

    p2.name = "Iphone 16";
    p2.price = 15899.99;
    p2.discount = 0.29;

    System.out.println(p1.name);
    System.out.println(p2.name);

    double finalPrice1 = p1.price * (1 - p1.discount);
    double finalPrice2 = p2.price * (1 - p2.discount);

    System.out.println((finalPrice1 + finalPrice2) / 2);
  }
}
