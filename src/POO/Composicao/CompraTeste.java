package POO.Composicao;

public class CompraTeste {
  public static void main(String[] args) {
    
    Compra c1 = new Compra();
    c1.cliente = "Arthur Sousa";
    c1.adicionarItem(new Item("Notebook", 2, 4300));
    c1.adicionarItem(new Item("Celular", 1, 2400));
    c1.adicionarItem(new Item("Monitor", 3, 3500));

    System.out.println(c1.itens.size());
    System.out.println(c1.obterValorTotal());

  }
}
