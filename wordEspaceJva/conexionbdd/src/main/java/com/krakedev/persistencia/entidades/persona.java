package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class persona {
	private String cedula;
	private String nombre;
	private String apellido;
	private EstadoCivil estadoCivil;
	private int numeroH;
	private double estatura;
	private BigDecimal cantidadA;
	private Date fechaN;
	private Date horaN;

	public persona() {
	}

	public persona(String cedula, String nombre, String apellido, EstadoCivil estadoCivil) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoCivil = estadoCivil;
	}

	public persona(String cedula, String nombre, String apellido, EstadoCivil estadoCivil, int numeroH, double estatura,
			BigDecimal cantidadA, Date fechaN, Date horaN) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoCivil = estadoCivil;
		this.numeroH = numeroH;
		this.estatura = estatura;
		this.cantidadA = cantidadA;
		this.fechaN = fechaN;
		this.horaN = horaN;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getNumeroH() {
		return numeroH;
	}

	public void setNumeroH(int numeroH) {
		this.numeroH = numeroH;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public BigDecimal getCantidadA() {
		return cantidadA;
	}

	public void setCantidadA(BigDecimal cantidadA) {
		this.cantidadA = cantidadA;
	}

	public Date getFechaN() {
		return fechaN;
	}

	public void setFechaN(Date fechaN) {
		this.fechaN = fechaN;
	}

	public Date getHoraN() {
		return horaN;
	}

	public void setHoraN(Date horaN) {
		this.horaN = horaN;
	}

	@Override
	public String toString() {
		return "persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil="
				+ estadoCivil + ", numeroH=" + numeroH + ", estatura=" + estatura + ", cantidadA=" + cantidadA
				+ ", fechaN=" + fechaN + ", horaN=" + horaN + "]";
	}

	

}
