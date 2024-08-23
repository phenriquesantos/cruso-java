package controle;

public class For1 {
	public static void main(String[] args) {
		for (int contador = 1; contador <= 10; contador++) {
			System.out.printf("i = %d\n", contador);
		}
		
		System.out.println("------- GAMBIARRA ABAIXO");
		
		int x = 2;
		for(;x <= 10;) {
			System.out.printf("x = %d\n", x);
			x++;
		}
	}
}
