package POO.Herança.Desafios.Carro;

public class Ferrari extends Carro{

  public Ferrari(){
    this(315);
  }

  public Ferrari(int velMax){
    super(velMax);
  }

  public void acelerar(){
    vel+=10;
  }
}
