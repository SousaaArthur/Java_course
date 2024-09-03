import java.util.Scanner;

public class Wrapper {
  public static void main(String[] args) {
    
    // Byte
    Byte b = 100; 
    // Short
    Short s = 1000;
    // Integer
    Integer i = 10000;
    // Long 
    Long l = 10000000L;

    System.out.println(b.byteValue());
    System.out.println(s.toString().concat("A"));

    System.out.println(l);

    Float f = 123.0F;
    System.out.println(f);

    Double d = 1234.5678;
    System.out.println(d);

    Boolean bo = Boolean.parseBoolean("True");
    System.out.println(bo);
    System.out.println(bo.toString().toUpperCase());

    Character c = '#';

    System.out.println(c + "....");

    Scanner sc = new Scanner(System.in);


    i = Integer.parseInt(sc.next());
    System.out.println(i * 3);

    sc.close();
  }
}
