package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
  public static void main(String[] args) {
    
    String value1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
    String value2 = JOptionPane.showInputDialog("Digite o segundo número: ");

    System.out.println(value1 + value2);

    double num1 = Double.parseDouble(value1);
    double num2 = Double.parseDouble(value2);

    double sum = num1 + num2;
    System.out.println("Soma é: " + sum);
    System.out.println("Média é: " + sum / 2);

  }
}
