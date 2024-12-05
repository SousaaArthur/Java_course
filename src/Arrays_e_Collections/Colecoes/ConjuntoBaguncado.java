package Arrays_e_Collections.Colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
  public static void main(String[] args) {
    
    HashSet conjunto = new HashSet();

    conjunto.add(1.2);
    conjunto.add(true);
    conjunto.add("Teste");
    conjunto.add(10);
    conjunto.add('x');

    System.out.println("Tamanho é " + conjunto.size());

    conjunto.add("teste");
    conjunto.add('x');

    System.out.println("Tamanho é " + conjunto.size());

    System.out.println(conjunto.remove("Teste"));
    System.out.println(conjunto.remove('x'));

    System.out.println("Tamanho é " + conjunto.size());

    System.out.println(conjunto.contains('x'));
    System.out.println(conjunto.contains(1));
    System.out.println(conjunto.contains(true));

    HashSet nums = new HashSet();

    nums.add(1);
    nums.add(2);
    nums.add(3);

    System.out.println(nums);
    System.out.println(conjunto);

    conjunto.addAll(nums); // União entre dois conjuntos
    conjunto.retainAll(nums); // Interseção entre dois conjuntos

    conjunto.clear();
    System.out.println(conjunto);

  }
}
