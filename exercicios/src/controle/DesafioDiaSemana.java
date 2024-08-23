package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o dia da semana: ");
		String day = in.nextLine();
		
		// TEM UMA FUNÇÃO CHAMADA equalsIgnoreCase que ai n precisa deixar a string maiscula ou minuscula
		if(day.toLowerCase().equals("domingo")) {
			System.out.println(1);
		} else if (day.toLowerCase().equals("segunda")) {
			System.out.println(2);
		} else if (day.toLowerCase().equals("terça")) {
			System.out.println(3);
		} else if (day.toLowerCase().equals("quarta")) {
			System.out.println(4);
		} else if (day.toLowerCase().equals("quinta")) {
			System.out.println(5);
		} else if (day.toLowerCase().equals("sexta")) {
			System.out.println(6);
		} else if (day.toLowerCase().equals("sábado")) {
			System.out.println(7);
		} else {
			System.out.println("Dia invalido bobão");
		}
		
		System.out.println("Acabou mt ez");
		in.close();
	}
}
