package POO.Herança.Desafios.Carro;

public class Carro {

  final int VEL_MAX;
  int vel = 0;
  int delta = 5;

  Carro(int velMax){
    VEL_MAX = velMax;
  }

  public void acelerar(){
    if(vel + delta > VEL_MAX){
      vel = VEL_MAX;
    } else {
      vel+=delta;
    }
  }

  public void frear(){
    if(vel > 0){
      vel-=delta;
    }
  }
}
