package fundamentos;

public class ConersaoTiposPrimitivosNumericos {
	
	public static void main(String[] args) {
		double a = 1;
		System.out.println(a);
		
		float b = (float) 1.12354564; // Conversão explicita
		System.out.println(b);
		
		int c = 129;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999;
		int f = (int) e;
		System.out.println(f);
	}
}
