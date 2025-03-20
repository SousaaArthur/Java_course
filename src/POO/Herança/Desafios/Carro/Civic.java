package POO.Herança.Desafios.Carro;

public class Civic extends Carro {

  public Civic(){
    this(289);
  }

  public Civic(int velMax){
    super(velMax);
  }
  
  public void acelerar(){
    vel+=10;
  }
}
