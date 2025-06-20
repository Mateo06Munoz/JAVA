package clearmids.cuentas.test;

import clearmids.cuentas.cuenta;

public class testCuenta {

	public static void main(String[] args) {
		//Crea un ojeto cuenta y lo refersncia con cuneta1
		cuenta cuenta1=new cuenta("03476");
		//coloco un valor en el saldo en la cuenta1
		cuenta1.setSaldo(675);
		// crea un bojeto ceunta y lo referencias como cuenta2
		cuenta cuenta2=new cuenta("03476","C",98);
		// crea un bojeto ceunta y lo referencias como cuenta3
		cuenta cuenta3=new cuenta("03476");
		//Modifica el tipo de cuenta
		cuenta3.setTipo("C");
		//imprimir la cueta1,cuenta2,cuenta3	
		System.out.println("-----------valores iniciales-----------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		System.out.println("-----------valores modificados-----------");
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		cuenta cuenta4 =new cuenta("0987");
		cuenta4.setSaldo(10);
		cuenta4.setTipo("A");
		cuenta cuenta5=new cuenta("0557");
		cuenta5.setSaldo(10);
		cuenta5.setTipo("C");
		cuenta cuenta6=new cuenta("0666","A",0);
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
	}

}
