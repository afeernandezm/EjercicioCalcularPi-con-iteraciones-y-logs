package com.dual.trazas;

import org.slf4j.LoggerFactory;

/**
 * @author Antonio.Fernández 
 * @since 20/04/2022
 */

public class Pi {

	public static double valorFPi;

	static Traza traza = new Traza(Pi.class);

	private static double calcPi(final int iterations) {

		double retorno;
		double x;
		double y;
		int successCount = 0;
		traza.escribe(Traza.INFO, "El valor de pi por cada iteraccion es: ");
		for (int i = 0; i <= iterations; i++) {
			x = Math.random();
			y = Math.random();
			if ((Math.pow(x, 2) + Math.pow(y, 2)) <= 1) {
				successCount++;
			}
			retorno = (double) (4 * successCount) / iterations;
			traza.escribe(Traza.INFO, "Valor de la iteración: " + retorno);
		}
		retorno = (double) (4 * successCount) / iterations;

		return retorno;
	}

	public static void main(String[] args) {
		traza.escribe(Traza.INFO, "Entramos en el main");
		Pi pi = new Pi();
		traza.escribe(Traza.DEBUG, "Calculo pi con iteraciones");
		valorFPi = pi.calcPi(1000000);

		UtilidadesFicheros.calcularValorPi(valorFPi);
		traza.escribe(Traza.INFO, "Salimos de main");
	}
}
