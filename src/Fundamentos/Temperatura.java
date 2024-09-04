package Fundamentos;
import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		// (ºF - 32(Ajuste) * 5/9.0(Fator) = ºC
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---> Conversor de Fahrenheit <---");
		System.out.print("Insira um valor: ");
		int fahrenheit = sc.nextInt();
		
		final int ajuste = 32;
		final double fator = 5 / 9.0;
		
		double result = (fahrenheit - ajuste) * fator;
		
		System.out.println(fahrenheit + " Fahreheit" + " = " + result + " Degree Celsius");
		
		sc.close();
	}
}
