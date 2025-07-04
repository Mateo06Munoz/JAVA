package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {
	public static void main(String[] args) {
		//date -java.util.Date
		//Date -java.aql.Date
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
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
