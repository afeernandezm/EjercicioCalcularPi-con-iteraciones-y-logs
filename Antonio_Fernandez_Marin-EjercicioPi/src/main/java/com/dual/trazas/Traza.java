package com.dual.trazas;

import org.slf4j.Logger;

/**
 * Esta clase se usa para daar facilidad y comodidad al uso de los log
 * pudiéndo cambiar la lína de declaración del logger en cada clase
 *  por un objeto de esta clase.
 */
import org.slf4j.LoggerFactory;

public class Traza {
	public static final String INFO = "i";
	public static final String DEBUG = "d";
	public static final String TRACE = "t";
	public static final String ERROR = "e";
	private Logger logger;
	static Traza traza = new Traza(Traza.class);

	public Traza(Class cls) {
		this.logger = LoggerFactory.getLogger(cls);
	}

	public void escribe(String mensaje) {
		escribe(INFO, mensaje);
	}

	public void escribe(String nivel, String mensaje) {

		switch (nivel) {
		case INFO:

			logger.info("Mensaje: " + mensaje);
			break;
		case DEBUG:

			logger.debug("Mensaje: " + mensaje);

			break;

		case TRACE:

			logger.trace("Mensaje: " + mensaje);
			break;
		case ERROR:
			logger.error("Mensaje: "+mensaje);
		default:

			logger.info("Mensaje: " + mensaje);
		}

	}

}
