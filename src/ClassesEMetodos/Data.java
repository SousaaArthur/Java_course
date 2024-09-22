package ClassesEMetodos;

public class Data {
  byte dia;
  byte mes;
  int ano;

  String dateFormatted(){
    return String.format("%02d/%02d/%02d", dia, mes,ano);
  }
}
