package ClassesEMetodos;

public class DataTeste {
  public static void main(String[] args) {
    Data d1 = new Data(2, 4, 2004);

    Data d2 = new Data();
    d2.dia = 2;
    d2.mes = 5;


    String date1 = d1.dateFormatted();
    System.out.println(date1);
    String date2 = d2.dateFormatted();
    System.out.println(date2);
  }
}
