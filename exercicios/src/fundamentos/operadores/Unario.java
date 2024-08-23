package fundamentos.operadores;

public class Unario {
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		a--; // a = a - 1
		
		++b; // b = b + 1
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		/* 
		 * Isso aqui da true por causa da precedencia de operadores 
		 * ele executa ++a primeiro
		 * depois compara com b
		 * e por fim executa b++
		 * 
		 * se tivesse ++b resultado seria false
		 * */
		System.out.println(++a == b++);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
	
}
