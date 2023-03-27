package fundamentos;

import org.w3c.dom.css.CSSFontFaceRule;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		final double FATOR = 5 / 9.0;
		final double AJUSTE = 32;
		
		double  fahrenheit = 86;
		double celcius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celcius + " °C ");
		
		fahrenheit = 150;
		celcius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celcius + " °C ");
	}
}
