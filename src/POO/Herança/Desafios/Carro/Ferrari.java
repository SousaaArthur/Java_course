package POO.Herança.Desafios.Carro;

public class Ferrari extends Carro{

  Ferrari(){
    this(315);
  }

  Ferrari(int velMax){
    super(velMax);
  }

  public void acelerar(){
    vel+=10;
  }
}
