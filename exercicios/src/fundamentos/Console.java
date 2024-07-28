package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		// Print que não pula linha
		System.out.print("Bom");
		
		// \n Tmb quebra a linha como nas outra linguagens
		System.out.print(" Dia \n");
		
		// Print que pula linha
		System.out.println("Bom");
		System.out.println("Dia!!");
		
		// Print formatado
		// %d tipo inteiro
		// %n funciona como quebra de linha no printf
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1,2,3,4,5,6);
		
		// %.1f tipo float o número anted da letra f é a quantidade de casas decimais que serão exibidas
		// Ele também vai arrendondar o número
		System.out.printf("Salário: %.1f%n", 1234.5678);
		
		// %s tipo string
		System.out.printf("Nome: %s%n", "João");
		
		// Entrda de dados
		// Obs: Não lembro de ver visto saporra de Scanner quando estudei a primeira vez
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu nome: ");
		String sobrenome = entrada.nextLine();
		
		// Pra pegar int tem que pssar o nextInt existem funções para pegar os outros tipos
		// OBS: N sei pq saporra n converte na hora de pegar igual outras linguagens
		System.out.print("Digite o seu nome: ");
		int idade = entrada.nextInt();
		
		System.out.printf("Nome = %s %s tem %d anos.", 
				nome, sobrenome, idade);

		// Scanner precisa ser fechado
		entrada.close();
	}
}
