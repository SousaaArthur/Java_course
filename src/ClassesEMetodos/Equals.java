package ClassesEMetodos;

import java.util.Date;

public class Equals {
  public static void main(String[] args) {
    
    Usuario u1 = new Usuario();
    u1.nome = "Arthur Sousa";
    u1.email = "sousa@email.com";

    Usuario u2 = new Usuario();
    u2.nome = "Arthur Sousa";
    u2.email = "sousa@email.com";

    System.out.println(u1 == u2);
    System.out.println(u1.equals(u2));
    System.out.println(u2.equals(u1));
    System.out.println(u2.equals(new Date()));
  }
}
