package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.persona;
import com.krakedev.persistencia.utils.Coneccionbdd;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(persona persona) throws Exception {
		Connection conecion = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a insertar>>>> " + persona);
		// abrir la conexion
		try {
			conecion = Coneccionbdd.conertar();

			ps = conecion.prepareStatement(
					"insert into personas1(cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorro,fecha_nacimiento,hora_nacimiento)"
							+ "			values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setInt(5, persona.getNumeroH());
			ps.setDouble(6, persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidadA());
			ps.setDate(8, new java.sql.Date(persona.getFechaN().getTime()));
			ps.setTime(9, new Time(persona.getHoraN().getTime()));

			ps.executeUpdate();

		} catch (Exception e) {
			// logger el error
			LOGGER.error("error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			try {
				// cerrar la coneccion
				conecion.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void actualizar(persona p) throws Exception {
		String sql = "UPDATE personas1 SET nombre=?, apellido=?, estado_civil_codigo=?, numero_hijos=?,  estatura=? , cantidad_ahorro=?, fecha_nacimiento=?, hora_nacimiento=? WHERE cedula=?";
		Connection conecion = null;
		PreparedStatement stmt = null;

		try {
			conecion = Coneccionbdd.conertar();
			stmt = conecion.prepareStatement(sql);

			stmt.setString(1, p.getNombre());
			stmt.setString(2, p.getApellido());
			stmt.setString(3, p.getEstadoCivil().getCodigo());
			stmt.setInt(4, p.getNumeroH());
			stmt.setDouble(5, p.getEstatura());
			stmt.setBigDecimal(6, p.getCantidadA());
			stmt.setDate(7, new java.sql.Date(p.getFechaN().getTime()));
			stmt.setTime(8, new java.sql.Time(p.getHoraN().getTime()));
			stmt.setString(9, p.getCedula());
			
			stmt.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("no se encomtro la persona con la cedula " + p.getCedula(), e);
			throw new Exception("Error al actualizar");
		} finally {
			try {
				conecion.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	public static void eliminar (String cedula) throws Exception {
		String sql = "delete from  personas1 where cedula=?";
		Connection conecion = null;
		PreparedStatement stmt = null;
		
		
		try {
			conecion = Coneccionbdd.conertar();
			stmt = conecion.prepareStatement(sql);
			
			stmt.setString(1,cedula);
			
			stmt.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error en el eliminar", e);
			throw new Exception("Error en el eliminar");
		}
		
	}
}
