package Fundamentos01;
public class NotacaoPonto {

	public static void main(String[] args) {

		String s = "Bom dia X";

		s = s.toUpperCase();
		System.out.println(s);

		s = s.replace("X", "Senhora");
		System.out.println(s);

		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);

	String x = "Arthur".toUpperCase();
	System.out.println(x);

		String y = "Bom dia X"
			.replace("X", "Arthur")
			.toUpperCase()
			.concat("!!!");
		System.out.println(y);

	}

}
