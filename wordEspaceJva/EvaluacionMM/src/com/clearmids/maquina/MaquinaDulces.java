package com.clearmids.maquina;

import com.clearmids.componentes.Cedula;
import com.clearmids.componentes.Producto;

public class MaquinaDulces {
	private Cedula celda1;
	private Cedula celda2;
	private Cedula celda3;
	private Cedula celda4;
	private double saldo;
	public Cedula getCelda1() {
		return celda1;
	}
	public void setCelda1(Cedula celda1) {
		this.celda1 = celda1;
	}
	public Cedula getCelda2() {
		return celda2;
	}
	public void setCelda2(Cedula celda2) {
		this.celda2 = celda2;
	}
	public Cedula getCelda3() {
		return celda3;
	}
	public void setCelda3(Cedula celda3) {
		this.celda3 = celda3;
	}
	public Cedula getCelda4() {
		return celda4;
	}
	public void setCelda4(Cedula celda4) {
		this.celda4 = celda4;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void configurarMquina(String codigo1,String codigo2,String codigo3,String codigo4) {
		celda1=new Cedula (codigo1);
		celda2=new Cedula (codigo2);
		celda3=new Cedula (codigo3);
		celda4=new Cedula (codigo4);
	}
	public void mostrarConfiguracion() {
		System.out.println("CELDA 1: "+celda1.getCodigo());
		System.out.println("CELDA 2: "+celda2.getCodigo());
		System.out.println("CELDA 3: "+celda3.getCodigo());
		System.out.println("CELDA 4: "+celda4.getCodigo());
	}
	public Cedula buscarCelda(String codigo) {
		if(codigo==celda1.getCodigo()) {
			return celda1;
		}else if(codigo==celda2.getCodigo()) {
			return celda2;
		}else if(codigo==celda3.getCodigo()) {
			return celda3;
		}else if(codigo==celda4.getCodigo()) {
			return celda4;
		}
		return null;
	}
	public void cargarProducto(Producto atributo,String Codigo,int cantidad) {
		Cedula celdaReduperada=buscarCelda(Codigo);
		celdaReduperada.ingresarProducto(atributo, cantidad);
	}
	public void mostrarProductos() {
		Producto p1=celda1.getProducto();
		System.out.println("celda 1");
		System.out.println("codigo: "+celda1.getCodigo());
		System.out.println("Stock: "+celda1.getStock());
		if(p1!=null) {
			System.out.println("nombre: "+p1.getNombre());
			System.out.println("precio: "+p1.getPrecio());
		}
		
		Producto p2=celda2.getProducto();
		System.out.println("celda 2");
		System.out.println("codigo: "+celda2.getCodigo());
		System.out.println("Stock: "+celda2.getStock());
		if(p2!=null) {
			System.out.println("nombre: "+p2.getNombre());
			System.out.println("precio: "+p2.getPrecio());
		}
		Producto p3=celda3.getProducto();
		System.out.println("celda 3");
		System.out.println("codigo: "+celda3.getCodigo());
		System.out.println("Stock: "+celda3.getStock());
		if(p3!=null) {
			System.out.println("nombre: "+p3.getNombre());
			System.out.println("precio: "+p3.getPrecio());
		}
		Producto p4=celda4.getProducto();
		System.out.println("celda 4");
		System.out.println("codigo: "+celda4.getCodigo());
		System.out.println("Stock: "+celda4.getStock());
		if(p4!=null) {
			System.out.println("nombre: "+p4.getNombre());
			System.out.println("precio: "+p4.getPrecio());
		}		
	}
	public Producto buscarProductoEnCelda(String codigo) {
		if(codigo==celda1.getCodigo()) {
			Producto p1=celda1.getProducto();
			return p1;
		}else if(codigo==celda2.getCodigo()) {
			Producto p2=celda2.getProducto();
			return p2;
		}else if(codigo==celda3.getCodigo()) {
			Producto p3=celda3.getProducto();
			return p3;
		}else if(codigo==celda4.getCodigo()) {
			Producto p4=celda4.getProducto();
			return p4;
		}
		return null;
		
	}	
	public double consultarPrecio(String codigo) {
		Producto p1=celda1.getProducto();
		Producto p2=celda2.getProducto();
		Producto p3=celda3.getProducto();
		Producto p4=celda4.getProducto();
		if(codigo==celda1.getCodigo()) {
			return p1.getPrecio();
		}else	if(codigo==celda2.getCodigo()) {
			return p2.getPrecio();
		}else if(codigo==celda3.getCodigo()) {
			return p3.getPrecio();
		}else if(codigo==celda4.getCodigo()) {
			return p4.getPrecio();
		}
		return 0.0;
	}
	
public Cedula buscarCeldaProducto(String codigoP) {
		
		
		if(celda1.getProducto() != null&& codigoP == celda1.getProducto().getCodigo()) {
				return celda1;			
		}else if(celda2.getProducto() != null&&codigoP == celda2.getProducto().getCodigo()) {
				return celda2;		
		}else if(celda3.getProducto() != null&&codigoP == celda3.getProducto().getCodigo()) {
				return celda3;
		}else if(celda4.getProducto() != null&&codigoP == celda4.getProducto().getCodigo()) {
				return celda4;
		}else {
		return null;
		}
		

		
	}
	public void incrementarProductos(String codigo,int items) {
		Cedula celdaEncontrada=buscarCeldaProducto(codigo);
			celdaEncontrada.setStock(items);
	}

	public void vender(String codigo) {
		Cedula celdaEncontrada = buscarCelda(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		saldo = saldo + celdaEncontrada.getProducto().getPrecio();
		mostrarProductos();
		
	}
	public double venderConCambio1(String codigo,double saldoC) {
		double cambio=saldo-saldoC;
		Cedula ce=buscarCeldaProducto(codigo);
		int S=ce.getStock();
		int s1=S-1;
		ce.setStock(s1);
		saldo=saldo-saldoC;
		return cambio;
	}
	public double venderConCambio(String codigo,double saldoI) {
		Cedula celdaEncontrada = buscarCelda(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		saldo = saldo + celdaEncontrada.getProducto().getPrecio();
		mostrarProductos();
		double cambio = saldoI - celdaEncontrada.getProducto().getPrecio();
		mostrarProductos();
		return cambio;
	}
	
	
}
