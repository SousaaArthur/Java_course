package POO.Herança.Desafios;

public class Carro {
  int vel = 0;

  public void acelerar(){
    vel+=5;
  }

  public void frear(){
    if(vel > 0){
      vel-=5;
    }
  }
}
