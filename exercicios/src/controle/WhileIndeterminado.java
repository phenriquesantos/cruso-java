package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String value = "";
		while(!value.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			value = in.nextLine();
			System.out.println("Você digitou: " + value);
		}
		System.out.println("Acabou desgraça");
		in.close();
	}
}
