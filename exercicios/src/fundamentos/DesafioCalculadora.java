package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor 1");
		double valor1 = Double.parseDouble(entrada.nextLine());
		
		System.out.println("Digite o valor 2");
		double valor2 = Double.parseDouble(entrada.nextLine());
				
		System.out.println("Digite a operação");
		String operacao = entrada.nextLine();

		double resultado = operacao.equals("+") ? valor1 + valor2 
				: operacao.equals("-") ?  valor1 - valor2 
				: operacao.equals("*") ? valor1 * valor2
				: operacao.equals("/") ? valor1 / valor2
				: operacao.equals("%") ? valor1 % valor2
				: 0;
		
		System.out.println("O resultado é: " + resultado);
		entrada.close();
	}
}
