package fundamentos.operadores;

public class DesafioAritimetico {
	
		public static void main(String[] args) {
			float a = (float)Math.pow( (1 - 5) * (2 - 7) / 2, 2 );
			float b = (float)Math.pow( ( 3 + 2 ) * 6, 2 ) / (3 * 2);
			float c = (float)Math.pow(b - a, 3);
			float d = (float)Math.pow(10, 3);
			System.out.println((float) c / d );
		}
	
}
