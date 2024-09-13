package EstruturaDeControles02.Desafios;

public class DesafioFor {
  public static void main(String[] args) {
    String valor = "#";
    for(int i = 1; i <=5; i++){
      System.out.println(valor);
      valor += "#";
    }

    for(String s = "#"; !s.equals("######"); s += "#"){
      System.out.println(s);
    }
  }
}
