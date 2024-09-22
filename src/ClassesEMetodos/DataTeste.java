package ClassesEMetodos;

public class DataTeste {
  public static void main(String[] args) {
    Data d1 = new Data();
    d1.dia = 19;
    d1.mes = 9;
    d1.ano = 2024;

    Data d2 = new Data();
    d2.dia = 2;
    d2.mes = 5;
    d2.ano = 2004;

    String date1 = d1.dateFormatted();
    System.out.println(date1);
    String date2 = d2.dateFormatted();
    System.out.println(date2);
  }
}
