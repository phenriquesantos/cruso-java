package fundamentos;

public class FahrenheitToGraus {
	
	public static void main(String args[]) {
		final double FMIN = 32;
		double f = 150.3;
		double c = (f - FMIN) * 5 / 9;
		System.out.println("Temperatura em graus: " + c);
	}
}
