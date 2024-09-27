package ClassesEMetodos;

public class Data {
  int dia;
  int mes;
  int ano;

  Data(){
    dia = 1;
    mes = 1;
    ano = 1970;
  }

  Data(int diaInicial, int mesInicial, int anoInicial){
    dia = diaInicial;
    mes = mesInicial;
    ano = anoInicial;
  }

  String dateFormatted(){
    return String.format("%02d/%02d/%02d", dia, mes,ano);
  }

  void printDateFormatted(){
    System.out.println(dateFormatted());
  }

}