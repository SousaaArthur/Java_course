package Arrays_e_Collections.Colecoes;

import java.util.ArrayList;

public class Lista {
  public static void main(String[] args) {
    ArrayList<Usuario> lista = new ArrayList<>();

    Usuario u1 = new Usuario("Arthur");
    lista.add(u1);

    lista.add(new Usuario("Robin"));
    lista.add(new Usuario("Clay"));
    lista.add(new Usuario("Jhonatan"));
    lista.add(new Usuario("Karl"));

    System.out.println(lista.get(0));

    System.out.println(">>>>" + lista.remove(1));
    System.out.println(lista.remove(new Usuario("Karl")));

    System.out.println("tem? " + lista.contains(new Usuario("Clay")));

    for(Usuario u: lista) {
      System.out.println(u.nome);
    }

  }
}
