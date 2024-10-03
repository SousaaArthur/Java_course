package ClassesEMetodos;

public class Data {
  int dia;
  int mes;
  int ano;

  Data(){
    // dia = 1;
    // mes = 1;
    // ano = 1970;
    this(1, 1, 1970);
  }

  Data(int dia, int mes, int ano){
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  String dateFormatted(){
    final String formato = "%02d/%02d/%02d";
    return String.format(formato, dia, mes,ano);
  }

  void printDateFormatted(){
    System.out.println(this.dateFormatted());
  }

}