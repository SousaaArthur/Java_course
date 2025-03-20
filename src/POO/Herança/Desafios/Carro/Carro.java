package POO.Herança.Desafios.Carro;

public class Carro {

  public final int VEL_MAX;
  public int vel = 0;
  public int delta = 5;

  public Carro(int velMax){
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
