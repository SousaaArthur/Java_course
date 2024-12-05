package Arrays_e_Collections.Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
  public static void main(String[] args) {

    Map<Integer, String> usuarios = new HashMap<>();

    usuarios.put(1, "Roberta");
    usuarios.put(2, "Arthur");
    usuarios.put(3, "Sousa");
    usuarios.put(4, "Larissa");


    System.out.println(usuarios.size());
    System.out.println(usuarios.isEmpty());
    System.out.println(usuarios.keySet());
    System.out.println(usuarios.values());
    System.out.println(usuarios.entrySet());
    System.out.println(usuarios.containsKey(4));
    System.out.println(usuarios.containsValue("Arthur"));
    System.out.println(usuarios.get(3));

    for(int chave: usuarios.keySet()){
      System.out.println(chave);
    }

    for(String valor: usuarios.values()){
      System.out.println(valor);
    }

    for(Entry<Integer, String> registro: usuarios.entrySet()){
      System.out.println(registro);
    }
  }
}
