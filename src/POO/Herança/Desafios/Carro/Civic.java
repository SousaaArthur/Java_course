package POO.Herança.Desafios.Carro;

public class Civic extends Carro {

  Civic(){
    this(289);
  }

  Civic(int velMax){
    super(velMax);
  }
  
  public void acelerar(){
    vel+=10;
  }
}
