package EstruturaDeControles02;

public class BreakRotulado {
  public static void main(String[] args) {
    exeterno: for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (i == 1) {
          break exeterno;
        }

        System.out.printf("[%d %d] ", i, j);
      }
      System.out.println();
    }
  }
}
