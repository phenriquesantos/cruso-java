package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s)); // Compara só o conteudo da variavel
		
		Scanner entrada = new Scanner(System.in);
		// String s2 = entrada.next(); O método next já retira os espaços em branco
		String s2 = entrada.nextLine(); // o nextLine n retira os espaços em branco
		System.out.println("2" == s2);
		System.out.println("2".equals(s2.trim())); // Trim remove espaços em branco
		entrada.close();
	}
}
