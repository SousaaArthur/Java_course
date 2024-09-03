public class TipoString {
	public static void main(String[] args) {
		
		System.out.println("Olá, pessoal".charAt(5));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		s = "Bom dia";
		
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("bom"));
		System.out.println(s.toLowerCase().startsWith("bom"));
		System.out.println(s.endsWith("dia"));
		System.out.println(s.length());
		System.out.println(s.equals("bom dia"));
		System.out.println(s.equalsIgnoreCase("bom dia"));

		var name = "Pedro";
		var lastname = "Santos";
		var age = 33;
		var wage = 12432.857;

		System.out.println("Nome: " + name + "\nSobrenome: " + lastname + "\nIdade: " + age + "\nSalario: " + wage);
		System.out.printf("O %s %s tem %d anos e ganha R$%.2f de salario!", name, lastname, age, wage);
		
		String frase = String.format("\nO %s %s tem %d anos e ganha R$%.2f de salario!", name, lastname, age, wage);
		System.out.println(frase);

		System.out.println("Qualquer frase".contains("Qual"));
		System.out.println("Qualquer frase".indexOf("Qual"));
		System.out.println("Qualquer frase".substring(9, 14));
	}
}
