package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testconexion {
	public static void main(String[] args) {
		Connection connettion=null;
		PreparedStatement ps=null;

		try {
			Class.forName("org.postgresql.Driver");
			connettion=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1727047720");
			System.out.println("Conexion exitosa");

			ps=connettion.prepareStatement("insert into personas1(cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorro,fecha_nacimiento,hora_nacimiento)"
					+ "			values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, "1727047720");
			ps.setString(2, "Mateo");
			ps.setString(3, "Muñoz");
			ps.setString(4, "U");
			ps.setInt(5, 2);
			ps.setDouble(6, 1.70);
			ps.setBigDecimal(7,new BigDecimal(1200.45));
	
			SimpleDateFormat sf= new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String Ftr="2020/03/22 10:05:04";
			try {
				Date  fecha=sf.parse(Ftr);
				System.out.println(fecha);
				long fechaM=fecha.getTime();
				System.out.println(fechaM);
				//crea un java.sql.date ,partiendo de un java.util.date
				java.sql.Date fSql= new java.sql.Date (fechaM);
				System.out.println(fSql);
				
				Time tsql=new Time(fechaM);
				System.out.println(tsql);
				ps.setDate(8, fSql);
				ps.setTime(9, tsql);
				
				ps.executeUpdate();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
	
			System.out.println("ejecuta Insert");
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		//ps.setInt(5, 2);
		//ps.setDouble(6, 1.70);
		//ps.setBigDecimal(7, new BigDecimal(1200.45));
		
		//,numero_hijos,estatura,cantidad_ahorro,fecha_nacimiento,hora_nacimiento
		 
	}
}
	