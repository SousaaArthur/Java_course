package ClassesEMetodos;

public class ProdutoTeste {
  public static void main(String[] args) {
    Produto p1 = new Produto("Notebook", 4356.89);

    var p2 = new Produto();  
    p2.name = "Iphone 16";
    p2.price = 15899.99;

    Produto.discount = 0.29;

    System.out.println(p1.name + " " + p1.precoComDesconto());
    System.out.println(p2.name + " " + p2.precoComDesconto());

    double finalPrice1 = p1.precoComDesconto();
    double finalPrice2 = p2.precoComDesconto(0.5);
    double mediaCarrinho = (finalPrice1 + finalPrice2)/2;

    System.out.printf("Média do carrinho = R$%.2f", mediaCarrinho);
  }
}
