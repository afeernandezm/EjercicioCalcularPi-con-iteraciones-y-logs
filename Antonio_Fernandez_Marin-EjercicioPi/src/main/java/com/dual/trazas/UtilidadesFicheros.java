package com.dual.trazas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Esta clase es la que pinta el archivo
 * calculo.txt
 */
public class UtilidadesFicheros {
	static Traza traza = new Traza(UtilidadesFicheros.class);

	public static void calcularValorPi(double valorPi) {

		String file = "logs/calculo.txt";

		try {
			FileWriter writer = new FileWriter(file);
			PrintWriter printer = new PrintWriter(file);
			traza.escribe(Traza.DEBUG, "Escribe en el fichero");
			printer.write("Valor Pi: " + valorPi);
			System.out.println(file);

			printer.close();
			writer.close();
		} catch (IOException ioe) {
			traza.escribe(Traza.ERROR, "Excepción");
			ioe.printStackTrace();
		}

	}
}
