package Arrays_e_Collections.Colecoes;

import java.util.HashSet;

public class Hash {
  public static void main(String[] args) {
    
    HashSet<Usuario> usuarios = new HashSet<>();

    usuarios.add(new Usuario("Sousa"));
    usuarios.add(new Usuario("Araújo"));
    usuarios.add(new Usuario("Arthur"));

    boolean resultado = usuarios.contains(new Usuario("Arthur"));
    System.out.println(resultado);
  }
}
