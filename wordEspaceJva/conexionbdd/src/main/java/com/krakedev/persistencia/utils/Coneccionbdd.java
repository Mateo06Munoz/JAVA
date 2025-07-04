package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Coneccionbdd {
	private final static String DIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
	private final static String user = "postgres";
	private final static String password = "1727047720";
	private static final Logger LOGGER = LogManager.getLogger(Coneccionbdd.class);

	public static Connection conertar() throws Exception {
		Connection connettion = null;
		try {
			Class.forName(DIVER);
			connettion = DriverManager.getConnection(URL, user, password);
			LOGGER.debug("conexion exitosa");
		} catch (ClassNotFoundException e) {
			LOGGER.error("error en la infraestructura", e);
			throw new Exception("error en la infraestructura");
		} catch (SQLException e) {
			LOGGER.error("error al conectarse revise usuario y clave", e);
			throw new Exception("error al conectarse revise usuario y clave	");
		}
		return connettion;
	}

}
