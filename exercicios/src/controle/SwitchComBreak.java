package controle;

public class SwitchComBreak {
	public static void main(String[] args) {
		int nota = 0;
		String conceito = "";
		switch (nota) {
		case 10: case 9: 
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1:
			conceito = "E";
			break;
		case 0:
			conceito = "F";
			break;
		}
		
		System.out.println("O conceito é: " + conceito);
	}
}
