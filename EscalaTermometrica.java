package fundamentos;

public class EscalaTermometrica {
//Exercicio para converter temperatura
	public static void main(String[] args) {
		final double ajustef = 32;
		final double ajustek = 273;
		final double fator = 5.0/9.0;
		double c = -40;
		double f = (c - ajustef)*fator;
		double k = c + ajustek;
		
		System.out.println("O valor da temperatura " + c + "oC na escala Fahrenheit e: " + f + "oF.");
		System.out.println("A temperatura " + c + "oC na escala Kelvin vale: " + k + "K.");
	
		
	}
}
