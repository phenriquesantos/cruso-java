package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String args[]) {
		// FINAL CONSTANTE
		final double PI = 3.14159;
		
		// DOUBLE = FLOAT
		double raio = 3;
		double area = PI * raio * raio;
		System.out.println("Área = " + area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area); 	
	}
	
}
