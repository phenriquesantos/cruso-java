package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Tipos numericos inteiros
		byte anosEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		System.out.println("ID: " + id + " - Pontos acumulados: " + pontosAcumulados);
		System.out.println("O Funcionário tem: " + anosEmpresa + " Anos de empresa e seu número de voos é: " + numeroDeVoos);
		
		
		// Tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.81;
		System.out.println("Salário: " + salario + " - Vendas acumuladas: " + vendasAcumuladas);
		
		// Tipo boolean
		boolean estaDeFerias = false;
		
		// Tipo char
		char status = 'a'; // ativo
		
		System.out.println("Está de férias: " + estaDeFerias + " - Status: " + status);
	}
}
