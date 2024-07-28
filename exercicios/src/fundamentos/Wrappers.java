package fundamentos;

// import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		
		// Scanner entrada = new Scanner(System.in);
		
		// Se definir os tipos primitivos com a primeira letra em Maisculo deixa de ser um tipo primitivo e vira um objeto pqp
		// Chamam isso de Wrapper
		Byte b = 100;
		Short s = 1000;
		
		// Integer.parseInt(entrada.next());
		Integer i = 1000;
		Long l =  10000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(l);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 12345.5678;
		System.out.println(d);
		
		// entrada.close();
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo.toString().toUpperCase());
		
		// O tipo literal dessa porra é com aspas simples se usar aspas duplas saporra reconhece como sendo um tipo string
		// Cada vez mais acho que isso é coisa de noia
		Character c = 'c';
		System.out.println(c);
	}
}
