package Fundamentos01.Exercicios;

public class DesafioLogioco {
  public static void main(String[] args){
    // Trabalho na terça (V ou F)
    // Trabalho na quinta (V ou F)
    // Trabalho quinta == Verdadeiro { Comprar tv de 32 polegadas tomar sorvete}
    // Trabalho Terça == Verdadeiro { Comprar tv de 32 polegadas tomar sorvete} 
    // Trabalho terça && Trabalho quinta {Comprar tv de 50 polegadas e tomar sorvete}
    // Trabalho terça == Falso && Trabalho quinta == Falso {Sem tv e sem sorvete}

    Boolean jobTuesday = false;
    Boolean jobThursday = true;

    boolean boughtTv50 = jobTuesday && jobThursday;
    boolean boughtTv32 = jobTuesday ^ jobThursday;
    
    boolean iceCream = jobTuesday || jobThursday;

    System.out.println(
      "Conseguiu trabalho Terça? " + jobTuesday +
      "\nConseguiu trabalho Terça? " + jobThursday +
      "\nComprou Tv 50\"? " + boughtTv50 +
      "\nComprou Tv 32\"? " + boughtTv32 +
      "\nTomou sorvete com a familia? " + iceCream +
      "\nMais saudável? " + !iceCream
      );
  }
} 
