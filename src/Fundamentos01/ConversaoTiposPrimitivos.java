package Fundamentos01;

public class ConversaoTiposPrimitivos {
  public static void main(String[] args) {
    
    double a = 1; // Converção implícita
    System.out.println(a);

    float b = (float) 1.12345; // Converção explícita (CAST)
    System.out.println(b);
    
    int c = 340;
    byte d = (byte) c; // Converção explícita (CAST)
    System.out.println(d);

    double e = 1;
    int f = (int) e;
    System.out.println(f);

  }
}
