package fundamentos.operadores;

public class Aritimeticos {
	public static void main(String[] args) {
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x / y);
		System.out.println(x * y);
		System.out.println(x % y);
		
		int a = 8;
		int b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a / (double) b); // Se fazer cast saporra trás as casas decimais
		System.out.println(a * b);
		System.out.println(a % b);
	}
}
