package ClassesEMetodos;

public class AreaCir {
  double raio;
  final static double PI = 3.1415;

  AreaCir(double raioInicial){
    raio = raioInicial;
  }

  double area(){
    return PI * Math.pow(raio, 2);
  }
}