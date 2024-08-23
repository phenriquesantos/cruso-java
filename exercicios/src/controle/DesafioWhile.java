package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double note = 0;
		int totalNotes = 0;
		int countNotes = 0;
		while(note != -1) {
			System.out.print("Digite a nota ou -1 para sair: ");
			note = in.nextDouble();
			if(note <= 10 && note >= 0) {
				totalNotes += note;
				countNotes++;
			} else if(note != -1) {
				System.out.println("Nota invalida!");
			}
		}
		
		double average = totalNotes / countNotes;
		
		System.out.printf("Você digitou %d notas válidas\n", countNotes);
		System.out.printf("A média é %.2f", average);
		in.close();
	}
}
