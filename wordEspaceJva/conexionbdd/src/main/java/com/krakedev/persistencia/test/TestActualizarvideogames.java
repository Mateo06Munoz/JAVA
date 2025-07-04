package com.krakedev.persistencia.test;

import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.convertidor;

public class TestActualizarvideogames {
	public static void main(String[] args) {
		EstadoCivil cv = new EstadoCivil("U", "union libre");
		persona p = new persona("1727047720", "Ana", "Lopez  ", cv);
		try {
			Date fechaC = convertidor.convertidorfecha("2020/06/15");
			Date horaC = convertidor.convertidorHora("07:35:28");
			p.setFechaN(fechaC);
			p.setHoraN(horaC);
			//p.setCantidadA(new BigDecimal(1200.45));
			//p.setNumeroH(50);
			AdminPersonas.actualizar(p);
		} catch (Exception e) {
			System.out.println("error en el sisitema: "+e.getMessage());
		}

	}
}
