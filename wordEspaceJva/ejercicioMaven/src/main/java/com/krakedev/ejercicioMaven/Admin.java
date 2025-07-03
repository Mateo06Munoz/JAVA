package com.krakedev.ejercicioMaven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
	private static Logger logger=LogManager.getLogger(Admin.class);
	
	public void agregar() {
		logger.warn("mendaje de warn");
		logger.info("mendaje de info");
		logger.debug("mendaje de debug");
		logger.trace("mendaje de trace");	
		
		logger.error("mendaje de error");
	}

}
