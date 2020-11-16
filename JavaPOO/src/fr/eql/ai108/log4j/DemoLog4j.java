package fr.eql.ai108.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoLog4j {
	
	final static Logger LOGGER = LogManager.getLogger();

	public static void main(String[] args) {

		LOGGER.debug("Un log utile uniquement pendant la phase de développement");
		LOGGER.info("Un log informatif");
		LOGGER.warn("un log d'alerte pas trop méchant");
		LOGGER.error("Un log pour signaler une erreur qui n'a pas fait crasher l'application");
		LOGGER.fatal("Un log qui signale une erreur fatale susceptible de faire crasher l'application");

	}

}
