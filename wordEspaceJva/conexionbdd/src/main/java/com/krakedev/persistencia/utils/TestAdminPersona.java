package com.krakedev.persistencia.utils;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

//ystem.out.println() solo se va apoder usar en los test

public class TestAdminPersona {
	public static void main(String[] args) {
		EstadoCivil cv = new EstadoCivil("U", "union libre");
		persona p = new persona("1727259720", "Natalia", "Rodriguez  ", cv);
		try {
			Date fechaC = convertidor.convertidorfecha("2000/02/23");
			Date horaC = convertidor.convertidorHora("02:23:45");
			p.setFechaN(fechaC);
			p.setHoraN(horaC);
			p.setCantidadA(new BigDecimal(1200.45));
			p.setNumeroH(50);
			AdminPersonas.insertar(p);
		} catch (Exception e) {
			System.out.println("error en el sisitema: "+e.getMessage());
		}
		
	}
}
