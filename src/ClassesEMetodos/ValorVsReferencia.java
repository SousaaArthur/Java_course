package ClassesEMetodos;

public class ValorVsReferencia {
  public static void main(String[] args) {
    
    double a = 2;
    double b = a;

    a++;
    b--;

    System.out.println(a + " " + b);

    Data d1 = new Data(1, 6, 2024);
    Data d2 = d1; // Atribuição por referencia

    d1.dia = 31;
    d2.mes = 12;
    d1.ano = 2025;

    System.out.println(d1.dateFormatted());
    System.out.println(d2.dateFormatted());

    voltarDataParaValorPadrao(d1);

    System.out.println(d1.dateFormatted());
    System.out.println(d2.dateFormatted());

    int c = 5;
    alterarPrimitivo(c);
    System.out.println(c);

  }

  static void voltarDataParaValorPadrao (Data d){
    d.dia = 1;
    d.mes = 1;
    d.ano = 1970;
  }

  static void alterarPrimitivo(int a){
    a++;
  }

}
