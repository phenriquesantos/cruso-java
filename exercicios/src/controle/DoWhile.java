package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = "";
		do {
			System.out.println("Se tu quer sair");
			System.out.println("Diga as palavras mágicas meu filho");
			text = in.nextLine();
		} while(!"Por Favor".equalsIgnoreCase(text));
		System.out.println("Aprendeu né fdp");
		in.close();
	}
}
