package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salário");
		String salario1 = entrada.nextLine().replace(',', '.');
		
		System.out.println("Digite o egundo salário");
		String salario2 = entrada.nextLine().replace(',', '.');
		
		System.out.println("Digite o terceiro salário");
		String salario3 = entrada.nextLine().replace(',', '.');
		
		float soma = Float.parseFloat(salario1)
				+Float.parseFloat(salario2)
				+Float.parseFloat(salario3);
		
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + soma / 3);
		
		entrada.close();
	}
}
