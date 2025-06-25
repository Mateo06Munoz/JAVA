package com.clearminds.maquina;

import java.util.ArrayList;
	
import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class maquinaDulces {
		private ArrayList<Celda> celdas;
		private double saldo;
		public maquinaDulces() {
			celdas = new ArrayList<Celda>();
		}

		
		public ArrayList<Celda> getCeldas() {
			return celdas;
		}
		public void setCeldas(ArrayList<Celda> celdas) {
			this.celdas = celdas;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		public void agregarCelda1(Celda codigoC) {
			celdas =new ArrayList<Celda>();
			celdas.add(codigoC);
		}
		public void agregarCelda(Celda codigoC) {
			celdas.add(codigoC);
		}
		public void mostraConfiguracion() {
			Celda celda;
			for(int i=0;i<celdas.size();i++) {
				celda =celdas.get(i);
				System.out.println("Celda: "+celda.getCodigo());
			}
		}
		public Celda buscarCelda(String codigoC) {
			Celda celdaE=null;
			Celda ec;
			for(int i=0;i<celdas.size();i++) {
				ec=celdas.get(i);
				if(codigoC.equals(ec.getCodigo())) {
					celdaE=ec;
				}
			}
			return celdaE;
		}
		public void cargarProducto(Producto atributo,String Codigo,int cantidad) {
			Celda celdaReduperada=buscarCelda(Codigo);
			celdaReduperada.ingresarProducto(atributo, cantidad);
		}
		public void mostrarProductos() {
			Celda ec;
			Producto ep=null;
			for (int i=0;i<celdas.size();i++) {
				ec=celdas.get(i);
				ep=ec.getProducto();
				System.out.println("Celda: "+ec.getCodigo()+" Stock: "+ec.getStock());
				System.out.println("Saldo: "+saldo);
				if(ep!=null) {
					System.out.println( "Producto"+ep.getNombre()+" Precio"+ep.getPrecio());
				}else {
					System.out.println("Sin producto asignado");
				}
				
			}
		}
		
		public Producto buscarProductoEnCelda(String codigoC) {
			Producto pe=null;
			Celda ec=null;
			for(int i=0;i<celdas.size();i++) {
				ec=celdas.get(i);
				if(codigoC.equals(ec.getCodigo())) {
					return pe=ec.getProducto();
				}
			}		
			return pe;
		}	
		
		public double consultarPrecio(String codigoC) {
			Producto ep=null;
			Celda ec=null;
			for(int i=0;i<celdas.size();i++) {
				ec=celdas.get(i);
				if(codigoC.equals(ec.getCodigo())) {
					ep=ec.getProducto();
					return ep.getPrecio();
				}
			}		
			return 0.0;
		}
		public Celda BuscarCeldaProducto(String codigoP) {
			Celda ec=null;
			Producto ep;
			for(int i=0;i<celdas.size();i++) {
				ec=celdas.get(i);
				ep=ec.getProducto();
				if(ep!=null&&codigoP.equals(ep.getCodigo())) {
					return ec;
				}
			}
			return ec;
		}
		public void incrementarProductos(String codigo,int items) {
			Celda celdaEncontrada=BuscarCeldaProducto(codigo);
				celdaEncontrada.setStock(items);
		}
		public void vender(String codigo) {
			Celda celdaEncontrada = buscarCelda(codigo);
			celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
			saldo = saldo + celdaEncontrada.getProducto().getPrecio();
			mostrarProductos();
			
		}
		public double venderConCambio(String codigo,double saldoI) {
			Celda celdaEncontrada = buscarCelda(codigo);
			celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
			saldo = saldo + celdaEncontrada.getProducto().getPrecio();
			mostrarProductos();
			double cambio = saldoI - celdaEncontrada.getProducto().getPrecio();
			mostrarProductos();
			return cambio;
		}
		public ArrayList<Producto> BuscarMenores(double limite) {
			ArrayList<Producto> menores=new ArrayList<Producto>();
			Celda ec=null;
			Producto ep=null;
			for(int i=0;i<celdas.size();i++) {
				ec=celdas.get(i);
				ep=ec.getProducto();
				if(ep.getPrecio()<=limite) {
					menores.add(ep);
				}
			}
			return menores;
		}
		
}
