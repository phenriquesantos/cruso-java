package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = false;
		boolean tv50 = trabalhoTerca && trabalhoQuinta;
		boolean tv32 = trabalhoTerca ^ trabalhoQuinta;
		boolean sorvete = tv50 || tv32;
		
		System.out.println("Vai ao shopping: " + (trabalhoTerca || trabalhoQuinta));
		System.out.println("TV 50 polegadas: " + tv50);
		System.out.println("TV 32 polegadas: " + tv32);
		System.out.println("Tomou sorvete ? " + sorvete);
		System.out.println("Familia saudavel ? " + !sorvete);	
	}
}
