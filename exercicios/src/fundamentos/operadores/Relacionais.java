package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		int a = 97;
		int b = 97;
		
		System.out.println(a == b); // igual
		System.out.println(3 > 4); // maior
		System.out.println(3 >= 4); // maior ou igual
		System.out.println(3 < 7); // menor
		System.out.println(3 <= 7); // menor ou igual
		System.out.println(3 != 7); // diferente
		
		double nota = 7.3;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		System.out.println("Tem desconto? " + temDesconto);
	}
}
