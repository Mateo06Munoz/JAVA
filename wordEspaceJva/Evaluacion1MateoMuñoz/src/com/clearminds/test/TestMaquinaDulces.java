package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.maquina.maquinaDulces;

public class TestMaquinaDulces {
    public static void main(String[] args) {
    	maquinaDulces maquina = new maquinaDulces();
        maquina.agregarCelda(new Celda("A"));
        maquina.agregarCelda(new Celda("B"));
        maquina.agregarCelda(new Celda("C"));
        maquina.agregarCelda(new Celda("D"));
        maquina.mostraConfiguracion();
    }
}