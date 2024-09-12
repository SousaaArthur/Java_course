package Fundamentos01;
public class TiposPremitivos {
	public static void main(String[] args) {
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		
		boolean estarDeFerias = false;
		
		char sexo = 'M';
		
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numeroDeVoos / 2);	
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estarDeFerias);
		System.out.println("Sexo: " + sexo);
	}
}